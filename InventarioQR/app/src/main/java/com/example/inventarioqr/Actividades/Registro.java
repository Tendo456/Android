package com.example.inventarioqr.Actividades;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.inventarioqr.Modelos.LectorResponse;
import com.example.inventarioqr.R;
import com.example.inventarioqr.RetrofitData.ApiClient;
import com.google.android.material.textfield.TextInputEditText;

import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Registro extends AppCompatActivity {

    ImageView createQR;
    TextInputEditText sendEquipo, sendSerie, sendDescripcion;
    Button btnSave;
    String saveEquipo, saveSerie, saveDescripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        createQR = findViewById(R.id.createQR);
        sendEquipo = findViewById(R.id.sendEquipo);
        sendSerie = findViewById(R.id.sendSerie);
        sendDescripcion = findViewById(R.id.sendDescripcion);
        btnSave = findViewById(R.id.btnSave);

        btnSave.setOnClickListener(v -> comfirmPC());

    }

    public void comfirmPC (){
        AlertDialog.Builder opcion = new AlertDialog.Builder(this);
        opcion.setMessage("Agregar Equipo?");
        opcion.setPositiveButton("Agregar", (dialog, which) -> savePC());
        opcion.setNegativeButton("Cancelar", (dialog, which) -> dialog.cancel());

        AlertDialog dialog = opcion.create();
        dialog.show();
    }

    public void savePC () {

        if (Objects.requireNonNull(sendEquipo.getText()).toString().isEmpty()) {
            sendEquipo.setError("Vacío");
        } else if (Objects.requireNonNull(sendSerie.getText()).toString().isEmpty()) {
            sendSerie.setError("Vacio");
        } else {

            saveEquipo = Objects.requireNonNull(sendEquipo.getText()).toString();
            saveSerie = Objects.requireNonNull(sendSerie.getText().toString());
            saveDescripcion = Objects.requireNonNull(sendDescripcion.getText()).toString();

        Call<LectorResponse> inPC = ApiClient.getUserService().insertEquipo(saveEquipo, saveSerie, saveDescripcion);
        inPC.enqueue(new Callback<LectorResponse>() {
            @Override
            public void onResponse(@NonNull Call<LectorResponse> call, @NonNull Response<LectorResponse> response) {
                if (response.isSuccessful()) {
                    LectorResponse mensage = response.body();
                    assert mensage != null;
                    Toast.makeText(Registro.this, mensage.getMensage() + " " + response.code(), Toast.LENGTH_SHORT).show();
                } else {
                    LectorResponse mensage = response.body();
                    assert mensage != null;
                    Toast.makeText(Registro.this, mensage.getMensage() + " " + response.code(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(@NonNull Call<LectorResponse> call, @NonNull Throwable t) {
                Toast.makeText(Registro.this, "Error Code: " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
    }
}