package com.example.hoja.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import com.example.hoja.R;

import java.util.Objects;

public class seleccion extends AppCompatActivity {

    private Window window;
    String primaryDark = "#3F51B5";
    String primary = "#3F51B5";
    String background = "#303F9F";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccion);

        this.window = getWindow();
        color(primaryDark,primary,background);

        Objects.requireNonNull(getSupportActionBar()).setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.logo);

    }

    public void isos(View view){
        startActivity(new Intent(getApplicationContext(), ISOS.class));
    }

    public void terceros(View view){
        startActivity(new Intent(getApplicationContext(), Terceros.class));
    }

    public void color (String primaryDark, String primary, String background){

        window.setStatusBarColor(Color.parseColor(primaryDark));

        Objects.requireNonNull(getSupportActionBar()).setBackgroundDrawable(new ColorDrawable(Color.parseColor(primary)));

        //window.setBackgroundDrawable(new ColorDrawable(Color.parseColor(background)));

        window.setNavigationBarColor(Color.parseColor(primary));

    }

}