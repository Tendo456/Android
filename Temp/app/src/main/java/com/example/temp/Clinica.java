package com.example.temp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.app.DownloadManager;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SearchView;
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

public class Clinica extends AppCompatActivity {

    private ListView list;
    Adaptador adaptador;
    public static ArrayList<Personal>personals=new ArrayList<>();
    String url="http://192.168.1.5/Acceso/mostrar.php";
    Personal personas;
    private SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clinica);

        list=findViewById(R.id.listItem);
        searchView=findViewById(R.id.SchNombres);
        adaptador=new Adaptador(this,personals);
        list.setAdapter(adaptador);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {
                AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                ProgressDialog progressDialog = new ProgressDialog(view.getContext());
                CharSequence [] dialogoItem ={"ver datos", "Editar datos", "Eliminar datos"};
                builder.setTitle(personals.get(position).getNombres());
                builder.setItems(dialogoItem, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        switch (i){
                            case 0:
                                startActivity(new Intent(getApplicationContext(),Master.class).
                                        putExtra("position",position));
                                break;
                            case 1:
                                startActivity(new Intent(getApplicationContext(),Ruta.class).
                                        putExtra("position",position));
                                break;
                            case 2:
                                Borrardatos(personals.get(position).getId_personal());
                                break;
                        }
                    }
                });
                builder.create().show();
            }
        });
        mostrardatos();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {

                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                return false;
            }
        });

    }

    private void Borrardatos(final String id) {

        StringRequest request = new StringRequest(Request.Method.POST, "http://192.168.1.5//probar/eliminar.php",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        if(response.equalsIgnoreCase("elimando con exito")){

                            Toast.makeText(Clinica.this, "Datos eliminados correctamente", Toast.LENGTH_SHORT).show();
                        }
                        else{
                            Toast.makeText(Clinica.this, "Datos no eliminados", Toast.LENGTH_SHORT).show();
                        }

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(Clinica.this, error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {

                Map<String,String> params = new HashMap<String,String>();
                params.put("id", id);
                return params;
            }
        };

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(request);


    }

    public void mostrardatos(){

        StringRequest request=new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                personals.clear();
                try {
                    JSONObject jsonObject=new JSONObject(response);
                    String success=jsonObject.getString("success");

                    JSONArray jsonArray=jsonObject.getJSONArray("personal,temperatura");

                    if(success.equals("1")){
                        for(int i=0;i<jsonArray.length();i++){
                            JSONObject object=jsonArray.getJSONObject(i);
                            String id_personal=object.getString("id_personal");
                            String nombres=object.getString("nombres");
                            String dni=object.getString("dni");
                            String edad=object.getString("edad");
                            String sexo=object.getString("sexo");
                            String temperatura1=object.getString("temperatura1");
                            String temperatura2=object.getString("temperatura2");

                            personas=new Personal(id_personal,nombres,dni,edad,sexo,temperatura1,temperatura2);
                            personals.add(personas);
                            adaptador.notifyDataSetChanged();

                        }
                    }
                }catch (JSONException e){
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(Clinica.this,error.getMessage(),Toast.LENGTH_SHORT).show();
            }
        });
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        requestQueue.add(request);
    }

    public void btnAgg (View view){

        startActivity(new Intent(getApplicationContext(),Master.class));

    }


}