package com.example.breaks.actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.breaks.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Marcas extends AppCompatActivity {

    FloatingActionButton addmarca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marcas);

        addmarca = findViewById(R.id.addmarca);

        addmarca.setOnClickListener(v -> addmarcasig());

    }

    public void addmarcasig (){
        Intent intent = new Intent(Marcas.this, Marcas_add.class);
        //intent.putExtra("DisplayUser",nombre.getText().toString());
        //intent.putExtra("EmailUser",email.getText().toString());
        startActivity(intent);

    }
}