package com.example.questasistencial;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    Spinner puntaje_1,puntaje_2,puntaje_3,puntaje_4,puntaje_5,spLugar;
    RadioButton rbSi,rbNo;
    TextView resp7,resp8,fecha,hora;
    Button Enviar;
    String p1,p2,p3,p4,p5,p6,lugares;
    ImageView fondo;
    Animation transparencia;
    int dia,mes,año;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        transparencia = AnimationUtils.loadAnimation(this, R.anim.transparencia);
        puntaje_1 = findViewById(R.id.puntaje_1);
        puntaje_2 = findViewById(R.id.puntaje_2);
        puntaje_3 = findViewById(R.id.puntaje_3);
        puntaje_4 = findViewById(R.id.puntaje_4);
        puntaje_5 = findViewById(R.id.puntaje_5);
        rbSi = findViewById(R.id.rbSi);
        rbNo = findViewById(R.id.rbNo);

        fecha = findViewById(R.id.fecha);
        spLugar = findViewById(R.id.spLugar);
        resp7 = findViewById(R.id.respuesta7);
        resp8 = findViewById(R.id.respuesta8);
        Enviar = findViewById(R.id.Enviar);
        fondo = findViewById(R.id.fondo);
        hora = findViewById(R.id.hora);

        fondo.setAnimation(transparencia);


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.numeros, R.layout.spinner_text);
        adapter.setDropDownViewResource(R.layout.spinner_dropdown_text);
        puntaje_1.setAdapter(adapter);
        puntaje_1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                p1 = parent.getItemAtPosition(position).toString();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        puntaje_2.setAdapter(adapter);
        puntaje_2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                p2  =parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        puntaje_3.setAdapter(adapter);
        puntaje_3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                p3  =parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        puntaje_4.setAdapter(adapter);
        puntaje_4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                p4  =parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        puntaje_5.setAdapter(adapter);
        puntaje_5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                p5  =parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayAdapter<CharSequence> loc = ArrayAdapter.createFromResource(this, R.array.lugares, R.layout.spinner_text);
        loc.setDropDownViewResource(R.layout.spinner_dropdown_text);
        spLugar.setAdapter(loc);
        spLugar.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                lugares = parent.getItemAtPosition(position).toString();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        fecha();

        Enviar.setOnClickListener(v -> confirmar());

        pre6();
        rbSi.setOnClickListener(v -> pre6());
        rbNo.setOnClickListener(v -> pre6());

    }

    public void pre6(){
        if(rbSi.isChecked()){
            p6="Si";
        }
        else if(rbNo.isChecked()){
            p6="No";
        }
    }

    public void confirmar(){
        AlertDialog.Builder opcion = new AlertDialog.Builder(this);
        opcion.setMessage("Enviar los Datos?");
        opcion.setPositiveButton("Enviar", (dialog, which) ->
                enviar("http://190.119.144.250:83/encuesta/asistencial/insertarAsistencial.php"));
        //http://190.119.144.250:83/encuesta/insertarEncuesta.php
        opcion.setNegativeButton("Cancelar", (dialog, which) -> dialog.cancel());

        AlertDialog dialog = opcion.create();
        dialog.show();
    }

    private void enviar (String URL){
        //numeros.setText(p1+p2+p3+p4+p5+lugares);

        hora();

        if (p1.equals("0")) {
            Toast.makeText(getApplicationContext(), "Preguntas del 1 al 6 obligatorias", Toast.LENGTH_SHORT).show();
        }

        else if (p2.equals("0")) {
            Toast.makeText(getApplicationContext(), "Preguntas del 1 al 6 obligatorias", Toast.LENGTH_SHORT).show();
        }

        else if (p3.equals("0")) {
            Toast.makeText(getApplicationContext(), "Preguntas del 1 al 6 obligatorias", Toast.LENGTH_SHORT).show();
        }

        else if (p4.equals("0")) {
            Toast.makeText(getApplicationContext(), "Preguntas del 1 al 6 obligatorias", Toast.LENGTH_SHORT).show();
        }

        else if (p5.equals("0")) {
            Toast.makeText(getApplicationContext(), "Preguntas del 1 al 6 obligatorias", Toast.LENGTH_SHORT).show();
        }


        else {

            StringRequest stringRequest = new StringRequest(Request.Method.POST, URL, response -> {
                Toast.makeText(getApplicationContext(), "Procesando Respuestas", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, Mensaje.class);
                startActivity(intent);
                finish();

            }, error -> Toast.makeText(getApplicationContext(), "Error al Enviar los Datos", Toast.LENGTH_SHORT).show()){

                @Override
                protected Map<String, String> getParams() throws AuthFailureError {
                    Map<String, String> parametros = new HashMap<String, String>();
                    parametros.put("fecha", fecha.getText().toString());
                    parametros.put("hora", hora.getText().toString());
                    parametros.put("lugar", lugares);
                    parametros.put("pregunta1", p1);
                    parametros.put("pregunta2", p2);
                    parametros.put("pregunta3", p3);
                    parametros.put("pregunta4", p4);
                    parametros.put("pregunta5", p5);
                    parametros.put("pregunta6", p6);
                    parametros.put("pregunta7", resp7.getText().toString());
                    parametros.put("pregunta8", resp8.getText().toString());
                    return parametros;
                }
            };
            RequestQueue requestQueue = Volley.newRequestQueue(this);
            requestQueue.add(stringRequest);

        }
    }

    public void fecha (){
        final Calendar calendar = Calendar.getInstance();
        dia =calendar.get(Calendar.DAY_OF_MONTH);
        mes= calendar.get(Calendar.MONTH);
        año = calendar.get(Calendar.YEAR);
        @SuppressLint("SimpleDateFormat") Format formatter = new SimpleDateFormat("yyyy-MM-dd");
        //Format formatter = new SimpleDateFormat("yyyy-MM-dd");
        String s = formatter.format(calendar.getTime());

        fecha.setText(s);
    }

    public void hora (){
        Date date = new Date();
        //@SuppressLint("SimpleDateFormat") Format h = new SimpleDateFormat("hh:mm:ss");
        @SuppressLint("SimpleDateFormat") Format h = new SimpleDateFormat("HH:mm:ss");
        String ho = h.format(date);
        hora.setText(ho);
    }
}