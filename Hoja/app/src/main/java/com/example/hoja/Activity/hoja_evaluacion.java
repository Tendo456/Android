package com.example.hoja.Activity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.hoja.R;
import com.example.hoja.Modelos.ruta_personal;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import org.json.JSONArray;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import cz.msebera.android.httpclient.Header;

public class hoja_evaluacion extends AppCompatActivity {

    RadioButton rbP1_1,rbP1_2,rbP1_3,rbP2_1,rbP2_2,rbP2_3,rbP3_1,rbP3_2,rbP3_3;
    EditText Coment1,Coment2,Coment3;
    TextView tmpHoja,prueba,dateHoja,timeHoja,idRhoja,NombreUser,EmailUser;
    String respEpp = "si", respLimp = "si", respCond = "si";
    Button btEnviar,btCancelar;
    Spinner spHoja;
    Animation transparencia;
    ImageView fondo;
    private AsyncHttpClient RHoja;

    private Window window;
    String primaryDark = "#3F51B5";
    String primary = "#3F51B5";
    String background = "#303F9F";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_hoja_evaluacion);

        this.window = getWindow();
        color(primaryDark,primary,background);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.calificacion);

        transparencia = AnimationUtils.loadAnimation(this, R.anim.transparencia);
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
        timeHoja = findViewById(R.id.timeHoja);
        EmailUser = findViewById(R.id.EmailUser);
        NombreUser = findViewById(R.id.NombreUser);
        fondo = findViewById(R.id.fondo);

        fondo.setAnimation(transparencia);
        prueba.setText(respEpp+" - "+respLimp+" - "+respCond);

        Date date = new Date();
        Format f = new SimpleDateFormat("yyyy-MM-dd");
        String fe = f.format(date);
        dateHoja.setText(fe);
        Format h = new SimpleDateFormat("hh:mm a");
        String ho = h.format(date);
        timeHoja.setText(ho);

        String NameUser = getIntent().getStringExtra("DisplayUser1");
        NombreUser.setText(NameUser);

        String EmailU = getIntent().getStringExtra("EmailUser1");
        EmailUser.setText(EmailU);


        btEnviar.setOnClickListener(v -> confirmar());

        btCancelar.setOnClickListener(v -> finish());

        RHoja = new AsyncHttpClient();
        llenarspHoja();
    }

    public void confirmar(){
        AlertDialog.Builder opcion = new AlertDialog.Builder(this);
        opcion.setMessage("Enviar los Datos?");
        opcion.setPositiveButton("Enviar", (dialog, which) -> ingresarHoja("http://190.119.144.250:83/hoja_evaluacion/hoja/insertHoja.php"));
        opcion.setNegativeButton("Cancelar", (dialog, which) -> dialog.cancel());

        AlertDialog dialog = opcion.create();
        dialog.show();
    }

    private void llenarspHoja (){

        String url = "http://190.119.144.250:83/hoja_evaluacion/hoja/listarRin.php";
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
        ArrayList<ruta_personal> listaEdR = new ArrayList<>();
        try {
            JSONArray jsonArreglo= new JSONArray(respuestaE);
            for (int i=0; i<jsonArreglo.length(); i++)
            {
                ruta_personal rpE = new ruta_personal();
                rpE.setIdruta(jsonArreglo.getJSONObject(i).getString("idruta"));
                rpE.setRuta(jsonArreglo.getJSONObject(i).getString("ruta"));
                listaEdR.add(rpE);
            }
            ArrayAdapter<ruta_personal> ed = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, listaEdR);
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

    public void opcionesradio(View view){
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
        if (NombreUser.equals("Nombres y Apellidos")){
            NombreUser.setError("Error Sin Nombre de Usuario");
            Toast.makeText(this,"Error Reintente", Toast.LENGTH_SHORT).show();
        }

        else {

            StringRequest stringRequest = new StringRequest(Request.Method.POST, URL, response -> {
                Toast.makeText(getApplicationContext(), response, Toast.LENGTH_SHORT).show();
                limpiar();
                finish();

            }, error -> Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT).show()) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {
                    Map<String, String> parametros = new HashMap<>();
                    parametros.put("persona", NombreUser.getText().toString());
                    parametros.put("email",EmailUser.getText().toString());
                    parametros.put("uso_epp", respEpp);
                    parametros.put("descripcion_epp", Coment1.getText().toString());
                    parametros.put("limpieza", respLimp);
                    parametros.put("descripcion_limpieza", Coment2.getText().toString());
                    parametros.put("conduccion", respCond);
                    parametros.put("descripcion_conduccion", Coment3.getText().toString());
                    parametros.put("dateHoja", dateHoja.getText().toString());
                    parametros.put("timeHoja", timeHoja.getText().toString());
                    parametros.put("idruta", tmpHoja.getText().toString());
                    return parametros;
                }
            };
            RequestQueue requestQueue = Volley.newRequestQueue(this);
            requestQueue.add(stringRequest);

        }

    }


    private void limpiar(){
        Coment1.setText("");
        Coment2.setText("");
        Coment3.setText("");

    }

    public void color (String primaryDark, String primary, String background){

        window.setStatusBarColor(Color.parseColor(primaryDark));

        Objects.requireNonNull(getSupportActionBar()).setBackgroundDrawable(new ColorDrawable(Color.parseColor(primary)));

        //window.setBackgroundDrawable(new ColorDrawable(Color.parseColor(background)));

        window.setNavigationBarColor(Color.parseColor(primary));

    }
}