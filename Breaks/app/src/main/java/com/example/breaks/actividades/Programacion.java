package com.example.breaks.actividades;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.example.breaks.Adaptador.ProgramacionAdapter;
import com.example.breaks.Modelos.ProgramacionResponse;
import com.example.breaks.R;
import com.example.breaks.RetrofitData.ApiClient;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Programacion extends AppCompatActivity implements ProgramacionAdapter.ClickedItemP{

    TextView fechaProg, bebidacount, galletaconut;
    Button buscarProg;
    RecyclerView listaProg;
    FloatingActionButton addProg;
    ProgramacionAdapter programacionAdapter;
    String fecha_prog;
    Animation transparencia;
    ImageView fondoPG;
    String fech;
    SwipeRefreshLayout refreshPRO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_programacion);

        transparencia = AnimationUtils.loadAnimation(this, R.anim.transparencia);
        fechaProg = findViewById(R.id.fechaProg);
        buscarProg = findViewById(R.id.buscarProg);
        listaProg = findViewById(R.id.listaProg);
        addProg = findViewById(R.id.addProg);
        fondoPG = findViewById(R.id.fondoPG);
        bebidacount = findViewById(R.id.bebidacount);
        galletaconut = findViewById(R.id.galletacount);
        refreshPRO = findViewById(R.id.refreshPRO);

        fondoPG.setAnimation(transparencia);

        listaProg.setLayoutManager(new LinearLayoutManager(this));
        listaProg.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        programacionAdapter = new ProgramacionAdapter(this);

        fechaPG();
        buscarProg.setOnClickListener(view -> getProg());
        addProg.setOnClickListener(view -> ProgAdd());
        getProg();
        getBebida();
        getGalleta();

        refreshPRO.setOnRefreshListener(()->{
            getProg();
            getBebida();
            getGalleta();
            refreshPRO.setRefreshing(false);
        });

    }

    public void fechaPG (){
        final Calendar calendar = Calendar.getInstance();
        @SuppressLint("SimpleDateFormat") Format formatter = new SimpleDateFormat("yyyy-MM-dd");
        String fechaPGR = formatter.format(calendar.getTime());
        fechaProg.setText(fechaPGR);
    }

    public void SelectFechaPG (View view){
        final Calendar c = Calendar.getInstance();

        int dia = c.get(Calendar.DAY_OF_MONTH);
        int mes = c.get(Calendar.MONTH);
        int an = c.get(Calendar.YEAR);

        DatePickerDialog datePickerDialog = new DatePickerDialog(this,R.style.DialogTheme, (view1, year, month, dayOfMonth) -> {

            Calendar cal = Calendar.getInstance();
            cal.setTimeInMillis(0);
            cal.set(year, month, dayOfMonth, 0, 0, 0);
            Date chosenDate = cal.getTime();

            DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            String p = formatter.format(chosenDate);
            fechaProg.setText(p);

        },an,mes,dia);
        datePickerDialog.show();
    }

    public void getProg(){

        fecha_prog = fechaProg.getText().toString();

        if (fechaProg.getText().toString().isEmpty()){
            Toast.makeText(Programacion.this, "Insertar Fecha" , Toast.LENGTH_SHORT).show();
        }else {
            Call<List<ProgramacionResponse>> ProgL = ApiClient.getUserService().getProg(fecha_prog);
            ProgL.enqueue(new Callback<List<ProgramacionResponse>>() {
                @Override
                public void onResponse(Call<List<ProgramacionResponse>> call, Response<List<ProgramacionResponse>> response) {
                    if (response.isSuccessful()) {
                        List<ProgramacionResponse> programacionResponses = response.body();
                        programacionAdapter.setData(programacionResponses);
                        listaProg.setAdapter(programacionAdapter);
                    }

                }

                @Override
                public void onFailure(Call<List<ProgramacionResponse>> call, Throwable t) {
                    Toast.makeText(Programacion.this, "Error " + t.getMessage(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

    public void getBebida(){
        fech = fechaProg.getText().toString();
        Call<List<ProgramacionResponse>> Gbeb = ApiClient.getUserService().getBebida(fech);
        Gbeb.enqueue(new Callback<List<ProgramacionResponse>>() {
            @Override
            public void onResponse(@NonNull Call<List<ProgramacionResponse>> call, @NonNull Response<List<ProgramacionResponse>> response) {
                if(response.isSuccessful()){
                    String beb;
                    String bebi = null;
                    String text1 = "Bebidas: ";
                    List<ProgramacionResponse> programacionResponses = response.body();
                    assert programacionResponses != null;
                    for(ProgramacionResponse programacionResponse: programacionResponses){
                        beb = programacionResponse.getBebidas();
                        bebi = beb;
                    }
                    if (bebi == null){
                        bebidacount.setText("Vacío");
                    }else {
                        bebidacount.setText(text1+bebi);
                    }
                }else {
                    Toast.makeText(Programacion.this, "Sin Programación", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(@NonNull Call<List<ProgramacionResponse>> call, @NonNull Throwable t) {
                Toast.makeText(Programacion.this, "Error Code: " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void getGalleta(){
        fech = fechaProg.getText().toString();
        Call<List<ProgramacionResponse>> Ggall = ApiClient.getUserService().getGalleta(fech);
        Ggall.enqueue(new Callback<List<ProgramacionResponse>>() {
            @Override
            public void onResponse(@NonNull Call<List<ProgramacionResponse>> call, @NonNull Response<List<ProgramacionResponse>> response) {
                if(response.isSuccessful()){
                    String gal;
                    String galle = null;
                    String text2 = "Galletas: ";
                    List<ProgramacionResponse> programacionResponses = response.body();
                    assert programacionResponses != null;
                    for(ProgramacionResponse programacionResponse: programacionResponses){
                        gal = programacionResponse.getGalletas();
                        galle = gal;
                    }
                    if (galle == null){
                        galletaconut.setText("Vacío");
                    }else {
                        galletaconut.setText(text2+galle);
                    }
                }else {
                    Toast.makeText(Programacion.this, "Sin Programación", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(@NonNull Call<List<ProgramacionResponse>> call, @NonNull Throwable t) {
                Toast.makeText(Programacion.this, "Error Code: " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void ClickedProg(ProgramacionResponse programacionResponse) {
        startActivity(new Intent(this,ProgramacionDetails.class).putExtra("datoProg",programacionResponse));
        //finish();
    }

    public void ProgAdd(){
        Intent intent = new Intent(Programacion.this, Programacion_add.class);
        //intent.putExtra("DisplayUser",nombre.getText().toString());
        //intent.putExtra("EmailUser",email.getText().toString());
        startActivity(intent);
    }
}