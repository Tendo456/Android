package com.example.breaks.actividades;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.example.breaks.Adaptador.PersonalAdapter;
import com.example.breaks.Modelos.PersonalResponse;
import com.example.breaks.R;
import com.example.breaks.RetrofitData.ApiClient;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import android.content.Intent;
import android.os.Bundle;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Personal extends AppCompatActivity implements PersonalAdapter.ClickedItemPE, SearchView.OnQueryTextListener{

    SearchView BuscarPer;
    RecyclerView PersonalList;
    FloatingActionButton addPersonal;
    PersonalAdapter personalAdapter;
    String est = "1";
    SwipeRefreshLayout refreshPS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal);

        BuscarPer = findViewById(R.id.BuscarPer);
        PersonalList = findViewById(R.id.PersonalList);
        addPersonal = findViewById(R.id.addPersonal);
        refreshPS = findViewById(R.id.refreshPS);


        PersonalList.setLayoutManager(new LinearLayoutManager(this));
        PersonalList.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        personalAdapter = new PersonalAdapter(this);

        getPersonal();
        addPersonal.setOnClickListener(view -> addPErs());

        BuscarPer.setOnQueryTextListener(this);

        refreshPS.setOnRefreshListener(()->{
            getPersonal();
            refreshPS.setRefreshing(false);
        });

    }

    public void getPersonal(){
        Call<List<PersonalResponse>> getPE = ApiClient.getUserService().getPersonal(est);
        getPE.enqueue(new Callback<List<PersonalResponse>>() {
            @Override
            public void onResponse(@NonNull Call<List<PersonalResponse>> call, @NonNull Response<List<PersonalResponse>> response) {
                if (response.isSuccessful()) {
                        List<PersonalResponse> personalResponses = response.body();
                        personalAdapter.setData(personalResponses);
                        PersonalList.setAdapter(personalAdapter);
                    }else {
                    Toast.makeText(Personal.this, "Error ", Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onFailure(@NonNull Call<List<PersonalResponse>> call, @NonNull Throwable t) {
                Toast.makeText(Personal.this, "Error " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void ClickedPer(PersonalResponse personalResponse) {
        startActivity(new Intent(this,PersonalDetails.class).putExtra("datoPers",personalResponse));
        //finish();
    }

    public void addPErs(){
        Intent intent = new Intent(Personal.this, Personal_add.class);
        //intent.putExtra("DisplayUser",nombre.getText().toString());
        //intent.putExtra("EmailUser",email.getText().toString());
        startActivity(intent);
    }

    @Override
    public boolean onQueryTextSubmit(String s) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String s) {
        personalAdapter.filter(s);
        return false;
    }
}