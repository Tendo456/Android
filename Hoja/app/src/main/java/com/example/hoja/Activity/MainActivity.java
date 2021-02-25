package com.example.hoja.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.Window;

import com.example.hoja.R;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    String dato1,dato2;
    private Window window;
    String primaryDark = "#3F51B5";
    String primary = "#3F51B5";
    String background = "#303F9F";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Objects.requireNonNull(getSupportActionBar()).setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.logo);

        this.window = getWindow();
        color(primaryDark,primary,background);

        dato1 = getIntent().getStringExtra("DisplayUser");
        dato2 = getIntent().getStringExtra("EmailUser");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_titulos, menu);


        return true;
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

    public void color (String primaryDark, String primary, String background){

        window.setStatusBarColor(Color.parseColor(primaryDark));

        Objects.requireNonNull(getSupportActionBar()).setBackgroundDrawable(new ColorDrawable(Color.parseColor(primary)));

        //window.setBackgroundDrawable(new ColorDrawable(Color.parseColor(background)));

        window.setNavigationBarColor(Color.parseColor(primary));

    }
}