package com.example.laboratoriomolecular.Actividades;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.laboratoriomolecular.Modelos.AlicuotadoResponse;
import com.example.laboratoriomolecular.Modelos.AmplificacionResponse;
import com.example.laboratoriomolecular.Modelos.OperadorResponse;
import com.example.laboratoriomolecular.Modelos.PlacaResponse;
import com.example.laboratoriomolecular.R;
import com.example.laboratoriomolecular.Retrofit_Data.ApiClient;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

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

public class resultados extends AppCompatActivity {

    TextView CPlacasRes, Resf_inicio, Resh_inicio, Resf_final, Resh_final, Respromedio, Resoperador ,Resdni;
    Spinner spOperadorRes;
    Button Resiniciar,Resfinalizar;
    CheckBox chResAyer;
    RecyclerView ListResultados;
    String ResF, ResH;
    String ResdAyer;
    private AsyncHttpClient operadorRes;
    SwipeRefreshLayout Resrefresh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);

        spOperadorRes = findViewById(R.id.spOperadorRes);
        CPlacasRes = findViewById(R.id.CPlacasRes);
        Resf_inicio = findViewById(R.id.Resf_inicio);
        Resh_inicio = findViewById(R.id.Resh_inicio);
        Resf_final = findViewById(R.id.Resf_final);
        Resh_final = findViewById(R.id.Resh_final);
        Respromedio = findViewById(R.id.Respromedio);
        Resoperador = findViewById(R.id.Resoperador);
        Resdni = findViewById(R.id.Resdni);
        Resiniciar = findViewById(R.id.Resiniciar);
        Resfinalizar = findViewById(R.id.Resfinalizar);
        chResAyer = findViewById(R.id.chResAyer);
        ListResultados = findViewById(R.id.ListResultados);
        Resrefresh = findViewById(R.id.Resrefresh);

        Resfecha();

        Resrefresh.setOnRefreshListener(()->{
            Resfecha();
            Resrefresh.setRefreshing(false);
        });
    }

    public void Resfecha (){
        final Calendar calendar = Calendar.getInstance();
        @SuppressLint("SimpleDateFormat") Format formatter = new SimpleDateFormat("yyyy-MM-dd");
        ResF = formatter.format(calendar.getTime());

        if (chResAyer.isChecked()){
            Resayer();
        }else{
            ResdAyer = ResF;
        }


        Date date = new Date();
        @SuppressLint("SimpleDateFormat") Format h = new SimpleDateFormat("HH:mm:ss");
        ResH = h.format(date);

        Resf_final.setText(ResF);
        Resh_final.setText(ResH);
        operadorRes = new AsyncHttpClient();
        llsOpeRes();

        countPlaca();
        firstPro();

        Reshilo();

    }

    public void Resayer (){

        Calendar calendar = Calendar.getInstance();

        calendar.add(Calendar.DAY_OF_YEAR, -1);
        Date ayer = calendar.getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        ResdAyer = dateFormat.format(ayer);

    }

    public void Reshilo(){
        new Handler(Looper.getMainLooper()).postDelayed(this::Resfecha,60000);
    }

    private void llsOpeRes (){

        String urlOpeA = "http://192.168.1.5/laboratorio/Operador/SpOperador.php";
        operadorRes.post(urlOpeA, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                if (statusCode == 200){
                    csOpeRes(new String(responseBody));
                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                Toast.makeText(resultados.this,"Error: Internet / Servidor", Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void csOpeRes (String respuestaO){
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
            ArrayAdapter<OperadorResponse> Oa = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, spOpeA);
            spOperadorRes.setAdapter(Oa);
            spOperadorRes.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    Resoperador.setText(parent.getItemAtPosition(position).toString());
                    Resdni.setText(spOpeA.get(position).getDni());

                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {
                }
            });
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public void countPlaca(){
        Call<List<AmplificacionResponse>> count = ApiClient.getUserService().countPlaca(ResdAyer);
        count.enqueue(new Callback<List<AmplificacionResponse>>() {
            @Override
            public void onResponse(Call<List<AmplificacionResponse>> call, Response<List<AmplificacionResponse>> response) {
                if(response.isSuccessful()){
                    List<AmplificacionResponse> cuenta = response.body();
                    for (AmplificacionResponse amplificacionResponse: cuenta){
                        CPlacasRes.setText(amplificacionResponse.getTotal());
                    }
                }else {
                    Toast.makeText(resultados.this, "Error Code: "+response.code(),Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<List<AmplificacionResponse>> call, Throwable t) {
                Toast.makeText(resultados.this, ""+t.getMessage(),Toast.LENGTH_SHORT).show();
            }
        });


    }

    public void firstPro (){
        Call<List<AlicuotadoResponse>> first = ApiClient.getUserService().firstProc(ResdAyer);
        first.enqueue(new Callback<List<AlicuotadoResponse>>() {
            @Override
            public void onResponse(Call<List<AlicuotadoResponse>> call, Response<List<AlicuotadoResponse>> response) {
                if(response.isSuccessful()){
                    List<AlicuotadoResponse> primer = response.body();
                    for (AlicuotadoResponse alicuotadoResponse: primer){
                        Resf_inicio.setText(alicuotadoResponse.getF_inicio());
                        Resh_inicio.setText(alicuotadoResponse.getH_inicio());
                    }
                }else {
                    Toast.makeText(resultados.this, "Error Code: "+response.code(),Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<List<AlicuotadoResponse>> call, Throwable t) {
                Toast.makeText(resultados.this, ""+t.getMessage(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}