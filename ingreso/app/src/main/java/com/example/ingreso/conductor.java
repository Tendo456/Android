package com.example.ingreso;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
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

public class conductor extends AppCompatActivity {

    EditText dniC,nombreC,breveteC;
    TextView conductorId;
    Button ingresarC,editaC,buscarC,eliminarC;
    ListView listaC;
    RequestQueue requestQueue;
    SwipeRefreshLayout refrescarC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conductor);

        dniC=findViewById(R.id.conductorDNI);
        nombreC=findViewById(R.id.conductorNombre);
        breveteC = findViewById(R.id.conductorLicencia);
        ingresarC = findViewById(R.id.ConductorIngresar);
        editaC = findViewById(R.id.ConductorEditar);
        buscarC = findViewById(R.id.ConductorBuscar);
        eliminarC = findViewById(R.id.ConductorEliminar);
        listaC = findViewById(R.id.ListaConductor);
        refrescarC = findViewById(R.id.refrescarConductor);
        conductorId = findViewById(R.id.conductorId);

        refrescarC.setOnRefreshListener(() -> {

            String consulta = "https://acceso-tendo.000webhostapp.com/acceso/condutor/consultaConductor.php";
            EnviarConductor(consulta);
            limpiarConductor();

            refrescarC.setRefreshing(false);
        });

        ingresarC.setOnClickListener(v -> ingresarConductor("https://acceso-tendo.000webhostapp.com/acceso/condutor/insertConductor.php"));

        editaC.setOnClickListener(v -> editarConductor("https://acceso-tendo.000webhostapp.com/acceso/condutor/editarConductor.php"));

        buscarC.setOnClickListener(v -> buscarConductor("https://acceso-tendo.000webhostapp.com/acceso/condutor/buscarConductor.php?dni="+dniC.getText()));

        eliminarC.setOnClickListener(v -> eliminarConductor("https://acceso-tendo.000webhostapp.com/acceso/condutor/eliminarConductor.php"));

        String Consult = "https://acceso-tendo.000webhostapp.com/acceso/condutor/consultaConductor.php";
        EnviarConductor(Consult);


    }

    public void EnviarConductor(String URL){
        Toast.makeText(getApplicationContext(),"cargando", Toast.LENGTH_SHORT).show();

        RequestQueue queue = Volley.newRequestQueue(this);
        StringRequest stringRequest = new StringRequest(Request.Method.GET, URL, response -> {
            response = response.replace("][", ",");
            if (response.length() > 0) {
                try {
                    JSONArray ja = new JSONArray(response);
                    Log.i("sizejson", "" + ja.length());
                    CargarListaC(ja);
                } catch (JSONException e) {
                    e.printStackTrace();
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

    public void CargarListaC(JSONArray ja){
        ArrayList<String> lista = new ArrayList<>();

        for(int i=0;i<ja.length();i+=3){

            try {

                lista.add("Nombre: "+ja.getString(i)+"\nDNI: "+ja.getString(i+1)+" / Licencia: "+ja.getString(i+2));
            } catch (JSONException e) {
                e.printStackTrace();
            }

        }

        ArrayAdapter<String> adaptador = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, lista);
        listaC.setAdapter(adaptador);


    }

    private void ingresarConductor (String URL) {

        if (dniC.getText().toString().isEmpty()) {
            dniC.setError("Complete los campos");}

        else if (nombreC.getText().toString().isEmpty()) {
            nombreC.setError("Complete los campos");
        } else if (breveteC.getText().toString().isEmpty()) {
            breveteC.setError("Complete los Campos");
        } else {

            StringRequest stringRequest = new StringRequest(Request.Method.POST, URL, response -> {
                Toast.makeText(getApplicationContext(), response, Toast.LENGTH_SHORT).show();
                limpiarConductor();
            }, error -> Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT).show()) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {
                    Map<String, String> parametros = new HashMap<>();
                    parametros.put("dni", dniC.getText().toString());
                    parametros.put("nombre_conductor", nombreC.getText().toString());
                    parametros.put("brevete", breveteC.getText().toString());
                    return parametros;
                }
            };
            RequestQueue requestQueue = Volley.newRequestQueue(this);
            requestQueue.add(stringRequest);

        }
    }

    private void editarConductor (String URL) {

        if (dniC.getText().toString().isEmpty()) {
            dniC.setError("Complete los campos");}

        else if (nombreC.getText().toString().isEmpty()) {
            nombreC.setError("Complete los campos");
        } else if (breveteC.getText().toString().isEmpty()) {
            breveteC.setError("Complete los Campos");
        } else {

            StringRequest stringRequest = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    Toast.makeText(getApplicationContext(), response, Toast.LENGTH_SHORT).show();
                    limpiarConductor();
                }
            }, error -> Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT).show()) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {
                    Map<String, String> parametros = new HashMap<String, String>();
                    parametros.put("idconductor", conductorId.getText().toString());
                    parametros.put("dni", dniC.getText().toString());
                    parametros.put("nombre_conductor", nombreC.getText().toString());
                    parametros.put("brevete", breveteC.getText().toString());
                    return parametros;
                }
            };
            RequestQueue requestQueue = Volley.newRequestQueue(this);
            requestQueue.add(stringRequest);

        }
    }

    private void buscarConductor (String URL){
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(URL, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                JSONObject jsonObject = null;
                for (int i = 0; i < response.length(); i++) {
                    try {
                        jsonObject = response.getJSONObject(i);
                        conductorId.setText(jsonObject.getString("idconductor"));
                        nombreC.setText(jsonObject.getString("nombre_conductor"));
                        dniC.setText(jsonObject.getString("dni"));
                        breveteC.setText(jsonObject.getString("brevete"));
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

    private void eliminarConductor (String URL){
        StringRequest stringRequest = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Toast.makeText(getApplicationContext(), response, Toast.LENGTH_SHORT).show();
                limpiarConductor();
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
                parametros.put("dni", dniC.getText().toString());
                return parametros;
            }
        };
        RequestQueue requestQueue=Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }

    private void limpiarConductor (){
        dniC.setText("");
        nombreC.setText("");
        breveteC.setText("");
            }

}