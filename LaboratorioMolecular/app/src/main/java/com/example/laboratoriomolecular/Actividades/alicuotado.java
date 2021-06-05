package com.example.laboratoriomolecular.Actividades;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.laboratoriomolecular.Adaptador.AlicuotadoAdapter;
import com.example.laboratoriomolecular.Modelos.AlicuotadoResponse;
import com.example.laboratoriomolecular.Modelos.OperadorResponse;
import com.example.laboratoriomolecular.Modelos.PlacaSpinner;
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
import java.util.Date;
import java.util.List;

import cz.msebera.android.httpclient.Header;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class alicuotado extends AppCompatActivity implements AlicuotadoAdapter.ClickedItemA{

    Spinner spPlacasA,spOperA;
    TextView AN_placa, Aq_muestras, Af_inicio, Ah_inicio, Af_final, Ah_final, Aoperador ,Adni;
    private AsyncHttpClient operadorA;
    AlicuotadoAdapter alicuotadoAdapter;
    RecyclerView ListAlicuotado;
    String idAl, placaAl, muestrasAl, FinicioAL, HinicioAL, FfinalAl, HfinalAl, F, H, AN_placa1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alicuotado);

        spPlacasA = findViewById(R.id.spPlacasA);
        spOperA = findViewById(R.id.spOperA);
        AN_placa = findViewById(R.id.AN_placa);
        Aq_muestras = findViewById(R.id.Aq_muestras);
        Af_inicio = findViewById(R.id.Af_inicio);
        Ah_inicio = findViewById(R.id.Ah_inicio);
        Af_final = findViewById(R.id.Af_final);
        Ah_final = findViewById(R.id.Ah_final);
        Aoperador = findViewById(R.id.Aoperador);
        Adni = findViewById(R.id.Adni);
        ListAlicuotado = findViewById(R.id.ListAlicuotado);

        ListAlicuotado.setLayoutManager(new LinearLayoutManager(this));
        ListAlicuotado.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));

        alicuotadoAdapter = new AlicuotadoAdapter(this);

        Afecha();
        operadorA = new AsyncHttpClient();
        llsOpeA();
    }

    public void Afecha (){
        final Calendar calendar = Calendar.getInstance();
        @SuppressLint("SimpleDateFormat") Format formatter = new SimpleDateFormat("yyyy-MM-dd");
         F = formatter.format(calendar.getTime());

        Date date = new Date();
        @SuppressLint("SimpleDateFormat") Format h = new SimpleDateFormat("HH:mm:ss");
        H = h.format(date);

        Af_inicio.setText(F);
        Ah_inicio.setText(H);
        Af_final.setText(F);
        Ah_final.setText(H);
        llenarspinnerA();
        new Handler(Looper.getMainLooper()).postDelayed(this::conseguir,3000);
        Ahilo();
    }

    public void Ahilo(){
        new Handler(Looper.getMainLooper()).postDelayed(this::Afecha,60000);
    }

    public void llenarspinnerA(){

        List<PlacaSpinner> Aplaca = new ArrayList<>();
        ArrayAdapter<PlacaSpinner> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,Aplaca);

        Call<List<PlacaSpinner>> placaList = ApiClient.getUserService().getPlacaFe(F);
        placaList.enqueue(new Callback<List<PlacaSpinner>>() {
            @Override
            public void onResponse(@NotNull Call<List<PlacaSpinner>> call, @NotNull Response<List<PlacaSpinner>> response) {
                if(response.isSuccessful()){
                    assert response.body() != null;
                    for (PlacaSpinner post : response.body()){

                        String plac = post.getN_placa();
                        PlacaSpinner placaSpinner = new PlacaSpinner(plac);
                        Aplaca.add(placaSpinner);

                        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        spPlacasA.setAdapter(adapter);
                    }

                }
                spPlacasA.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        AN_placa1 = parent.getItemAtPosition(position).toString();
                        AN_placa.setText(AN_placa1);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
            }

            @Override
            public void onFailure(@NotNull Call<List<PlacaSpinner>> call, @NotNull Throwable t) {

            }
        });
    }

    private void llsOpeA (){

        String url = "http://10.50.1.202/laboratorio/Operador/SpOperador.php";
        operadorA.post(url, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                if (statusCode == 200){
                    csOpeA(new String(responseBody));
                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {

            }
        });

    }

    private void csOpeA (String respuestaO){
        ArrayList<OperadorResponse> spOpeA = new ArrayList<>();
        try {
            JSONArray jsonArreglo= new JSONArray(respuestaO);
            for (int i=0; i<jsonArreglo.length(); i++)
            {
                OperadorResponse spo = new OperadorResponse();
                spo.setOperador(jsonArreglo.getJSONObject(i).getString("operador"));
                spo.setDni(jsonArreglo.getJSONObject(i).getString("dni"));
                spOpeA.add(spo);
            }
            ArrayAdapter<OperadorResponse> a = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, spOpeA);
            spOperA.setAdapter(a);
            spOperA.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        Aoperador.setText(parent.getItemAtPosition(position).toString());
                        Adni.setText(spOpeA.get(position).getDni());

                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {
                }
            });
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public void ClickedAlicuotado(AlicuotadoResponse alicuotadoResponse) {
        //Aq_muestras.setText(alicuotadoResponse.getQ_muestras());

        idAl = alicuotadoResponse.getId_alicuotado();
        placaAl = alicuotadoResponse.getN_placa();
        muestrasAl = alicuotadoResponse.getQ_muestras();
        FinicioAL = alicuotadoResponse.getF_inicio();
        HinicioAL = alicuotadoResponse.getH_inicio();
        FfinalAl = alicuotadoResponse.getF_final();
        HfinalAl = alicuotadoResponse.getH_final();

        if (muestrasAl == null){ Aq_muestras.setText("Vacio"); }else { Aq_muestras.setText(muestrasAl); }
        if(FinicioAL == null){ Af_inicio.setText(F); }else { Af_inicio.setText(FinicioAL); }
        if(HinicioAL == null){Ah_inicio.setText(H);} else {Ah_inicio.setText(HinicioAL);}
        if(FfinalAl == null){Af_final.setText(F);} else {Af_final.setText(FfinalAl);}
        if(HfinalAl == null){Ah_final.setText(H);} else {Ah_final.setText(HfinalAl);}
    }

    private void conseguir (){
        Call<List<AlicuotadoResponse>> alicuotadoList = ApiClient.getUserService().conseguirAl(F);
        alicuotadoList.enqueue(new Callback<List<AlicuotadoResponse>>() {
            @Override
            public void onResponse(@NotNull Call<List<AlicuotadoResponse>> call, @NotNull Response<List<AlicuotadoResponse>> response) {
                if(response.isSuccessful()){
                    List<AlicuotadoResponse> alicuotadoResponses = response.body();
                    alicuotadoAdapter.setData(alicuotadoResponses);
                    ListAlicuotado.setAdapter(alicuotadoAdapter);

                }
            }

            @Override
            public void onFailure(@NotNull Call<List<AlicuotadoResponse>> call, @NotNull Throwable t) {
                Log.e("Fallo ",t.getLocalizedMessage());
            }
        });

    }

}