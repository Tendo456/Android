package com.example.breaks.actividades;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.breaks.Adaptador.StockAdapter;
import com.example.breaks.Modelos.StockResponse;
import com.example.breaks.R;
import com.example.breaks.RetrofitData.ApiClient;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Stock extends AppCompatActivity implements StockAdapter.ClickedItemS {

    TextView fechaSTK;
    String fSTK,fSTK2;
    Button buscarSTK;
    RecyclerView listaSTK;
    StockAdapter stockAdapter;
    FloatingActionButton addstock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stock);

        fechaSTK = findViewById(R.id.fechaSTK);
        buscarSTK = findViewById(R.id.buscarSTK);
        listaSTK = findViewById(R.id.listaSTK);
        addstock = findViewById(R.id.addstock);

        listaSTK.setLayoutManager(new LinearLayoutManager(this));
        listaSTK.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
        stockAdapter = new StockAdapter(this::ClickedStock);

        addstock.setOnClickListener(view -> StockAdd());

        fechaHoy();

        buscarSTK.setOnClickListener(view -> getStock());
    }

    public void fechaHoy (){
        final Calendar calendar = Calendar.getInstance();
        @SuppressLint("SimpleDateFormat") Format formatter = new SimpleDateFormat("yyyy-MM-dd");
        fSTK = formatter.format(calendar.getTime());
        fechaSTK.setText(fSTK);

    }

    public void SelectFecha (View view){
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
            String s = formatter.format(chosenDate);
            fechaSTK.setText(s);

        },an,mes,dia);
        datePickerDialog.show();
    }

    public void getStock () {

        fSTK2 = fechaSTK.getText().toString();

        Call<List<StockResponse>> stockList = ApiClient.getUserService().getStock(fSTK2);
        stockList.enqueue(new Callback<List<StockResponse>>() {
            @Override
            public void onResponse(Call<List<StockResponse>> call, Response<List<StockResponse>> response) {
                if(response.isSuccessful()){
                    List<StockResponse> stockResponses = response.body();
                    stockAdapter.setData(stockResponses);
                    listaSTK.setAdapter(stockAdapter);
                }
            }

            @Override
            public void onFailure(Call<List<StockResponse>> call, Throwable t) {
                Toast.makeText(Stock.this, "Error " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public void ClickedStock(StockResponse stockResponse) {
        startActivity(new Intent(this,StockDetails.class).putExtra("datoStock",stockResponse));
        finish();
    }

    public void StockAdd(){
        Intent intent = new Intent(Stock.this, Stock_add.class);
        //intent.putExtra("DisplayUser",nombre.getText().toString());
        //intent.putExtra("EmailUser",email.getText().toString());
        startActivity(intent);
    }
}