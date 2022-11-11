package com.example.laravel;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.laravel.Modelos.MainResponse;
import com.example.laravel.retrofit_Data.ApiClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    EditText id, nombre, edad, dni;
    Button buscar;
    String Sid;
    String id2;
    String nombre2 = null;
    String edad2;
    String dni2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        id = findViewById(R.id.id);
        nombre = findViewById(R.id.nombre);
        edad = findViewById(R.id.edad);
        dni = findViewById(R.id.dni);
        buscar = findViewById(R.id.buscar);

        buscar.setOnClickListener(v -> conseguir());
    }

    public void conseguir() {
        Call<List<MainResponse>> bus = ApiClient.getUserService().getDato(Sid);
        bus.enqueue(new Callback<List<MainResponse>>() {
            @Override
            public void onResponse(@NonNull Call<List<MainResponse>> call, @NonNull Response<List<MainResponse>> response) {
                if (response.isSuccessful()) {
                    List<MainResponse> mainResponses = response.body();
                    assert mainResponses != null;
                    for (MainResponse mainResponse : mainResponses){
                        nombre2 = mainResponse.getNombre();
                        edad2 = mainResponse.getEdad();
                        dni2 = mainResponse.getDni();
                    }
                    if(nombre2 == null){
                        Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
                    }else {
                        nombre.append(nombre2);
                        edad.append(edad2);
                        dni.setText(dni2);

                    }
                }
            }

            @Override
            public void onFailure(@NonNull Call<List<MainResponse>> call, @NonNull Throwable t) {
                Toast.makeText(MainActivity.this, "Error Code: " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}