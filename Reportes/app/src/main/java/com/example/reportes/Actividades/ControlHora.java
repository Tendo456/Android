package com.example.reportes.Actividades;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

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
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.reportes.Adaptadores.ControlHoraAdapter;
import com.example.reportes.Modelos.ControlHoraResponse;
import com.example.reportes.Modelos.PersonalResponse;
import com.example.reportes.R;
import com.example.reportes.RetrofitData.ApiClient;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ControlHora extends AppCompatActivity implements SearchView.OnQueryTextListener {

    SwipeRefreshLayout refreshCH;
    String Bdate, Btime, Buser, contador;
    TextView tiempoCH, NombreBus;
    RecyclerView HoraList;
    ControlHoraAdapter controlHoraAdapter;
    SearchView buscarCH;
    Animation transpCH;
    ImageView fondoCH;
    FloatingActionButton addControlHora;
    Button GuardarBus;
    EditText DNIBus;
    String idName = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control_hora);

        transpCH = AnimationUtils.loadAnimation(this, R.anim.transparencia);
        tiempoCH = findViewById(R.id.tiempoCH);
        HoraList = findViewById(R.id.HoraList);
        refreshCH = findViewById(R.id.refreshCH);
        buscarCH = findViewById(R.id.buscarCH);
        fondoCH = findViewById(R.id.fondoCH);
        addControlHora = findViewById(R.id.addControlHora);
        Buser = getIntent().getStringExtra("EmailUser");

        Bfecha();
        Bhora();

        addControlHora.setOnClickListener(view -> dialogoCH());

        HoraList.setLayoutManager(new LinearLayoutManager(this));
        HoraList.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
        controlHoraAdapter = new ControlHoraAdapter();

        refreshCH.setOnRefreshListener(()->{
            getTiempos();
            refreshCH.setRefreshing(false);
        });

        buscarCH.setOnQueryTextListener(this);
        fondoCH.setAnimation(transpCH);
    }

    public void Bfecha (){
        final Calendar calendar = Calendar.getInstance();
        @SuppressLint("SimpleDateFormat") Format formatter = new SimpleDateFormat("yyyy-MM-dd");
        Bdate = formatter.format(calendar.getTime());
        //date.setText(s);
        getTiempos();
    }

    public void Bhora (){
        Date date = new Date();
        @SuppressLint("SimpleDateFormat") Format h = new SimpleDateFormat("HH:mm:ss");
        Btime = h.format(date);
        // time.setText(ho);
        segundos();

        tiempoCH.setText(Bdate+" "+Btime);
    }

    public void segundos(){
        new Handler(Looper.getMainLooper()).postDelayed(this::Bhora,60000);
    }

    public void dialogoCH(){

        AlertDialog.Builder builder = new AlertDialog.Builder(ControlHora.this);
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.control_hora_dialog,null);
        builder.setView(view);
        AlertDialog dialog = builder.create();
        dialog.show();

        GuardarBus = view.findViewById(R.id.GuardarBus);
        Button ScanBus = view.findViewById(R.id.ScanBus);
        DNIBus = view.findViewById(R.id.DNIBus);
        NombreBus = view.findViewById(R.id.NombreBus);

        GuardarBus.setOnClickListener(view12 -> {
            ConfirmarCH();
            dialog.dismiss();
        });
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
                    NombreBus.setText("");
                    contador = DNIBus.getText().toString();
                    Toast.makeText(ControlHora.this, "Buscando: "+contador, Toast.LENGTH_SHORT).show();
                    hilo();
                }else {
                    GuardarBus.setEnabled(false);
                }
            }
        });
    }

    public void Scan(){
        IntentIntegrator integrador = new IntentIntegrator(ControlHora.this);
        integrador.setDesiredBarcodeFormats(IntentIntegrator.ALL_CODE_TYPES);
        integrador.setPrompt("Lector - QR");
        integrador.setCameraId(0);
        integrador.setOrientationLocked(false);
        integrador.setCaptureActivity(com.example.reportes.Actividades.orientation.class);
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
                Toast.makeText(this,"Buscando: "+result.getContents(), Toast.LENGTH_SHORT).show();
                DNIBus.setText(result.getContents());
            }
        }else{
            super.onActivityResult(requestCode, resultCode, data);
        }
    }

    public void getTiempos(){
        Call<List<ControlHoraResponse>> getCH = ApiClient.getUserService().getTime(Bdate);
        getCH.enqueue(new Callback<List<ControlHoraResponse>>() {
            @Override
            public void onResponse(@NonNull Call<List<ControlHoraResponse>> call, @NonNull Response<List<ControlHoraResponse>> response) {
                if(response.isSuccessful()){
                    List<ControlHoraResponse> controlHoraResponses = response.body();
                    controlHoraAdapter.setData(controlHoraResponses);
                    HoraList.setAdapter(controlHoraAdapter);
                }
            }

            @Override
            public void onFailure(@NonNull Call<List<ControlHoraResponse>> call, @NonNull Throwable t) {
            }
        });
    }

    public void hilo(){
        new Handler(Looper.getMainLooper()).postDelayed(this::search,2000);
    }

    public void search(){
        Call<List<PersonalResponse>> PersB = ApiClient.getUserService().getPerB(contador);
        PersB.enqueue(new Callback<List<PersonalResponse>>() {
            @Override
            public void onResponse(@NonNull Call<List<PersonalResponse>> call, @NonNull Response<List<PersonalResponse>> response) {
                if(response.isSuccessful()){
                    NombreBus.setText("");
                    String nam;
                    String name = null;

                    List<PersonalResponse> personalResponses = response.body();
                    assert personalResponses != null;
                    for (PersonalResponse personalResponse: personalResponses){
                        idName = personalResponse.getId_personal();
                        nam=personalResponse.getNombres()+" "+personalResponse.getApelli_paterno()+" "+personalResponse.getApelli_materno();
                        name = nam;
                    }
                    if(name == null){
                        Toast.makeText(ControlHora.this, "No Encontrado", Toast.LENGTH_SHORT).show();
                        GuardarBus.setEnabled(false);
                    }else{
                        NombreBus.append(name);
                        Toast.makeText(ControlHora.this,idName , Toast.LENGTH_SHORT).show();
                        GuardarBus.setEnabled(true);
                    }

                }else {
                    Toast.makeText(ControlHora.this, "No Encontrado", Toast.LENGTH_SHORT).show();
                    NombreBus.setText(response.code());

                }
            }

            @Override
            public void onFailure(@NonNull Call<List<PersonalResponse>> call, @NonNull Throwable t) {
                Toast.makeText(ControlHora.this, "Error Code: " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void ConfirmarCH(){
        AlertDialog.Builder opcion = new AlertDialog.Builder(this);
        opcion.setMessage("Agregar Hora?");
        opcion.setPositiveButton("Agregar", (dialog, which) -> SaveCH());
        opcion.setNegativeButton("Cancelar", (dialog, which) -> dialog.cancel());

        AlertDialog dialog = opcion.create();
        dialog.show();
    }

    public void SaveCH(){
        Call<ControlHoraResponse> insertCH = ApiClient.getUserService().ADDControlH(idName,Bdate,Btime,Buser);
        insertCH.enqueue(new Callback<ControlHoraResponse>() {
            @Override
            public void onResponse(@NonNull Call<ControlHoraResponse> call, @NonNull Response<ControlHoraResponse> response) {
                if (response.isSuccessful()) {
                    ControlHoraResponse mensaje = response.body();
                    assert mensaje != null;
                    Toast.makeText(ControlHora.this, mensaje.getMensaje()+" "+response.code(), Toast.LENGTH_SHORT).show();
                    getTiempos();
                } else {
                    ControlHoraResponse mensaje = response.body();
                    assert mensaje != null;
                    Toast.makeText(ControlHora.this, ""+mensaje.getMensaje()+" "+response.code(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(@NonNull Call<ControlHoraResponse> call, @NonNull Throwable t) {
                Toast.makeText(ControlHora.this, "Error Code: " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onQueryTextSubmit(String s) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String s) {
        controlHoraAdapter.filtrar(s);
        return false;
    }
}