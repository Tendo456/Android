package com.example.questasistencial;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

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
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
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

    Spinner puntaje_1,puntaje_2,puntaje_3,puntaje_4,puntaje_5,spLugar;
    RadioButton rbSi,rbNo;
    TextView resp7,resp8,fecha,hora,title,encabezado1,encabezado2,encabezado3,pregunta1,pregunta2,pregunta3,pregunta4,pregunta5,pregunta6,pregunta7,pregunta8;
    Button Enviar;
    String p1,p2,p3,p4,p5,p6,lugares,mensaje1,mensaje2,obligatorio;
    ImageView fondo,image1,image2,image3,image4,image5;
    Animation transparencia;
    int dia,mes,año;
    private Merlin merlin;

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
        image1 = findViewById(R.id.image1);
        image2 = findViewById(R.id.image2);
        image3 = findViewById(R.id.image3);
        image4 = findViewById(R.id.image4);
        image5 = findViewById(R.id.image5);
        title = findViewById(R.id.title);
        encabezado1 = findViewById(R.id.encabezado1);
        encabezado2 = findViewById(R.id.encabezado2);
        encabezado3 = findViewById(R.id.encabezado3);
        pregunta1 = findViewById(R.id.pregunta1);
        pregunta2 = findViewById(R.id.pregunta2);
        pregunta3 = findViewById(R.id.pregunta3);
        pregunta4 = findViewById(R.id.pregunta4);
        pregunta5 = findViewById(R.id.pregunta5);
        pregunta6 = findViewById(R.id.pregunta6);
        pregunta7 = findViewById(R.id.pregunta7);
        pregunta8 = findViewById(R.id.pregunta8);

        fondo.setAnimation(transparencia);

        merlin = new Merlin.Builder().withConnectableCallbacks()
                .withDisconnectableCallbacks()
                .withBindableCallbacks()
                .build(this);

        merlin.registerBindable(this);
        merlin.registerConnectable(this);
        merlin.registerDisconnectable(this);


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
        loc.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spLugar.setAdapter(loc);
        spLugar.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                lugares = parent.getItemAtPosition(position).toString();
                if(lugares.equals("Expats")){
                    image1.setImageResource(R.drawable.verybad);
                    image2.setImageResource(R.drawable.bad);
                    image3.setImageResource(R.drawable.fair);
                    image4.setImageResource(R.drawable.good);
                    image5.setImageResource(R.drawable.excellent);
                    Enviar.setText("Send");
                    rbSi.setText("Yes");
                    title.setText(R.string.title);
                    encabezado1.setText(R.string.header1);
                    encabezado2.setText(R.string.header2);
                    encabezado3.setText(R.string.header3);
                    pregunta1.setText(R.string.number1);
                    pregunta2.setText(R.string.number2);
                    pregunta3.setText(R.string.number3);
                    pregunta4.setText(R.string.number4);
                    pregunta5.setText(R.string.number5);
                    pregunta6.setText(R.string.number6);
                    pregunta7.setText(R.string.number7);
                    pregunta8.setText(R.string.number8);
                    Enviar.setOnClickListener(v -> confirm());
                    mensaje1 = getText(R.string.message1).toString();
                    mensaje2 = getText(R.string.message2).toString();
                    obligatorio = getText(R.string.required).toString();

                }else {
                    image1.setImageResource(R.drawable.muy_malo);
                    image2.setImageResource(R.drawable.malo);
                    image3.setImageResource(R.drawable.regular);
                    image4.setImageResource(R.drawable.bueno);
                    image5.setImageResource(R.drawable.muy_bueno);
                    Enviar.setText("Enviar");
                    rbSi.setText("Si");
                    title.setText(R.string.titulo);
                    encabezado1.setText(R.string.encabezado1);
                    encabezado2.setText(R.string.encabezado2);
                    encabezado3.setText(R.string.encabezado3);
                    pregunta1.setText(R.string.numero1);
                    pregunta2.setText(R.string.numero2);
                    pregunta3.setText(R.string.numero3);
                    pregunta4.setText(R.string.numero4);
                    pregunta5.setText(R.string.numero5);
                    pregunta6.setText(R.string.numero6);
                    pregunta7.setText(R.string.numero7);
                    pregunta8.setText(R.string.numero8);
                    Enviar.setOnClickListener(v -> confirmar());
                    mensaje1 = getText(R.string.mensaje1).toString();
                    mensaje2 = getText(R.string.mensaje2).toString();
                    obligatorio = getText(R.string.obligatorio).toString();
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        fecha();

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
        opcion.setMessage("Enviar Respuestas?");
        opcion.setPositiveButton("Enviar", (dialog, which) ->
                enviar("http://179.43.85.99:80/encuesta/asistencial/insertarAsistencial.php"));
        opcion.setNegativeButton("Cancelar", (dialog, which) -> dialog.cancel());

        AlertDialog dialog = opcion.create();
        dialog.show();
    }

    public void confirm(){
        AlertDialog.Builder opcion = new AlertDialog.Builder(this);
        opcion.setMessage("Send Replay?");
        opcion.setPositiveButton("Send", (dialog, which) ->
                enviar("http://179.43.85.99:80/encuesta/asistencial/insertarAsistencial.php"));
        opcion.setNegativeButton("Cancel", (dialog, which) -> dialog.cancel());

        AlertDialog dialog = opcion.create();
        dialog.show();
    }

    private void enviar (String URL){
        //numeros.setText(p1+p2+p3+p4+p5+lugares);

        hora();

        if (p1.equals("0")) {
            //Toast.makeText(this,obligatorio,Toast.LENGTH_SHORT).show();
            LayoutInflater inflater = getLayoutInflater();
            View layout = inflater.inflate(R.layout.mensaje_toast2, findViewById(R.id.layoutToastEr));

            TextView textEr = (TextView) layout.findViewById(R.id.textEr);
            textEr.setText(obligatorio);

            Toast toast = new Toast(getApplicationContext());
            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
            toast.setDuration(Toast.LENGTH_LONG);
            toast.setView(layout);
            toast.show();
        }

        else if (p2.equals("0")) {
            //Toast.makeText(this,obligatorio,Toast.LENGTH_SHORT).show();
            LayoutInflater inflater = getLayoutInflater();
            View layout = inflater.inflate(R.layout.mensaje_toast2, (ViewGroup) findViewById(R.id.layoutToastEr));

            TextView textEr = (TextView) layout.findViewById(R.id.textEr);
            textEr.setText(obligatorio);

            Toast toast = new Toast(getApplicationContext());
            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
            toast.setDuration(Toast.LENGTH_LONG);
            toast.setView(layout);
            toast.show();
        }

        else if (p3.equals("0")) {
            //Toast.makeText(this,obligatorio,Toast.LENGTH_SHORT).show();
            LayoutInflater inflater = getLayoutInflater();
            View layout = inflater.inflate(R.layout.mensaje_toast2, (ViewGroup) findViewById(R.id.layoutToastEr));

            TextView textEr = (TextView) layout.findViewById(R.id.textEr);
            textEr.setText(obligatorio);

            Toast toast = new Toast(getApplicationContext());
            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
            toast.setDuration(Toast.LENGTH_LONG);
            toast.setView(layout);
            toast.show();
        }

        else if (p4.equals("0")) {
            //Toast.makeText(this,obligatorio,Toast.LENGTH_SHORT).show();
            LayoutInflater inflater = getLayoutInflater();
            View layout = inflater.inflate(R.layout.mensaje_toast2, (ViewGroup) findViewById(R.id.layoutToastEr));

            TextView textEr = (TextView) layout.findViewById(R.id.textEr);
            textEr.setText(obligatorio);

            Toast toast = new Toast(getApplicationContext());
            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
            toast.setDuration(Toast.LENGTH_LONG);
            toast.setView(layout);
            toast.show();
        }

        else if (p5.equals("0")) {
            //Toast.makeText(this,obligatorio,Toast.LENGTH_SHORT).show();
            LayoutInflater inflater = getLayoutInflater();
            View layout = inflater.inflate(R.layout.mensaje_toast2, (ViewGroup) findViewById(R.id.layoutToastEr));

            TextView textEr = (TextView) layout.findViewById(R.id.textEr);
            textEr.setText(obligatorio);

            Toast toast = new Toast(getApplicationContext());
            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
            toast.setDuration(Toast.LENGTH_LONG);
            toast.setView(layout);
            toast.show();
        }


        else {

            StringRequest stringRequest = new StringRequest(Request.Method.POST, URL, response -> {
                //Toast.makeText(this,mensaje1,Toast.LENGTH_SHORT).show();
                LayoutInflater inflater = getLayoutInflater();
                View layout = inflater.inflate(R.layout.mensaje_toast, (ViewGroup) findViewById(R.id.layoutToast));

                TextView text = (TextView) layout.findViewById(R.id.text);
                text.setText(mensaje1);

                Toast toast = new Toast(getApplicationContext());
                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 100);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setView(layout);
                toast.show();

                Intent intent = new Intent(MainActivity.this, Mensaje.class);
                intent.putExtra("place",lugares);
                startActivity(intent);
                finish();

            }, error -> {/*Toast.makeText(this,mensaje2,Toast.LENGTH_SHORT).show();*/

                LayoutInflater inflater = getLayoutInflater();
                View layout = inflater.inflate(R.layout.mensaje_toast2, (ViewGroup) findViewById(R.id.layoutToastEr));

                TextView textEr = (TextView) layout.findViewById(R.id.textEr);
                textEr.setText(mensaje2);

                Toast toast = new Toast(getApplicationContext());
                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 100);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setView(layout);
                toast.show();

            } ){

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
        año = calendar.get(Calendar.YEAR);
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
        //Toast.makeText(this,"Conectado a Internet ✓",Toast.LENGTH_SHORT).show();
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
            //Toast.makeText(this,"SIN ACCSESO A INTERNET X",Toast.LENGTH_SHORT).show();
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