package com.example.breaks.actividades;

import androidx.appcompat.app.AppCompatActivity;

import com.example.breaks.Modelos.MarcasResponseSP;
import com.example.breaks.R;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import org.json.JSONArray;

import java.util.ArrayList;

import cz.msebera.android.httpclient.Header;

public class Stock_add extends AppCompatActivity {

    Spinner sendMarcasST;
    EditText sendST;
    TextView sendFechaST,confIDMarca, confMarca;
    private AsyncHttpClient MarcasAct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stock_add);

        sendMarcasST = findViewById(R.id.sendMarcaST);
        sendST = findViewById(R.id.sendST);
        sendFechaST = findViewById(R.id.sendFechaST);
        confIDMarca = findViewById(R.id.confIDMarca);
        confMarca = findViewById(R.id.confMarca);

        MarcasAct = new AsyncHttpClient();
        llenarspinerM();

    }

    public void llenarspinerM (){
        String url = "http://192.168.1.107/ScreeningApp/Marcas/MarcasSP.php";
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
}