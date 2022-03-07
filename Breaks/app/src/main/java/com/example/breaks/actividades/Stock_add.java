package com.example.breaks.actividades;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.breaks.Modelos.MarcasResponseSP;
import com.example.breaks.Modelos.StockResponse;
import com.example.breaks.R;
import com.example.breaks.RetrofitData.ApiClient;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import android.annotation.SuppressLint;
import android.os.Bundle;
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

public class Stock_add extends AppCompatActivity {

    Spinner sendMarcasST;
    EditText sendST;
    TextView sendFechaST,confIDMarca, confMarca;
    private AsyncHttpClient MarcasAct;
    String sdIDM,sdSTK,fecha_s;
    Button GuardarStock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stock_add);

        sendMarcasST = findViewById(R.id.sendMarcaST);
        sendST = findViewById(R.id.sendST);
        sendFechaST = findViewById(R.id.sendFechaST);
        confIDMarca = findViewById(R.id.confIDMarca);
        confMarca = findViewById(R.id.confMarca);
        GuardarStock = findViewById(R.id.GuardarStock);

        MarcasAct = new AsyncHttpClient();
        llenarspinerM();
        fechaADDST();

        GuardarStock.setOnClickListener(view -> ConfirmarStock());

    }

    public void fechaADDST (){
        final Calendar calendar = Calendar.getInstance();
        @SuppressLint("SimpleDateFormat") Format formatter = new SimpleDateFormat("yyyy-MM-dd");
        fecha_s = formatter.format(calendar.getTime());
        sendFechaST.setText(fecha_s);

    }

    public void llenarspinerM (){
        String url = "http://192.168.1.139/ScreeningApp/Marcas/MarcasSP.php";
        MarcasAct.post(url, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                if (statusCode == 200){
                    cargarspinerM(new String(responseBody));
                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {

            }
        });
    }

    public void cargarspinerM(String respuestaM){

        ArrayList<MarcasResponseSP> listaMarcas = new ArrayList<>();
        try {
            JSONArray jsonArreglo= new JSONArray(respuestaM);
            for (int i=0; i<jsonArreglo.length(); i++)
            {
                MarcasResponseSP spM = new MarcasResponseSP();
                spM.setId_marcas(jsonArreglo.getJSONObject(i).getString("id_marcas"));
                spM.setMarca(jsonArreglo.getJSONObject(i).getString("marca"));
                listaMarcas.add(spM);
            }
            ArrayAdapter<MarcasResponseSP> a = new ArrayAdapter<>(this, R.layout.spinner_text, listaMarcas);
            a.setDropDownViewResource(R.layout.spinner_dropdown_text);
            sendMarcasST.setAdapter(a);
            sendMarcasST.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                    confMarca.setText(parent.getItemAtPosition(position).toString());
                    confIDMarca.setText(listaMarcas.get(position).getId_marcas());

                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public void ConfirmarStock (){
        AlertDialog.Builder opcion = new AlertDialog.Builder(this);
        opcion.setMessage("Agregar Stock?");
        opcion.setPositiveButton("Enviar", (dialog, which) -> saveStock());
        opcion.setNegativeButton("Cancelar", (dialog, which) -> dialog.cancel());

        AlertDialog dialog = opcion.create();
        dialog.show();
    }

    public void saveStock (){
        fechaADDST();

        sdIDM = confIDMarca.getText().toString();
        sdSTK = sendST.getText().toString();

        if (sendST.getText().toString().isEmpty()){
            sendST.setError("Agregar Stock");
        }else{
            Call<StockResponse> svST = ApiClient.getUserService().ADDStock(sdIDM,sdSTK,sdSTK,fecha_s,"1");
            svST.enqueue(new Callback<StockResponse>() {
                @Override
                public void onResponse(@NonNull Call<StockResponse> call, @NonNull Response<StockResponse> response) {

                    if (response.isSuccessful()) {
                        StockResponse mensaje = response.body();
                        assert mensaje != null;
                        Toast.makeText(Stock_add.this, ""+mensaje.getMensaje()+" "+response.code(), Toast.LENGTH_SHORT).show();
                        finish();
                    } else {
                        StockResponse mensaje = response.body();
                        assert mensaje != null;
                        Toast.makeText(Stock_add.this, ""+mensaje.getMensaje()+" "+response.code(), Toast.LENGTH_SHORT).show();
                    }

                }

                @Override
                public void onFailure(@NonNull Call<StockResponse> call, @NonNull Throwable t) {
                    Toast.makeText(Stock_add.this, "Error " + t.getMessage(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}