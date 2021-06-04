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

public class alicuotado extends AppCompatActivity implements AlicuotadoAdapter.ClickedItemA{

    Spinner spPlacasA,spOperA;
    TextView Af_inicio,Aoperador,Adni,Aq_muestras,AN_placa;
    private AsyncHttpClient placasA;
    private AsyncHttpClient operadorA;
    AlicuotadoAdapter alicuotadoAdapter;
    RecyclerView ListAlicuotado;
    String idAl,placaAl,muestrasAl,FinicioAL,HinicioAL,FfinalAl,HfinalAl,s,AN_placa1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alicuotado);

        spPlacasA = findViewById(R.id.spPlacasA);
        spOperA = findViewById(R.id.spOperA);
        Af_inicio = findViewById(R.id.Af_inicio);
        Aoperador = findViewById(R.id.Aoperador);
        AN_placa = findViewById(R.id.AN_placa);
        Adni = findViewById(R.id.Adni);
        Aq_muestras = findViewById(R.id.Aq_muestras);
        ListAlicuotado = findViewById(R.id.ListAlicuotado);

        ListAlicuotado.setLayoutManager(new LinearLayoutManager(this));
        ListAlicuotado.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));

        alicuotadoAdapter = new AlicuotadoAdapter(this::ClickedAlicuotado);

        placasA = new AsyncHttpClient();
        Afecha();
        operadorA = new AsyncHttpClient();
        llsOpeA();
    }

    public void Afecha (){
        final Calendar calendar = Calendar.getInstance();
        @SuppressLint("SimpleDateFormat") Format formatter = new SimpleDateFormat("yyyy-MM-dd");
         s = formatter.format(calendar.getTime());

        Af_inicio.setText(s);

        llenarspinnerA();

        new Handler(Looper.getMainLooper()).postDelayed(() -> conseguir(),5000);
    }

    public void llenarspinnerA(){

        List<PlacaSpinner> Aplaca = new ArrayList<>();
        ArrayAdapter<PlacaSpinner> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,Aplaca);

        Call<List<PlacaSpinner>> placaList = ApiClient.getUserService().getPlacaFe(s);
        placaList.enqueue(new Callback<List<PlacaSpinner>>() {
            @Override
            public void onResponse(Call<List<PlacaSpinner>> call, Response<List<PlacaSpinner>> response) {
                if(response.isSuccessful()){
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
            public void onFailure(Call<List<PlacaSpinner>> call, Throwable t) {

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

        if (muestrasAl.isEmpty()){
            Aq_muestras.setText(s);
        }else {
            Aq_muestras.setText(muestrasAl);
        }
    }

    private void conseguir (){
        Call<List<AlicuotadoResponse>> alicuotadoList = ApiClient.getUserService().conseguirAl(AN_placa.getText().toString(),s);
        alicuotadoList.enqueue(new Callback<List<AlicuotadoResponse>>() {
            @Override
            public void onResponse(Call<List<AlicuotadoResponse>> call, Response<List<AlicuotadoResponse>> response) {
                if(response.isSuccessful()){
                    List<AlicuotadoResponse> alicuotadoResponses = response.body();
                    alicuotadoAdapter.setData(alicuotadoResponses);
                    ListAlicuotado.setAdapter(alicuotadoAdapter);


                }
            }

            @Override
            public void onFailure(Call<List<AlicuotadoResponse>> call, Throwable t) {
                Log.e("Fallo ",t.getLocalizedMessage());
            }
        });

    }

}