package com.example.poke;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements UsersAdapter.ClickedItem{

    String poke="ditto";
    Toolbar toolbar;
    RecyclerView recyclerView;

    UsersAdapter usersAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        recyclerView = findViewById(R.id.recyclerview);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));

        usersAdapter = new UsersAdapter(this::ClickedUser);

        PokemonById();
    }

    public void PokemonById(){

        Call<List<PokemonByIdResponse>> call = ApiClient.getUserService().getPokemonById(poke);
        call.enqueue(new Callback<List<PokemonByIdResponse>>() {
            @Override
            public void onResponse(Call<List<PokemonByIdResponse>> call, Response<List<PokemonByIdResponse>> response) {
                if(response.isSuccessful()){
                    List<PokemonByIdResponse> pokemon = response.body();
                    usersAdapter.setData(pokemon);
                    recyclerView.setAdapter(usersAdapter);
                    Toast.makeText(MainActivity.this,"hecho",Toast.LENGTH_SHORT).show();
                } else {
                    Log.e("error", "Hubo un error inesperado!");
                }
            }

            @Override
            public void onFailure(Call<List<PokemonByIdResponse>> call, Throwable t) {
                Log.e("Failure",t.getLocalizedMessage());
            }
        });
    }

    @Override
    public void ClickedUser(PokemonByIdResponse pokemonByIdResponse) {

    }
}