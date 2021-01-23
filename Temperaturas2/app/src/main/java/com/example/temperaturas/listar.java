package com.example.temperaturas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

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