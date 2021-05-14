package com.example.laboratoriomolecular.Actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.laboratoriomolecular.Modelos.RecepcionRequest;
import com.example.laboratoriomolecular.Modelos.RecepcionResponse;
import com.example.laboratoriomolecular.R;
import com.example.laboratoriomolecular.Retrofit_Data.ApiClient;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class recepcion extends AppCompatActivity {

    EditText Rhora,Rnenvio,Rqmuestras,Roperador,Rdni,Restado;
    Button RGuardar;
    String est;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recepcion);

        Rhora = findViewById(R.id.Rhora);
        Rnenvio = findViewById(R.id.Rnenvio);
        Rqmuestras = findViewById(R.id.Rqmuestras);
        Roperador = findViewById(R.id.Roperador);
        Rdni = findViewById(R.id.Rdni);
        RGuardar = findViewById(R.id.RGuardar);
        est = "0";

        fecha();

        RGuardar.setOnClickListener(v -> Guardar_Recepcion(createRequest()));
    }

    public void fecha (){
        final Calendar calendar = Calendar.getInstance();
        @SuppressLint("SimpleDateFormat") Format formatter = new SimpleDateFormat("yyyy-MM-dd");
        String s = formatter.format(calendar.getTime());

        Date date = new Date();
        //@SuppressLint("SimpleDateFormat") Format h = new SimpleDateFormat("hh:mm:ss");
        @SuppressLint("SimpleDateFormat") Format h = new SimpleDateFormat("HH:mm:ss");
        String ho = h.format(date);

        Rhora.setText(s+" "+ho);
    }

    public RecepcionRequest createRequest(){
        RecepcionRequest recepcionRequest = new RecepcionRequest();
        recepcionRequest.setHora(Rhora.getText().toString());
        recepcionRequest.setN_envio(Rnenvio.getText().toString());
        recepcionRequest.setQ_muestras(Rqmuestras.getText().toString());
        recepcionRequest.setOperador(Roperador.getText().toString());
        recepcionRequest.setDni(Rdni.getText().toString());
        recepcionRequest.setEstado(est);

        return recepcionRequest;
    }

    public void Guardar_Recepcion (RecepcionRequest recepcionRequest){
        Call<RecepcionResponse> recepcionResponseCall = ApiClient.getUserService().saveRecepcion(recepcionRequest);
        recepcionResponseCall.enqueue(new Callback<RecepcionResponse>() {
            @Override
            public void onResponse(Call<RecepcionResponse> call, Response<RecepcionResponse> response) {
                if(response.isSuccessful()){
                    Toast.makeText(recepcion.this, "Datos Guardados",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(recepcion.this, "Error al Guardar 1",Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<RecepcionResponse> call, Throwable t) {
                Toast.makeText(recepcion.this, "Error al Guardar",Toast.LENGTH_SHORT).show();
            }
        });
    }


}