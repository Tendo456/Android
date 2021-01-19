package com.example.poke;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    TextView texto1;
    String poke="ditto";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto1 = findViewById(R.id.texto1);

        PokemonById();
    }

    public void PokemonById(){

        Call<PokemonByIdResponse> call = ApiClient.getUserService().getPokemonById(poke);
        call.enqueue(new Callback<PokemonByIdResponse>() {
            @Override
            public void onResponse(Call<PokemonByIdResponse> call, Response<PokemonByIdResponse> response) {

                if(response.isSuccessful()){
                    PokemonByIdResponse pokemon = response.body();
                    Toast.makeText(MainActivity.this,"hecho",Toast.LENGTH_SHORT).show();
                } else {
                    Log.e("error", "Hubo un error inesperado!");
                }

            }

            @Override
            public void onFailure(Call<PokemonByIdResponse> call, Throwable t) {

            }
        });
    }
}