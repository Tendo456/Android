package com.example.labprueba;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {

    EditText Rhora,Rnenvio,Rqmuestras,Roperador,Rdni,Restado;
    Button RGuardar;
    String est;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Rhora = findViewById(R.id.Rhora);
        Rnenvio = findViewById(R.id.Rnenvio);
        Rqmuestras = findViewById(R.id.Rqmuestras);
        Roperador = findViewById(R.id.Roperador);
        Rdni = findViewById(R.id.Rdni);
        RGuardar = findViewById(R.id.RGuardar);
        est = "1";

        fecha();

        /*RGuardar.setOnClickListener(v -> {
            sendPost(Rhora.getText().toString(),
                    Rnenvio.getText().toString(),
                    Rqmuestras.getText().toString(),
                    Roperador.getText().toString(),
                    Rdni.getText().toString(),
                    est);
        });*/

        RGuardar.setOnClickListener(v -> saveuser());
    }


    public void fecha (){
        final Calendar calendar = Calendar.getInstance();
        @SuppressLint("SimpleDateFormat") Format formatter = new SimpleDateFormat("yyyy-MM-dd");
        String s = formatter.format(calendar.getTime());

        Date date = new Date();
        //@SuppressLint("SimpleDateFormat") Format h = new SimpleDateFormat("hh:mm:ss");
        @SuppressLint("SimpleDateFormat") Format h = new SimpleDateFormat("HH:mm:ss");
        String ho = h.format(date);

        Rhora.setText(s+" "+ho);
    }

    /*public void sendPost(String hora, String n_envio, String q_muestras, String operador, String dni, String estado){
        Call<String> call = ApliClient.getUserService().insert(hora,n_envio,q_muestras,operador,dni,estado);
        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {

                if(response.isSuccessful()){
                    Toast.makeText(MainActivity.this, "Datos Guardados",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Error 1",Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Error 2 "+ t.getMessage(),Toast.LENGTH_SHORT).show();
            }
        });
    }*/

    private void saveuser(){
        Call<Presponse> call = ApliClient.getUserService().insert("2021-06-05 10:58:45","55", "44","juan","44444","1");
        call.enqueue(new Callback<Presponse>() {
            @Override
            public void onResponse(Call<Presponse> call, Response<Presponse> response) {
                if(response.isSuccessful()){
                    Toast.makeText(MainActivity.this, "Datos Guardados",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Error 1",Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Presponse> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Error 2"+t.getMessage(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}