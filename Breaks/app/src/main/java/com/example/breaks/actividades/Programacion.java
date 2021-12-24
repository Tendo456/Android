package com.example.breaks.actividades;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.breaks.Adaptador.ProgramacionAdapter;
import com.example.breaks.Modelos.ProgramacionResponse;
import com.example.breaks.R;
import com.example.breaks.RetrofitData.ApiClient;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Programacion extends AppCompatActivity implements ProgramacionAdapter.ClickedItemP{

    TextView fechaProg;
    Button buscarProg;
    RecyclerView listaProg;
    FloatingActionButton addProg;
    ProgramacionAdapter programacionAdapter;
    String fecha_prog = "2021-12-24";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programacion);

        fechaProg = findViewById(R.id.fechaProg);
        buscarProg = findViewById(R.id.buscarProg);
        listaProg = findViewById(R.id.listaProg);
        addProg = findViewById(R.id.addProg);


        listaProg.setLayoutManager(new LinearLayoutManager(this));
        listaProg.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        programacionAdapter = new ProgramacionAdapter(this);

        getProg();

    }

    public void getProg(){
        Call<List<ProgramacionResponse>> ProgL = ApiClient.getUserService().getProg(fecha_prog);
        ProgL.enqueue(new Callback<List<ProgramacionResponse>>() {
            @Override
            public void onResponse(Call<List<ProgramacionResponse>> call, Response<List<ProgramacionResponse>> response) {
                if(response.isSuccessful()){
                    List<ProgramacionResponse> programacionResponses = response.body();
                    programacionAdapter.setData(programacionResponses);
                    listaProg.setAdapter(programacionAdapter);
                }

            }

            @Override
            public void onFailure(Call<List<ProgramacionResponse>> call, Throwable t) {
                Toast.makeText(Programacion.this, "Error " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void ClickedProg(ProgramacionResponse programacionResponse) {
        startActivity(new Intent(this,ProgramacionDetails.class).putExtra("datoProg",programacionResponse));
        finish();
    }
}