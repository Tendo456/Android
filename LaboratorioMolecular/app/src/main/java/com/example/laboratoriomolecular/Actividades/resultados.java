package com.example.laboratoriomolecular.Actividades;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.laboratoriomolecular.Adaptador.ResultadosAdapter;
import com.example.laboratoriomolecular.Modelos.AlicuotadoResponse;
import com.example.laboratoriomolecular.Modelos.AmplificacionResponse;
import com.example.laboratoriomolecular.Modelos.OperadorResponse;
import com.example.laboratoriomolecular.Modelos.PlacaResponse;
import com.example.laboratoriomolecular.Modelos.PlacaSpinner;
import com.example.laboratoriomolecular.Modelos.PlacaSpinnerRes;
import com.example.laboratoriomolecular.Modelos.ResultadosResponse;
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

public class resultados extends AppCompatActivity implements ResultadosAdapter.ClickedItemRes {

    TextView  Resf_inicio, Resh_inicio, Resf_final, Resh_final, Respromedio, Resoperador ,Resdni,Resid_resultados;
    TextView diResN_placa,diResf_inicio,diResh_inicio,diResf_final,diResh_final,diRespromedio,diResoperador,diResdni,diResestado,CPlacasRes;
    String idRes, placaRes, f_inicioRes, h_inicioRes, f_finalRes, h_finalRes, promedioRes ,operadorResu, dniRes, estadoRes;
    Spinner spOperadorRes,spCorridaRes;
    Button Resiniciar,Resfinalizar;
    CheckBox chResAyer;
    RecyclerView ListResultados;
    String ResF, ResH;
    String ResdAyer;
    String CRes_fhi,CRes_fhf;
    private AsyncHttpClient operadorRes;
    private AsyncHttpClient placasResul;
    SwipeRefreshLayout Resrefresh;
    ResultadosAdapter resultadosAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);

        spOperadorRes = findViewById(R.id.spOperadorRes);
        spCorridaRes = findViewById(R.id.spCorridaRes);
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
        Resid_resultados = findViewById(R.id.Resid_resultados);

        ListResultados.setLayoutManager(new LinearLayoutManager(this));
        ListResultados.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));

        resultadosAdapter = new ResultadosAdapter(this);
        Resfinalizar.setEnabled(false);

        Resfinalizar.setOnClickListener(v -> FinalizarRes());
        Resiniciar.setOnClickListener(v -> IniciarRes());

        Resfecha();
        ConseguirResul();

        Resrefresh.setOnRefreshListener(()->{
            Resfecha();
            ConseguirResul();
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

        Resf_inicio.setText(ResF);
        Resh_inicio.setText(ResH);
        Resf_final.setText(ResF);
        Resh_final.setText(ResH);
        placasResul = new AsyncHttpClient();
        llenarspinnerRes();
        operadorRes = new AsyncHttpClient();
        llsOpeRes();
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

    private void llenarspinnerRes(){

        String url = "http://190.119.144.250:83/laboratorio/Placas/spNCorridaRes.php?fechaP="+ResdAyer;
        placasResul.post(url, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                if (statusCode == 200){
                    CargarSpinnerRes(new String(responseBody));
                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                Toast.makeText(resultados.this,"Error: Internet / Servidor", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void CargarSpinnerRes(String respuestaAl){
        ArrayList<PlacaSpinnerRes> PlsRes = new ArrayList<>();
        try{
            JSONArray PlacaArray = new JSONArray(respuestaAl);
            for (int i=0; i<PlacaArray.length(); i++){
                PlacaSpinnerRes spPRes = new PlacaSpinnerRes();

                spPRes.setN_corrida(PlacaArray.getJSONObject(i).getString("N_corrida"));

                PlsRes.add(spPRes);
            }
            ArrayAdapter<PlacaSpinnerRes> PRes = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, PlsRes);
            spCorridaRes.setAdapter(PRes);
            spCorridaRes.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    CPlacasRes.setText(PlsRes.get(position).getN_corrida());
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void llsOpeRes (){

        String urlOpeA = "http://190.119.144.250:83/laboratorio/Operador/SpOperador.php";
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

    public void IniciarRes (){
        AlertDialog.Builder opcion = new AlertDialog.Builder(this);
        opcion.setMessage("Iniciar Resultados?");
        opcion.setPositiveButton("Iniciar Resultados?", (dialog, which) -> SaveResultados());
        opcion.setNegativeButton("Cancelar", (dialog, which) -> dialog.cancel());

        AlertDialog dialog = opcion.create();
        dialog.show();
    }

    public void FinalizarRes (){
        AlertDialog.Builder opcion = new AlertDialog.Builder(this);
        opcion.setMessage("Finalizar Resultados?");
        opcion.setPositiveButton("Finalizar", (dialog, which) -> PromedioRes());
        opcion.setNegativeButton("Cancelar", (dialog, which) -> dialog.cancel());

        AlertDialog dialog = opcion.create();
        dialog.show();
    }

    public void ConseguirResul(){
        Call<List<ResultadosResponse>> resulList = ApiClient.getUserService().conseguirResultados(ResdAyer);
        resulList.enqueue(new Callback<List<ResultadosResponse>>() {
            @Override
            public void onResponse(@NotNull Call<List<ResultadosResponse>> call, @NotNull Response<List<ResultadosResponse>> response) {
                if(response.isSuccessful()){
                    List<ResultadosResponse> resultadosResponses = response.body();
                    resultadosAdapter.setData(resultadosResponses);
                    ListResultados.setAdapter(resultadosAdapter);
                }
            }

            @Override
            public void onFailure(@NotNull Call<List<ResultadosResponse>> call, @NotNull Throwable t) {
                Log.e("Fallo ",t.getLocalizedMessage());
            }
        });
    }

    public void SaveResultados() {
        if (Resdni.getText().toString().equals("0")) {
            Resdni.setError("Seleccione un Operador");
        } else {

        Call<ResultadosResponse> finRes = ApiClient.getUserService().IniciarResultado(CPlacasRes.getText().toString(), Resf_inicio.getText().toString(), Resh_inicio.getText().toString(), Resoperador.getText().toString(), Resdni.getText().toString(), "1");
        finRes.enqueue(new Callback<ResultadosResponse>() {
            @Override
            public void onResponse(@NotNull Call<ResultadosResponse> call, @NotNull Response<ResultadosResponse> response) {
                if (response.isSuccessful()) {
                    ResultadosResponse mensaje = response.body();
                    Toast.makeText(resultados.this, "" + mensaje.getMensaje(), Toast.LENGTH_SHORT).show();
                    ConseguirResul();
                    Resfecha();
                    Resfinalizar.setEnabled(false);
                } else {
                    Toast.makeText(resultados.this, "Error al Guardar los Datos", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(@NotNull Call<ResultadosResponse> call, @NotNull Throwable t) {
                Toast.makeText(resultados.this, "Error " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
    }

    public void finResultados(){
        Call<ResultadosResponse> iniRes = ApiClient.getUserService().FinalizarResultado(Resid_resultados.getText().toString(),CPlacasRes.getText().toString(),Resf_inicio.getText().toString(),Resf_final.getText().toString(),Resh_final.getText().toString(),Respromedio.getText().toString(),"2");
        iniRes.enqueue(new Callback<ResultadosResponse>() {
            @Override
            public void onResponse(@NotNull Call<ResultadosResponse> call, @NotNull Response<ResultadosResponse> response) {
                if (response.isSuccessful()) {
                    ResultadosResponse mensaje = response.body();
                    assert mensaje != null;
                    Toast.makeText(resultados.this, "" + mensaje.getMensaje(), Toast.LENGTH_SHORT).show();
                    ConseguirResul();
                    Resfinalizar.setEnabled(false);
                } else {
                    Toast.makeText(resultados.this, "Error al Guardar los Datos", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(@NotNull Call<ResultadosResponse> call, @NotNull Throwable t) {

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

    @Override
    public void ClickedResultados(ResultadosResponse resultadosResponse) {
        idRes = resultadosResponse.getId_resultados();
        placaRes = resultadosResponse.getN_corrida();
        f_inicioRes = resultadosResponse.getF_inicio();
        h_inicioRes = resultadosResponse.getH_inicio();
        f_finalRes = resultadosResponse.getF_final();
        h_finalRes= resultadosResponse.getH_final();
        promedioRes = resultadosResponse.getPromedio();
        operadorResu = resultadosResponse.getOperador();
        dniRes = resultadosResponse.getDni();
        estadoRes = resultadosResponse.getEstadoRes();

        Resid_resultados.setText(idRes);
        CPlacasRes.setText(placaRes);
        CRes_fhi = resultadosResponse.getF_inicio()+" "+resultadosResponse.getH_inicio();

        if(f_finalRes == null){Resf_final.setText(ResF); Resfinalizar.setEnabled(true);} else {Resf_final.setText(f_finalRes); Resfinalizar.setEnabled(false);}
        if(h_finalRes == null){Resh_final.setText(ResH);} else {Resh_final.setText(h_finalRes);}

        dialogoRes();
    }

    public void dialogoRes (){

        AlertDialog.Builder builder = new AlertDialog.Builder(resultados.this);
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.dialogo_res,null);
        builder.setView(view);

        final AlertDialog dialog = builder.create();
        dialog.show();

        diResN_placa = view.findViewById(R.id.diResN_placa);
        diResf_inicio = view.findViewById(R.id.diResf_inicio);
        diResh_inicio = view.findViewById(R.id.diResh_inicio);
        diResf_final = view.findViewById(R.id.diResf_final);
        diResh_final = view.findViewById(R.id.diResh_final);
        diRespromedio = view.findViewById(R.id.diRespromedio);
        diResoperador = view.findViewById(R.id.diResoperador);
        diResdni = view.findViewById(R.id.diResdni);
        diResestado = view.findViewById(R.id.diResestado);

        diResN_placa.setText(placaRes);
        diResf_inicio.setText(f_inicioRes);
        diResh_inicio.setText(h_inicioRes);
        diResf_final.setText(f_finalRes);
        diResh_final.setText(h_finalRes);
        diRespromedio.setText(promedioRes);
        diResoperador.setText(operadorResu);
        diResdni.setText(dniRes);
        diResestado.setText(estadoRes);

        Button diRes_ok = view.findViewById(R.id.diRes_ok);
        diRes_ok.setOnClickListener(v -> dialog.dismiss());
    }
}