package com.example.laboratoriomolecular.Actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.laboratoriomolecular.R;

public class Formularios extends AppCompatActivity {

    Button FRecepcion,FAlicuotado,FExtraccion,FArea,FAmplificacion,FResultados,FPlaca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formularios);

        FRecepcion = findViewById(R.id.FRecepcion);
        FAlicuotado = findViewById(R.id.FAlicuotado);
        FExtraccion = findViewById(R.id.FExtraccion);
        FArea = findViewById(R.id.FArea);
        FAmplificacion = findViewById(R.id.FAmplificacion);
        FResultados = findViewById(R.id.FResultados);
        FPlaca = findViewById(R.id.FPlaca);

        FRecepcion.setOnClickListener(v -> startActivity(new Intent(getApplicationContext(), recepcion.class)));
        FAlicuotado.setOnClickListener(v -> startActivity(new Intent(getApplicationContext(), alicuotado.class)));
        FExtraccion.setOnClickListener(v -> startActivity(new Intent(getApplicationContext(), extraccion.class)));
        FArea.setOnClickListener(v -> startActivity(new Intent(getApplicationContext(), area_limpia.class)));
        FAmplificacion.setOnClickListener(v -> startActivity(new Intent(getApplicationContext(), amplificacion.class)));
        FResultados.setOnClickListener(v -> startActivity(new Intent(getApplicationContext(), resultados.class)));
        FPlaca.setOnClickListener(v -> startActivity(new Intent(getApplicationContext(), nueva_placa.class)));

    }

}