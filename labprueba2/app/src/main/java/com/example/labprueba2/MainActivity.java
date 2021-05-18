package com.example.labprueba2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    Button RGuardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RGuardar = findViewById(R.id.RGuardar);

        RGuardar.setOnClickListener(v -> saveuser());
    }


    private void saveuser(){
        Call<RespPost> call = ApiClient.getUserService().insert("2021-06-05 10:58:45","55", "44","luan","44444","1");
        call.enqueue(new Callback<RespPost>() {
            @Override
            public void onResponse(Call<RespPost> call, Response<RespPost> response) {
                if(response.isSuccessful()){
                    Toast.makeText(MainActivity.this, "Datos Guardados",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Error 1",Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<RespPost> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Error 2 "+t.getMessage(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}