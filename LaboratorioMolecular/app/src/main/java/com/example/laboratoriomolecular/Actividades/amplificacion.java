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

import com.example.laboratoriomolecular.Adaptador.AmplificacionAdapter;
import com.example.laboratoriomolecular.Modelos.AmplificacionResponse;
import com.example.laboratoriomolecular.Modelos.OperadorResponse;
import com.example.laboratoriomolecular.Modelos.PlacaSpinner;
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

public class amplificacion extends AppCompatActivity implements AmplificacionAdapter.ClickedItemAm{

    SwipeRefreshLayout Amrefresh;
    Spinner spPlacasAm,spOperadorAm;
    EditText Amq_muestras,AmM_valido, AmM_invalido,AmCi_valido,AmCi_invalido;
    TextView Amid_placa, Amid_placaSp, Amf_inicio, Amh_inicio, Amf_final, Amh_final, Ampromedio, Amoperador ,Amdni;
    //dialogo
    TextView diAmN_placa,diAmq_muestras,diAmf_inicio,diAmh_inicio,diAmf_final,diAmh_final,diAmpromedio, diAmM_valido, diAmM_invalido, diAmCi_valido, diAmCi_invalido, diAmoperador,diAmdni,diAmestado;
    private AsyncHttpClient operadorAmp;
    private AsyncHttpClient placasAmp;
    AmplificacionAdapter amplificacionAdapter;
    RecyclerView ListAmplificacion;
    String idAm, placaAm, muestrasAm, f_inicioAm, h_inicioAm, f_finalAm, h_finalAm, promedioAm, M_validoAm, M_invalidoAm, Ci_validoAm, Ci_ivalidoAm ,operadorAm, dniAm,id_placaAm, estadoAm;
    String AmF, AmH, AmN_placaF,AmN_placaI,dayerAm;
    String CAm_fhi, CAm_fhf;
    Button Aminiciar,Amfinalizar;
    CheckBox chAmAyer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amplificacion);

        Amrefresh = findViewById(R.id.Amrefresh);
        spPlacasAm = findViewById(R.id.spPlacasAm);
        spOperadorAm = findViewById(R.id.spOperadorAm);
        Amid_placa = findViewById(R.id.Amid_placa);
        Amid_placaSp = findViewById(R.id.Amid_placaSp);
        Amq_muestras = findViewById(R.id.Amq_muestras);
        Amf_inicio = findViewById(R.id.Amf_inicio);
        Amh_inicio = findViewById(R.id.Amh_inicio);
        Amf_final = findViewById(R.id.Amf_final);
        Amh_final = findViewById(R.id.Amh_final);
        Ampromedio = findViewById(R.id.Ampromedio);
        AmM_valido = findViewById(R.id.AmM_valido);
        AmM_invalido = findViewById(R.id.AmM_invalido);
        AmCi_valido = findViewById(R.id.AmCi_valido);
        AmCi_invalido = findViewById(R.id.AmCi_invalido);
        Amoperador = findViewById(R.id.Amoperador);
        Amdni = findViewById(R.id.Amdni);
        Aminiciar = findViewById(R.id.Aminiciar);
        Amfinalizar = findViewById(R.id.Amfinalizar);
        ListAmplificacion = findViewById(R.id.ListAmplificacion);
        chAmAyer = findViewById(R.id.chAmAyer);

        Amfinalizar.setEnabled(false);

        ListAmplificacion.setLayoutManager(new LinearLayoutManager(this));
        ListAmplificacion.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));

        amplificacionAdapter = new AmplificacionAdapter(this);

        Aminiciar.setOnClickListener(v -> ConfirmarAmplificacion());
        Amfinalizar.setOnClickListener(v -> FinalizarAmplificacion());
        Amfecha();
        conseguirAm();

        Amrefresh.setOnRefreshListener(()->{
            Amfecha();
            limpiarAmplificacion();
            Amrefresh.setRefreshing(false);
            conseguirAm();
        });
    }

    public void Amfecha (){
        final Calendar calendar = Calendar.getInstance();
        @SuppressLint("SimpleDateFormat") Format formatter = new SimpleDateFormat("yyyy-MM-dd");
        AmF = formatter.format(calendar.getTime());

        if (chAmAyer.isChecked()){
            ayerAm();

        }else{
            dayerAm = AmF;
        }

        Date date = new Date();
        @SuppressLint("SimpleDateFormat") Format h = new SimpleDateFormat("HH:mm:ss");
        AmH = h.format(date);

        Amf_inicio.setText(AmF);
        Amh_inicio.setText(AmH);
        Amf_final.setText(AmF);
        Amh_final.setText(AmH);
        placasAmp = new AsyncHttpClient();
        llenarspinnerAm();
        operadorAmp = new AsyncHttpClient();
        llsOpeAmp();

        Ahilo();

    }

    public void ayerAm (){

        Calendar calendar = Calendar.getInstance();

        calendar.add(Calendar.DAY_OF_YEAR, -1);
        Date ayer = calendar.getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dayerAm = dateFormat.format(ayer);
        //Toast.makeText(alicuotado.this,"ayer "+ dayer,Toast.LENGTH_SHORT).show();
    }

    public void Ahilo(){
        new Handler(Looper.getMainLooper()).postDelayed(this::Amfecha,60000);
    }

    private void llenarspinnerAm(){
        String url = "http://10.50.1.184/laboratorio/Placas/spPlacaAm.php?fechaP="+AmF;
        placasAmp.post(url, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                if (statusCode == 200){
                    CargarSpinnerAm(new String(responseBody));
                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                Toast.makeText(amplificacion.this,"Error: Internet / Servidor", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void CargarSpinnerAm(String respuestaAm){
        ArrayList<PlacaSpinner> spAmp = new ArrayList<>();
        try{
            JSONArray PlacaArray = new JSONArray(respuestaAm);
            for (int i=0; i<PlacaArray.length(); i++){
                PlacaSpinner spAm = new PlacaSpinner();
                spAm.setId_placa(PlacaArray.getJSONObject(i).getString("id_placa"));
                spAm.setN_placa(PlacaArray.getJSONObject(i).getString("N_placa"));
                spAm.setFechaP(PlacaArray.getJSONObject(i).getString("fechaP"));
                spAmp.add(spAm);
            }
            ArrayAdapter<PlacaSpinner> Pa = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, spAmp);
            spPlacasAm.setAdapter(Pa);
            spPlacasAm.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    Amid_placaSp.setText(spAmp.get(position).getId_placa());
                    AmN_placaI = spAmp.get(position).getN_placa();
                    Amf_inicio.setText(AmF);
                    Amh_inicio.setText(AmH);
                    Amf_final.setText(AmF);
                    Amh_final.setText(AmH);
                    limpiarAmplificacion();
                    Amfinalizar.setEnabled(false);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void llsOpeAmp (){

        String urlOpeA = "http://10.50.1.184/laboratorio/Operador/SpOperador.php";
        operadorAmp.post(urlOpeA, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                if (statusCode == 200){
                    csOpeAmp(new String(responseBody));
                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                Toast.makeText(amplificacion.this,"Error: Internet / Servidor", Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void csOpeAmp (String respuestaO){
        ArrayList<OperadorResponse> spOpeAmp = new ArrayList<>();
        try {
            JSONArray jsonArreglo= new JSONArray(respuestaO);
            for (int i=0; i<jsonArreglo.length(); i++)
            {
                OperadorResponse spOAm = new OperadorResponse();
                spOAm.setOperador(jsonArreglo.getJSONObject(i).getString("operador"));
                spOAm.setDni(jsonArreglo.getJSONObject(i).getString("dni"));
                spOpeAmp.add(spOAm);
            }
            ArrayAdapter<OperadorResponse> Oa = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, spOpeAmp);
            spOperadorAm.setAdapter(Oa);
            spOperadorAm.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    Amoperador.setText(parent.getItemAtPosition(position).toString());
                    Amdni.setText(spOpeAmp.get(position).getDni());

                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {
                }
            });
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public void ConfirmarAmplificacion (){
        AlertDialog.Builder opcion = new AlertDialog.Builder(this);
        opcion.setMessage("Iniciar Alicuotado para "+ AmN_placaI+"?");
        opcion.setPositiveButton("Crear", (dialog, which) -> saveAmplificacion());
        opcion.setNegativeButton("Cancelar", (dialog, which) -> dialog.cancel());

        AlertDialog dialog = opcion.create();
        dialog.show();
    }

    public void FinalizarAmplificacion (){
        AlertDialog.Builder opcion = new AlertDialog.Builder(this);
        opcion.setMessage("Finalizar Alicuotado para "+ AmN_placaF+"?");
        opcion.setPositiveButton("Finalizar", (dialog, which) -> calcularPromedioAm());
        opcion.setNegativeButton("Cancelar", (dialog, which) -> dialog.cancel());

        AlertDialog dialog = opcion.create();
        dialog.show();
    }

    @Override
    public void ClickedAmplificacion(AmplificacionResponse amplificacionResponse) {

        idAm = amplificacionResponse.getId_amplificacion();
        placaAm = amplificacionResponse.getN_placa();
        id_placaAm = amplificacionResponse.getId_placa();
        muestrasAm = amplificacionResponse.getQ_muestras();
        f_inicioAm = amplificacionResponse.getF_inicio();
        h_inicioAm = amplificacionResponse.getH_inicio();
        f_finalAm = amplificacionResponse.getF_final();
        h_finalAm = amplificacionResponse.getH_final();
        promedioAm = amplificacionResponse.getPromedio();
        M_validoAm = amplificacionResponse.getM_valido();
        M_invalidoAm = amplificacionResponse.getM_invalido();
        Ci_validoAm = amplificacionResponse.getCi_valido();
        Ci_ivalidoAm = amplificacionResponse.getCi_invalido();
        operadorAm = amplificacionResponse.getOperador();
        dniAm = amplificacionResponse.getDni();
        estadoAm = amplificacionResponse.getEstadoAm();

        Amid_placa.setText(id_placaAm);
        AmN_placaF = placaAm;
        CAm_fhi = amplificacionResponse.getF_inicio()+" "+amplificacionResponse.getH_inicio();

        if (muestrasAm == null){ Amq_muestras.setText("Vacio"); }else { Amq_muestras.setText(muestrasAm); }
        if(f_inicioAm == null){ Amf_inicio.setText(AmF); }else { Amf_inicio.setText(f_inicioAm); }
        if(h_inicioAm == null){Amh_inicio.setText(AmH);} else {Amh_inicio.setText(h_inicioAm);}
        if(f_finalAm == null){Amf_final.setText(AmF); Amfinalizar.setEnabled(true);} else {Amf_final.setText(f_finalAm); Amfinalizar.setEnabled(false);}
        if(h_finalAm == null){Amh_final.setText(AmH);} else {Amh_final.setText(h_finalAm);}

        dialogoAm();

    }

    public void dialogoAm (){

        AlertDialog.Builder builder = new AlertDialog.Builder(amplificacion.this);
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.dialogo_amp,null);
        builder.setView(view);

        final AlertDialog dialog = builder.create();
        dialog.show();

        diAmN_placa = view.findViewById(R.id.diAmN_placa);
        diAmq_muestras = view.findViewById(R.id.diAmq_muestras);
        diAmf_inicio = view.findViewById(R.id.diAmf_inicio);
        diAmh_inicio = view.findViewById(R.id.diAmh_inicio);
        diAmf_final = view.findViewById(R.id.diAmf_final);
        diAmh_final = view.findViewById(R.id.diAmh_final);
        diAmpromedio = view.findViewById(R.id.diAmpromedio);
        diAmM_valido = view.findViewById(R.id.diAmM_valido);
        diAmM_invalido = view.findViewById(R.id.diAmM_invalido);
        diAmCi_valido = view.findViewById(R.id.diAmCi_valido);
        diAmCi_invalido = view.findViewById(R.id.diAmCi_invalido);
        diAmoperador = view.findViewById(R.id.diAmoperador);
        diAmdni = view.findViewById(R.id.diAmdni);
        diAmestado = view.findViewById(R.id.diAmestado);

        diAmN_placa.setText(placaAm);
        diAmq_muestras.setText(muestrasAm);
        diAmf_inicio.setText(f_inicioAm);
        diAmh_inicio.setText(h_inicioAm);
        diAmf_final.setText(f_finalAm);
        diAmh_final.setText(h_finalAm);
        diAmpromedio.setText(promedioAm);
        diAmM_valido.setText(M_validoAm);
        diAmM_invalido.setText(M_invalidoAm);
        diAmCi_valido.setText(Ci_validoAm);
        diAmCi_invalido.setText(Ci_ivalidoAm);
        diAmoperador.setText(operadorAm);
        diAmdni.setText(dniAm);
        diAmestado.setText(estadoAm);

        Button diAm_ok = view.findViewById(R.id.diAm_ok);
        diAm_ok.setOnClickListener(v -> dialog.dismiss());
    }

    private void conseguirAm (){
        Call<List<AmplificacionResponse>> amplificacionList = ApiClient.getUserService().conseguirAmplificacion(dayerAm);
        amplificacionList.enqueue(new Callback<List<AmplificacionResponse>>() {
            @Override
            public void onResponse(@NotNull Call<List<AmplificacionResponse>> call, @NotNull Response<List<AmplificacionResponse>> response) {
                if(response.isSuccessful()){
                    List<AmplificacionResponse> amplificacionResponses = response.body();
                    amplificacionAdapter.setData(amplificacionResponses);
                    ListAmplificacion.setAdapter(amplificacionAdapter);

                }
            }

            @Override
            public void onFailure(@NotNull Call<List<AmplificacionResponse>> call, @NotNull Throwable t) {
                Log.e("Fallo ",t.getLocalizedMessage());
            }
        });

    }

    private void saveAmplificacion(){
        if (Amq_muestras.getText().toString().isEmpty()){
            Amq_muestras.setError("Ingrese Cantidad de Muestras");
        }
        Call<AmplificacionResponse> callAli = ApiClient.getUserService().InsertarAmplificacion(Amq_muestras.getText().toString(),Amf_inicio.getText().toString(),Amh_inicio.getText().toString(),Amoperador.getText().toString(),Amdni.getText().toString(),"1",Amid_placaSp.getText().toString());
        callAli.enqueue(new Callback<AmplificacionResponse>() {
            @Override
            public void onResponse(@NotNull Call<AmplificacionResponse> call, @NotNull Response<AmplificacionResponse> response) {
                if (response.isSuccessful()) {
                    AmplificacionResponse mensaje = response.body();
                    Toast.makeText(amplificacion.this, ""+mensaje.getMensaje()+" "+response.code(), Toast.LENGTH_SHORT).show();
                    conseguirAm();
                    limpiarAmplificacion();
                    Amfecha();
                } else {
                    Toast.makeText(amplificacion.this, "Error al Guardar los Datos "+response.code(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(@NotNull Call<AmplificacionResponse> call, @NotNull Throwable t) {
                Toast.makeText(amplificacion.this, "Error " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void upDateAmplificacion() {

        if (placaAm == null) {
            Toast.makeText(this, "Seleccione La Placa a Finalizar en la Lista", Toast.LENGTH_LONG).show();
        } else {

            Call<AmplificacionResponse> upAlic = ApiClient.getUserService().upAmplificacion(Amid_placa.getText().toString(), Amf_final.getText().toString(), Amh_final.getText().toString(), Ampromedio.getText().toString(), AmM_valido.getText().toString(),AmM_invalido.getText().toString(),AmCi_valido.getText().toString(),AmCi_invalido.getText().toString(), "2");
            upAlic.enqueue(new Callback<AmplificacionResponse>() {
                @Override
                public void onResponse(@NotNull Call<AmplificacionResponse> call, @NotNull Response<AmplificacionResponse> response) {
                    if (response.isSuccessful()) {
                        AmplificacionResponse mensaje = response.body();
                        Toast.makeText(amplificacion.this, "" + mensaje.getMensaje(), Toast.LENGTH_SHORT).show();
                        conseguirAm();
                        limpiarAmplificacion();
                        Amfinalizar.setEnabled(false);
                    } else {
                        Toast.makeText(amplificacion.this, "Error al Guardar los Datos", Toast.LENGTH_SHORT).show();
                    }
                }

                @Override
                public void onFailure(@NotNull Call<AmplificacionResponse> call, @NotNull Throwable t) {
                    Toast.makeText(amplificacion.this, "Error " + t.getMessage(), Toast.LENGTH_SHORT).show();
                }
            });
        }

    }

    public void limpiarAmplificacion(){

        Amq_muestras.getText().clear();
        AmM_valido.getText().clear();
        AmM_invalido.getText().clear();
        AmCi_valido.getText().clear();
        AmCi_invalido.getText().clear();
    }

    public void calcularPromedioAm () {
        if (CAm_fhi == null) {
            Toast.makeText(this, "Seleccione La Placa a Finalizar en la Lista", Toast.LENGTH_LONG).show();
        } else {
            CAm_fhf = Amf_final.getText().toString() + " " + Amh_final.getText().toString();
            String pf1 = CAm_fhi.replace('-', '/');
            String pf2 = CAm_fhf.replace('-', '/');
            String time;

            long total = new Date(pf2).getTime() - new Date(pf1).getTime();
            long horas = TimeUnit.MINUTES.convert(total, TimeUnit.MILLISECONDS);
            time = String.valueOf(horas);

            Ampromedio.setText(time);

            new Handler(Looper.getMainLooper()).postDelayed(this::upDateAmplificacion, 2000);
        }
    }


}