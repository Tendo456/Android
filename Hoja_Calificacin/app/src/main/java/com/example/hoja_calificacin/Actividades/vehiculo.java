package com.example.hoja_calificacin.Actividades;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.hoja_calificacin.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class vehiculo extends AppCompatActivity {

    EditText placaV,marcaV,modeloV;
    Button ingresarV,editarV,buscarV,eliminarV;
    ListView listaV;
    RequestQueue requestQueue;
    SwipeRefreshLayout refrescarV;
    TextView vehiculoId;

    private Window window;
    String primaryDark = "#3F51B5";
    String primary = "#3F51B5";
    String background = "#303F9F";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehiculo);

        this.window = getWindow();
        color(primaryDark,primary,background);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.autobus);

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

        refrescarV.setOnRefreshListener(() -> {

            String consultaV = "http://190.119.144.250:83/hoja_evaluacion/vehiculo/consultaVehiculo.php";
            EnviarVehiculo(consultaV);
            limpiarVehiculo();

            refrescarV.setRefreshing(false);
        });

        ingresarV.setOnClickListener(v -> ingresarVehiculo("http://190.119.144.250:83/hoja_evaluacion/vehiculo/insertVehiculo.php"));
        editarV.setOnClickListener(v -> editarVehiculo("http://190.119.144.250:83/hoja_evaluacion/vehiculo/editarVehiculo.php"));
        buscarV.setOnClickListener(v -> buscarVehiculo("http://190.119.144.250:83/hoja_evaluacion/vehiculo/buscarVehiculo.php?placa="+placaV.getText()));
        eliminarV.setOnClickListener(v -> eliminarVehiculo("http://190.119.144.250:83/hoja_evaluacion/vehiculo/eliminarVehiculo.php"));

        String consultaV = "http://190.119.144.250:83/hoja_evaluacion/vehiculo/consultaVehiculo.php";
        EnviarVehiculo(consultaV);
    }

    public void EnviarVehiculo(String URL){
        Toast.makeText(getApplicationContext(),"cargando", Toast.LENGTH_SHORT).show();

        RequestQueue queue = Volley.newRequestQueue(this);
        StringRequest stringRequest = new StringRequest(Request.Method.GET, URL, response -> {
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

        }, error -> Toast.makeText(getApplicationContext(), "Error",Toast.LENGTH_SHORT).show());

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

        ArrayAdapter<String> adaptador = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, lista);
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

            StringRequest stringRequest = new StringRequest(Request.Method.POST, URL, response -> {
                Toast.makeText(getApplicationContext(), response, Toast.LENGTH_SHORT).show();
                limpiarVehiculo();
            }, error -> Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT).show()) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {
                    Map<String, String> parametros = new HashMap<>();
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

            StringRequest stringRequest = new StringRequest(Request.Method.POST, URL, response -> {
                Toast.makeText(getApplicationContext(), response, Toast.LENGTH_SHORT).show();
                limpiarVehiculo();
            }, error -> Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT).show()) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {
                    Map<String, String> parametros = new HashMap<>();
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
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(URL, response -> {
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
        }, error -> Toast.makeText(getApplicationContext(), "Vehiculo no Encontrado",Toast.LENGTH_SHORT).show()
        );

        requestQueue= Volley.newRequestQueue(this);
        requestQueue.add(jsonArrayRequest);
    }

    private void eliminarVehiculo (String URL){
        StringRequest stringRequest = new StringRequest(Request.Method.POST, URL, response -> {
            Toast.makeText(getApplicationContext(), response, Toast.LENGTH_SHORT).show();
            limpiarVehiculo();
        }, error -> Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT).show()){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String>parametros= new HashMap<>();
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

    public void color (String primaryDark, String primary, String background){

        window.setStatusBarColor(Color.parseColor(primaryDark));

        Objects.requireNonNull(getSupportActionBar()).setBackgroundDrawable(new ColorDrawable(Color.parseColor(primary)));

        //window.setBackgroundDrawable(new ColorDrawable(Color.parseColor(background)));

        window.setNavigationBarColor(Color.parseColor(primary));

    }

}