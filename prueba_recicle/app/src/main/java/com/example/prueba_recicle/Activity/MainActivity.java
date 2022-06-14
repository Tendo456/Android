package com.example.prueba_recicle.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.prueba_recicle.R;
import com.example.prueba_recicle.adaptador.RecyclerAdapter;
import com.example.prueba_recicle.model.ItemList;
import com.example.prueba_recicle.retrofit_data.RetrofitApiService;
import com.example.prueba_recicle.retrofit_data.RetrofitClient;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements RecyclerAdapter.RecyclerItemClick, SearchView.OnQueryTextListener{

    private RecyclerView rvLista;
    private SearchView svSearch;
    private RecyclerAdapter adapter;
    private List<ItemList> items;

    private RetrofitApiService retrofitApiService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        initValues();
        initListener();

    }

    private void initViews(){
        rvLista = findViewById(R.id.rvLista);
        svSearch = findViewById(R.id.svSearch);

    }

    private void initValues() {
        retrofitApiService = RetrofitClient.getApiService();

        LinearLayoutManager manager = new LinearLayoutManager(this);
        rvLista.setLayoutManager(manager);

        getItemsSQL();
    }

    private void initListener() {
        svSearch.setOnQueryTextListener(this);
    }


    private void getItemsSQL() {
        retrofitApiService.getItemsDB().enqueue(new Callback<List<ItemList>>() {
            @Override
            public void onResponse(Call<List<ItemList>> call, Response<List<ItemList>> response) {
                if (response.isSuccessful()){

                    items = response.body();
                    adapter = new RecyclerAdapter(items, MainActivity.this);
                    rvLista.setAdapter(adapter);

                }

                else {
                    Toast.makeText(getBaseContext(),"Error en el formato de respuesta",Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onFailure(Call<List<ItemList>> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Error: "+t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
    }
    @Override
    public void itemClick(ItemList item) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("itemDetail", item);
        startActivity(intent);
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        adapter.filter(newText);
        return false;
    }

    public void agregar (View view){
        Intent intentar = new Intent(this, IngresarDatos.class);
        startActivity(intentar);
    }


}