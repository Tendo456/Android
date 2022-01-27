package com.example.breaks.actividades;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.breaks.Adaptador.BreaksAdapter;
import com.example.breaks.Modelos.BreaksResponse;
import com.example.breaks.Modelos.PersonalResponse;
import com.example.breaks.R;
import com.example.breaks.RetrofitData.ApiClient;
import com.google.android.gms.common.api.Api;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Breaks extends AppCompatActivity {

    TextView BTiempo,BProg,NombreBus;
    String Bdate, Btime;
    RecyclerView BreaksList;
    BreaksAdapter breaksAdapter;
    FloatingActionButton addBreak;
    EditText DNIBus;
    String contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breaks);

        BTiempo = findViewById(R.id.BTiempo);
        BProg = findViewById(R.id.BProg);
        BreaksList = findViewById(R.id.BreaksList);
        addBreak = findViewById(R.id.addBreak);



        BreaksList.setLayoutManager(new LinearLayoutManager(this));
        BreaksList.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
        breaksAdapter = new BreaksAdapter();


        Bfecha();
        Bhora();


        addBreak.setOnClickListener(view -> dialogoBre() );
    }

    public void Bfecha (){
        final Calendar calendar = Calendar.getInstance();
        @SuppressLint("SimpleDateFormat") Format formatter = new SimpleDateFormat("yyyy-MM-dd");
        Bdate = formatter.format(calendar.getTime());
        //date.setText(s);
        getBreaks();
    }

    public void Bhora (){
        Date date = new Date();
        @SuppressLint("SimpleDateFormat") Format h = new SimpleDateFormat("HH:mm:ss");
        Btime = h.format(date);
        //time.setText(ho);

        BTiempo.setText(Bdate+" "+Btime);
    }

    public void getBreaks(){
        Call<List<BreaksResponse>> getBk = ApiClient.getUserService().getBreak(Bdate);
        getBk.enqueue(new Callback<List<BreaksResponse>>() {
            @Override
            public void onResponse(Call<List<BreaksResponse>> call, Response<List<BreaksResponse>> response) {
                if(response.isSuccessful()){
                    List<BreaksResponse> breaksResponses = response.body();
                    breaksAdapter.setData(breaksResponses);
                    BreaksList.setAdapter(breaksAdapter);
                }
            }

            @Override
            public void onFailure(Call<List<BreaksResponse>> call, Throwable t) {
                Toast.makeText(Breaks.this, "Error " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void dialogoBre (){

        AlertDialog.Builder builder = new AlertDialog.Builder(Breaks.this);
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.break_dialog,null);
        builder.setView(view);

        Button GuardarBus = view.findViewById(R.id.GuardarBus);
        Button ScanBus = view.findViewById(R.id.ScanBus);
        DNIBus = view.findViewById(R.id.DNIBus);
        NombreBus = view.findViewById(R.id.NombreBus);

        GuardarBus.setOnClickListener(view1 -> Toast.makeText(Breaks.this, "guardar", Toast.LENGTH_SHORT).show());
        ScanBus.setOnClickListener(view1 -> Scan());

        DNIBus.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if(editable.toString().length()>=8){
                    contador = DNIBus.getText().toString();
                    Toast.makeText(Breaks.this, "siuuuuuu", Toast.LENGTH_SHORT).show();
                    hilo();
                }
            }
        });

        final AlertDialog dialog = builder.create();
        dialog.show();

    }

    public void Scan (){
        IntentIntegrator integrador = new IntentIntegrator(Breaks.this);
        integrador.setDesiredBarcodeFormats(IntentIntegrator.ALL_CODE_TYPES);
        integrador.setPrompt("Lector - CDP");
        integrador.setCameraId(0);
        integrador.setOrientationLocked(false);
        integrador.setCaptureActivity(orientation.class);
        integrador.setBeepEnabled(true);
        integrador.setBarcodeImageEnabled(true);
        integrador.initiateScan();

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        IntentResult result = IntentIntegrator.parseActivityResult(requestCode,resultCode,data);

        if(result != null){
            if(result.getContents() == null){
                Toast.makeText(this,"Lectura Cancelada", Toast.LENGTH_SHORT).show();
            }else {
                Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){v.vibrate(VibrationEffect.createOneShot(500, VibrationEffect.DEFAULT_AMPLITUDE));}
                Toast.makeText(this,result.getContents(), Toast.LENGTH_SHORT).show();
                DNIBus.setText(result.getContents());
            }
        }else{
            super.onActivityResult(requestCode, resultCode, data);
        }
    }

    public void hilo(){
        new Handler(Looper.getMainLooper()).postDelayed(this::search,3000);
    }

    public void search(){

        Call<List<PersonalResponse>> PersB = ApiClient.getUserService().getPerB(contador);
        PersB.enqueue(new Callback<List<PersonalResponse>>() {
            @Override
            public void onResponse(@NonNull Call<List<PersonalResponse>> call, @NonNull Response<List<PersonalResponse>> response) {
                if(!response.isSuccessful()){
                    NombreBus.setText(response.code());
                    return;
                }
                List<PersonalResponse> personalResponses = response.body();
                assert personalResponses != null;
                for (PersonalResponse personalResponse: personalResponses){
                    String nam ="";
                    nam=personalResponse.getNombres()+" "+personalResponse.getApelli_paterno()+" "+personalResponse.getApelli_materno();
                    NombreBus.append(nam);
                }

            }

            @Override
            public void onFailure(@NonNull Call<List<PersonalResponse>> call, @NonNull Throwable t) {
                Toast.makeText(Breaks.this, "Errores " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

    }


}