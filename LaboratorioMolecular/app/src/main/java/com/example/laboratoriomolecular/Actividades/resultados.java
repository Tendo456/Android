package com.example.laboratoriomolecular.Actividades;

import androidx.appcompat.app.AlertDialog;
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
import com.example.laboratoriomolecular.Modelos.ResultadoResponse;
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
import java.util.concurrent.TimeUnit;

import cz.msebera.android.httpclient.Header;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class resultados extends AppCompatActivity {

    TextView CPlacasRes, Resf_inicio, Resh_inicio, Resf_final, Resh_final, Respromedio, Resoperador ,Resdni,IDs;
    Spinner spOperadorRes;
    Button Resfinalizar;
    CheckBox chResAyer;
    RecyclerView ListResultados;
    String ResF, ResH;
    String ResdAyer;
    String CRes_fhi,CRes_fhf;
    private AsyncHttpClient operadorRes;
    SwipeRefreshLayout Resrefresh;
    String idp1,idp2,idp3,idp4,idp5,idp6,idp7,idp8,idp9,idp10,idp11,idp12,idp13;

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
        Resfinalizar = findViewById(R.id.Resfinalizar);
        chResAyer = findViewById(R.id.chResAyer);
        ListResultados = findViewById(R.id.ListResultados);
        Resrefresh = findViewById(R.id.Resrefresh);
        IDs = findViewById(R.id.IDs);

        Resfinalizar.setOnClickListener(v -> FinalizarRes());

        Resfecha();
        idPlacas();
        Resrefresh.setOnRefreshListener(()->{
            Resfecha();
            idPlacas();
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

        String urlOpeA = "http://10.50.1.238/laboratorio/Operador/SpOperador.php";
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

    public void FinalizarRes (){
        AlertDialog.Builder opcion = new AlertDialog.Builder(this);
        opcion.setMessage("Finalizar Resultados?");
        opcion.setPositiveButton("Finalizar", (dialog, which) -> PromedioRes());
        opcion.setNegativeButton("Cancelar", (dialog, which) -> dialog.cancel());

        AlertDialog dialog = opcion.create();
        dialog.show();
    }

    public void countPlaca(){
        Call<List<AmplificacionResponse>> count = ApiClient.getUserService().countPlaca(ResdAyer);
        count.enqueue(new Callback<List<AmplificacionResponse>>() {
            @Override
            public void onResponse(Call<List<AmplificacionResponse>> call, Response<List<AmplificacionResponse>> response) {
                if(response.isSuccessful()){
                    List<AmplificacionResponse> cuenta = response.body();
                    assert cuenta != null;
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
                    CRes_fhi = Resf_inicio.getText().toString()+" "+Resh_inicio.getText().toString();
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

    public void finResultados(){
        Call<ResultadoResponse> finRes = ApiClient.getUserService().FinalizarResultado(CPlacasRes.getText().toString(),Resf_inicio.getText().toString(),Resh_inicio.getText().toString(),Resf_final.getText().toString(),Resh_final.getText().toString(),Respromedio.getText().toString(),Resoperador.getText().toString(),Resdni.getText().toString(),"2");
        finRes.enqueue(new Callback<ResultadoResponse>() {
            @Override
            public void onResponse(Call<ResultadoResponse> call, Response<ResultadoResponse> response) {
                if (response.isSuccessful()) {
                    ResultadoResponse mensaje = response.body();
                    Toast.makeText(resultados.this, "" + mensaje.getMensaje(), Toast.LENGTH_SHORT).show();
                    //conseguirAl();
                    //limpiarAlicuotado();
                    Resfinalizar.setEnabled(false);
                } else {
                    Toast.makeText(resultados.this, "Error al Guardar los Datos", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(@NotNull Call<ResultadoResponse> call, @NotNull Throwable t) {
                Toast.makeText(resultados.this, "Error " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void idPlacas(){
        Call<List<PlacaResponse>> placaids = ApiClient.getUserService().getPlacaF(ResdAyer);
        placaids.enqueue(new Callback<List<PlacaResponse>>() {
            @Override
            public void onResponse(@NotNull Call<List<PlacaResponse>> call, @NotNull Response<List<PlacaResponse>> response) {
                if(response.isSuccessful()) {
                    String resu = "";
                    List<PlacaResponse> IDEs = response.body();
                    for (PlacaResponse placaResponse : IDEs) {
                        resu = placaResponse.getId_placa() + "-";
                    }
                    String cade;
                    IDs.append(resu);
                    cade = IDs.getText().toString();
                    String[] parts = cade.split("-");
                    idp1 = parts[0];
                    idp2 = parts[1];
                    idp3 = parts[2];

                    Toast.makeText(resultados.this,""+idp1,Toast.LENGTH_LONG).show();
                }

            }

            @Override
            public void onFailure(@NotNull Call<List<PlacaResponse>> call, @NotNull Throwable t) {
                Toast.makeText(resultados.this, ""+t.getMessage(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void PromedioRes () {
        if (CRes_fhi == null) {
            Toast.makeText(this, "No hay Placas hoy", Toast.LENGTH_LONG).show();
        } else {
            CRes_fhf = Resf_final.getText().toString() + " " + Resh_final.getText().toString();
            String pf1 = CRes_fhi.replace('-', '/');
            String pf2 = CRes_fhf.replace('-', '/');
            String time;

            long total = new Date(pf2).getTime() - new Date(pf1).getTime();
            long horas = TimeUnit.MINUTES.convert(total, TimeUnit.MILLISECONDS);
            time = String.valueOf(horas);

            Respromedio.setText(time);

            new Handler(Looper.getMainLooper()).postDelayed(this::finResultados, 2000);
        }
    }
}