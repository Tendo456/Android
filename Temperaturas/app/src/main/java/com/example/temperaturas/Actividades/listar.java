package com.example.temperaturas.Actividades;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.temperaturas.Conexion.ApiClient;
import com.example.temperaturas.Modelos.AtencionesAdapter;
import com.example.temperaturas.Modelos.AtencionesResponse;
import com.example.temperaturas.R;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class listar extends AppCompatActivity implements AtencionesAdapter.ClickedItem{

    private TextView RUserName;
    Toolbar toolbar;
    RecyclerView recyclerView;
    String n="2";
    AtencionesAdapter atencionesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar);

        RUserName = findViewById(R.id.title);
        toolbar = findViewById(R.id.toolbar);
        recyclerView = findViewById(R.id.recyclerview);

        String ISOS = getIntent().getStringExtra("username");

        String THIRD = getIntent().getStringExtra("EmailUser");

        if(ISOS == null){
            RUserName.setText(THIRD);
        }else
        {
            RUserName.setText(ISOS);
        }

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));

        atencionesAdapter = new AtencionesAdapter(this);

        getDatos();
    }

    public void getDatos(){
        Call<List<AtencionesResponse>> atention = ApiClient.getUserService().getPostById(Integer.parseInt(n));
        atention.enqueue(new Callback<List<AtencionesResponse>>() {
            @Override
            public void onResponse(Call<List<AtencionesResponse>> call, Response<List<AtencionesResponse>> response) {
                if(response.isSuccessful()){
                    List<AtencionesResponse> atencionesResponses = response.body();
                    atencionesAdapter.setData(atencionesResponses);
                    recyclerView.setAdapter(atencionesAdapter);
                }
            }

            @Override
            public void onFailure(Call<List<AtencionesResponse>> call, Throwable t) {
                Log.e("Failure",t.getLocalizedMessage());
            }
        });
    }

    @Override
    public void ClickedAtencion(AtencionesResponse atencionesResponse) {
    }
}