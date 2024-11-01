package com.example.laboratoriomolecular.Actividades;

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

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.example.laboratoriomolecular.Adaptador.AlicuotadoAdapter;
import com.example.laboratoriomolecular.Modelos.AlicuotadoResponse;
import com.example.laboratoriomolecular.Modelos.OperadorResponse;
import com.example.laboratoriomolecular.Modelos.PlacaSpinner;
import com.example.laboratoriomolecular.R;
import com.example.laboratoriomolecular.Retrofit_Data.ApiClient;
import com.google.android.material.textfield.TextInputEditText;
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
import java.util.Objects;
import java.util.concurrent.TimeUnit;

import cz.msebera.android.httpclient.Header;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class alicuotado extends AppCompatActivity implements AlicuotadoAdapter.ClickedItemA{

    SwipeRefreshLayout Alrefresh;
    Spinner spPlacasA,spOperA;
    EditText Aq_muestras;
    TextView Aid_placa, Aid_placaSp, Af_inicio, Ah_inicio, Af_final, Ah_final, Apromedio, Aoperador ,Adni,AN_corrida;
    //dialogo
    TextView diAlN_placa,diAlq_muestras,diAlf_inicio,diAlh_inicio,diAlf_final,diAlh_final,diAlpromedio,diAloperador,diAldni,diAlestado;
    private AsyncHttpClient operadorA;
    private AsyncHttpClient placaA;
    AlicuotadoAdapter alicuotadoAdapter;
    RecyclerView ListAlicuotado;
    String idAl, placaAl, muestrasAl, f_inicioAl, h_inicioAl, f_finalAl, h_finalAl, promedioAl ,operadorAl, dniAl,observacionAl,id_placaAl, estadoAl,N_corridaAl;
    String F, H, AN_placaF,AN_placaI;
    String CAl_fhi, CAl_fhf;
    Button Ainiciar,Afinalizar;
    String dayer;
    CheckBox chAyer,Salto;
    TextInputEditText Aobservacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alicuotado);

        Alrefresh = findViewById(R.id.Alrefresh);
        spPlacasA = findViewById(R.id.spPlacasA);
        spOperA = findViewById(R.id.spOperA);
        Aid_placa = findViewById(R.id.Aid_placa);
        Aid_placaSp = findViewById(R.id.Aid_placaSp);
        Aq_muestras = findViewById(R.id.Aq_muestras);
        Af_inicio = findViewById(R.id.Af_inicio);
        Ah_inicio = findViewById(R.id.Ah_inicio);
        Af_final = findViewById(R.id.Af_final);
        Ah_final = findViewById(R.id.Ah_final);
        Apromedio = findViewById(R.id.Apromedio);
        Aoperador = findViewById(R.id.Aoperador);
        Adni = findViewById(R.id.Adni);
        Ainiciar = findViewById(R.id.Ainiciar);
        Afinalizar = findViewById(R.id.Afinalizar);
        chAyer = findViewById(R.id.chAyer);
        ListAlicuotado = findViewById(R.id.ListAlicuotado);
        AN_corrida = findViewById(R.id.AN_corrida);
        Salto = findViewById(R.id.Salto);
        Aobservacion = findViewById(R.id.Aobservacion);


        Afinalizar.setEnabled(false);

        ListAlicuotado.setLayoutManager(new LinearLayoutManager(this));
        ListAlicuotado.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));

        alicuotadoAdapter = new AlicuotadoAdapter(this);

        Ainiciar.setOnClickListener(v -> {if(Salto.isChecked()){
            SaltoPlaca();
        }else { ConfirmarAlicuotado(); }
        });
        Afinalizar.setOnClickListener(v -> FinalizarAlicuotado());
        Afecha();
        conseguirAl();

        Alrefresh.setOnRefreshListener(()->{
            Afecha();
            conseguirAl();
            limpiarAlicuotado();
            Afinalizar.setEnabled(false);
            Alrefresh.setRefreshing(false);
        });

    }

    public void Afecha (){
        final Calendar calendar = Calendar.getInstance();
        @SuppressLint("SimpleDateFormat") Format formatter = new SimpleDateFormat("yyyy-MM-dd");
         F = formatter.format(calendar.getTime());

         if (chAyer.isChecked()){
             ayer();

         }else{
             dayer = F;
         }


        Date date = new Date();
        @SuppressLint("SimpleDateFormat") Format h = new SimpleDateFormat("HH:mm:ss");
        H = h.format(date);

        Af_inicio.setText(F);
        Ah_inicio.setText(H);
        Af_final.setText(F);
        Ah_final.setText(H);
        placaA = new AsyncHttpClient();
        llenarspinnerAl();
        operadorA = new AsyncHttpClient();
        llsOpeA();

        Ahilo();

    }

    public void ayer (){

        Calendar calendar = Calendar.getInstance();

        calendar.add(Calendar.DAY_OF_YEAR, -1);
        Date ayer = calendar.getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dayer = dateFormat.format(ayer);
        Toast.makeText(alicuotado.this,"ayer "+ dayer,Toast.LENGTH_SHORT).show();
    }

    public void Ahilo(){
        new Handler(Looper.getMainLooper()).postDelayed(this::Afecha,60000);
    }

    private void llenarspinnerAl(){

        String url = "http://190.119.144.250:83/laboratorio/Placas/spPlacaAl.php?fechaP="+dayer;
        //String url = "http://192.168.1.25/laboratorio/Placas/spPlacaAl.php?fechaP="+dayer;
        placaA.post(url, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                if (statusCode == 200){
                    CargarSpinnerAL(new String(responseBody));
                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                Toast.makeText(alicuotado.this,"Error: Internet / Servidor", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void CargarSpinnerAL(String respuestaAl){
        ArrayList<PlacaSpinner> Pls = new ArrayList<>();
        try{
            JSONArray PlacaArray = new JSONArray(respuestaAl);
            for (int i=0; i<PlacaArray.length(); i++){
                PlacaSpinner spP = new PlacaSpinner();
                spP.setId_placa(PlacaArray.getJSONObject(i).getString("id_placa"));
                spP.setN_placa(PlacaArray.getJSONObject(i).getString("N_placa"));
                spP.setN_corrida(PlacaArray.getJSONObject(i).getString("N_corrida"));
                spP.setFechaP(PlacaArray.getJSONObject(i).getString("fechaP"));
                Pls.add(spP);
            }
            ArrayAdapter<PlacaSpinner> Pa = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, Pls);
            spPlacasA.setAdapter(Pa);
            spPlacasA.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    Aid_placaSp.setText(Pls.get(position).getId_placa());
                    AN_placaI = Pls.get(position).getN_placa();
                    AN_corrida.setText(Pls.get(position).getN_corrida());
                    Af_inicio.setText(F);
                    Ah_inicio.setText(H);
                    Af_final.setText(F);
                    Ah_final.setText(H);
                    limpiarAlicuotado();
                    Afinalizar.setEnabled(false);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void llsOpeA (){

        String urlOpeA = "http://190.119.144.250:83/laboratorio/Operador/SpOperador.php";
        //String urlOpeA = "http://192.168.1.25/laboratorio/Operador/SpOperador.php";
        operadorA.post(urlOpeA, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                if (statusCode == 200){
                    csOpeA(new String(responseBody));
                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                Toast.makeText(alicuotado.this,"Error: Internet / Servidor", Toast.LENGTH_SHORT).show();
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
            ArrayAdapter<OperadorResponse> Oa = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, spOpeA);
            spOperA.setAdapter(Oa);
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

    public void SaltoPlaca (){
        AlertDialog.Builder opcion = new AlertDialog.Builder(this);
        opcion.setMessage("Iniciar Salto para "+ AN_placaI+"?");
        opcion.setPositiveButton("Crear", (dialog, which) -> salto());
        opcion.setNegativeButton("Cancelar", (dialog, which) -> dialog.cancel());

        AlertDialog dialog = opcion.create();
        dialog.show();
    }

    public void ConfirmarAlicuotado (){
        Af_inicio.setText(F);
        Ah_inicio.setText(H);
        AlertDialog.Builder opcion = new AlertDialog.Builder(this);
        opcion.setMessage("Iniciar Alicuotado para "+ AN_placaI+"?");
        opcion.setPositiveButton("Crear", (dialog, which) -> saveAlicuotado());
        opcion.setNegativeButton("Cancelar", (dialog, which) -> dialog.cancel());

        AlertDialog dialog = opcion.create();
        dialog.show();
    }

    public void FinalizarAlicuotado (){
        Af_final.setText(F);
        Ah_final.setText(H);
        AlertDialog.Builder opcion = new AlertDialog.Builder(this);
        opcion.setMessage("Finalizar Alicuotado para "+ AN_placaF+"?");
        opcion.setPositiveButton("Finalizar", (dialog, which) -> calcularPromedio());
        opcion.setNegativeButton("Cancelar", (dialog, which) -> dialog.cancel());

        AlertDialog dialog = opcion.create();
        dialog.show();
    }

    @Override
    public void ClickedAlicuotado(AlicuotadoResponse alicuotadoResponse) {

        idAl = alicuotadoResponse.getId_alicuotado();
        placaAl = alicuotadoResponse.getN_placa();
        N_corridaAl = alicuotadoResponse.getN_corrida();
        id_placaAl = alicuotadoResponse.getId_placa();
        muestrasAl = alicuotadoResponse.getQ_muestras();
        f_inicioAl = alicuotadoResponse.getF_inicio();
        h_inicioAl = alicuotadoResponse.getH_inicio();
        f_finalAl = alicuotadoResponse.getF_final();
        h_finalAl = alicuotadoResponse.getH_final();
        promedioAl = alicuotadoResponse.getPromedio();
        operadorAl = alicuotadoResponse.getOperador();
        dniAl = alicuotadoResponse.getDni();
        observacionAl = alicuotadoResponse.getObservacion();
        estadoAl = alicuotadoResponse.getEstadoAl();

        Aid_placa.setText(id_placaAl);
        AN_placaF = placaAl;
        CAl_fhi = alicuotadoResponse.getF_inicio()+" "+alicuotadoResponse.getH_inicio();

        if (N_corridaAl == null){ AN_corrida.setText("Vacio"); }else { AN_corrida.setText(N_corridaAl); }
        if (muestrasAl == null){ Aq_muestras.setText("Vacio"); }else { Aq_muestras.setText(muestrasAl); }
        if(f_inicioAl == null){ Af_inicio.setText(F); }else { Af_inicio.setText(f_inicioAl); }
        if(h_inicioAl == null){Ah_inicio.setText(H);} else {Ah_inicio.setText(h_inicioAl);}
        if(f_finalAl == null){Af_final.setText(F); Afinalizar.setEnabled(true);} else {Af_final.setText(f_finalAl); Afinalizar.setEnabled(false);}
        if(h_finalAl == null){Ah_final.setText(H);} else {Ah_final.setText(h_finalAl);}
        if(observacionAl == null){Aobservacion.setText("Vacio");}else {Aobservacion.setText(observacionAl);}

        dialogoAl();

    }

    public void dialogoAl (){

        AlertDialog.Builder builder = new AlertDialog.Builder(alicuotado.this);
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.dialogo_ali,null);
        builder.setView(view);

        final AlertDialog dialog = builder.create();
        dialog.show();

        diAlN_placa = view.findViewById(R.id.diAlN_placa);
        diAlq_muestras = view.findViewById(R.id.diAlq_muestras);
        diAlf_inicio = view.findViewById(R.id.diAlf_inicio);
        diAlh_inicio = view.findViewById(R.id.diAlh_inicio);
        diAlf_final = view.findViewById(R.id.diAlf_final);
        diAlh_final = view.findViewById(R.id.diAlh_final);
        diAlpromedio = view.findViewById(R.id.diAlpromedio);
        diAloperador = view.findViewById(R.id.diAloperador);
        diAldni = view.findViewById(R.id.diAldni);
        diAlestado = view.findViewById(R.id.diAlestado);

        diAlN_placa.setText(placaAl);
        diAlq_muestras.setText(muestrasAl);
        diAlf_inicio.setText(f_inicioAl);
        diAlh_inicio.setText(h_inicioAl);
        diAlf_final.setText(f_finalAl);
        diAlh_final.setText(h_finalAl);
        diAlpromedio.setText(promedioAl);
        diAloperador.setText(operadorAl);
        diAldni.setText(dniAl);
        diAlestado.setText(estadoAl);

        Button diAl_ok = view.findViewById(R.id.diAl_ok);
        diAl_ok.setOnClickListener(v -> dialog.dismiss());
    }

    private void conseguirAl (){
        Call<List<AlicuotadoResponse>> alicuotadoList = ApiClient.getUserService().conseguirAl(dayer);
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

    private void salto(){
        if (Aq_muestras.getText().toString().isEmpty()){
            Aq_muestras.setError("Ingrese Cantidad de Muestras"); }
        Call<AlicuotadoResponse> salto = ApiClient.getUserService().Salto(Aq_muestras.getText().toString(),Af_inicio.getText().toString(),Aid_placaSp.getText().toString(),AN_corrida.getText().toString());
        salto.enqueue(new Callback<AlicuotadoResponse>() {
            @Override
            public void onResponse(@NotNull Call<AlicuotadoResponse> call, @NotNull Response<AlicuotadoResponse> response) {
                if (response.isSuccessful()) {
                    AlicuotadoResponse mensaje = response.body();
                    Toast.makeText(alicuotado.this, ""+mensaje.getMensaje()+" "+response.code(), Toast.LENGTH_SHORT).show();
                    conseguirAl();
                    limpiarAlicuotado();
                    Afecha();
                } else {
                    Toast.makeText(alicuotado.this, "Error al Guardar los Datos "+response.code(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(@NotNull Call<AlicuotadoResponse> call, @NotNull Throwable t) {
                Toast.makeText(alicuotado.this, "Error " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void saveAlicuotado(){
        if(Aobservacion.getText().toString().isEmpty()){
            Aobservacion.setText("Vacío"); }
            if (Aq_muestras.getText().toString().isEmpty()){
                Aq_muestras.setError("Ingrese Cantidad de Muestras");
            }else if (Adni.getText().toString().equals("0")){
                Adni.setError("Seleccione un Operador");
            } else {
            Call<AlicuotadoResponse> callAli = ApiClient.getUserService().InsertarAlicuotado(Aq_muestras.getText().toString(),Af_inicio.getText().toString(),Ah_inicio.getText().toString(),Aoperador.getText().toString(),Adni.getText().toString(),Aobservacion.getText().toString(),"1",Aid_placaSp.getText().toString(),AN_corrida.getText().toString());
            callAli.enqueue(new Callback<AlicuotadoResponse>() {
                @Override
                public void onResponse(@NotNull Call<AlicuotadoResponse> call, @NotNull Response<AlicuotadoResponse> response) {
                    if (response.isSuccessful()) {
                        AlicuotadoResponse mensaje = response.body();
                        Toast.makeText(alicuotado.this, ""+mensaje.getMensaje()+" "+response.code(), Toast.LENGTH_SHORT).show();
                        conseguirAl();
                        limpiarAlicuotado();
                        Afecha();
                    } else {
                        Toast.makeText(alicuotado.this, "Error al Guardar los Datos "+response.code(), Toast.LENGTH_SHORT).show();
                    }
                }

                @Override
                public void onFailure(@NotNull Call<AlicuotadoResponse> call, @NotNull Throwable t) {
                    Toast.makeText(alicuotado.this, "Error " + t.getMessage(), Toast.LENGTH_SHORT).show();
                }
            });
            }

    }

    private void upDateAlicuotado() {

        if(Objects.requireNonNull(Aobservacion.getText()).toString().isEmpty()){
            Aobservacion.setText("Vacío"); }

        if (placaAl == null) {
            Toast.makeText(this, "Seleccione La Placa a Finalizar en la Lista", Toast.LENGTH_LONG).show();
        } else {

            Call<AlicuotadoResponse> upAlic = ApiClient.getUserService().upAlicuotado(Aid_placa.getText().toString(), Af_final.getText().toString(), Ah_final.getText().toString(),Aobservacion.getText().toString(), Apromedio.getText().toString(), "2");
            upAlic.enqueue(new Callback<AlicuotadoResponse>() {
                @Override
                public void onResponse(@NotNull Call<AlicuotadoResponse> call, @NotNull Response<AlicuotadoResponse> response) {
                    if (response.isSuccessful()) {
                        AlicuotadoResponse mensaje = response.body();
                        Toast.makeText(alicuotado.this, "" + mensaje.getMensaje(), Toast.LENGTH_SHORT).show();
                        conseguirAl();
                        limpiarAlicuotado();
                        Afinalizar.setEnabled(false);
                    } else {
                        Toast.makeText(alicuotado.this, "Error al Guardar los Datos", Toast.LENGTH_SHORT).show();
                    }
                }

                @Override
                public void onFailure(@NotNull Call<AlicuotadoResponse> call, @NotNull Throwable t) {
                    Toast.makeText(alicuotado.this, "Error " + t.getMessage(), Toast.LENGTH_SHORT).show();
                }
            });
        }

    }

    public void limpiarAlicuotado(){

        Aq_muestras.getText().clear();
        Aobservacion.getText().clear();
    }

    public void calcularPromedio () {
        if (CAl_fhi == null) {
            Toast.makeText(this, "Seleccione La Placa a Finalizar en la Lista", Toast.LENGTH_LONG).show();
        } else {
            CAl_fhf = Af_final.getText().toString() + " " + Ah_final.getText().toString();
            String pf1 = CAl_fhi.replace('-', '/');
            String pf2 = CAl_fhf.replace('-', '/');
            String time;

            long total = new Date(pf2).getTime() - new Date(pf1).getTime();
            long horas = TimeUnit.MINUTES.convert(total, TimeUnit.MILLISECONDS);
            time = String.valueOf(horas);

            Apromedio.setText(time);

            new Handler(Looper.getMainLooper()).postDelayed(this::upDateAlicuotado, 2000);
        }
    }

}