package com.example.laboratoriomolecular.Actividades;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.SearchView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.laboratoriomolecular.Adaptador.RecepcionAdapter;
import com.example.laboratoriomolecular.Modelos.OperadorResponse;
import com.example.laboratoriomolecular.Modelos.RecepcionResponse;
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

public class recepcion extends AppCompatActivity implements RecepcionAdapter.ClickedItem {

    EditText Rnenvio,Rqmuestras;
    TextView Roperador,Rhora,Rdni,Rfecha,Fechapiker;
    Button RGuardar,BuscarF;
    RecepcionAdapter recepcionAdapter;
    RecyclerView ListRecepcion;
    Spinner spOperador;
    private AsyncHttpClient operador;
    private boolean isFirstTime = true,isFirstTime1 = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recepcion);

        Rfecha = findViewById(R.id.Rfecha);
        Rhora = findViewById(R.id.Rhora);
        Rnenvio = findViewById(R.id.Rnenvio);
        Rqmuestras = findViewById(R.id.Rqmuestras);
        Roperador = findViewById(R.id.Roperador);
        Rdni = findViewById(R.id.Rdni);
        RGuardar = findViewById(R.id.RGuardar);
        ListRecepcion = findViewById(R.id.ListRecepcion);
        spOperador = findViewById(R.id.spOperador);
        Fechapiker = findViewById(R.id.Fechapiker);
        BuscarF = findViewById(R.id.BuscarF);

        ListRecepcion.setLayoutManager(new LinearLayoutManager(this));
        ListRecepcion.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));

        recepcionAdapter = new RecepcionAdapter(this::ClickedRecepcion);

        fecha();
        BuscarF.setOnClickListener(v -> getAllRecepcion());

        RGuardar.setOnClickListener(v -> ConfirmarRecepcion());

        operador = new AsyncHttpClient();
        llenarspinerO();


    }

    private void llenarspinerO (){

        String url = "http://10.50.1.202/laboratorio/Operador/SpOperador.php";
        operador.post(url, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                if (statusCode == 200){
                    cargarspinerO(new String(responseBody));
                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {

            }
        });

    }

    private void cargarspinerO (String respuestaO){
        ArrayList<OperadorResponse> listaO = new ArrayList<>();
        try {
            JSONArray jsonArreglo= new JSONArray(respuestaO);
            for (int i=0; i<jsonArreglo.length(); i++)
            {
                OperadorResponse spo = new OperadorResponse();
                spo.setOperador(jsonArreglo.getJSONObject(i).getString("operador"));
                spo.setDni(jsonArreglo.getJSONObject(i).getString("dni"));
                listaO.add(spo);
            }
            ArrayAdapter<OperadorResponse> a = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, listaO);
            spOperador.setAdapter(a);
            spOperador.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    if(isFirstTime){
                        isFirstTime=false;
                    }
                    else{
                        Roperador.setText(parent.getItemAtPosition(position).toString());
                        Rdni.setText(listaO.get(position).getDni());
                        }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {
                }
            });
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public void fecha (){
        final Calendar calendar = Calendar.getInstance();
        @SuppressLint("SimpleDateFormat") Format formatter = new SimpleDateFormat("yyyy-MM-dd");
        String s = formatter.format(calendar.getTime());

        Date date = new Date();
        //@SuppressLint("SimpleDateFormat") Format h = new SimpleDateFormat("hh:mm:ss");
        @SuppressLint("SimpleDateFormat") Format h = new SimpleDateFormat("HH:mm:ss");
        String ho = h.format(date);

        Rfecha.setText(s);
        Rhora.setText(ho);
        hilo();
    }

    public void ConfirmarRecepcion (){
        AlertDialog.Builder opcion = new AlertDialog.Builder(this);
        opcion.setMessage("Enviar los Datos?");
        opcion.setPositiveButton("Enviar", (dialog, which) ->
                saveRecepcion());
        opcion.setNegativeButton("Cancelar", (dialog, which) -> dialog.cancel());

        AlertDialog dialog = opcion.create();
        dialog.show();
    }

    private void saveRecepcion (){

        if (Rnenvio.getText().toString().isEmpty()){
            Rnenvio.setError("Complete los campos");
        }else if (Rqmuestras.getText().toString().isEmpty()){
            Rqmuestras.setError("Complete los campos");
        }else if (Rdni.getText().toString().isEmpty()){
            Rdni.setError("Seleccione un Operador");
        } else {


            Call<RecepcionResponse> call = ApiClient.getUserService().InsertarRecepcion(Rfecha.getText().toString(), Rhora.getText().toString(), Rnenvio.getText().toString(), Rqmuestras.getText().toString(), Roperador.getText().toString(), Rdni.getText().toString(), "1");
            call.enqueue(new Callback<RecepcionResponse>() {
                @Override
                public void onResponse(Call<RecepcionResponse> call, Response<RecepcionResponse> response) {
                    if (response.isSuccessful()) {
                        Toast.makeText(recepcion.this, "Datos Guardados", Toast.LENGTH_SHORT).show();
                        limpiar();
                    } else {
                        Toast.makeText(recepcion.this, "Error al Guardar los Datos", Toast.LENGTH_SHORT).show();
                    }
                }

                @Override
                public void onFailure(Call<RecepcionResponse> call, Throwable t) {
                    Toast.makeText(recepcion.this, "Error " + t.getMessage(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

    @Override
    public void ClickedRecepcion(RecepcionResponse recepcionResponse) {
        startActivity(new Intent(this,RecepcionDetails.class).putExtra("data",recepcionResponse));
    }

    public void hilo(){
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                fecha();
            }
        },60000);
    }

    public void getAllRecepcion(){
        Call<List<RecepcionResponse>> recepcionList = ApiClient.getUserService().getRecepcionF(Fechapiker.getText().toString());
        recepcionList.enqueue(new Callback<List<RecepcionResponse>>() {
            @Override
            public void onResponse(Call<List<RecepcionResponse>> call, Response<List<RecepcionResponse>> response) {
                if(response.isSuccessful()){
                    List<RecepcionResponse> recepcionResponses = response.body();
                    recepcionAdapter.setData(recepcionResponses);
                    ListRecepcion.setAdapter(recepcionAdapter);
                }
            }

            @Override
            public void onFailure(Call<List<RecepcionResponse>> call, Throwable t) {
                Log.e("Falló ",t.getLocalizedMessage());
            }
        });
    }

    public void SelectFecha (View view){
        final Calendar c = Calendar.getInstance();

        int dia = c.get(Calendar.DAY_OF_MONTH);
        int mes = c.get(Calendar.MONTH);
        int año = c.get(Calendar.YEAR);

        DatePickerDialog datePickerDialog = new DatePickerDialog(this,R.style.DialogTheme, (view1, year, month, dayOfMonth) -> {

            Calendar cal = Calendar.getInstance();
            cal.setTimeInMillis(0);
            cal.set(year, month, dayOfMonth, 0, 0, 0);
            Date chosenDate = cal.getTime();

            DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            String s = formatter.format(chosenDate);
            Fechapiker.setText(s);

        },año,mes,dia);
        datePickerDialog.show();
    }

    public void limpiar (){
        Rnenvio.getText().clear();
        Rqmuestras.getText().clear();
        Rdni.setText("");

    }


}