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
    Button buscar, save;
    String Sid;
    String id2;
    String nombre2;
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
        save = findViewById(R.id.save);

        buscar.setOnClickListener(v -> conseguir());
        save.setOnClickListener(v -> salvar());
    }

    public void conseguir() {
        Call<List<MainResponse>> bus = ApiClient.getUserService().getDato();
        bus.enqueue(new Callback<List<MainResponse>>() {
            @Override
            public void onResponse(@NonNull Call<List<MainResponse>> call, @NonNull Response<List<MainResponse>> response) {
                if (response.isSuccessful()) {
                    List<MainResponse> mainResponses = response.body();
                    assert mainResponses != null;
                    for (MainResponse mainResponse : mainResponses){
                        id2 = mainResponse.getId();
                        nombre2 = mainResponse.getNombre();
                        edad2 = mainResponse.getEdad();
                        dni2 = mainResponse.getDni();
                    }
                    if(nombre2 == null){
                        Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
                    }else {
                        id.setText(id2);
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

    public void salvar (){
        nombre2 = nombre.getText().toString();
        edad2 = edad.getText().toString();
        dni2 = dni.getText().toString();

        Call<MainResponse> gu = ApiClient.getUserService().insert(nombre2,edad2,dni2);
        gu.enqueue(new Callback<MainResponse>() {
            @Override
            public void onResponse(@NonNull Call<MainResponse> call, @NonNull Response<MainResponse> response) {
                if (response.isSuccessful()){
                    MainResponse mensage = response.body();
                    assert mensage != null;
                    Toast.makeText(MainActivity.this, mensage.getMensaje() + " " + response.code(), Toast.LENGTH_SHORT).show();
                }else {
                    MainResponse mensage = response.body();
                    assert mensage != null;
                    Toast.makeText(MainActivity.this, mensage.getMensaje() + " " + response.code(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(@NonNull Call<MainResponse> call, @NonNull Throwable t) {
                Toast.makeText(MainActivity.this, "Error Code: " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}