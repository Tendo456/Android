package com.example.laboratoriomolecular.Actividades;

import android.annotation.SuppressLint;
import android.hardware.Camera;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
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

import com.example.laboratoriomolecular.Adaptador.AreaAdapter;
import com.example.laboratoriomolecular.Modelos.AlicuotadoResponse;
import com.example.laboratoriomolecular.Modelos.AreaResponse;
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
import java.util.concurrent.TimeUnit;

import cz.msebera.android.httpclient.Header;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class area_limpia extends AppCompatActivity implements AreaAdapter.ClickedItemAr{

    SwipeRefreshLayout Arrefresh;
    Spinner spPlacasAr,spOperaAr;
    EditText Arq_muestras;
    TextView Arid_placa, Arid_placaSp, Arf_inicio, Arh_inicio, Arf_final, Arh_final, Arpromedio, Aroperador ,Ardni;
    //dialogo
    TextView diArN_placa,diArq_muestras,diArf_inicio,diArh_inicio,diArf_final,diArh_final,diArpromedio,diAroperador,diArdni,diArestado;
    private AsyncHttpClient operadorAre;
    private AsyncHttpClient placaAre;
    AreaAdapter areaAdapter;
    RecyclerView ListArea;
    String idAr, placaAr, muestrasAr, f_inicioAr, h_inicioAr, f_finalAr, h_finalAr, promedioAr ,operadorAr, dniAr,id_placaAr, estadoAr;
    String ArF, ArH, ArN_placaF,ArN_placaI;
    String CAr_fhi, CAr_fhf;
    Button Ariniciar,Arfinalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_limpia);

        Arrefresh = findViewById(R.id.Arrefresh);
        spPlacasAr = findViewById(R.id.spPlacasAr);
        spOperaAr = findViewById(R.id.spOperAr);
        Arid_placa = findViewById(R.id.Arid_placa);
        Arid_placaSp = findViewById(R.id.Arid_placaSp);
        Arq_muestras =findViewById(R.id.Arq_muestras);
        Arf_inicio = findViewById(R.id.Arf_inicio);
        Arh_inicio = findViewById(R.id.Arh_inicio);
        Arf_final = findViewById(R.id.Arf_final);
        Arh_final = findViewById(R.id.Arh_final);
        Arpromedio = findViewById(R.id.Arpromedio);
        Aroperador = findViewById(R.id.Aroperador);
        Ardni = findViewById(R.id.Ardni);
        Ariniciar = findViewById(R.id.Ariniciar);
        Arfinalizar = findViewById(R.id.Arfinalizar);
        ListArea = findViewById(R.id.ListArea);

        Arfinalizar.setEnabled(false);

        ListArea.setLayoutManager(new LinearLayoutManager(this));
        ListArea.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
        areaAdapter = new AreaAdapter(this);

        Ariniciar.setOnClickListener(v -> ConfirmarArea());
        Arfinalizar.setOnClickListener(v -> FinalizarArea());

        Arefecha();
        conseguirAr();

        Arrefresh.setOnRefreshListener(()->{
            Arefecha();
            limpiarAlicuotado();
            Arrefresh.setRefreshing(false);
        });

    }

    public void Arefecha (){
        final Calendar calendar = Calendar.getInstance();
        @SuppressLint("SimpleDateFormat") Format formatter = new SimpleDateFormat("yyyy-MM-dd");
        ArF = formatter.format(calendar.getTime());

        Date date = new Date();
        @SuppressLint("SimpleDateFormat") Format h = new SimpleDateFormat("HH:mm:ss");
        ArH = h.format(date);

        Arf_inicio.setText(ArF);
        Arh_inicio.setText(ArH);
        Arf_final.setText(ArF);
        Arh_final.setText(ArH);
        placaAre = new AsyncHttpClient();
        llenarspinnerAr();
        operadorAre = new AsyncHttpClient();
        llsOpeA();

        Arhilo();

    }

    public void Arhilo(){
        new Handler(Looper.getMainLooper()).postDelayed(this::Arefecha,60000);
    }

    private void llenarspinnerAr(){
        String url = "http://10.50.1.238/laboratorio/Placas/spPlacaAr.php?fechaP="+ArF;
        placaAre.post(url, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                if (statusCode == 200){
                    CargarSpinnerAr(new String(responseBody));
                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                Toast.makeText(area_limpia.this,"Error: Internet / Servidor", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void CargarSpinnerAr(String respuestaAl){
        ArrayList<PlacaSpinner> plAr = new ArrayList<>();
        try{
            JSONArray PlacaArray = new JSONArray(respuestaAl);
            for (int i=0; i<PlacaArray.length(); i++){
                PlacaSpinner spP = new PlacaSpinner();
                spP.setId_placa(PlacaArray.getJSONObject(i).getString("id_placa"));
                spP.setN_placa(PlacaArray.getJSONObject(i).getString("N_placa"));
                spP.setFechaP(PlacaArray.getJSONObject(i).getString("fechaP"));
                plAr.add(spP);
            }
            ArrayAdapter<PlacaSpinner> Pa = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, plAr);
            spPlacasAr.setAdapter(Pa);
            spPlacasAr.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    Arid_placaSp.setText(plAr.get(position).getId_placa());
                    ArN_placaI = plAr.get(position).getN_placa();
                    Arf_inicio.setText(ArF);
                    Arh_inicio.setText(ArH);
                    Arf_final.setText(ArF);
                    Arh_final.setText(ArH);
                    limpiarAlicuotado();
                    Arfinalizar.setEnabled(false);
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

        String urlOpeA = "http://10.50.1.238/laboratorio/Operador/SpOperador.php";
        operadorAre.post(urlOpeA, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                if (statusCode == 200){
                    csOpeA(new String(responseBody));
                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                Toast.makeText(area_limpia.this,"Error: Internet / Servidor", Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void csOpeA (String respuestaO){
        ArrayList<OperadorResponse> spOpeAr = new ArrayList<>();
        try {
            JSONArray jsonArreglo= new JSONArray(respuestaO);
            for (int i=0; i<jsonArreglo.length(); i++)
            {
                OperadorResponse spo = new OperadorResponse();
                spo.setOperador(jsonArreglo.getJSONObject(i).getString("operador"));
                spo.setDni(jsonArreglo.getJSONObject(i).getString("dni"));
                spOpeAr.add(spo);
            }
            ArrayAdapter<OperadorResponse> Oa = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, spOpeAr);
            spOperaAr.setAdapter(Oa);
            spOperaAr.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    Aroperador.setText(parent.getItemAtPosition(position).toString());
                    Ardni.setText(spOpeAr.get(position).getDni());

                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {
                }
            });
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public void ConfirmarArea (){
        AlertDialog.Builder opcion = new AlertDialog.Builder(this);
        opcion.setMessage("Iniciar Alicuotado para "+ ArN_placaI+"?");
        opcion.setPositiveButton("Crear", (dialog, which) -> saveArea());
        opcion.setNegativeButton("Cancelar", (dialog, which) -> dialog.cancel());

        AlertDialog dialog = opcion.create();
        dialog.show();
    }

    public void FinalizarArea (){
        AlertDialog.Builder opcion = new AlertDialog.Builder(this);
        opcion.setMessage("Finalizar Alicuotado para "+ ArN_placaF+"?");
        opcion.setPositiveButton("Finalizar", (dialog, which) -> calcularPromedioAr());
        opcion.setNegativeButton("Cancelar", (dialog, which) -> dialog.cancel());

        AlertDialog dialog = opcion.create();
        dialog.show();
    }

    @Override
    public void ClickedArea(AreaResponse areaResponse) {
        idAr = areaResponse.getId_area_limpia();
        placaAr = areaResponse.getN_placa();
        id_placaAr = areaResponse.getId_placa();
        muestrasAr = areaResponse.getQ_muestras();
        f_inicioAr = areaResponse.getF_inicio();
        h_inicioAr = areaResponse.getH_inicio();
        f_finalAr = areaResponse.getF_final();
        h_finalAr = areaResponse.getH_final();
        promedioAr = areaResponse.getPromedio();
        operadorAr = areaResponse.getOperador();
        dniAr = areaResponse.getDni();
        estadoAr = areaResponse.getEstadoAr();

        Arid_placa.setText(id_placaAr);
        ArN_placaF = placaAr;
        CAr_fhi = areaResponse.getF_inicio()+" "+areaResponse.getH_inicio();

        if (muestrasAr == null){ Arq_muestras.setText("Vacio"); }else { Arq_muestras.setText(muestrasAr); }
        if(f_inicioAr == null){ Arf_inicio.setText(ArF); }else { Arf_inicio.setText(f_inicioAr); }
        if(h_inicioAr == null){Arh_inicio.setText(ArH);} else {Arh_inicio.setText(h_inicioAr);}
        if(f_finalAr == null){Arf_final.setText(ArF); Arfinalizar.setEnabled(true);} else {Arf_final.setText(f_finalAr); Arfinalizar.setEnabled(false);}
        if(h_finalAr == null){Arh_final.setText(ArH);} else {Arh_final.setText(h_finalAr);}

        dialogoAr();
    }

    public void dialogoAr (){

        AlertDialog.Builder builder = new AlertDialog.Builder(area_limpia.this);
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.dialogo_ar,null);
        builder.setView(view);

        final AlertDialog dialog = builder.create();
        dialog.show();

        diArN_placa = view.findViewById(R.id.diArN_placa);
        diArq_muestras = view.findViewById(R.id.diArq_muestras);
        diArf_inicio = view.findViewById(R.id.diArf_inicio);
        diArh_inicio = view.findViewById(R.id.diArh_inicio);
        diArf_final = view.findViewById(R.id.diArf_final);
        diArh_final = view.findViewById(R.id.diArh_final);
        diArpromedio = view.findViewById(R.id.diArpromedio);
        diAroperador = view.findViewById(R.id.diAroperador);
        diArdni = view.findViewById(R.id.diArdni);
        diArestado = view.findViewById(R.id.diArestado);

        diArN_placa.setText(placaAr);
        diArq_muestras.setText(muestrasAr);
        diArf_inicio.setText(f_inicioAr);
        diArh_inicio.setText(h_inicioAr);
        diArf_final.setText(f_finalAr);
        diArh_final.setText(h_finalAr);
        diArpromedio.setText(promedioAr);
        diAroperador.setText(operadorAr);
        diArdni.setText(dniAr);
        diArestado.setText(estadoAr);

        Button diAr_ok = view.findViewById(R.id.diAr_ok);
        diAr_ok.setOnClickListener(v -> dialog.dismiss());
    }

    private void conseguirAr (){
        Call<List<AreaResponse>> areaList = ApiClient.getUserService().conseguirArea(ArF);
        areaList.enqueue(new Callback<List<AreaResponse>>() {
            @Override
            public void onResponse(Call<List<AreaResponse>> call, Response<List<AreaResponse>> response) {
                if(response.isSuccessful()){
                    List<AreaResponse> areaResponses = response.body();
                    areaAdapter.setData(areaResponses);
                    ListArea.setAdapter(areaAdapter);
                }
            }

            @Override
            public void onFailure(Call<List<AreaResponse>> call, Throwable t) {
                Log.e("Fallo ",t.getLocalizedMessage());
            }
        });

    }

    private void saveArea(){
        if (Arq_muestras.getText().toString().isEmpty()){
            Arq_muestras.setError("Ingrese Cantidad de Muestras");
        }
        Call<AreaResponse> callAli = ApiClient.getUserService().InsertarArea(Arq_muestras.getText().toString(),Arf_inicio.getText().toString(),Arh_inicio.getText().toString(),Aroperador.getText().toString(),Ardni.getText().toString(),"1",Arid_placaSp.getText().toString());
        callAli.enqueue(new Callback<AreaResponse>() {
            @Override
            public void onResponse(@NotNull Call<AreaResponse> call, @NotNull Response<AreaResponse> response) {
                if (response.isSuccessful()) {
                    AreaResponse mensaje = response.body();
                    Toast.makeText(area_limpia.this, ""+mensaje.getMensaje()+" "+response.code(), Toast.LENGTH_SHORT).show();
                    conseguirAr();
                    limpiarAlicuotado();
                    Arefecha();
                } else {
                    Toast.makeText(area_limpia.this, "Error al Guardar los Datos "+response.code(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(@NotNull Call<AreaResponse> call, @NotNull Throwable t) {
                Toast.makeText(area_limpia.this, "Error " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void upDateArea() {

        if (placaAr == null) {
            Toast.makeText(this, "Seleccione La Placa a Finalizar en la Lista", Toast.LENGTH_LONG).show();
        } else {

            Call<AreaResponse> upAlic = ApiClient.getUserService().upArea(Arid_placa.getText().toString(), Arf_final.getText().toString(), Arh_final.getText().toString(), Arpromedio.getText().toString(), "2");
            upAlic.enqueue(new Callback<AreaResponse>() {
                @Override
                public void onResponse(@NotNull Call<AreaResponse> call, @NotNull Response<AreaResponse> response) {
                    if (response.isSuccessful()) {
                        AreaResponse mensaje = response.body();
                        Toast.makeText(area_limpia.this, "" + mensaje.getMensaje(), Toast.LENGTH_SHORT).show();
                        conseguirAr();
                        limpiarAlicuotado();
                        Arfinalizar.setEnabled(false);
                    } else {
                        Toast.makeText(area_limpia.this, "Error al Guardar los Datos", Toast.LENGTH_SHORT).show();
                    }
                }

                @Override
                public void onFailure(@NotNull Call<AreaResponse> call, @NotNull Throwable t) {
                    Toast.makeText(area_limpia.this, "Error " + t.getMessage(), Toast.LENGTH_SHORT).show();
                }
            });
        }

    }

    public void limpiarAlicuotado(){

        Arq_muestras.setText(null);
    }

    public void calcularPromedioAr () {
        if (CAr_fhi == null) {
            Toast.makeText(this, "Seleccione La Placa a Finalizar en la Lista", Toast.LENGTH_LONG).show();
        } else {
            CAr_fhf = Arf_final.getText().toString() + " " + Arh_final.getText().toString();
            String pf1 = CAr_fhi.replace('-', '/');
            String pf2 = CAr_fhf.replace('-', '/');
            String time;

            long total = new Date(pf2).getTime() - new Date(pf1).getTime();
            long horas = TimeUnit.MINUTES.convert(total, TimeUnit.MILLISECONDS);
            time = String.valueOf(horas);

            Arpromedio.setText(time);

            new Handler(Looper.getMainLooper()).postDelayed(this::upDateArea, 2000);
        }
    }


}