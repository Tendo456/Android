package com.example.breaks.actividades;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

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

public class Personal extends AppCompatActivity implements PersonalAdapter.ClickedItemPE{

    SearchView BuscarPer;
    RecyclerView PersonalList;
    FloatingActionButton addPersonal;
    PersonalAdapter personalAdapter;
    String est = "1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal);

        BuscarPer = findViewById(R.id.BuscarPer);
        PersonalList = findViewById(R.id.PersonalList);
        addPersonal = findViewById(R.id.addPersonal);


        PersonalList.setLayoutManager(new LinearLayoutManager(this));
        PersonalList.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        personalAdapter = new PersonalAdapter(this);

        getPersonal();

    }

    public void getPersonal(){
        Call<List<PersonalResponse>> getPE = ApiClient.getUserService().getPersonal(est);
        getPE.enqueue(new Callback<List<PersonalResponse>>() {
            @Override
            public void onResponse(Call<List<PersonalResponse>> call, Response<List<PersonalResponse>> response) {
                if (response.isSuccessful()) {
                        List<PersonalResponse> personalResponses = response.body();
                        personalAdapter.setData(personalResponses);
                        PersonalList.setAdapter(personalAdapter);
                    }else {
                    Toast.makeText(Personal.this, "Error ", Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onFailure(Call<List<PersonalResponse>> call, Throwable t) {
                Toast.makeText(Personal.this, "Error " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void ClickedPer(PersonalResponse personalResponse) {
        startActivity(new Intent(this,PersonalDetails.class).putExtra("datoPers",personalResponse));
        finish();
    }
}