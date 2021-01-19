package com.example.prueba_recicle.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.prueba_recicle.R;

public class IngresarDatos extends AppCompatActivity {

    private EditText PostNombre, PostPoster;
    private Button Enviar;

    public static final String ROOT_URL = "http://10.50.1.180/Api%20prueba/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingresar_datos);

        PostNombre = findViewById(R.id.PostNombre);
        PostPoster = findViewById(R.id.PostPoster);
        Enviar = findViewById(R.id.Enviar);

        //Enviar.setOnClickListener(this);



    }


    private void postItemsDB(){
    }
}