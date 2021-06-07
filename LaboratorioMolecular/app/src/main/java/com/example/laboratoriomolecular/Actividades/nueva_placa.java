package com.example.laboratoriomolecular.Actividades;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.laboratoriomolecular.Adaptador.PlacaAdapter;
import com.example.laboratoriomolecular.Modelos.PlacaResponse;
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

public class nueva_placa extends AppCompatActivity {

    EditText CodPlaca;
    TextView fechaPl;
    Button PGuardar;
    RecyclerView ListaPlaca;
    PlacaAdapter placaAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nueva_placa);

        CodPlaca = findViewById(R.id.CodPlaca);
        PGuardar = findViewById(R.id.PGuardar);
        ListaPlaca = findViewById(R.id.ListaPlaca);
        fechaPl = findViewById(R.id.fechaPl);

        PGuardar.setOnClickListener(v -> ConfirmarPlaca());

        ListaPlaca.setLayoutManager(new LinearLayoutManager(this));
        ListaPlaca.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));

        placaAdapter = new PlacaAdapter();

        fechaPlaca();
    }

    public void fechaPlaca (){
        final Calendar calendar = Calendar.getInstance();
        @SuppressLint("SimpleDateFormat") Format formatter = new SimpleDateFormat("yyyy-MM-dd");
        String s = formatter.format(calendar.getTime());

        fechaPl.setText(s);
        hiloPlaca();
        ListarPlaca();
    }

    public void hiloPlaca(){
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                fechaPlaca();
            }
        },3000);
    }

    public void ConfirmarPlaca (){
        AlertDialog.Builder opcion = new AlertDialog.Builder(this);
        opcion.setMessage("Crear Placa?");
        opcion.setPositiveButton("Crear", (dialog, which) -> Placa());
        opcion.setNegativeButton("Cancelar", (dialog, which) -> dialog.cancel());

        AlertDialog dialog = opcion.create();
        dialog.show();
    }

    private void Placa (){

        if(CodPlaca.getText().toString().isEmpty()){
            CodPlaca.setError("Ingresar Placa");

        }else {
            Call<PlacaResponse> call = ApiClient.getUserService().savePlaca(CodPlaca.getText().toString(),fechaPl.getText().toString());
            call.enqueue(new Callback<PlacaResponse>() {
                @Override
                public void onResponse(Call<PlacaResponse> call, Response<PlacaResponse> response) {
                    if (response.isSuccessful()) {
                        Toast.makeText(nueva_placa.this, "Placa Creada", Toast.LENGTH_SHORT).show();

                    } else {
                        Toast.makeText(nueva_placa.this, "Error al Guardar los Datos", Toast.LENGTH_SHORT).show();
                    }
                }

                @Override
                public void onFailure(Call<PlacaResponse> call, Throwable t) {
                    Toast.makeText(nueva_placa.this, "Error Codigo: " + t.getMessage(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

    public void ListarPlaca (){
        Call<List<PlacaResponse>> placaList = ApiClient.getUserService().getPlacaF(fechaPl.getText().toString());
        placaList.enqueue(new Callback<List<PlacaResponse>>() {
            @Override
            public void onResponse(Call<List<PlacaResponse>> call, Response<List<PlacaResponse>> response) {
                if(response.isSuccessful()){
                    List<PlacaResponse> placaResponses = response.body();
                    placaAdapter.setData(placaResponses);
                    ListaPlaca.setAdapter(placaAdapter);
                }
            }

            @Override
            public void onFailure(Call<List<PlacaResponse>> call, Throwable t) {

            }
        });
    }
}