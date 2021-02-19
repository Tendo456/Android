package com.example.temperaturas.Actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.temperaturas.R;

public class Seleccion extends AppCompatActivity {

    TextView isos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccion);

    }

    public void isos(View view){
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
    }

    public void terceros(View view){
        startActivity(new Intent(getApplicationContext(),Terceros.class));
    }
}