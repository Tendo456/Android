package com.example.laboratoriomolecular.Actividades;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.laboratoriomolecular.Adaptador.PlacaAdapter;
import com.example.laboratoriomolecular.Modelos.PlacaResponse;
import com.example.laboratoriomolecular.Modelos.PlacaSpinner;
import com.example.laboratoriomolecular.Modelos.RecepcionSpinner;
import com.example.laboratoriomolecular.R;
import com.example.laboratoriomolecular.Retrofit_Data.ApiClient;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import cz.msebera.android.httpclient.Header;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class nueva_placa extends AppCompatActivity implements PlacaAdapter.ClickedItemP {

    EditText CodPlaca;
    TextView fechaPl, id_recepcion;
    Button PGuardar;
    RecyclerView ListaPlaca;
    PlacaAdapter placaAdapter;
    Spinner spRecepcion;
    private AsyncHttpClient spRecepcion1;
    String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nueva_placa);

        CodPlaca = findViewById(R.id.CodPlaca);
        PGuardar = findViewById(R.id.PGuardar);
        ListaPlaca = findViewById(R.id.ListaPlaca);
        fechaPl = findViewById(R.id.fechaPl);
        spRecepcion = findViewById(R.id.spRecepcion);
        id_recepcion = findViewById(R.id.id_recepcion);

        PGuardar.setOnClickListener(v -> ConfirmarPlaca());

        ListaPlaca.setLayoutManager(new LinearLayoutManager(this));
        ListaPlaca.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));

        placaAdapter = new PlacaAdapter(this);

        fechaPlaca();

    }

    public void fechaPlaca (){
        final Calendar calendar = Calendar.getInstance();
        @SuppressLint("SimpleDateFormat") Format formatter = new SimpleDateFormat("yyyy-MM-dd");
        s = formatter.format(calendar.getTime());
        fechaPl.setText(s);

        spRecepcion1 = new AsyncHttpClient();
        llenarspinnerRecep();
        hiloPlaca();
        ListarPlaca();
    }

    public void hiloPlaca(){
        new Handler(Looper.getMainLooper()).postDelayed(this::fechaPlaca,60000);
    }

    public void llenarspinnerRecep(){
        String url = "http://10.50.1.184/laboratorio/Placas/spRecepcion.php?fecha="+s;
        spRecepcion1.post(url, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                if (statusCode == 200){
                    CargarSpinnerRecep(new String(responseBody));
                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                Toast.makeText(nueva_placa.this,"Error: Internet / Servidor", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void CargarSpinnerRecep(String Recep){
        ArrayList<RecepcionSpinner> Pls = new ArrayList<>();
        try{
            JSONArray PlacaArray = new JSONArray(Recep);
            for (int i=0; i<PlacaArray.length(); i++){
                RecepcionSpinner spP = new RecepcionSpinner();
                spP.setId_recepcion(PlacaArray.getJSONObject(i).getString("id_recepcion"));
                spP.setN_envio(PlacaArray.getJSONObject(i).getString("n_envio"));
                Pls.add(spP);
            }
            ArrayAdapter<RecepcionSpinner> Pa = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, Pls);
            spRecepcion.setAdapter(Pa);
            spRecepcion.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    id_recepcion.setText(Pls.get(position).getId_recepcion());
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

        }catch (Exception e){
            e.printStackTrace();
        }
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
            Call<PlacaResponse> call = ApiClient.getUserService().savePlaca(CodPlaca.getText().toString(),fechaPl.getText().toString(),id_recepcion.getText().toString());
            call.enqueue(new Callback<PlacaResponse>() {
                @Override
                public void onResponse(@NotNull Call<PlacaResponse> call, @NotNull Response<PlacaResponse> response) {
                    if (response.isSuccessful()) {

                        PlacaResponse mensaje = response.body();
                        Toast.makeText(nueva_placa.this, ""+ mensaje.getMensaje()+" "+response.code(), Toast.LENGTH_SHORT).show();
                        limpiarPlaca();
                        ListarPlaca();

                    } else {
                        Toast.makeText(nueva_placa.this, "Error al Guardar los Datos "+ response.code(), Toast.LENGTH_SHORT).show();
                    }
                }

                @Override
                public void onFailure(@NotNull Call<PlacaResponse> call, @NotNull Throwable t) {
                    Toast.makeText(nueva_placa.this, "Error Codigo: " + t.getMessage(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

    public void ListarPlaca (){
        Call<List<PlacaResponse>> placaList = ApiClient.getUserService().getPlacaF(fechaPl.getText().toString());
        placaList.enqueue(new Callback<List<PlacaResponse>>() {
            @Override
            public void onResponse(@NotNull Call<List<PlacaResponse>> call, @NotNull Response<List<PlacaResponse>> response) {
                if(response.isSuccessful()){
                    List<PlacaResponse> placaResponses = response.body();
                    placaAdapter.setData(placaResponses);
                    ListaPlaca.setAdapter(placaAdapter);
                }
            }

            @Override
            public void onFailure(@NotNull Call<List<PlacaResponse>> call, @NotNull Throwable t) {

            }
        });
    }

    public void limpiarPlaca(){
        CodPlaca.getText().clear();
    }

    @Override
    public void ClickedNueva_placa(PlacaResponse placaResponse) {
        startActivity(new Intent(this,PlacasDetails.class).putExtra("dataP",placaResponse));
    }
}