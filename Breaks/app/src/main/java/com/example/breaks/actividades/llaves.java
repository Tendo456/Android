package com.example.breaks.actividades;

import android.os.Bundle;
import android.widget.Button;
import android.widget.SearchView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.example.breaks.Modelos.LlaveResponse;
import com.example.breaks.R;
import com.example.breaks.RetrofitData.ApiClient;
import com.google.android.material.textfield.TextInputEditText;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class llaves extends AppCompatActivity {

    SwipeRefreshLayout refreshKey;
    TextInputEditText NumKey;
    Button agregarKey;
    SearchView buscarKey;
    RecyclerView listallaves;
    String NK;

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
}