package com.example.ingreso;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EdgeEffect;
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
import com.loopj.android.http.*;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import cz.msebera.android.httpclient.Header;

public class ruta extends AppCompatActivity {
    EditText ruta,idConductor,idVehiculo;
    TextView capturaCond,capturaVehi,rutaId;
    Spinner spConductor, spVehiculo;
    ListView listaRuta;
    Button ingresarR,editarR,buscarR,eliminarR;
    private AsyncHttpClient RCond,RVehi;
    SwipeRefreshLayout refrescarR;
    RequestQueue requestQueue;
    private boolean isFirstTime = true,isFirstTime1 = true;
    private boolean isFirstTimes = true,isFirstTimes1 = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rurta);

        ruta=findViewById(R.id.Ruta);
        idConductor=findViewById(R.id.idConductor);
        idVehiculo=findViewById(R.id.idVehiculo);
        spConductor=findViewById(R.id.spConductor);
        spVehiculo=findViewById(R.id.spVehiculo);
        listaRuta=findViewById(R.id.ListaRuta);
        ingresarR=findViewById(R.id.RutaIngresar);
        editarR=findViewById(R.id.RutaEditar);
        buscarR=findViewById(R.id.RutaBuscar);
        eliminarR=findViewById(R.id.RutaEliminar);
        capturaCond = findViewById(R.id.capturaCond);
        capturaVehi = findViewById(R.id.capturavehi);
        rutaId  =findViewById(R.id.rutaId);
        refrescarR = findViewById(R.id.refrescarRuta);

        refrescarR.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {

                String consultaR = "https://acceso-tendo.000webhostapp.com/acceso/ruta/consultaRuta.php";
                EnviarRuta(consultaR);
                limpiarRuta();

                refrescarR.setRefreshing(false);
            }
        });

        ingresarR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ingresarRuta("https://acceso-tendo.000webhostapp.com/acceso/ruta/insertRuta.php");
            }
        });

        buscarR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buscarRuta("https://acceso-tendo.000webhostapp.com/acceso/ruta/buscarRuta.php?ruta="+ruta.getText());
            }
        });

        editarR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editarRuta("https://acceso-tendo.000webhostapp.com/acceso/ruta/editarRuta.php");
            }
        });

        eliminarR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eliminarRuta("https://acceso-tendo.000webhostapp.com/acceso/ruta/eliminarRuta.php");
            }
        });

        RCond = new AsyncHttpClient();
        llenarspinerC();

        RVehi = new AsyncHttpClient();
        llenarspinerV();

        String ConsultaR = "https://acceso-tendo.000webhostapp.com/acceso/ruta/consultaRuta.php";
        EnviarRuta(ConsultaR);

    }

    private void llenarspinerC (){

        String url = "https://acceso-tendo.000webhostapp.com/acceso/ruta/listarC.php";
        RCond.post(url, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                if (statusCode == 200){
                    cargarspinerC(new String(responseBody));
                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {

            }
        });

    }

    private void cargarspinerC (String respuestaC){
        ArrayList<ruta_conductor> listaC = new ArrayList<ruta_conductor>();
        try {
            JSONArray jsonArreglo= new JSONArray(respuestaC);
            for (int i=0; i<jsonArreglo.length(); i++)
            {
                ruta_conductor rc = new ruta_conductor();
                rc.setIdconductor(jsonArreglo.getJSONObject(i).getString("idconductor"));
                rc.setNombre_conductor(jsonArreglo.getJSONObject(i).getString("nombre_conductor"));
                listaC.add(rc);
            }
            ArrayAdapter<ruta_conductor> a = new ArrayAdapter<ruta_conductor>(this, android.R.layout.simple_dropdown_item_1line,listaC);
            spConductor.setAdapter(a);
            spConductor.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    if(isFirstTime){
                        isFirstTime=false;
                    }
                    else{
                    idConductor.setText(parent.getItemAtPosition(position).toString());
                    String idCnum = idConductor.getText().toString();
                    char[] idCnum_div = idCnum.toCharArray();
                    String n="";
                    for (int j=0; j<idCnum_div.length; j++){
                        if (Character.isDigit(idCnum_div[j])){
                            n+=idCnum_div[j];
                        }
                    }
                    capturaCond.setText(n);}
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {
                }
            });
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    private void llenarspinerV(){

        String url = "https://acceso-tendo.000webhostapp.com/acceso/ruta/listarV.php";
        RVehi.post(url, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                if (statusCode == 200){
                    cargarspinerV(new String(responseBody));
                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {

            }
        });

    }

    private void cargarspinerV (String respuestaV){
        ArrayList<ruta_vehiculo> listaV = new ArrayList<ruta_vehiculo>();
        try {
            JSONArray jsonArreglo= new JSONArray(respuestaV);
            for (int i=0; i<jsonArreglo.length(); i++)
            {
                ruta_vehiculo rv = new ruta_vehiculo();
                rv.setIdvehiculo(jsonArreglo.getJSONObject(i).getString("idvehiculo"));
                rv.setPlaca(jsonArreglo.getJSONObject(i).getString("placa"));
                listaV.add(rv);
            }
            ArrayAdapter<ruta_vehiculo> a = new ArrayAdapter<ruta_vehiculo>(this, android.R.layout.simple_dropdown_item_1line,listaV);
            spVehiculo.setAdapter(a);
            spVehiculo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    if(isFirstTimes){
                        isFirstTimes=false;
                    }
                    else {
                    idVehiculo.setText(parent.getItemAtPosition(position).toString());
                    String m = idVehiculo.getText().toString();
                    capturaVehi.setText(m.substring(0,2));}
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {
                }
            });
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public void EnviarRuta(String URL){
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
                        CargarListaR(ja);
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

    public void CargarListaR(JSONArray ja){
        ArrayList<String> lista = new ArrayList<>();

        for(int i=0;i<ja.length();i+=3){

            try {

                lista.add("Ruta: "+ja.getString(i)+"  /  ID Vehiculo: "+ja.getString(i+1)+"\nID Conductor: "+ja.getString(i+2));
            } catch (JSONException e) {
                e.printStackTrace();
            }

        }

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lista);
        listaRuta.setAdapter(adaptador);


    }

    private void ingresarRuta (String URL) {

        if (ruta.getText().toString().isEmpty()) {
            ruta.setError("Complete los campos");}

       else {
            StringRequest stringRequest = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    Toast.makeText(getApplicationContext(), response, Toast.LENGTH_SHORT).show();
                    limpiarRuta();
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
                    parametros.put("ruta", ruta.getText().toString());
                    parametros.put("idvehiculo", capturaVehi.getText().toString());
                    parametros.put("idconductor", capturaCond.getText().toString());
                    return parametros;
                }
            };
            requestQueue = Volley.newRequestQueue(this);
            requestQueue.add(stringRequest);

        }
    }

    private void editarRuta (String URL) {

        if (ruta.getText().toString().isEmpty()) {
            ruta.setError("Complete los campos");}

        else {
            StringRequest stringRequest = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    Toast.makeText(getApplicationContext(), response, Toast.LENGTH_SHORT).show();
                    limpiarRuta();
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
                    parametros.put("idruta", rutaId.getText().toString());
                    parametros.put("ruta", ruta.getText().toString());
                    parametros.put("idvehiculo", capturaVehi.getText().toString());
                    parametros.put("idconductor", capturaCond.getText().toString());
                    return parametros;
                }
            };
            requestQueue = Volley.newRequestQueue(this);
            requestQueue.add(stringRequest);

        }
    }

    private void buscarRuta (String URL){
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(URL, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                JSONObject jsonObject = null;
                for (int i = 0; i < response.length(); i++) {
                    try {
                        jsonObject = response.getJSONObject(i);
                        rutaId.setText(jsonObject.getString("idruta"));
                        idVehiculo.setText(jsonObject.getString("idvehiculo"));
                        idConductor.setText(jsonObject.getString("idconductor"));
                    } catch (JSONException e) {
                        Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
                    }

                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(), "Ruta no Encontrada",Toast.LENGTH_SHORT).show();
            }
        }
        );

        requestQueue= Volley.newRequestQueue(this);
        requestQueue.add(jsonArrayRequest);
    }

    private void eliminarRuta (String URL){
        StringRequest stringRequest = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Toast.makeText(getApplicationContext(), response, Toast.LENGTH_SHORT).show();
                limpiarRuta();
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
                parametros.put("ruta", ruta.getText().toString());
                return parametros;
            }
        };
        RequestQueue requestQueue=Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }

    private void limpiarRuta (){
        ruta.setText("");
        capturaVehi.setText("");
        capturaCond.setText("");
    }

}