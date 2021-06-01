package com.example.laboratoriomolecular.Actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.laboratoriomolecular.Modelos.PlacaResponse;
import com.example.laboratoriomolecular.R;
import com.example.laboratoriomolecular.Retrofit_Data.ApiClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class nueva_placa extends AppCompatActivity {

    EditText CodPlaca;
    Button PGuardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nueva_placa);

        CodPlaca = findViewById(R.id.CodPlaca);
        PGuardar = findViewById(R.id.PGuardar);

        PGuardar.setOnClickListener(v -> Placa());
    }

    private void Placa (){

        if(CodPlaca.getText().toString().isEmpty()){
            CodPlaca.setError("Ingresar Placa");

        }else {
            Call<PlacaResponse> call = ApiClient.getUserService().savePlaca(CodPlaca.getText().toString());
            call.enqueue(new Callback<PlacaResponse>() {
                @Override
                public void onResponse(Call<PlacaResponse> call, Response<PlacaResponse> response) {
                    if (response.isSuccessful()) {
                        Toast.makeText(nueva_placa.this, "Placa Creada", Toast.LENGTH_SHORT).show();

                    } else {
                        Toast.makeText(nueva_placa.this, "Error al Guardar los Datos", Toast.LENGTH_SHORT).show();
                    }
                }

                @Override
                public void onFailure(Call<PlacaResponse> call, Throwable t) {
                    Toast.makeText(nueva_placa.this, "Error Codigo: " + t.getMessage(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}