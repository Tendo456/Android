package com.example.questguyana.Actividades;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.questguyana.Modelos.QuestResponse;
import com.example.questguyana.R;
import com.example.questguyana.RetrofitData.ApiClient;
import com.novoda.merlin.Bindable;
import com.novoda.merlin.Connectable;
import com.novoda.merlin.Disconnectable;
import com.novoda.merlin.Merlin;
import com.novoda.merlin.NetworkStatus;

import org.jetbrains.annotations.NotNull;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Quest extends AppCompatActivity implements Connectable, Disconnectable, Bindable {

    private Merlin merlin;
    Spinner puntaje_1,puntaje_2,puntaje_3,puntaje_4,puntaje_5,puntaje_6,puntaje_7,puntaje_8,puntaje_9,puntaje_10,puntaje_11;
    EditText respuesta_12, respuesta_13;
    Button send;
    String p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11;
    Integer shoot;
    TextView date,time,location;
    int dia,mes,year;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quest);

        puntaje_1 = findViewById(R.id.puntaje_1);
        puntaje_2 = findViewById(R.id.puntaje_2);
        puntaje_3 = findViewById(R.id.puntaje_3);
        puntaje_4 = findViewById(R.id.puntaje_4);
        puntaje_5 = findViewById(R.id.puntaje_5);
        puntaje_6 = findViewById(R.id.puntaje_6);
        puntaje_7 = findViewById(R.id.puntaje_7);
        puntaje_8 = findViewById(R.id.puntaje_8);
        puntaje_9 = findViewById(R.id.puntaje_9);
        puntaje_10 = findViewById(R.id.puntaje_10);
        puntaje_11 = findViewById(R.id.puntaje_11);
        respuesta_12 = findViewById(R.id.respuesta_12);
        respuesta_13 = findViewById(R.id.respuesta_13);
        send = findViewById(R.id.send);
        date = findViewById(R.id.textDate);
        time = findViewById(R.id.textTime);
        location = findViewById(R.id.textLocation);

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

        puntaje_7.setAdapter(adapter);
        puntaje_7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                p7  =parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        puntaje_8.setAdapter(adapter);
        puntaje_8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                p8  =parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        puntaje_9.setAdapter(adapter);
        puntaje_9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                p9  =parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        puntaje_10.setAdapter(adapter);
        puntaje_10.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                p10  =parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        puntaje_11.setAdapter(adapter);
        puntaje_11.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                p11  =parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        send.setOnClickListener(v -> Confirm());
    }

    public void Confirm (){
        AlertDialog.Builder opcion = new AlertDialog.Builder(this);
        opcion.setMessage("Enviar los Datos?");
        opcion.setPositiveButton("Enviar", (dialog, which) -> SendAnswer());
        opcion.setNegativeButton("Cancelar", (dialog, which) -> dialog.cancel());

        AlertDialog dialog = opcion.create();
        dialog.show();
    }

    private void SendAnswer (){

        fecha();
        hora();

        if (p1.equals("0")) {
            LayoutInflater inflater = getLayoutInflater();
            View layout = inflater.inflate(R.layout.mensaje_toast2, findViewById(R.id.layoutToastEr));

            TextView textEr = layout.findViewById(R.id.textEr);
            textEr.setText("Questions 1 to 11 are required");

            Toast toast = new Toast(getApplicationContext());
            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
            toast.setDuration(Toast.LENGTH_LONG);
            toast.setView(layout);
            toast.show();
        }

        else if (p2.equals("0")) {
            LayoutInflater inflater = getLayoutInflater();
            View layout = inflater.inflate(R.layout.mensaje_toast2, findViewById(R.id.layoutToastEr));

            TextView textEr = layout.findViewById(R.id.textEr);
            textEr.setText("Questions 1 to 11 are required");

            Toast toast = new Toast(getApplicationContext());
            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
            toast.setDuration(Toast.LENGTH_LONG);
            toast.setView(layout);
            toast.show();
        }

        else if (p3.equals("0")) {
            LayoutInflater inflater = getLayoutInflater();
            View layout = inflater.inflate(R.layout.mensaje_toast2, findViewById(R.id.layoutToastEr));

            TextView textEr = layout.findViewById(R.id.textEr);
            textEr.setText("Questions 1 to 11 are required");

            Toast toast = new Toast(getApplicationContext());
            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
            toast.setDuration(Toast.LENGTH_LONG);
            toast.setView(layout);
            toast.show();
        }

        else if (p4.equals("0")) {
            LayoutInflater inflater = getLayoutInflater();
            View layout = inflater.inflate(R.layout.mensaje_toast2, findViewById(R.id.layoutToastEr));

            TextView textEr = layout.findViewById(R.id.textEr);
            textEr.setText("Questions 1 to 11 are required");

            Toast toast = new Toast(getApplicationContext());
            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
            toast.setDuration(Toast.LENGTH_LONG);
            toast.setView(layout);
            toast.show();
        }

        else if (p5.equals("0")) {
            LayoutInflater inflater = getLayoutInflater();
            View layout = inflater.inflate(R.layout.mensaje_toast2, findViewById(R.id.layoutToastEr));

            TextView textEr = layout.findViewById(R.id.textEr);
            textEr.setText("Questions 1 to 11 are required");

            Toast toast = new Toast(getApplicationContext());
            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
            toast.setDuration(Toast.LENGTH_LONG);
            toast.setView(layout);
            toast.show();
        }

        else if (p6.equals("0")) {
            LayoutInflater inflater = getLayoutInflater();
            View layout = inflater.inflate(R.layout.mensaje_toast2, findViewById(R.id.layoutToastEr));

            TextView textEr = layout.findViewById(R.id.textEr);
            textEr.setText("Questions 1 to 11 are required");

            Toast toast = new Toast(getApplicationContext());
            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
            toast.setDuration(Toast.LENGTH_LONG);
            toast.setView(layout);
            toast.show();
        }

        else if (p7.equals("0")) {
            LayoutInflater inflater = getLayoutInflater();
            View layout = inflater.inflate(R.layout.mensaje_toast2, findViewById(R.id.layoutToastEr));

            TextView textEr = layout.findViewById(R.id.textEr);
            textEr.setText("Questions 1 to 11 are required");

            Toast toast = new Toast(getApplicationContext());
            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
            toast.setDuration(Toast.LENGTH_LONG);
            toast.setView(layout);
            toast.show();
        }

        else if (p8.equals("0")) {
            LayoutInflater inflater = getLayoutInflater();
            View layout = inflater.inflate(R.layout.mensaje_toast2, findViewById(R.id.layoutToastEr));

            TextView textEr = layout.findViewById(R.id.textEr);
            textEr.setText("Questions 1 to 11 are required");

            Toast toast = new Toast(getApplicationContext());
            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
            toast.setDuration(Toast.LENGTH_LONG);
            toast.setView(layout);
            toast.show();
        }

        else if (p9.equals("0")) {
            LayoutInflater inflater = getLayoutInflater();
            View layout = inflater.inflate(R.layout.mensaje_toast2, findViewById(R.id.layoutToastEr));

            TextView textEr = layout.findViewById(R.id.textEr);
            textEr.setText("Questions 1 to 11 are required");

            Toast toast = new Toast(getApplicationContext());
            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
            toast.setDuration(Toast.LENGTH_LONG);
            toast.setView(layout);
            toast.show();
        }

        else if (p10.equals("0")) {
            LayoutInflater inflater = getLayoutInflater();
            View layout = inflater.inflate(R.layout.mensaje_toast2, findViewById(R.id.layoutToastEr));

            TextView textEr = layout.findViewById(R.id.textEr);
            textEr.setText("Questions 1 to 11 are required");

            Toast toast = new Toast(getApplicationContext());
            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
            toast.setDuration(Toast.LENGTH_LONG);
            toast.setView(layout);
            toast.show();
        }

        else if (p11.equals("0")) {
            LayoutInflater inflater = getLayoutInflater();
            View layout = inflater.inflate(R.layout.mensaje_toast2, findViewById(R.id.layoutToastEr));

            TextView textEr = layout.findViewById(R.id.textEr);
            textEr.setText("Questions 1 to 11 are required");

            Toast toast = new Toast(getApplicationContext());
            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
            toast.setDuration(Toast.LENGTH_LONG);
            toast.setView(layout);
            toast.show();
        }else {

            Call<QuestResponse> call = ApiClient.getUserService().SendAnswers(date.getText().toString(), time.getText().toString(), location.getText().toString(), p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,respuesta_12.getText().toString(),respuesta_13.getText().toString());
            call.enqueue(new Callback<QuestResponse>() {
                @Override
                public void onResponse(@NotNull Call<QuestResponse> call, @NotNull Response<QuestResponse> response) {
                    if (response.isSuccessful()) {
                        QuestResponse mensage = response.body();
                        assert mensage != null;
                        Toast.makeText(Quest.this, ""+mensage.getMensage()+" "+response.code(), Toast.LENGTH_SHORT).show();
                        shoot = response.code();
                        if (shoot == 200){
                            LayoutInflater inflater = getLayoutInflater();
                            View layout = inflater.inflate(R.layout.mensaje_toast, findViewById(R.id.layoutToast));

                            TextView text = layout.findViewById(R.id.text);
                            text.setText("Procesando Respuestas");

                            Toast toast = new Toast(getApplicationContext());
                            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 800);
                            toast.setDuration(Toast.LENGTH_LONG);
                            toast.setView(layout);
                            toast.show();

                            Intent intent = new Intent(Quest.this, reebot.class);
                            startActivity(intent);
                            finish();
                        }
                    } else {
                        QuestResponse mensage = response.body();
                        assert mensage != null;
                        Toast.makeText(Quest.this, ""+mensage.getMensage()+" " +response.code(), Toast.LENGTH_SHORT).show();
                    }
                }

                @Override
                public void onFailure(@NotNull Call<QuestResponse> call, @NotNull Throwable t) {
                    Toast.makeText(Quest.this, "Fail " + t.getMessage(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

    public void fecha (){
        final Calendar calendar = Calendar.getInstance();
        dia =calendar.get(Calendar.DAY_OF_MONTH);
        mes= calendar.get(Calendar.MONTH);
        year = calendar.get(Calendar.YEAR);
        @SuppressLint("SimpleDateFormat") Format formatter = new SimpleDateFormat("yyyy-MM-dd");
        String s = formatter.format(calendar.getTime());

        date.setText(s);
    }

    public void hora (){
        Date date = new Date();
        @SuppressLint("SimpleDateFormat") Format h = new SimpleDateFormat("HH:mm:ss");
        String ho = h.format(date);
        time.setText(ho);
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