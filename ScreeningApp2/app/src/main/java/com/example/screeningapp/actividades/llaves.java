package com.example.screeningapp.actividades;

import android.os.Bundle;
import android.widget.Button;
import android.widget.SearchView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.example.screeningapp.Adaptador.LlaveAdapter;
import com.example.screeningapp.Modelos.LlaveResponse;
import com.example.screeningapp.R;
import com.example.screeningapp.RetrofitData.ApiClient;
import com.google.android.material.textfield.TextInputEditText;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class llaves extends AppCompatActivity implements LlaveAdapter.ClickedItemLl, SearchView.OnQueryTextListener{
    //implements LlavelAdapter.ClickedItemLl, SearchView.OnQueryTextListener

    SwipeRefreshLayout refreshKey;
    TextInputEditText NumKey;
    Button agregarKey;
    SearchView buscarKey;
    RecyclerView listallaves;
    String NK,estK = "1";
    LlaveAdapter llaveAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_llaves);

        refreshKey = findViewById(R.id.refreshKey);
        NumKey = findViewById(R.id.NumKey);
        agregarKey = findViewById(R.id.agregarKey);
        buscarKey  = findViewById(R.id.buscarKey);
        listallaves = findViewById(R.id.listallaves);

        agregarKey.setOnClickListener(view -> agrekey());


        listallaves.setLayoutManager(new LinearLayoutManager(this));
        listallaves.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        llaveAdapter = new LlaveAdapter(this);

        refreshKey.setOnRefreshListener(()->{
            getLlaves();
            refreshKey.setRefreshing(false);
        });


        getLlaves();
    }

    public void agrekey (){

        if(NumKey.getText().toString().isEmpty()){
            NumKey.setError("N° Llave");
        }else if(NumKey.getText().toString().equals("0")){
            NumKey.setError("Valor 0");
        }else {
            NK = NumKey.getText().toString();

            Call<LlaveResponse> agr = ApiClient.getUserService().ADDllave(NK);
            agr.enqueue(new Callback<LlaveResponse>() {
                @Override
                public void onResponse(@NonNull Call<LlaveResponse> call, @NonNull Response<LlaveResponse> response) {
                    if (response.isSuccessful()) {
                        LlaveResponse mensaje = response.body();
                        assert mensaje != null;
                        Toast.makeText(llaves.this, mensaje.getMensaje() + " " + response.code(), Toast.LENGTH_SHORT).show();
                        NumKey.getText().clear();
                    } else {
                        LlaveResponse mensaje = response.body();
                        assert mensaje != null;
                        Toast.makeText(llaves.this, "" + mensaje.getMensaje() + " " + response.code(), Toast.LENGTH_SHORT).show();
                    }
                }

                @Override
                public void onFailure(@NonNull Call<LlaveResponse> call, @NonNull Throwable t) {
                    Toast.makeText(llaves.this, "Error Code: " + t.getMessage(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

    public void getLlaves(){
        Call<List<LlaveResponse>> getK = ApiClient.getUserService().getLlaves(estK);
        getK.enqueue(new Callback<List<LlaveResponse>>() {
            @Override
            public void onResponse(@NonNull Call<List<LlaveResponse>> call, @NonNull Response<List<LlaveResponse>> response) {
                if (response.isSuccessful()) {
                        List<LlaveResponse> llaveResponses = response.body();
                        llaveAdapter.setData(llaveResponses);
                        listallaves.setAdapter(llaveAdapter);
                    }else {
                    Toast.makeText(llaves.this, "Error ", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(@NonNull Call<List<LlaveResponse>> call, @NonNull Throwable t) {
                Toast.makeText(llaves.this, "Error " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onQueryTextSubmit(String s) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String s) {
        llaveAdapter.filterLl(s);
        return false;
    }

    @Override
    public void ClickedLl(LlaveResponse llaveResponse) {
        //startActivity(new Intent(this,PersonalDetails.class).putExtra("datoPers",llaveResponse));
    }
}