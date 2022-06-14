package com.example.ingreso;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import org.json.JSONArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import cz.msebera.android.httpclient.Header;

public class Editar extends AppCompatActivity {

    EditText txtId_Personal,txtNombres, txtDni, txtEdad, txtSexo, txtIdruta;
    Button btnModificar;
    TextView tmpEdRuta;
    Spinner spRutaE, spSexo;
    private boolean isFirstTime = true,isFirstTime1 = true;
    private boolean isFirstTimed = true,isFirstTimed1 = true;
    private AsyncHttpClient EdRuta;


    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar);

        txtId_Personal = findViewById(R.id.txtId);
        txtNombres = findViewById(R.id.txtNombres);
        txtDni = findViewById(R.id.txtDni);
        txtEdad = findViewById(R.id.txtEdad);
        txtSexo = findViewById(R.id.txtSexo);
        txtIdruta = findViewById(R.id.txtIdruta);
        btnModificar= findViewById(R.id.btnModificar);
        spRutaE = findViewById(R.id.spRutaE);
        spSexo = findViewById(R.id.spSexo);
        tmpEdRuta = findViewById(R.id.tmpEdRuta);

        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.sexo, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spSexo.setAdapter(adapter1);
        spSexo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(isFirstTime){
                    isFirstTime=false;
                }
                else {
                    txtSexo.setText(parent.getItemAtPosition(position).toString());
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        Intent intent = getIntent();
        position=intent.getExtras().getInt("position");
        txtId_Personal.setText(Home.users.get(position).getId_Personal());
        txtNombres.setText(Home.users.get(position).getNombres());
        txtDni.setText(Home.users.get(position).getDni());
        txtEdad.setText(Home.users.get(position).getEdad());
        txtSexo.setText(Home.users.get(position).getSexo());
        txtIdruta.setText(Home.users.get(position).getIdruta());

        EdRuta = new AsyncHttpClient();
        llenarspRutaEd();
    }

    private void llenarspRutaEd (){

        String url = "https://acceso-tendo.000webhostapp.com/acceso/listarRin.php";
        EdRuta.post(url, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                if (statusCode == 200){
                    cargarspRutaEd(new String(responseBody));
                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {

            }
        });

    }

    private void cargarspRutaEd (String respuestaE){
        ArrayList<ruta_personal> listaEdR = new ArrayList<ruta_personal>();
        try {
            JSONArray jsonArreglo= new JSONArray(respuestaE);
            for (int i=0; i<jsonArreglo.length(); i++)
            {
                ruta_personal rpE = new ruta_personal();
                rpE.setIdruta(jsonArreglo.getJSONObject(i).getString("idruta"));
                rpE.setRuta(jsonArreglo.getJSONObject(i).getString("ruta"));
                listaEdR.add(rpE);
            }
            ArrayAdapter<ruta_personal> ed = new ArrayAdapter<ruta_personal>(this, android.R.layout.simple_dropdown_item_1line,listaEdR);
            spRutaE.setAdapter(ed);
            spRutaE.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    if(isFirstTimed){
                        isFirstTimed=false;
                    }
                    else{
                        txtIdruta.setText(parent.getItemAtPosition(position).toString());
                        //String m = txtIdruta.getText().toString();
                        //tmpEdRuta.setText(m.substring(0,2));
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {
                }
            });
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public void actualizar (View view){

        final String nombres = txtNombres.getText().toString();
        final String dni = txtDni.getText().toString();
        final String edad = txtEdad.getText().toString();
        final String sexo = txtSexo.getText().toString();
        final String idruta = txtIdruta.getText().toString();
        final String id_personal = txtId_Personal.getText().toString();


        final ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Cargando....");
        progressDialog.show();

        StringRequest request = new StringRequest(Request.Method.POST, "http://acceso-tendo.000webhostapp.com/acceso/actualizar.php",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        Toast.makeText(Editar.this, response, Toast.LENGTH_SHORT).show();
                        finish();
                        progressDialog.dismiss();
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                Toast.makeText(Editar.this, error.getMessage(), Toast.LENGTH_SHORT).show();
                progressDialog.dismiss();

            }
        }){

            @Override
            protected Map<String, String> getParams() throws AuthFailureError {

                Map<String,String> params = new HashMap<String,String>();

                params.put("id_personal",id_personal);
                params.put("nombres",nombres);
                params.put("dni",dni);
                params.put("edad",edad);
                params.put("sexo",sexo);
                params.put("idruta",idruta);


                return params;
            }
        };

        RequestQueue requestQueue = Volley.newRequestQueue(Editar.this);
        requestQueue.add(request);


    }

}