package com.example.hoja.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.hoja.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class conductor extends AppCompatActivity {

    EditText dniC,nombreC,breveteC;
    TextView conductorId;
    Button ingresarC,editaC,buscarC,eliminarC;
    ListView listaC;
    RequestQueue requestQueue;
    SwipeRefreshLayout refrescarC;
    private Window window;
    String primaryDark = "#3F51B5";
    String primary = "#3F51B5";
    String background = "#303F9F";
    Animation transparenciaC;
    ImageView fondoC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_conductor);

        Objects.requireNonNull(getSupportActionBar()).setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.conductor);

        this.window = getWindow();
        color(primaryDark,primary,background);

        transparenciaC = AnimationUtils.loadAnimation(this, R.anim.transparencia);

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
        fondoC = findViewById(R.id.fondoC);

        fondoC.setAnimation(transparenciaC);


        refrescarC.setOnRefreshListener(() -> {

            String consulta = "http://190.119.144.250:83/hoja_evaluacion/conductor/consultaConductor.php";
            EnviarConductor(consulta);
            limpiarConductor();

            refrescarC.setRefreshing(false);
        });

        ingresarC.setOnClickListener(v -> ingresarConductor());

        editaC.setOnClickListener(v -> editarConductor());

        buscarC.setOnClickListener(v -> buscarConductor("http://190.119.144.250:83/hoja_evaluacion/conductor/buscarConductor.php?dni="+dniC.getText()));

        eliminarC.setOnClickListener(v -> eliminarConductor());

        String Consult = "http://190.119.144.250:83/hoja_evaluacion/conductor/consultaConductor.php";
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

        }, error -> Toast.makeText(getApplicationContext(), "Error",Toast.LENGTH_SHORT).show());

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

    private void ingresarConductor() {

        if (dniC.getText().toString().isEmpty()) {
            dniC.setError("Complete los campos");}

        else if (nombreC.getText().toString().isEmpty()) {
            nombreC.setError("Complete los campos");
        } else if (breveteC.getText().toString().isEmpty()) {
            breveteC.setError("Complete los Campos");
        } else {

            StringRequest stringRequest = new StringRequest(Request.Method.POST, "http://190.119.144.250:83/hoja_evaluacion/conductor/insertConductor.php", response -> {
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

    private void editarConductor() {

        if (dniC.getText().toString().isEmpty()) {
            dniC.setError("Complete los campos");}

        else if (nombreC.getText().toString().isEmpty()) {
            nombreC.setError("Complete los campos");
        } else if (breveteC.getText().toString().isEmpty()) {
            breveteC.setError("Complete los Campos");
        } else {

            StringRequest stringRequest = new StringRequest(Request.Method.POST, "http://190.119.144.250:83/hoja_evaluacion/conductor/editarConductor.php", response -> {
                Toast.makeText(getApplicationContext(), response, Toast.LENGTH_SHORT).show();
                limpiarConductor();
            }, error -> Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT).show()) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {
                    Map<String, String> parametros = new HashMap<>();
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
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(URL, response -> {
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
        }, error -> Toast.makeText(getApplicationContext(), "Usuario no Encontrado",Toast.LENGTH_SHORT).show()
        );

        requestQueue= Volley.newRequestQueue(this);
        requestQueue.add(jsonArrayRequest);
    }

    private void eliminarConductor(){
        StringRequest stringRequest = new StringRequest(Request.Method.POST, "http://190.119.144.250:83/hoja_evaluacion/conductor/eliminarConductor.php", response -> {
            Toast.makeText(getApplicationContext(), response, Toast.LENGTH_SHORT).show();
            limpiarConductor();
        }, error -> Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT).show()){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String>parametros= new HashMap<>();
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

    public void color (String primaryDark, String primary, String background){

        window.setStatusBarColor(Color.parseColor(primaryDark));

        Objects.requireNonNull(getSupportActionBar()).setBackgroundDrawable(new ColorDrawable(Color.parseColor(primary)));

        //window.setBackgroundDrawable(new ColorDrawable(Color.parseColor(background)));

        window.setNavigationBarColor(Color.parseColor(primary));

    }
}