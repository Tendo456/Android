package com.example.hoja.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.hoja.R;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    String dato1,dato2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Objects.requireNonNull(getSupportActionBar()).setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.logo);

        dato1 = getIntent().getStringExtra("DisplayUser");
        dato2 = getIntent().getStringExtra("EmailUser");

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

        Intent intent = new Intent(MainActivity.this, hoja_evaluacion.class);
        intent.putExtra("DisplayUser1",dato1);
        intent.putExtra("EmailUser1",dato2);
        startActivity(intent);

    }
}