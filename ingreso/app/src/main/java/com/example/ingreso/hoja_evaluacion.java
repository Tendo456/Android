package com.example.ingreso;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
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
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import cz.msebera.android.httpclient.Header;
public class hoja_evaluacion extends AppCompatActivity {

    RadioButton rbP1_1,rbP1_2,rbP1_3,rbP2_1,rbP2_2,rbP2_3,rbP3_1,rbP3_2,rbP3_3;
    EditText Coment1,Coment2,Coment3,idRhoja;
    TextView tmpHoja,prueba,dateHoja;
    String respEpp = "si", respLimp = "si", respCond = "si";
    Button btEnviar,btCancelar;
    Spinner spHoja;
    private AsyncHttpClient RHoja;
    private int dia,mes,año;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoja_evaluacion);

        rbP1_1 = findViewById(R.id.rbP1_1);
        rbP1_2 = findViewById(R.id.rbP1_2);
        rbP1_3 = findViewById(R.id.rbP1_3);
        rbP2_1 = findViewById(R.id.rbP2_1);
        rbP2_2 = findViewById(R.id.rbP2_2);
        rbP2_3 = findViewById(R.id.rbP2_3);
        rbP3_1 = findViewById(R.id.rbP3_1);
        rbP3_2 = findViewById(R.id.rbP3_2);
        rbP3_3 = findViewById(R.id.rbP3_3);
        Coment1 = findViewById(R.id.Coment1);
        Coment2 = findViewById(R.id.Coment2);
        Coment3 = findViewById(R.id.Coment3);
        btEnviar = findViewById(R.id.btEnviar);
        btCancelar = findViewById(R.id.btCancelar);
        idRhoja = findViewById(R.id.idRHoja);
        spHoja = findViewById(R.id.spHoja);
        tmpHoja = findViewById(R.id.tmpHoja);
        prueba = findViewById(R.id.probar);
        dateHoja = findViewById(R.id.dateHoja);
        prueba.setText(respEpp+" - "+respLimp+" - "+respCond);


        btEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                confirmar();
            }
        });

        btCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        RHoja = new AsyncHttpClient();
        llenarspHoja();
        fechaHoja();

    }

    public void confirmar(){
        AlertDialog.Builder opcion = new AlertDialog.Builder(this);
        opcion.setMessage("Enviar los Datos?");
        opcion.setPositiveButton("Enviar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                ingresarHoja("https://acceso-tendo.000webhostapp.com/acceso/hoja/insertHoja.php");
            }
        });
        opcion.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        AlertDialog dialog = opcion.create();
        dialog.show();
    }

    private void llenarspHoja (){

        String url = "https://acceso-tendo.000webhostapp.com/acceso/listarRin.php";
        RHoja.post(url, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                if (statusCode == 200){
                    cargarspHoja(new String(responseBody));
                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {

            }
        });

    }

    private void cargarspHoja (String respuestaE){
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
            spHoja.setAdapter(ed);
            spHoja.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                        idRhoja.setText(parent.getItemAtPosition(position).toString());
                        String x = idRhoja.getText().toString();
                        tmpHoja.setText(x.substring(0,2));

                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {
                }
            });
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public void opciones_radio(View view){

        //pregubta 1

        if(rbP1_1.isChecked()){
            respEpp = "si";

        }
        else if(rbP1_2.isChecked()){
            respEpp = "parcialmente";
        }
        else if (rbP1_3.isChecked()){
            respEpp = "no";
        }

        //pregunta 2

        if(rbP2_1.isChecked()){
            respLimp = "si";
        }
        else if(rbP2_2.isChecked()){
            respLimp = "parcialmente";
        }
        else if (rbP2_3.isChecked()){
            respLimp = "no";
        }

        //pregunta 3

        if(rbP3_1.isChecked()){
            respCond = "si";
        }
        else if(rbP3_2.isChecked()){
            respCond = "parcialmente";
        }
        else if (rbP3_3.isChecked()){
            respCond = "no";
        }

        prueba.setText(respEpp+" - "+respLimp+" - "+respCond);

    }

    private void ingresarHoja(String URL){
        StringRequest stringRequest = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Toast.makeText(getApplicationContext(), response, Toast.LENGTH_SHORT).show();
                limpiar();

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
                parametros.put("uso_epp", respEpp);
                parametros.put("descripcion_epp", Coment1.getText().toString());
                parametros.put("limpieza", respLimp);
                parametros.put("descripcion_limpieza", Coment2.getText().toString());
                parametros.put("conduccion",respCond);
                parametros.put("descripcion_conduccion",Coment3.getText().toString());
                parametros.put("dateHoja",dateHoja.getText().toString());
                parametros.put("idruta",tmpHoja.getText().toString());
                return parametros;
            }
        };
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);

    }

    public void fechaHoja (){
        final Calendar calendar = Calendar.getInstance();
        dia =calendar.get(Calendar.DAY_OF_YEAR);
        mes= calendar.get(Calendar.MONTH);
        año = calendar.get(Calendar.YEAR);
        Format formatter = new SimpleDateFormat("yyyy-MM-dd");
        String s = formatter.format(calendar.getTime());

        dateHoja.setText(s);
    }

    private void limpiar(){
        Coment1.setText("");
        Coment2.setText("");
        Coment3.setText("");

    }

}