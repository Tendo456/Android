package com.example.hoja;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void conductor(View view){

        startActivity(new Intent(getApplicationContext(),conductor.class));

    }

    public void vehiculo(View view){

        startActivity(new Intent(getApplicationContext(),vehiculo.class));

    }

    public void ruta(View view){

        startActivity(new Intent(getApplicationContext(),ruta.class));

    }

    public void hoja(View view){

        startActivity(new Intent(getApplicationContext(),hoja_evaluacion.class));

    }
}