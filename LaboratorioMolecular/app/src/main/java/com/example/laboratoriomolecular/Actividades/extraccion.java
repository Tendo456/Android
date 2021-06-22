package com.example.laboratoriomolecular.Actividades;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
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
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.example.laboratoriomolecular.Adaptador.ExtraccionAdapter;
import com.example.laboratoriomolecular.Modelos.ExtraccionResponse;
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
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import cz.msebera.android.httpclient.Header;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class extraccion extends AppCompatActivity implements ExtraccionAdapter.ClickedItemEx{

    Spinner spPlacasEx, spOperadorEx;
    private AsyncHttpClient operadorExt;
    private AsyncHttpClient placasExt;
    TextView Exid_placa,Exid_placaSp,Exf_inicio, Exh_inicio, Exf_final, Exh_final, Expromedio, Exoperador, Exdni;
    //dialogo
    TextView diExN_placa,diExf_inicio,diExh_inicio,diExf_final,diExh_final,diExpromedio,diExoperador,diExdni,diExestado;
    Button Exiniciar,Exfinalizar;
    RecyclerView ListaExtraccion;
    String idEx, placaEx, f_inicioEx, h_inicioEx, f_finalEx, h_finalEx, promedioEx ,operadorEx, dniEx,id_placaEx, estadoEx;
    String ExF,ExH,ExN_placa;
    String CEx_fhi, CEx_fhf;
    ExtraccionAdapter extraccionAdapter;
    SwipeRefreshLayout Exrefresh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extraccion);

        spPlacasEx = findViewById(R.id.spPLacasEx);
        spOperadorEx = findViewById(R.id.spOperadorEx);
        Exid_placa = findViewById(R.id.Exid_placa);
        Exid_placaSp = findViewById(R.id.Exid_placaSp);
        Exf_inicio = findViewById(R.id.Exf_inicio);
        Exh_inicio = findViewById(R.id.Exh_inicio);
        Exf_final = findViewById(R.id.Exf_final);
        Exh_final = findViewById(R.id.Exh_final);
        Expromedio = findViewById(R.id.Expromedio);
        Exoperador = findViewById(R.id.Exoperador);
        Exdni = findViewById(R.id.Exdni);
        Exiniciar = findViewById(R.id.Exiniciar);
        Exfinalizar = findViewById(R.id.Exfinalizar);
        Exrefresh = findViewById(R.id.Exrefresh);
        ListaExtraccion = findViewById(R.id.ListExtraccion);

        Exfinalizar.setEnabled(false);

        ListaExtraccion.setLayoutManager(new LinearLayoutManager(this));
        ListaExtraccion.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));

        extraccionAdapter = new ExtraccionAdapter(this);

        Exiniciar.setOnClickListener(v -> ConfirmarExtraccion());
        Exfinalizar.setOnClickListener(v -> FinalizarExtraccion());

        Exfecha();
        conseguirEx();

        Exrefresh.setOnRefreshListener(()->{
            Exfecha();
            Exrefresh.setRefreshing(false);
        });
    }

    public void Exfecha (){
        final Calendar calendar = Calendar.getInstance();
        @SuppressLint("SimpleDateFormat") Format formatter = new SimpleDateFormat("yyyy-MM-dd");
        ExF = formatter.format(calendar.getTime());

        Date date = new Date();
        @SuppressLint("SimpleDateFormat") Format h = new SimpleDateFormat("HH:mm:ss");
        ExH = h.format(date);

        Exf_inicio.setText(ExF);
        Exh_inicio.setText(ExH);
        Exf_final.setText(ExF);
        Exh_final.setText(ExH);
        placasExt = new AsyncHttpClient();
        llenarspinnerEx();
        operadorExt = new AsyncHttpClient();
        llsOpeEx();

        Exhilo();
    }

    public void Exhilo(){
        new Handler(Looper.getMainLooper()).postDelayed(this::Exfecha,60000);
    }

    public void llenarspinnerEx(){
        String url = "http://10.50.1.238/laboratorio/Placas/spPlacaEx.php?fechaP="+ExF;
        placasExt.post(url, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                if (statusCode == 200){
                    CargarSpinnerEx(new String(responseBody));
                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                Toast.makeText(extraccion.this,"Error: Internet / Servidor", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void CargarSpinnerEx(String respuestaAl){
        ArrayList<PlacaSpinner> plEx = new ArrayList<>();
        try{
            JSONArray PlacaArray = new JSONArray(respuestaAl);
            for (int i=0; i<PlacaArray.length(); i++){
                PlacaSpinner spP = new PlacaSpinner();
                spP.setId_placa(PlacaArray.getJSONObject(i).getString("id_placa"));
                spP.setN_placa(PlacaArray.getJSONObject(i).getString("N_placa"));
                spP.setFechaP(PlacaArray.getJSONObject(i).getString("fechaP"));
                plEx.add(spP);
            }
            ArrayAdapter<PlacaSpinner> Pa = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, plEx);
            spPlacasEx.setAdapter(Pa);
            spPlacasEx.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    Exid_placaSp.setText(plEx.get(position).getId_placa());
                    ExN_placa = plEx.get(position).getN_placa();
                    Exf_inicio.setText(ExF);
                    Exh_inicio.setText(ExH);
                    Exf_final.setText(ExF);
                    Exh_final.setText(ExH);
                    Exfinalizar.setEnabled(false);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void llsOpeEx (){

        String urlOpeA = "http://10.50.1.238/laboratorio/Operador/SpOperador.php";
        operadorExt.post(urlOpeA, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                if (statusCode == 200){
                    csOpeEx(new String(responseBody));
                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                Toast.makeText(extraccion.this,"Error: Internet / Servidor", Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void csOpeEx (String respuestaO){
        ArrayList<OperadorResponse> spOpeEx = new ArrayList<>();
        try {
            JSONArray jsonArreglo= new JSONArray(respuestaO);
            for (int i=0; i<jsonArreglo.length(); i++)
            {
                OperadorResponse spo = new OperadorResponse();
                spo.setOperador(jsonArreglo.getJSONObject(i).getString("operador"));
                spo.setDni(jsonArreglo.getJSONObject(i).getString("dni"));
                spOpeEx.add(spo);
            }
            ArrayAdapter<OperadorResponse> Oa = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, spOpeEx);
            spOperadorEx.setAdapter(Oa);
            spOperadorEx.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    Exoperador.setText(parent.getItemAtPosition(position).toString());
                    Exdni.setText(spOpeEx.get(position).getDni());

                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {
                }
            });
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public void ConfirmarExtraccion (){
        AlertDialog.Builder opcion = new AlertDialog.Builder(this);
        opcion.setMessage("Iniciar Extraccion para "+ ExN_placa+"?");
        opcion.setPositiveButton("Crear", (dialog, which) -> saveExtraccion());
        opcion.setNegativeButton("Cancelar", (dialog, which) -> dialog.cancel());

        AlertDialog dialog = opcion.create();
        dialog.show();
    }

    public void FinalizarExtraccion (){
        AlertDialog.Builder opcion = new AlertDialog.Builder(this);
        opcion.setMessage("Finalizar Extraccion para "+ ExN_placa+"?");
        opcion.setPositiveButton("Finalizar", (dialog, which) -> calcularPromedioEx());
        opcion.setNegativeButton("Cancelar", (dialog, which) -> dialog.cancel());

        AlertDialog dialog = opcion.create();
        dialog.show();
    }

    @Override
    public void ClickedExtraccion(ExtraccionResponse extraccionResponse) {
        idEx = extraccionResponse.getId_extraccion();
        placaEx = extraccionResponse.getN_placa();
        id_placaEx = extraccionResponse.getId_placa();
        f_inicioEx = extraccionResponse.getF_inicio();
        h_inicioEx = extraccionResponse.getH_inicio();
        f_finalEx = extraccionResponse.getF_final();
        h_finalEx = extraccionResponse.getH_final();
        promedioEx = extraccionResponse.getPromedio();
        operadorEx = extraccionResponse.getOperador();
        dniEx = extraccionResponse.getDni();
        estadoEx = extraccionResponse.getEstadoEx();

        Exid_placa.setText(id_placaEx);
        CEx_fhi = extraccionResponse.getF_inicio()+" "+extraccionResponse.getH_inicio();

        if(f_inicioEx == null){ Exf_inicio.setText(ExF);}else { Exf_inicio.setText(f_inicioEx);}
        if(h_inicioEx == null){Exh_inicio.setText(ExH);} else {Exh_inicio.setText(h_inicioEx);}
        if(f_finalEx == null){Exf_final.setText(ExF); Exfinalizar.setEnabled(true); } else {Exf_final.setText(f_finalEx); Exfinalizar.setEnabled(false);}
        if(h_finalEx == null){Exh_final.setText(ExH);} else {Exh_final.setText(h_finalEx);}

        dialogoEx();
    }

    public void dialogoEx (){
        AlertDialog.Builder builder = new AlertDialog.Builder(extraccion.this);
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.dialogoex,null);
        builder.setView(view);

        final AlertDialog dialog = builder.create();
        dialog.show();

        diExN_placa = view.findViewById(R.id.diExN_placa);
        diExf_inicio = view.findViewById(R.id.diExf_inicio);
        diExh_inicio = view.findViewById(R.id.diExh_inicio);
        diExf_final = view.findViewById(R.id.diExf_final);
        diExh_final = view.findViewById(R.id.diExh_final);
        diExpromedio = view.findViewById(R.id.diExpromedio);
        diExoperador = view.findViewById(R.id.diExoperador);
        diExdni = view.findViewById(R.id.diExdni);
        diExestado = view.findViewById(R.id.diExestado);

        diExN_placa.setText(placaEx);
        diExf_inicio.setText(f_inicioEx);
        diExh_inicio.setText(h_inicioEx);
        diExf_final.setText(f_finalEx);
        diExh_final.setText(h_finalEx);
        diExpromedio.setText(promedioEx);
        diExoperador.setText(operadorEx);
        diExdni.setText(dniEx);
        diExestado.setText(estadoEx);

        Button diEx_ok = view.findViewById(R.id.diEx_ok);
        diEx_ok.setOnClickListener(v -> dialog.dismiss());
    }

    public void conseguirEx (){
        Call<List<ExtraccionResponse>> extraccionList = ApiClient.getUserService().conseguirExtraccion(ExF);
        extraccionList.enqueue(new Callback<List<ExtraccionResponse>>() {
            @Override
            public void onResponse(Call<List<ExtraccionResponse>> call, Response<List<ExtraccionResponse>> response) {
                if(response.isSuccessful()){
                    List<ExtraccionResponse> extraccionResponses = response.body();
                    extraccionAdapter.setData(extraccionResponses);
                    ListaExtraccion.setAdapter(extraccionAdapter);
                }
            }

            @Override
            public void onFailure(Call<List<ExtraccionResponse>> call, Throwable t) {

            }
        });
    }

    public void saveExtraccion (){
        Call<ExtraccionResponse> callEx = ApiClient.getUserService().InsertarExtraccion(Exf_inicio.getText().toString(),Exh_inicio.getText().toString(),Exoperador.getText().toString(),Exdni.getText().toString(),"1",Exid_placaSp.getText().toString());
        callEx.enqueue(new Callback<ExtraccionResponse>() {
            @Override
            public void onResponse(Call<ExtraccionResponse> call, Response<ExtraccionResponse> response) {
                if(response.isSuccessful()){
                    ExtraccionResponse mensaje = response.body();
                    Toast.makeText(extraccion.this, ""+mensaje.getMensaje()+" "+response.code(), Toast.LENGTH_SHORT).show();
                    conseguirEx();

                }
                else {
                    Toast.makeText(extraccion.this, "Error al Guardar los Datos "+response.code(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<ExtraccionResponse> call, Throwable t) {
                Toast.makeText(extraccion.this, "Error " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void upDateExtraccion (){
        if (placaEx == null) {
            Toast.makeText(this, "Seleccione La Placa a Finalizar en la Lista", Toast.LENGTH_LONG).show();
        } else {

            Call<ExtraccionResponse> upEx = ApiClient.getUserService().upExtraccion(Exid_placa.getText().toString(), Exf_final.getText().toString(), Exh_final.getText().toString(), Expromedio.getText().toString(), "2");
            upEx.enqueue(new Callback<ExtraccionResponse>() {
                @Override
                public void onResponse(Call<ExtraccionResponse> call, Response<ExtraccionResponse> response) {
                    if (response.isSuccessful()) {
                        ExtraccionResponse mensaje = response.body();
                        Toast.makeText(extraccion.this, "" + mensaje.getMensaje() + " " + response.code(), Toast.LENGTH_SHORT).show();
                        conseguirEx();
                        Exfinalizar.setEnabled(false);

                    } else {
                        Toast.makeText(extraccion.this, "Error al Guardar los Datos " + response.code(), Toast.LENGTH_SHORT).show();
                    }
                }

                @Override
                public void onFailure(Call<ExtraccionResponse> call, Throwable t) {
                    Toast.makeText(extraccion.this, "Error " + t.getMessage(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

    public void calcularPromedioEx () {
        if (CEx_fhi == null) {
            Toast.makeText(this, "Seleccione La Placa a Finalizar en la Lista", Toast.LENGTH_LONG).show();
        } else {
            CEx_fhf = Exf_final.getText().toString() + " " + Exh_final.getText().toString();
            String pf1 = CEx_fhi.replace('-', '/');
            String pf2 = CEx_fhf.replace('-', '/');
            String time;

            long total = new Date(pf2).getTime() - new Date(pf1).getTime();
            long horas = TimeUnit.MINUTES.convert(total, TimeUnit.MILLISECONDS);
            time = String.valueOf(horas);

            Expromedio.setText(time);

            new Handler(Looper.getMainLooper()).postDelayed(this::upDateExtraccion, 2000);
        }
    }
}