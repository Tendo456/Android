package com.example.quest;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.novoda.merlin.Bindable;
import com.novoda.merlin.Connectable;
import com.novoda.merlin.Disconnectable;
import com.novoda.merlin.Merlin;
import com.novoda.merlin.NetworkStatus;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity implements Connectable, Disconnectable, Bindable {

    private Merlin merlin;
    Spinner puntaje_1,puntaje_2,puntaje_3,puntaje_4,puntaje_5,puntaje_6;
    TextView resp7,resp8,fecha,hora,Lugar;
    Button Enviar;
    String p1,p2,p3,p4,p5,p6,lugares;
    ImageView fondo;
    Animation transparencia;
    int dia,mes,year;

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
        puntaje_6 = findViewById(R.id.puntaje_6);

        fecha = findViewById(R.id.fecha);
        Lugar = findViewById(R.id.Lugar);
        resp7 = findViewById(R.id.respuesta7);
        resp8 = findViewById(R.id.respuesta8);
        Enviar = findViewById(R.id.Enviar);
        fondo = findViewById(R.id.fondo);
        hora = findViewById(R.id.hora);

        merlin = new Merlin.Builder().withConnectableCallbacks()
                .withDisconnectableCallbacks()
                .withBindableCallbacks()
                .build(this);

        merlin.registerBindable(this);
        merlin.registerConnectable(this);
        merlin.registerDisconnectable(this);

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

        puntaje_6.setAdapter(adapter);
        puntaje_6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                p6  =parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        lugares=Lugar.getText().toString();
        fecha();
        Enviar.setOnClickListener(v -> confirmar());


    }

    public void confirmar(){
        AlertDialog.Builder opcion = new AlertDialog.Builder(this);
        opcion.setMessage("Enviar las Respuestas?");
        opcion.setPositiveButton("Enviar", (dialog, which) ->
                enviar("http://190.119.144.250:83/encuesta/ocupacional/insertarOcupacional.php"));
        opcion.setNegativeButton("Cancelar", (dialog, which) -> dialog.cancel());

        AlertDialog dialog = opcion.create();
        dialog.show();
    }

    private void enviar (String URL){
        //numeros.setText(p1+p2+p3+p4+p5+lugares);

        hora();

        if (p1.equals("0")) {
            LayoutInflater inflater = getLayoutInflater();
            View layout = inflater.inflate(R.layout.mensaje_toast2, (ViewGroup) findViewById(R.id.layoutToastEr));

            TextView textEr = (TextView) layout.findViewById(R.id.textEr);
            textEr.setText("Preguntas del 1 al 6 obligatorias");

            Toast toast = new Toast(getApplicationContext());
            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
            toast.setDuration(Toast.LENGTH_LONG);
            toast.setView(layout);
            toast.show();
        }

        else if (p2.equals("0")) {
            LayoutInflater inflater = getLayoutInflater();
            View layout = inflater.inflate(R.layout.mensaje_toast2, (ViewGroup) findViewById(R.id.layoutToastEr));

            TextView textEr = (TextView) layout.findViewById(R.id.textEr);
            textEr.setText("Preguntas del 1 al 6 obligatorias");

            Toast toast = new Toast(getApplicationContext());
            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
            toast.setDuration(Toast.LENGTH_LONG);
            toast.setView(layout);
            toast.show();
        }

        else if (p3.equals("0")) {
            LayoutInflater inflater = getLayoutInflater();
            View layout = inflater.inflate(R.layout.mensaje_toast2, (ViewGroup) findViewById(R.id.layoutToastEr));

            TextView textEr = (TextView) layout.findViewById(R.id.textEr);
            textEr.setText("Preguntas del 1 al 6 obligatorias");

            Toast toast = new Toast(getApplicationContext());
            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
            toast.setDuration(Toast.LENGTH_LONG);
            toast.setView(layout);
            toast.show();
        }

        else if (p4.equals("0")) {
            LayoutInflater inflater = getLayoutInflater();
            View layout = inflater.inflate(R.layout.mensaje_toast2, (ViewGroup) findViewById(R.id.layoutToastEr));

            TextView textEr = (TextView) layout.findViewById(R.id.textEr);
            textEr.setText("Preguntas del 1 al 6 obligatorias");

            Toast toast = new Toast(getApplicationContext());
            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
            toast.setDuration(Toast.LENGTH_LONG);
            toast.setView(layout);
            toast.show();
        }

        else if (p5.equals("0")) {
            LayoutInflater inflater = getLayoutInflater();
            View layout = inflater.inflate(R.layout.mensaje_toast2, (ViewGroup) findViewById(R.id.layoutToastEr));

            TextView textEr = (TextView) layout.findViewById(R.id.textEr);
            textEr.setText("Preguntas del 1 al 6 obligatorias");

            Toast toast = new Toast(getApplicationContext());
            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
            toast.setDuration(Toast.LENGTH_LONG);
            toast.setView(layout);
            toast.show();
        }

        else if (p6.equals("0")) {
            LayoutInflater inflater = getLayoutInflater();
            View layout = inflater.inflate(R.layout.mensaje_toast2, (ViewGroup) findViewById(R.id.layoutToastEr));

            TextView textEr = (TextView) layout.findViewById(R.id.textEr);
            textEr.setText("Preguntas del 1 al 6 obligatorias");

            Toast toast = new Toast(getApplicationContext());
            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
            toast.setDuration(Toast.LENGTH_LONG);
            toast.setView(layout);
            toast.show();
        }


        else {

            StringRequest stringRequest = new StringRequest(Request.Method.POST, URL, response -> {

                LayoutInflater inflater = getLayoutInflater();
                View layout = inflater.inflate(R.layout.mensaje_toast, (ViewGroup) findViewById(R.id.layoutToast));

                TextView text = (TextView) layout.findViewById(R.id.text);
                text.setText("Procesando Respuestas");

                Toast toast = new Toast(getApplicationContext());
                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 100);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setView(layout);
                toast.show();

                Intent intent = new Intent(MainActivity.this, Mensaje.class);
                startActivity(intent);
                finish();

            }, error -> {LayoutInflater inflater = getLayoutInflater();
                View layout = inflater.inflate(R.layout.mensaje_toast2, (ViewGroup) findViewById(R.id.layoutToastEr));

                TextView textEr = (TextView) layout.findViewById(R.id.textEr);
                textEr.setText("Error al Enviar las Respuestas");

                Toast toast = new Toast(getApplicationContext());
                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 100);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setView(layout);
                toast.show();}){
                
                @Override
                protected Map<String, String> getParams() {
                    Map<String, String> parametros = new HashMap<>();
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
        year = calendar.get(Calendar.YEAR);
        @SuppressLint("SimpleDateFormat") Format formatter = new SimpleDateFormat("yyyy-MM-dd");
        String s = formatter.format(calendar.getTime());

        fecha.setText(s);
    }

    public void hora (){
        Date date = new Date();
        @SuppressLint("SimpleDateFormat") Format h = new SimpleDateFormat("HH:mm:ss");
        String ho = h.format(date);
        hora.setText(ho);
    }

    @Override
    protected void onResume() {
        super.onResume();
        if(merlin != null){
            merlin.bind();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(merlin != null){
            merlin.unbind();
        }
    }

    @Override
    public void onBind(NetworkStatus networkStatus) {
        if(!networkStatus.isAvailable()){
            onDisconnect();
        }
    }

    @Override
    public void onConnect() {
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.mensaje_toast, (ViewGroup) findViewById(R.id.layoutToast));

        TextView text = (TextView) layout.findViewById(R.id.text);
        text.setText("Conectado a Internet ✓");

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();
    }

    @Override
    public void onDisconnect() {
        runOnUiThread(() -> {
            LayoutInflater inflater = getLayoutInflater();
            View layout = inflater.inflate(R.layout.mensaje_toast2, (ViewGroup) findViewById(R.id.layoutToastEr));

            TextView textEr = (TextView) layout.findViewById(R.id.textEr);
            textEr.setText("Sin Acceso a Internet X");

            Toast toast = new Toast(getApplicationContext());
            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
            toast.setDuration(Toast.LENGTH_LONG);
            toast.setView(layout);
            toast.show();
        });
    }
}

