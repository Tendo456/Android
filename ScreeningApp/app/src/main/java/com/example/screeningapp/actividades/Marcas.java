package com.example.screeningapp.actividades;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.screeningapp.Adaptador.MarcasAdapter;
import com.example.screeningapp.Modelos.MarcasResponse;
import com.example.screeningapp.R;
import com.example.screeningapp.RetrofitData.ApiClient;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Marcas extends AppCompatActivity implements MarcasAdapter.ClickedItemM{

    FloatingActionButton addmarca;
    RecyclerView MarcasList;
    MarcasAdapter marcasAdapter;
    Switch MarcasEstado;
    Button MarcasSearch;
    String est="1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marcas);

        addmarca = findViewById(R.id.addmarca);
        MarcasList = findViewById(R.id.MarcasList);
        MarcasEstado = findViewById(R.id.MarcasEstado);
        MarcasSearch = findViewById(R.id.MarcasSearch);


        MarcasList.setLayoutManager(new LinearLayoutManager(this));
        MarcasList.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
        marcasAdapter = new MarcasAdapter(this);



        MarcasSearch.setOnClickListener(v -> getMarcas());
        addmarca.setOnClickListener(v -> addmarcasig());
        getMarcas();
    }

    public void getMarcas(){

        if(MarcasEstado.isChecked()){
            est = "2";
            Toast.makeText(Marcas.this, "Marcas Inactivas ", Toast.LENGTH_SHORT).show();
        }else {
            est="1";
            Toast.makeText(Marcas.this, "Marcas Activas ", Toast.LENGTH_SHORT).show();
        }

        Call<List<MarcasResponse>> marcalist = ApiClient.getUserService().getMarcas(est);
        marcalist.enqueue(new Callback<List<MarcasResponse>>() {
            @Override
            public void onResponse(@NonNull Call<List<MarcasResponse>> call, @NonNull Response<List<MarcasResponse>> response) {
                if(response.isSuccessful()){
                    List<MarcasResponse> marcasResponses = response.body();
                    marcasAdapter.setData(marcasResponses);
                    MarcasList.setAdapter(marcasAdapter);
                }
            }

            @Override
            public void onFailure(@NonNull Call<List<MarcasResponse>> call, @NonNull Throwable t) {
                Toast.makeText(Marcas.this, "Error Code: " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void addmarcasig (){
        Intent intent = new Intent(Marcas.this, Marcas_add.class);
        //intent.putExtra("DisplayUser",nombre.getText().toString());
        //intent.putExtra("EmailUser",email.getText().toString());
        startActivity(intent);

    }

    @Override
    public void ClickedMarca(MarcasResponse marcasResponse) {
        startActivity(new Intent(this,MarcasDetails.class).putExtra("data",marcasResponse));
        finish();
    }
}