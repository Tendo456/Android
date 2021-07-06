package com.example.laboratoriomolecular.Actividades;

import androidx.appcompat.app.AppCompatActivity;

import com.example.laboratoriomolecular.Modelos.PlacaResponse;
import com.example.laboratoriomolecular.R;
import com.example.laboratoriomolecular.Retrofit_Data.ApiClient;
import com.shuhart.stepview.StepView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PlacasDetails extends AppCompatActivity {

    TextView id_placa,N_placa,fechaP,N_corrida;
    PlacaResponse placaResponse;
    String estadoRe,estadoAl,estadoEx,estadoAr,estadoAm,estadoRes;
    StepView step_view;
    int count = 0;
    String idplaca;
    Button reiniciarPl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_placas_details);

        id_placa = findViewById(R.id.id_placa);
        N_placa = findViewById(R.id.N_placa);
        N_corrida = findViewById(R.id.N_corrida);
        fechaP = findViewById(R.id.fechaP);
        step_view = findViewById(R.id.step_view);
        reiniciarPl = findViewById(R.id.reiniciarPl);

        reiniciarPl.setOnClickListener(v -> Reiniciar());

        step_view.setOnStepClickListener(step -> Toast.makeText(PlacasDetails.this, "Proceso " + step, Toast.LENGTH_SHORT).show());

        Intent intent = getIntent();

        if (intent.getExtras() != null){
            placaResponse = (PlacaResponse) intent.getSerializableExtra("dataP");

            idplaca = placaResponse.getId_placa();
            String Nplaca = placaResponse.getN_placa();
            String Ncorrida = placaResponse.getN_corrida();
            String fechaPl = placaResponse.getFechaP();
            estadoRe = placaResponse.getEstadoRe();
            estadoAl = placaResponse.getEstadoAl();
            estadoEx = placaResponse.getEstadoEx();
            estadoAr = placaResponse.getEstadoAr();
            estadoAm = placaResponse.getEstadoAm();
            estadoRes = placaResponse.getEstadoRes();
            //estadoRes = placaResponse.getEstadoRe();

            id_placa.setText(idplaca);
            N_placa.setText(Nplaca);
            N_corrida.setText(Ncorrida);
            fechaP.setText(fechaPl);
        }

        PDhilo();

    }

    public void PDhilo(){
        new Handler(Looper.getMainLooper()).postDelayed(this::agregar,2000);
    }

    public void agregar(){
        if(estadoRe != null){
            if (estadoRe.equals("2")){
                paso();
            }else {
                Toast.makeText(PlacasDetails.this,"Proceso Actual Recepción",Toast.LENGTH_LONG).show();
            }
        }

        if(estadoAl != null){
            if (estadoAl.equals("2")){
                paso();
            }else {
                Toast.makeText(PlacasDetails.this,"Proceso Actual Alicuotado",Toast.LENGTH_LONG).show();
            }
        }

        if(estadoEx != null){
            if (estadoEx.equals("2")){
                paso();
            }else {
                Toast.makeText(PlacasDetails.this,"Proceso Actual Extracción",Toast.LENGTH_LONG).show();
            }
        }

        if (estadoAr != null){
            if (estadoAr.equals("2")){
                paso();
            }else {
                Toast.makeText(PlacasDetails.this,"Proceso Actual Area Limpia",Toast.LENGTH_LONG).show();
            }
        }

        if(estadoAm != null){
            if (estadoAm.equals("2")){
                paso();
            }else {
                Toast.makeText(PlacasDetails.this,"Proceso Actual Amplificación",Toast.LENGTH_LONG).show();
            }
        }
        if(estadoRes != null){
            if (estadoRes.equals("2")){
                paso();
            }else {
                Toast.makeText(PlacasDetails.this,"Proceso Actual Amplificación",Toast.LENGTH_LONG).show();
            }
        }

    }

    public void paso(){

            if (count < step_view.getStepCount() -1){
                count++;
                step_view.go(count,true);
            } else {
                step_view.done(true);
            }

    }

    public void Reiniciar (){
        Call<PlacaResponse> restart = ApiClient.getUserService().reiniciarPlaca(idplaca);
        restart.enqueue(new Callback<PlacaResponse>() {
            @Override
            public void onResponse(Call<PlacaResponse> call, Response<PlacaResponse> response) {
                if(response.isSuccessful()){
                    PlacaResponse mensaje = response.body();
                    Toast.makeText(PlacasDetails.this, ""+ mensaje.getMensaje()+" "+response.code(), Toast.LENGTH_SHORT).show();
                    finish();
                }
            }

            @Override
            public void onFailure(Call<PlacaResponse> call, Throwable t) {
                Toast.makeText(PlacasDetails.this,"Error: "+t.getMessage(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}