package com.example.laboratoriomolecular.Actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.laboratoriomolecular.R;

public class MainActivity extends AppCompatActivity {

    TextView hola;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hola = findViewById(R.id.hola);

        hola.setOnClickListener(v ->siguiente() );

    }

    public void siguiente (){
        startActivity(new Intent(getApplicationContext(),Formularios.class));
    }

}