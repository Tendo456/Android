package com.example.inventarioqr.Actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.inventarioqr.R;

public class Menu extends AppCompatActivity {

    ImageView scanqr, registrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        scanqr = findViewById(R.id.scanqr);
        registrar = findViewById(R.id.registrar);

        scanqr.setOnClickListener(v -> scan());
        registrar.setOnClickListener(v -> registro());
    }

    public void scan(){
        Intent intent = new Intent(Menu.this, Lector.class);
        //intent.putExtra("DisplayUser",nombre.getText().toString());
        //intent.putExtra("EmailUser",emailuserME);
        startActivity(intent);
    }

    public void registro(){
        Intent intent = new Intent(Menu.this, Registro.class);
        //intent.putExtra("DisplayUser",nombre.getText().toString());
        //intent.putExtra("EmailUser",emailuserME);
        startActivity(intent);
    }
}