package com.example.laboratoriomolecular.Actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import com.example.laboratoriomolecular.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class recepcion extends AppCompatActivity {

    EditText Rhora;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recepcion);

        Rhora = findViewById(R.id.Rhora);

fecha();
    }

    public void fecha (){
        final Calendar calendar = Calendar.getInstance();
        @SuppressLint("SimpleDateFormat") Format formatter = new SimpleDateFormat("yyyy-MM-dd");
        String s = formatter.format(calendar.getTime());

        Date date = new Date();
        //@SuppressLint("SimpleDateFormat") Format h = new SimpleDateFormat("hh:mm:ss");
        @SuppressLint("SimpleDateFormat") Format h = new SimpleDateFormat("HH:mm:ss");
        String ho = h.format(date);

        Rhora.setText(s+" "+ho);
    }


}