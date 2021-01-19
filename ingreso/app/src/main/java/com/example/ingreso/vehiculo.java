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

public class vehiculo extends AppCompatActivity {
    EditText placaV,marcaV,modeloV;
    Button ingresarV,editarV,buscarV,eliminarV;
    ListView listaV;
    RequestQueue requestQueue;
    SwipeRefreshLayout refrescarV;
    TextView vehiculoId;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehiculo);

        placaV = findViewById(R.id.vehiculoPlaca);
        marcaV = findViewById(R.id.vehiculoMarca);
        modeloV = findViewById(R.id.vehiculoModelo);
        vehiculoId = findViewById(R.id.vehiculoId);
        ingresarV = findViewById(R.id.VehiculoIngresar);
        editarV = findViewById(R.id.VehiculoEditar);
        buscarV = findViewById(R.id.VehiculoBuscar);
        eliminarV = findViewById(R.id.VehiculoEliminar);
        listaV = findViewById(R.id.ListaVehiculo);
        refrescarV = findViewById(R.id.refrescarVehiculo);

        refrescarV.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {

                String consultaV = "https://acceso-tendo.000webhostapp.com/acceso/vehiculo/consultaVehiculo.php";
                EnviarVehiculo(consultaV);
                limpiarVehiculo();

                refrescarV.setRefreshing(false);
            }
        });

        ingresarV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ingresarVehiculo("https://acceso-tendo.000webhostapp.com/acceso/vehiculo/insertVehiculo.php");
            }
        });
        editarV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editarVehiculo("https://acceso-tendo.000webhostapp.com/acceso/vehiculo/editarVehiculo.php");
            }
        });
        buscarV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buscarVehiculo("https://acceso-tendo.000webhostapp.com/acceso/vehiculo/buscarVehiculo.php?placa="+placaV.getText());
            }
        });
        eliminarV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eliminarVehiculo("https://acceso-tendo.000webhostapp.com/acceso/vehiculo/eliminarVehiculo.php");
            }
        });

        String consultaV = "https://acceso-tendo.000webhostapp.com/acceso/vehiculo/consultaVehiculo.php";
        EnviarVehiculo(consultaV);
    }

    public void EnviarVehiculo(String URL){
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
                        CargarListaV(ja);
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

    public void CargarListaV(JSONArray ja){
        ArrayList<String> lista = new ArrayList<>();

        for(int i=0;i<ja.length();i+=3){

            try {

                lista.add("Placa: "+ja.getString(i)+"  /  Marca: "+ja.getString(i+1)+"\nModelo: "+ja.getString(i+2));
            } catch (JSONException e) {
                e.printStackTrace();
            }

        }

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lista);
        listaV.setAdapter(adaptador);


    }

    private void ingresarVehiculo (String URL) {

        if (placaV.getText().toString().isEmpty()) {
            placaV.setError("Complete los campos");}

        else if (marcaV.getText().toString().isEmpty()) {
            marcaV.setError("Complete los campos");
        } else if (modeloV.getText().toString().isEmpty()) {
            modeloV.setError("Complete los Campos");
        } else {

            StringRequest stringRequest = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    Toast.makeText(getApplicationContext(), response, Toast.LENGTH_SHORT).show();
                    limpiarVehiculo();
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
                    parametros.put("placa", placaV.getText().toString());
                    parametros.put("marca", marcaV.getText().toString());
                    parametros.put("modelo", modeloV.getText().toString());
                    return parametros;
                }
            };
            RequestQueue requestQueue = Volley.newRequestQueue(this);
            requestQueue.add(stringRequest);

        }
    }

    private void editarVehiculo (String URL) {

        if (placaV.getText().toString().isEmpty()) {
            placaV.setError("Complete los campos");}

        else if (marcaV.getText().toString().isEmpty()) {
            marcaV.setError("Complete los campos");
        } else if (modeloV.getText().toString().isEmpty()) {
            modeloV.setError("Complete los Campos");
        } else {

            StringRequest stringRequest = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    Toast.makeText(getApplicationContext(), response, Toast.LENGTH_SHORT).show();
                    limpiarVehiculo();
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
                    parametros.put("idvehiculo", vehiculoId.getText().toString());
                    parametros.put("placa", placaV.getText().toString());
                    parametros.put("marca", marcaV.getText().toString());
                    parametros.put("modelo", modeloV.getText().toString());
                    return parametros;
                }
            };
            RequestQueue requestQueue = Volley.newRequestQueue(this);
            requestQueue.add(stringRequest);

        }
    }

    private void buscarVehiculo (String URL){
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(URL, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                JSONObject jsonObject = null;
                for (int i = 0; i < response.length(); i++) {
                    try {
                        jsonObject = response.getJSONObject(i);
                        marcaV.setText(jsonObject.getString("marca"));
                        modeloV.setText(jsonObject.getString("modelo"));
                        placaV.setText(jsonObject.getString("placa"));
                        vehiculoId.setText(jsonObject.getString("idvehiculo"));
                    } catch (JSONException e) {
                        Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
                    }

                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(), "Vehiculo no Encontrado",Toast.LENGTH_SHORT).show();
            }
        }
        );

        requestQueue= Volley.newRequestQueue(this);
        requestQueue.add(jsonArrayRequest);
    }

    private void eliminarVehiculo (String URL){
        StringRequest stringRequest = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Toast.makeText(getApplicationContext(), response, Toast.LENGTH_SHORT).show();
                limpiarVehiculo();
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
                parametros.put("placa", placaV.getText().toString());
                return parametros;
            }
        };
        RequestQueue requestQueue=Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }

    private void limpiarVehiculo (){
        placaV.setText("");
        modeloV.setText("");
        marcaV.setText("");
    }

}
