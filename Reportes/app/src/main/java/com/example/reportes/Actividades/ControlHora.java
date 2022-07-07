package com.example.reportes.Actividades;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.TextView;

import com.example.reportes.Adaptadores.ControlHoraAdapter;
import com.example.reportes.Modelos.ControlHoraResponse;
import com.example.reportes.R;
import com.example.reportes.RetrofitData.ApiClient;

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
    String Bdate, Btime, Buser;
    TextView tiempoCH;
    RecyclerView HoraList;
    ControlHoraAdapter controlHoraAdapter;
    SearchView buscarCH;
    Animation transpCH;
    ImageView fondoCH;

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

        Bfecha();
        Bhora();

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
        //time.setText(ho);
        segundos();

        tiempoCH.setText(Bdate+" "+Btime);
    }

    public void segundos(){
        new Handler(Looper.getMainLooper()).postDelayed(this::Bhora,60000);
    }

    public void getTiempos(){
        Call<List<ControlHoraResponse>> getCH = ApiClient.getUserService().getTime(Bdate);
        getCH.enqueue(new Callback<List<ControlHoraResponse>>() {
            @Override
            public void onResponse(Call<List<ControlHoraResponse>> call, Response<List<ControlHoraResponse>> response) {
                if(response.isSuccessful()){
                    List<ControlHoraResponse> controlHoraResponses = response.body();
                    controlHoraAdapter.setData(controlHoraResponses);
                    HoraList.setAdapter(controlHoraAdapter);
                }
            }

            @Override
            public void onFailure(Call<List<ControlHoraResponse>> call, Throwable t) {

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