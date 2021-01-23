package com.example.temperaturas.Actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.temperaturas.R;

public class listar extends AppCompatActivity {

    private TextView RUserName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar);

        RUserName = findViewById(R.id.RUserName);



        String RUN = getIntent().getStringExtra("username");
        RUserName.setText(RUN);
    }
}