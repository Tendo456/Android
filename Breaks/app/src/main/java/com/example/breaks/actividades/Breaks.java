package com.example.breaks.actividades;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.breaks.Adaptador.BreaksAdapter;
import com.example.breaks.Modelos.BreaksResponse;
import com.example.breaks.R;
import com.example.breaks.RetrofitData.ApiClient;
import com.google.android.gms.common.api.Api;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
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

    TextView BTiempo,BProg;
    String Bdate, Btime;
    RecyclerView BreaksList;
    BreaksAdapter breaksAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breaks);

        BTiempo = findViewById(R.id.BTiempo);
        BProg = findViewById(R.id.BProg);
        BreaksList = findViewById(R.id.BreaksList);


        BreaksList.setLayoutManager(new LinearLayoutManager(this));
        BreaksList.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
        breaksAdapter = new BreaksAdapter();


        Bfecha();
        Bhora();
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

    public void dialogoAl (){

        AlertDialog.Builder builder = new AlertDialog.Builder(Breaks.this);
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.dialogo_break,null);
        builder.setView(view);

        final AlertDialog dialog = builder.create();
        dialog.show();

        Button diAl_ok = view.findViewById(R.id.dialog);
        diAl_ok.setOnClickListener(v -> dialog.dismiss());
    }
}