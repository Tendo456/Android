package com.example.ingreso;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;
import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Home extends AppCompatActivity {

    SwipeRefreshLayout refreshLayout;
    ListView list;
    Adaptador adaptador;
    public static ArrayList<Users1> users = new ArrayList<>();
    String url = "http://acceso-tendo.000webhostapp.com/acceso/mostrar.php";
    Users1 usuarios;
    EditText buscador;
    String tras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.equipo);

        list=findViewById(R.id.listItem);

        adaptador=new Adaptador(this,users);
        list.setAdapter(adaptador);
        refreshLayout = findViewById(R.id.refresh);
        buscador = findViewById(R.id.buscador);


        refreshLayout.setOnRefreshListener(() -> {

            mostrardatos();
            buscador.setText("");

            refreshLayout.setRefreshing(false);
        });


        list.setOnItemClickListener((parent, view, position, id) -> {
            AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
            ProgressDialog progressDialog = new ProgressDialog(view.getContext());
            CharSequence [] dialogoItem = {"Ver datos", "Editar datos","Temperatura","Editar Temperatura","Ver Temperatura","Ver Registros", "Eliminar datos"};
            builder.setTitle(users.get(position).getNombres());
            builder.setItems(dialogoItem, (dialog, i) -> {

                switch (i){
                    case 0:
                        startActivity(new Intent(getApplicationContext(),Detalles.class).
                                putExtra("position",position));
                        break;
                    case 1:
                        startActivity(new Intent(getApplicationContext(),Editar.class).
                                putExtra("position",position));
                        break;
                    case 2:
                        startActivity(new Intent(getApplicationContext(),tempIn.class).
                                putExtra("position",position));
                        break;
                    case 3:
                        startActivity(new Intent(getApplicationContext(),editTemp.class).
                                putExtra("position",position));
                        break;
                    case 4:
                        startActivity(new Intent(getApplicationContext(),DetalleTemp.class).
                                putExtra("position",position));
                        break;
                    case 5:
                        startActivity(new Intent(getApplicationContext(),reporteTemp.class).
                                putExtra("position",position));
                        break;
                    case 6:
                        //Borrardatos(users.get(position).getId_Personal());
                        tras = users.get(position).getId_Personal();
                        EliminarConfirmar();


                        break;
                }
            });

            builder.create().show();
        });
        mostrardatos();

    }

    public void EliminarConfirmar(){
        AlertDialog.Builder opcionBorrar = new AlertDialog.Builder(this);
        opcionBorrar.setMessage("Eliminar Personal?");
        opcionBorrar.setPositiveButton("Eliminar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Borrardatos(tras);
            }
        });
        opcionBorrar.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        AlertDialog dialog = opcionBorrar.create();
        dialog.show();
    }

    private void Borrardatos(final String id_personal) {

        StringRequest request = new StringRequest(Request.Method.POST, "http://acceso-tendo.000webhostapp.com/acceso/eliminar.php",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        Toast.makeText(Home.this, response, Toast.LENGTH_SHORT).show();
                        mostrardatos();

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(Home.this, error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {

                Map<String,String> params = new HashMap<String,String>();
                params.put("id_personal", id_personal);
                return params;
            }
        };

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(request);


    }

    public void mostrardatos(){

        StringRequest request=new StringRequest(Request.Method.POST, url, response -> {
            users.clear();
            try {
                JSONObject jsonObject=new JSONObject(response);
                String success=jsonObject.getString("success");

                JSONArray jsonArray=jsonObject.getJSONArray("personal");

                if(success.equals("1")){
                    for(int i=0;i<jsonArray.length();i++){
                        JSONObject object=jsonArray.getJSONObject(i);
                        String id_personal=object.getString("id_personal");
                        String nombres=object.getString("nombres");
                        String dni=object.getString("dni");
                        String edad=object.getString("edad");
                        String sexo=object.getString("sexo");
                        String idruta=object.getString("idruta");


                        usuarios=new Users1(id_personal,nombres,dni,edad,sexo,idruta);
                        users.add(usuarios);
                        adaptador.notifyDataSetChanged();

                    }
                }
            }catch (JSONException e){
                e.printStackTrace();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(Home.this,error.getMessage(),Toast.LENGTH_SHORT).show();
            }
        });
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        requestQueue.add(request);
    }

    public void buscardatos (View view){
        StringRequest request=new StringRequest(Request.Method.POST,
                "https://acceso-tendo.000webhostapp.com/acceso/buscador.php?nombres="+buscador.getText(), response -> {
                    users.clear();
                    try {
                        JSONObject jsonObject=new JSONObject(response);
                        String success=jsonObject.getString("success");

                        JSONArray jsonArray=jsonObject.getJSONArray("personal");

                        if(success.equals("1")){
                            for(int i=0;i<jsonArray.length();i++){
                                JSONObject object=jsonArray.getJSONObject(i);
                                String id_personal=object.getString("id_personal");
                                String nombres=object.getString("nombres");
                                String dni=object.getString("dni");
                                String edad=object.getString("edad");
                                String sexo=object.getString("sexo");
                                String idruta=object.getString("idruta");


                                usuarios=new Users1(id_personal,nombres,dni,edad,sexo,idruta);
                                users.add(usuarios);
                                adaptador.notifyDataSetChanged();

                            }
                        }
                    }catch (JSONException e){
                        e.printStackTrace();
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(Home.this,error.getMessage(),Toast.LENGTH_SHORT).show();
            }
        });
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        requestQueue.add(request);
    }

    public void btnAgg (View view){

        startActivity(new Intent(getApplicationContext(),Insertar.class));

    }

    public void reporte_dia (View view){
        startActivity(new Intent(getApplicationContext(),reporte_dia.class));
    }

}