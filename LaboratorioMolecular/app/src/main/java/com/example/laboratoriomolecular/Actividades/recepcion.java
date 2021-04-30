package com.example.laboratoriomolecular.Actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.laboratoriomolecular.Add_recepcion;
import com.example.laboratoriomolecular.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class recepcion extends AppCompatActivity {

    FloatingActionButton addRecepcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recepcion);

        addRecepcion = findViewById(R.id.addRecepcion);

        addRecepcion.setOnClickListener(v -> AddRecepcion());
    }

    public void AddRecepcion (){

        startActivity(new Intent(getApplicationContext(), Add_recepcion.class));
    }
}