package com.example.inventarioqr.Actividades;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.inventarioqr.Modelos.LectorResponse;
import com.example.inventarioqr.R;
import com.example.inventarioqr.RetrofitData.ApiClient;
import com.google.android.material.textfield.TextInputEditText;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

import java.util.List;
import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Lector extends AppCompatActivity {

    TextInputEditText datoID, datoEquipo, datoSerie, datoDescripcion;
    Button btnScan, button3;
    String contador;
    String id = null;
    String equipo = null;
    String serie = null;
    String descripcion = null;
    SwitchCompat Activar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lector);

        datoID = findViewById(R.id.datoID);
        datoEquipo = findViewById(R.id.datoEquipo);
        datoSerie = findViewById(R.id.datoSerie);
        datoDescripcion = findViewById(R.id.datoDescripcion);
        btnScan = findViewById(R.id.btnScan);
        button3 = findViewById(R.id.button3);
        Activar = findViewById(R.id.Activar);

        btnScan.setOnClickListener(v -> Scan());

        datoID.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(s.toString().length()>=1){
                    Objects.requireNonNull(datoEquipo.getText()).clear();
                    Objects.requireNonNull(datoSerie.getText()).clear();
                    Objects.requireNonNull(datoDescripcion.getText()).clear();
                    contador = Objects.requireNonNull(datoID.getText()).toString();
                    Toast.makeText(Lector.this, "Buscando: "+contador, Toast.LENGTH_SHORT).show();
                    getData();
                }else {
                    button3.setEnabled(false);
                }
            }
        });
    }


    public void Scan (){
        IntentIntegrator integrador = new IntentIntegrator(Lector.this);
        integrador.setDesiredBarcodeFormats(IntentIntegrator.ALL_CODE_TYPES);
        integrador.setPrompt("Lector - QR");
        integrador.setCameraId(0);
        integrador.setOrientationLocked(false);
        integrador.setCaptureActivity(com.example.inventarioqr.Actividades.orientacion.class);
        integrador.setBeepEnabled(true);
        integrador.setBarcodeImageEnabled(true);
        integrador.initiateScan();

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        IntentResult result = IntentIntegrator.parseActivityResult(requestCode,resultCode,data);

        if(result != null){
            if(result.getContents() == null){
                Toast.makeText(this,"Lectura Cancelada", Toast.LENGTH_SHORT).show();
            }else {
                Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){v.vibrate(VibrationEffect.createOneShot(500, VibrationEffect.DEFAULT_AMPLITUDE));}
                Toast.makeText(this,"Buscando: "+result.getContents(), Toast.LENGTH_SHORT).show();
                datoID.setText(result.getContents());
            }
        }else{
            super.onActivityResult(requestCode, resultCode, data);
        }
    }

    public void getData (){

        Call<List<LectorResponse>> pc = ApiClient.getUserService().getEquipo(contador);
        pc.enqueue(new Callback<List<LectorResponse>>() {
            @Override
            public void onResponse(@NonNull Call<List<LectorResponse>> call, @NonNull Response<List<LectorResponse>> response) {
                if (response.isSuccessful()){
                    Objects.requireNonNull(datoEquipo.getText()).clear();

                    List<LectorResponse> lectorResponses = response.body();
                    assert lectorResponses !=null;
                    for (LectorResponse lectorResponse: lectorResponses){
                        equipo = lectorResponse.getEquipo();
                        serie = lectorResponse.getSerie();
                        descripcion = lectorResponse.getDescripcion();
                    }
                    if (equipo == null){
                        Toast.makeText(Lector.this, "No Encontrado", Toast.LENGTH_SHORT).show();
                    }else{
                        datoEquipo.setText(equipo);
                        datoSerie.setText(serie);
                        datoDescripcion.setText(descripcion);
                    }
                }
            }

            @Override
            public void onFailure(@NonNull Call<List<LectorResponse>> call, @NonNull Throwable t) {
                Toast.makeText(Lector.this, "Error Code: " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void ActivarProg (View view){
        if(Activar.isChecked()){
            datoID.setEnabled(true);
            datoEquipo.setEnabled(true);
            datoSerie.setEnabled(true);
            datoDescripcion.setEnabled(true);
        }else {
            datoID.setEnabled(false);
            datoEquipo.setEnabled(false);
            datoSerie.setEnabled(false);
            datoDescripcion.setEnabled(false);
        }
    }
}