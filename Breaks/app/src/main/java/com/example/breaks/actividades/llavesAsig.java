package com.example.breaks.actividades;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.os.Bundle;
import android.widget.SearchView;

import com.example.breaks.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class llavesAsig extends AppCompatActivity {

    RecyclerView KeyList;
    SearchView buscarKey;
    SwipeRefreshLayout refreshKey;
    FloatingActionButton addKey;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_llaves_asig);

        KeyList = findViewById(R.id.KeysList);
        buscarKey = findViewById(R.id.buscarKey);
        refreshKey = findViewById(R.id.refreshKey);
        addKey = findViewById(R.id.addKey);
    }
}