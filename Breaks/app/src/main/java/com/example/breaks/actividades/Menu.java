package com.example.breaks.actividades;

import androidx.appcompat.app.AppCompatActivity;

import com.example.breaks.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    String emailuserME;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        emailuserME = getIntent().getStringExtra("EmailUser");
    }

    public void menu1 (View view){
        Intent intent = new Intent(Menu.this, Marcas.class);
        //intent.putExtra("DisplayUser",nombre.getText().toString());
        intent.putExtra("EmailUser",emailuserME);
        startActivity(intent);
    }

    public void menu2 (View view){
        Intent intent = new Intent(Menu.this, Stock.class);
        //intent.putExtra("DisplayUser",nombre.getText().toString());
        intent.putExtra("EmailUser",emailuserME);
        startActivity(intent);
    }

    public void menu3 (View view){
        Intent intent = new Intent(Menu.this, Programacion.class);
        //intent.putExtra("DisplayUser",nombre.getText().toString());
        intent.putExtra("EmailUser",emailuserME);
        startActivity(intent);
    }

    public void menu4 (View view){
        Intent intent = new Intent(Menu.this, Personal.class);
        //intent.putExtra("DisplayUser",nombre.getText().toString());
        intent.putExtra("EmailUser",emailuserME);
        startActivity(intent);
    }
}