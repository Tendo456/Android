package com.example.breaks.actividades;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.breaks.Modelos.ProgramacionResponse;
import com.example.breaks.Modelos.ProgramacionResponseSP;
import com.example.breaks.R;
import com.example.breaks.RetrofitData.ApiClient;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import cz.msebera.android.httpclient.Header;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Programacion_add extends AppCompatActivity {

    Spinner sendMarcaPROG;
    EditText sendCant;
    TextView sendFechaPROG, confIDStockPG, confMarcaPROG,totalSTK;
    Button GuardarPROG;
    private AsyncHttpClient MarcasActPG;
    String fechaPG,cantPG,IDstockPG;
    String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programacion_add);

        sendMarcaPROG = findViewById(R.id.sendMarcaPROG);
        sendCant = findViewById(R.id.sendCant);
        sendFechaPROG = findViewById(R.id.sendFechaPROG);
        confIDStockPG = findViewById(R.id.confIDStockPG);
        confMarcaPROG = findViewById(R.id.confMarcaPROG);
        GuardarPROG = findViewById(R.id.GuardarPROG);
        totalSTK = findViewById(R.id.totalSTK);

        MarcasActPG = new AsyncHttpClient();
        llenarspinerPG();
        fechaADDPG();

        GuardarPROG.setOnClickListener(view -> ConfirmarProg());

        sendCant.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String valor1 = totalSTK.getText().toString();
                String valor2 = sendCant.getText().toString();
                if(valor2.isEmpty()){
                    Toast.makeText(Programacion_add.this, "Ingresa Cantidad", Toast.LENGTH_SHORT).show();
                }else {
                    int v1 = Integer.parseInt(valor1);
                    int v2 = Integer.parseInt(valor2);
                    int r = v1-v2;
                    if(r<0){
                        sendCant.setError("Reducir Valor");
                    }else {
                        result= String.valueOf(r);
                        if (result.equals("0")){
                            result="00";
                            Toast.makeText(Programacion_add.this, result, Toast.LENGTH_SHORT).show();
                        }else {
                            result= String.valueOf(r);
                            Toast.makeText(Programacion_add.this, result, Toast.LENGTH_SHORT).show();
                        }
                    }

                }

            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });

    }

    public void fechaADDPG (){
        final Calendar calendar = Calendar.getInstance();
        @SuppressLint("SimpleDateFormat") Format formatter = new SimpleDateFormat("yyyy-MM-dd");
        fechaPG = formatter.format(calendar.getTime());
        sendFechaPROG.setText(fechaPG);
    }


    public void llenarspinerPG (){
        String url = "http://190.119.144.250:83/ScreeningApp/Programacion/ProgramacionSP.php";
        MarcasActPG.post(url, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                if (statusCode == 200){
                    cargarspinerPG(new String(responseBody));
                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {

            }
        });
    }

    public void cargarspinerPG(String respuestaPG){

        ArrayList<ProgramacionResponseSP> listaMarcasPG = new ArrayList<>();
        try {
            JSONArray jsonArreglo= new JSONArray(respuestaPG);
            for (int i=0; i<jsonArreglo.length(); i++)
            {
                ProgramacionResponseSP spPG = new ProgramacionResponseSP();
                spPG.setId_stock(jsonArreglo.getJSONObject(i).getString("id_stock"));
                spPG.setMarca(jsonArreglo.getJSONObject(i).getString("marca"));
                spPG.setStock_cant(jsonArreglo.getJSONObject(i).getString("stock_cant"));
                listaMarcasPG.add(spPG);
            }
            ArrayAdapter<ProgramacionResponseSP> pg = new ArrayAdapter<>(this, R.layout.spinner_text, listaMarcasPG);
            pg.setDropDownViewResource(R.layout.spinner_dropdown_text);
            sendMarcaPROG.setAdapter(pg);
            sendMarcaPROG.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                    confMarcaPROG.setText(parent.getItemAtPosition(position).toString());
                    confIDStockPG.setText(listaMarcasPG.get(position).getId_stock());
                    IDstockPG = confIDStockPG.getText().toString();
                    totalSTK.setText((listaMarcasPG.get(position).getStock_cant()));

                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public void ConfirmarProg (){
        AlertDialog.Builder opcion = new AlertDialog.Builder(this);
        opcion.setMessage("Agregar Programación?");
        opcion.setPositiveButton("Enviar", (dialog, which) -> saveProg());
        opcion.setNegativeButton("Cancelar", (dialog, which) -> dialog.cancel());

        AlertDialog dialog = opcion.create();
        dialog.show();
    }

    public void saveProg(){
        fechaADDPG();
        IDstockPG = confIDStockPG.getText().toString();
        if(sendCant.getText().toString().isEmpty()){
            sendCant.setError("Ingrese una Cantidad");
        }else{
            cantPG = sendCant.getText().toString();

            Call<ProgramacionResponse> svPG = ApiClient.getUserService().ADDProg(IDstockPG,cantPG,fechaPG,result);
            svPG.enqueue(new Callback<ProgramacionResponse>() {
                @Override
                public void onResponse(Call<ProgramacionResponse> call, Response<ProgramacionResponse> response) {
                    if (response.isSuccessful()) {
                        ProgramacionResponse mensaje = response.body();
                        assert mensaje != null;
                        Toast.makeText(Programacion_add.this, ""+mensaje.getMensaje()+" "+response.code(), Toast.LENGTH_SHORT).show();
                        finish();
                    } else {
                        ProgramacionResponse mensaje = response.body();
                        assert mensaje != null;
                        Toast.makeText(Programacion_add.this, ""+mensaje.getMensaje()+" "+response.code(), Toast.LENGTH_SHORT).show();
                    }
                }

                @Override
                public void onFailure(Call<ProgramacionResponse> call, Throwable t) {
                    Toast.makeText(Programacion_add.this, "Error " + t.getMessage(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }



}