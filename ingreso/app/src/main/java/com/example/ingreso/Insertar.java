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

public class Insertar extends AppCompatActivity {

    EditText txtNombres, txtDni, txtEdad, txtSexo,txtIdruta;
    TextView tmpIdRuta;
    Button btnIngresar;
    Spinner spSexoI,spRutaI;
    private AsyncHttpClient inRuta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNombres = findViewById(R.id.txtNombres);
        txtDni = findViewById(R.id.txtDni);
        txtEdad = findViewById(R.id.txtEdad);
        txtSexo = findViewById(R.id.txtSexo);
        txtIdruta = findViewById(R.id.txtIdruta);
        spRutaI = findViewById(R.id.spRuta);
        spSexoI = findViewById(R.id.spSexoI);
        tmpIdRuta = findViewById(R.id.tmpIdRuta);

        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.sexo, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spSexoI.setAdapter(adapter2);
        spSexoI.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                txtSexo.setText(parent.getItemAtPosition(position).toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        btnIngresar=findViewById(R.id.btnIngresar);
        btnIngresar.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){
                insertar();
            }
        });

        inRuta = new AsyncHttpClient();
        llenarspRuta();

    }

    private void llenarspRuta (){

        String url = "https://acceso-tendo.000webhostapp.com/acceso/listarRin.php";
        inRuta.post(url, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                if (statusCode == 200){
                    cargarspRuta(new String(responseBody));
                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {

            }
        });

    }

    private void cargarspRuta (String respuestaI){
        ArrayList<ruta_personal> listaInR = new ArrayList<ruta_personal>();
        try {
            JSONArray jsonArreglo= new JSONArray(respuestaI);
            for (int i=0; i<jsonArreglo.length(); i++)
            {
                ruta_personal rp = new ruta_personal();
                rp.setIdruta(jsonArreglo.getJSONObject(i).getString("idruta"));
                rp.setRuta(jsonArreglo.getJSONObject(i).getString("ruta"));
                listaInR.add(rp);
            }
            ArrayAdapter<ruta_personal> a = new ArrayAdapter<ruta_personal>(this, android.R.layout.simple_dropdown_item_1line,listaInR);
            spRutaI.setAdapter(a);
            spRutaI.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                        txtIdruta.setText(parent.getItemAtPosition(position).toString());
                        String m = txtIdruta.getText().toString();
                        tmpIdRuta.setText(m.substring(0,2));

                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {
                }
            });
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    private void insertar() {
        final String nombres=txtNombres.getText().toString().trim();
        final String dni=txtDni.getText().toString().trim();
        final String edad=txtEdad.getText().toString().trim();
        final String sexo=txtSexo.getText().toString().trim();
        final String idruta=tmpIdRuta.getText().toString().trim();


        final ProgressDialog progressDialog=new ProgressDialog(this);

        if (nombres.isEmpty()){
            txtNombres.setError("Complete los Campos");
        }
        else if (dni.isEmpty()){
            txtDni.setError("Complete los Campos");
        }
        else if (edad.isEmpty()){
            txtEdad.setError("Complete los Campos");
        }
        else if (sexo.isEmpty()){
            txtSexo.setError("Complete los Campos");
        }
        else if (idruta.isEmpty()){
            txtIdruta.setError("Complete los Campos");
        }
        else {
            progressDialog.show();
            StringRequest request=new StringRequest(Request.Method.POST, "http://acceso-tendo.000webhostapp.com/acceso/insertar.php", new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    if (response.equalsIgnoreCase("Datos Insertados")){
                        limpiar();
                        Toast.makeText(Insertar.this,response,Toast.LENGTH_SHORT).show();
                        progressDialog.dismiss();
                        finish();
                    }
                    else{
                        Toast.makeText(Insertar.this,"Error",Toast.LENGTH_SHORT).show();
                        progressDialog.dismiss();
                    }
                }
            }, new Response.ErrorListener(){
                @Override
                public void onErrorResponse(VolleyError error) {
                    Toast.makeText(Insertar.this,"Error",Toast.LENGTH_SHORT).show();
                    progressDialog.dismiss();
                }

            } ){
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {
                    Map<String ,String>params=new HashMap<String, String>();
                    params.put("nombres",nombres);
                    params.put("dni",dni);
                    params.put("edad",edad);
                    params.put("sexo",sexo);
                    params.put("idruta",idruta);

                    return params;
                }
            };
            RequestQueue requestQueue= Volley.newRequestQueue(Insertar.this);
            requestQueue.add(request);
        }


    }

    public void limpiar(){
        txtNombres.setText("");
        txtDni.setText("");
        txtEdad.setText("");
        txtSexo.setText("");
        txtIdruta.setText("");
    }
}



