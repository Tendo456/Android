package com.example.laboratoriomolecular.Actividades;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.laboratoriomolecular.Adaptador.RecepcionAdapter;
import com.example.laboratoriomolecular.Modelos.RecepcionResponse;
import com.example.laboratoriomolecular.R;
import com.example.laboratoriomolecular.Retrofit_Data.ApiClient;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class recepcion extends AppCompatActivity implements RecepcionAdapter.ClickedItem{

    EditText Rhora,Rnenvio,Rqmuestras,Roperador,Rdni,Restado;
    Button RGuardar;
    String estado;
    RecepcionAdapter recepcionAdapter;
    RecyclerView ListRecepcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recepcion);

        Rhora = findViewById(R.id.Rhora);
        Rnenvio = findViewById(R.id.Rnenvio);
        Rqmuestras = findViewById(R.id.Rqmuestras);
        Roperador = findViewById(R.id.Roperador);
        Rdni = findViewById(R.id.Rdni);
        RGuardar = findViewById(R.id.RGuardar);
        ListRecepcion = findViewById(R.id.ListRecepcion);
        estado = "0";

        ListRecepcion.setLayoutManager(new LinearLayoutManager(this));
        ListRecepcion.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));

        recepcionAdapter = new RecepcionAdapter(this::ClickedRecepcion);

        fecha();
        getAllRecepcion();
        RGuardar.setOnClickListener(v -> saveRecepcion());

    }



    public void fecha (){
        final Calendar calendar = Calendar.getInstance();
        @SuppressLint("SimpleDateFormat") Format formatter = new SimpleDateFormat("yyyy-MM-dd");
        String s = formatter.format(calendar.getTime());

        Date date = new Date();
        //@SuppressLint("SimpleDateFormat") Format h = new SimpleDateFormat("hh:mm:ss");
        @SuppressLint("SimpleDateFormat") Format h = new SimpleDateFormat("HH:mm:ss");
        String ho = h.format(date);

        Rhora.setText(s+" "+ho);
    }

    private void saveRecepcion (){
        Call<RecepcionResponse> call = ApiClient.getUserService().InsertarRecepcion(Rhora.getText().toString(),Rnenvio.getText().toString(),Rqmuestras.getText().toString(),Roperador.getText().toString(),Rdni.getText().toString(),"1");
        call.enqueue(new Callback<RecepcionResponse>() {
            @Override
            public void onResponse(Call<RecepcionResponse> call, Response<RecepcionResponse> response) {
                if(response.isSuccessful()){
                    Toast.makeText(recepcion.this, "Datos Guardados",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(recepcion.this, "Error 1",Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<RecepcionResponse> call, Throwable t) {
                Toast.makeText(recepcion.this, "Error 2 "+t.getMessage(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void getAllRecepcion(){
        Call<List<RecepcionResponse>> recepcionList = ApiClient.getUserService().getRecepcion();
        recepcionList.enqueue(new Callback<List<RecepcionResponse>>() {
            @Override
            public void onResponse(Call<List<RecepcionResponse>> call, Response<List<RecepcionResponse>> response) {
                if(response.isSuccessful()){
                    List<RecepcionResponse> recepcionResponses = response.body();
                    recepcionAdapter.setData(recepcionResponses);
                    ListRecepcion.setAdapter(recepcionAdapter);
                }
            }

            @Override
            public void onFailure(Call<List<RecepcionResponse>> call, Throwable t) {
                Log.e("Fallo ",t.getLocalizedMessage());
            }
        });

    }


    @Override
    public void ClickedRecepcion(RecepcionResponse recepcionResponse) {

    }
}