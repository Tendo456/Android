package com.example.ingreso;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class control_usuarios extends AppCompatActivity {
    EditText txtDni, txtUsuario, txtContraseña, txtTipoUser;
    Spinner spTipoUser;
    Button Uinsertar, Ueditar, Ubuscar, Ueliminar;
    ListView listaUser;
    RequestQueue requestQueue;
    SwipeRefreshLayout refrescar;
    TextView usuarioId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control_usuarios);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.grupo1);

        txtDni = findViewById(R.id.txtDni);
        txtUsuario  = findViewById(R.id.txtUsuario);
        txtContraseña = findViewById(R.id.txtContraseña);
        txtTipoUser  = findViewById(R.id.txtTipoUser);
        usuarioId = findViewById(R.id.usuarioId);
        spTipoUser = findViewById(R.id.spTipoUser);
        Uinsertar = findViewById(R.id.UInsertar);
        Ueditar = findViewById(R.id.UEditar);
        Ubuscar = findViewById(R.id.UBuscar);
        Ueliminar = findViewById(R.id.UEliminar);
        listaUser = findViewById(R.id.listaUser);
        refrescar = findViewById(R.id.refrescar);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.usuario, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spTipoUser.setAdapter(adapter);
        spTipoUser.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                txtTipoUser.setText(parent.getItemAtPosition(position).toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        refrescar.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {

                String consulta = "https://acceso-tendo.000webhostapp.com/acceso/user/consultaUser.php";
                EnviarUser(consulta);
                limpiaruser();

                refrescar.setRefreshing(false);
            }
        });

        Uinsertar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ingresaruser("https://acceso-tendo.000webhostapp.com/acceso/user/insertUser.php");
            }
        });

        Ubuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buscarUser("https://acceso-tendo.000webhostapp.com/acceso/user/buscarUser.php?dni="+txtDni.getText());
            }
        });

        Ueditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editaruser("https://acceso-tendo.000webhostapp.com/acceso/user/editarUser.php");
            }
        });

        Ueliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eliminaruser("https://acceso-tendo.000webhostapp.com/acceso/user/eliminarUser.php");
            }
        });

        String consulta = "https://acceso-tendo.000webhostapp.com/acceso/user/consultaUser.php";
        EnviarUser(consulta);
    }

    public void EnviarUser(String URL){
        Toast.makeText(getApplicationContext(),"cargando", Toast.LENGTH_SHORT).show();

        RequestQueue queue = Volley.newRequestQueue(this);
        StringRequest stringRequest = new StringRequest(Request.Method.GET, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                response = response.replace("][", ",");
                if (response.length() > 0) {
                    try {
                        JSONArray ja = new JSONArray(response);
                        Log.i("sizejson", "" + ja.length());
                        CargarLista(ja);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(), "Error",Toast.LENGTH_SHORT).show();
            }
        });

        queue.add(stringRequest);
    }

    public void CargarLista(JSONArray ja){
        ArrayList<String> lista = new ArrayList<>();

        for(int i=0;i<ja.length();i+=4){

            try {

                lista.add("DNI: "+ja.getString(i)+"  /  Usuario: "+ja.getString(i+1)+"\nPass: "+ja.getString(i+2)+"  /  Tipo: "+ja.getString(i+3));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lista);
        listaUser.setAdapter(adaptador);
    }

    private void ingresaruser (String URL) {

        if (txtDni.getText().toString().isEmpty()) {
            txtDni.setError("Complete los campos");}
        else if (txtUsuario.getText().toString().isEmpty()) {
            txtUsuario.setError("Complete los campos");
        } else if (txtContraseña.getText().toString().isEmpty()) {
            txtContraseña.setError("Complete los Campos");
        } else {

            StringRequest stringRequest = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    Toast.makeText(getApplicationContext(), response, Toast.LENGTH_SHORT).show();
                    limpiaruser();
                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT).show();
                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {
                    Map<String, String> parametros = new HashMap<String, String>();
                    parametros.put("dni", txtDni.getText().toString());
                    parametros.put("usuario", txtUsuario.getText().toString());
                    parametros.put("contraseña", txtContraseña.getText().toString());
                    parametros.put("tipo_usuario", txtTipoUser.getText().toString());
                    return parametros;
                }
            };
            RequestQueue requestQueue = Volley.newRequestQueue(this);
            requestQueue.add(stringRequest);
        }
    }

    private void editaruser (String URL) {

        if (txtDni.getText().toString().isEmpty()) {
            txtDni.setError("Complete los campos");}
        else if (txtUsuario.getText().toString().isEmpty()) {
            txtUsuario.setError("Complete los campos");
        } else if (txtContraseña.getText().toString().isEmpty()) {
            txtContraseña.setError("Complete los Campos");
        } else {

            StringRequest stringRequest = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    Toast.makeText(getApplicationContext(), response, Toast.LENGTH_SHORT).show();
                    limpiaruser();
                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT).show();
                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {
                    Map<String, String> parametros = new HashMap<String, String>();
                    parametros.put("id_usuario", usuarioId.getText().toString());
                    parametros.put("dni", txtDni.getText().toString());
                    parametros.put("usuario", txtUsuario.getText().toString());
                    parametros.put("contraseña", txtContraseña.getText().toString());
                    parametros.put("tipo_usuario", txtTipoUser.getText().toString());
                    return parametros;
                }
            };
            RequestQueue requestQueue = Volley.newRequestQueue(this);
            requestQueue.add(stringRequest);
        }
    }

    private void buscarUser (String URL){
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(URL, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                JSONObject jsonObject = null;
                for (int i = 0; i < response.length(); i++) {
                    try {
                        jsonObject = response.getJSONObject(i);
                        //txtDni.setText(jsonObject.getString("dni"));
                        usuarioId.setText(jsonObject.getString("id_usuario"));
                        txtUsuario.setText(jsonObject.getString("usuario"));
                        txtContraseña.setText(jsonObject.getString("contraseña"));
                        txtTipoUser.setText(jsonObject.getString("tipo_usuario"));
                    } catch (JSONException e) {
                        Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
                    }

                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(), "Usuario no Encontrado",Toast.LENGTH_SHORT).show();
            }
        }
        );

        requestQueue= Volley.newRequestQueue(this);
        requestQueue.add(jsonArrayRequest);
    }

    private void eliminaruser (String URL){
        StringRequest stringRequest = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Toast.makeText(getApplicationContext(), response, Toast.LENGTH_SHORT).show();
                limpiaruser();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT).show();
            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String>parametros=new HashMap<String, String>();
                parametros.put("dni", txtDni.getText().toString());
                return parametros;
            }
        };
        RequestQueue requestQueue=Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }

    private void limpiaruser (){
        txtDni.setText("");
        txtUsuario.setText("");
        txtContraseña.setText("");
        txtTipoUser.setText("");
    }
}