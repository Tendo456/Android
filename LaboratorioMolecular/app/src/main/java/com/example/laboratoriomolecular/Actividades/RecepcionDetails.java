package com.example.laboratoriomolecular.Actividades;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
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

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.laboratoriomolecular.Modelos.OperadorResponse;
import com.example.laboratoriomolecular.Modelos.RecepcionResponse;
import com.example.laboratoriomolecular.R;
import com.example.laboratoriomolecular.Retrofit_Data.ApiClient;
import com.google.android.material.textfield.TextInputEditText;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import org.json.JSONArray;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

import cz.msebera.android.httpclient.Header;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RecepcionDetails extends AppCompatActivity {

    TextView RDfecha,RDhora,RDoperador,RDdni,RDID;
    TextInputEditText RDobservacion;
    EditText RDn_envio,RDq_muestras;
    RecepcionResponse recepcionResponse;
    int hora, minutos;
    String RDID1B,RDfecha1B, RDhora1B, RDn_envio1B, RDq_muestras1B, RDoperador1B, RDdni1B, RDobservacion1B;
    private AsyncHttpClient operadorRD;
    Spinner spOperadorRD;
    private boolean isFirstTime = true;
    Button RDguardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recepcion_details);

        RDID = findViewById(R.id.RDID);
        RDfecha = findViewById(R.id.RDfecha);
        RDhora = findViewById(R.id.RDhora);
        RDn_envio = findViewById(R.id.RDn_envio);
        RDq_muestras = findViewById(R.id.RDq_muestras);
        RDoperador = findViewById(R.id.RDoperador);
        RDdni = findViewById(R.id.RDdni);
        RDobservacion = findViewById(R.id.RDobservacion);
        spOperadorRD = findViewById(R.id.spOperadorRD);
        RDguardar = findViewById(R.id.RDguardar);

        operadorRD = new AsyncHttpClient();
        llenarspinerORD();

        Intent intent = getIntent();
        if(intent.getExtras() !=null){
            recepcionResponse = (RecepcionResponse) intent.getSerializableExtra("data");

            String RDID1 = recepcionResponse.getId_recepcion();
            String RDfecha1 = recepcionResponse.getFecha();
            String RDhora1 = recepcionResponse.getHora();
            String RDn_envio1 = recepcionResponse.getN_envio();
            String RDq_muestras1 = recepcionResponse.getQ_muestras();
            String RDoperador1 = recepcionResponse.getOperador();
            String RDdni1 = recepcionResponse.getDni();
            String RDobservacion1 = recepcionResponse.getObservacion();

            RDID.setText(RDID1);
            RDfecha.setText(RDfecha1);
            RDhora.setText(RDhora1);
            RDn_envio.setText(RDn_envio1);
            RDq_muestras.setText(RDq_muestras1);
            RDoperador.setText(RDoperador1);
            RDdni.setText(RDdni1);
            RDobservacion.setText(RDobservacion1);

        }

        RDguardar.setOnClickListener(v -> ConfirmarEdicionRD());
    }

    private void llenarspinerORD (){

        String url = "http://190.119.144.250:83/laboratorio/Operador/SpOperador.php";
        operadorRD.post(url, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                if (statusCode == 200){
                    cargarspinerORD(new String(responseBody));
                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {

            }
        });

    }

    private void cargarspinerORD (String respuestaO){
        ArrayList<OperadorResponse> listaO = new ArrayList<>();
        try {
            JSONArray jsonArreglo= new JSONArray(respuestaO);
            for (int i=0; i<jsonArreglo.length(); i++)
            {
                OperadorResponse spo = new OperadorResponse();
                spo.setOperador(jsonArreglo.getJSONObject(i).getString("operador"));
                spo.setDni(jsonArreglo.getJSONObject(i).getString("dni"));
                listaO.add(spo);
            }
            ArrayAdapter<OperadorResponse> a = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, listaO);
            spOperadorRD.setAdapter(a);
            spOperadorRD.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    if(isFirstTime){
                        isFirstTime=false;
                    }
                    else {
                        RDoperador.setText(parent.getItemAtPosition(position).toString());
                        RDdni.setText(listaO.get(position).getDni());
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

    public void SelectFecha (View view){

        final Calendar c = Calendar.getInstance();

        int day = c.get(Calendar.DAY_OF_MONTH);
        int month = c.get(Calendar.MONTH);
        int year = c.get(Calendar.YEAR);

        DatePickerDialog datePickerDialog = new DatePickerDialog(this,R.style.DialogTheme, (view1, year1, month1, dayOfMonth) -> {
            Calendar cal = Calendar.getInstance();
            cal.setTimeInMillis(0);
            cal.set(year1, month1, dayOfMonth, 0, 0, 0);
            Date chosenDate = cal.getTime();

            DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            String date = formatter.format(chosenDate);
            RDfecha.setText(date);
        },year,month,day);
        datePickerDialog.show();
    }

    public void SelectHora (View view){

        TimePickerDialog timePickerDialog = new TimePickerDialog(this,R.style.DialogTheme, (view1, hourOfDay, minute) -> {
            hora = hourOfDay;
            minutos = minute;
            //segundos = seconds;
            Calendar h = Calendar.getInstance();
            h.set(0,0,0,hora, minutos);
            RDhora.setText(android.text.format.DateFormat.format("HH:mm:ss",h));
        },12,0,true);
        timePickerDialog.updateTime(hora,minutos);
        timePickerDialog.show();
    }

    public void ConfirmarEdicionRD (){
        AlertDialog.Builder opcion = new AlertDialog.Builder(this);
        opcion.setMessage("Guardar Edición?");
        opcion.setPositiveButton("Guardar", (dialog, which) ->
                editarRD());
        opcion.setNegativeButton("Cancelar", (dialog, which) -> dialog.cancel());

        AlertDialog dialog = opcion.create();
        dialog.show();
    }

    public void editarRD(){

        if(RDn_envio.getText().toString().isEmpty()){
            RDn_envio.setError("Complete los campos");
        }else if (RDq_muestras.getText().toString().isEmpty()){
            RDq_muestras.setError("Complete los campos");
        }else if (RDdni.getText().toString().equals("0")){
            RDdni.setError("Complete los campos");
        }else {
            RDID1B = RDID.getText().toString();
            RDfecha1B = RDfecha.getText().toString();
            RDhora1B = RDhora.getText().toString();
            RDn_envio1B = RDn_envio.getText().toString();
            RDq_muestras1B = RDq_muestras.getText().toString();
            RDoperador1B = RDoperador.getText().toString();
            RDdni1B = RDdni.getText().toString();
            RDobservacion1B = Objects.requireNonNull(RDobservacion.getText()).toString();
            Call<RecepcionResponse> EDRD = ApiClient.getUserService().EditarRecepcion(RDID1B, RDfecha1B, RDhora1B, RDn_envio1B, RDq_muestras1B, RDoperador1B, RDdni1B, RDobservacion1B);
            EDRD.enqueue(new Callback<RecepcionResponse>() {
                @Override
                public void onResponse(@NonNull Call<RecepcionResponse> call, @NonNull Response<RecepcionResponse> response) {
                    if (response.isSuccessful()) {
                        RecepcionResponse mensaje = response.body();
                        assert mensaje != null;
                        Toast.makeText(RecepcionDetails.this, "" + mensaje.getMensaje() + " " + response.code(), Toast.LENGTH_SHORT).show();

                    } else {
                        RecepcionResponse mensaje = response.body();
                        assert mensaje != null;
                        Toast.makeText(RecepcionDetails.this, "" + mensaje.getMensaje() + " " + response.code(), Toast.LENGTH_SHORT).show();
                    }
                }

                @Override
                public void onFailure(@NonNull Call<RecepcionResponse> call, @NonNull Throwable t) {
                    Toast.makeText(RecepcionDetails.this, "Error Code: " + t.getMessage(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}