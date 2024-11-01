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
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.example.laboratoriomolecular.Adaptador.PlacaAdapter;
import com.example.laboratoriomolecular.Modelos.PlacaResponse;
import com.example.laboratoriomolecular.Modelos.RecepcionSpinner;
import com.example.laboratoriomolecular.R;
import com.example.laboratoriomolecular.Retrofit_Data.ApiClient;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import cz.msebera.android.httpclient.Header;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class nueva_placa extends AppCompatActivity implements PlacaAdapter.ClickedItemP {

    EditText CodPlaca;
    TextView fechaPl, id_recepcion, N_corrida;
    Button PGuardar,PActualizar;
    RecyclerView ListaPlaca;
    PlacaAdapter placaAdapter;
    Spinner spRecepcion,spCorrida;
    private AsyncHttpClient spRecepcion1;
    String s,PDayer;
    SwipeRefreshLayout NPrefresh;
    CheckBox chNPAyer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nueva_placa);

        CodPlaca = findViewById(R.id.CodPlaca);
        PGuardar = findViewById(R.id.PGuardar);
        PActualizar = findViewById(R.id.PActualizar);
        ListaPlaca = findViewById(R.id.ListaPlaca);
        fechaPl = findViewById(R.id.fechaPl);
        spRecepcion = findViewById(R.id.spRecepcion);
        spCorrida = findViewById(R.id.spCorrida);
        id_recepcion = findViewById(R.id.id_recepcion);
        N_corrida = findViewById(R.id.N_corrida);
        NPrefresh = findViewById(R.id.NPrefresh);
        chNPAyer = findViewById(R.id.chNPAyer);

        PGuardar.setOnClickListener(v -> ConfirmarPlaca());
        PActualizar.setOnClickListener(v -> ActualizarPlaca());

        ListaPlaca.setLayoutManager(new LinearLayoutManager(this));
        ListaPlaca.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));

        placaAdapter = new PlacaAdapter(this);

        fechaPlaca();
        ListarPlaca();

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.numeros, R.layout.support_simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(R.layout.spinner_dropdown_text);
        spCorrida.setAdapter(adapter);
        spCorrida.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                N_corrida.setText(parent.getItemAtPosition(position).toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        NPrefresh.setOnRefreshListener(()->{
            fechaPlaca();
            ListarPlaca();
            NPrefresh.setRefreshing(false);
        });

    }

    public void fechaPlaca (){

        final Calendar calendar = Calendar.getInstance();
        @SuppressLint("SimpleDateFormat") Format formatter = new SimpleDateFormat("yyyy-MM-dd");
        s = formatter.format(calendar.getTime());


        if (chNPAyer.isChecked()){
            NPayer();

        }else{
            PDayer = s;
        }
        fechaPl.setText(s);

        spRecepcion1 = new AsyncHttpClient();
        llenarspinnerRecep();
        hiloPlaca();

    }

    public void NPayer (){

        Calendar calendar = Calendar.getInstance();

        calendar.add(Calendar.DAY_OF_YEAR, -1);
        Date ayer = calendar.getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        PDayer = dateFormat.format(ayer);
        //Toast.makeText(nueva_placa.this,"ayer "+ PDayer,Toast.LENGTH_SHORT).show();
    }

    public void hiloPlaca(){
        new Handler(Looper.getMainLooper()).postDelayed(this::fechaPlaca,60000);
    }

    public void llenarspinnerRecep(){
        String url = "http://190.119.144.250:83/laboratorio/Placas/spRecepcion.php?fecha="+s;
        //String url = "http://192.168.1.25/laboratorio/Placas/spRecepcion.php?fecha="+s;
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
            Pa.setDropDownViewResource(R.layout.spinner_dropdown_text);
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

    public void ActualizarPlaca (){
        AlertDialog.Builder opcion = new AlertDialog.Builder(this);
        opcion.setMessage("Actualizar Placa?");
        opcion.setPositiveButton("Actualizar", (dialog, which) -> Actualizar());
        opcion.setNegativeButton("Cancelar", (dialog, which) -> dialog.cancel());

        AlertDialog dialog = opcion.create();
        dialog.show();
    }

    public void ListarPlaca (){
        Call<List<PlacaResponse>> placaList = ApiClient.getUserService().getPlacaF(PDayer);
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

    private void Placa (){

        if(CodPlaca.getText().toString().isEmpty()){
            CodPlaca.setError("Ingresar Placa");

        }else {
            Call<PlacaResponse> call = ApiClient.getUserService().savePlaca(CodPlaca.getText().toString(), N_corrida.getText().toString(),fechaPl.getText().toString(),id_recepcion.getText().toString());
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


    public void Actualizar (){
        Call<PlacaResponse> upPlaca = ApiClient.getUserService().updatePlaca(CodPlaca.getText().toString(), N_corrida.getText().toString(),fechaPl.getText().toString(),id_recepcion.getText().toString());
        upPlaca.enqueue(new Callback<PlacaResponse>() {
            @Override
            public void onResponse(@NonNull Call<PlacaResponse> call, @NonNull Response<PlacaResponse> response) {
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
            public void onFailure(@NonNull Call<PlacaResponse> call, @NonNull Throwable t) {
                Toast.makeText(nueva_placa.this, "Error Codigo: " + t.getMessage(), Toast.LENGTH_SHORT).show();
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