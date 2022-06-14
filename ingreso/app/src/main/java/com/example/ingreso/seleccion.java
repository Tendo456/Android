package com.example.ingreso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class seleccion extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccion);


    }

    public void controlpersonal(View view){

        startActivity(new Intent(getApplicationContext(),Home.class));

    }

    public void controlusuarios(View view){

        startActivity(new Intent(getApplicationContext(),control_usuarios.class));

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

        startActivity(new Intent(getApplicationContext(),hoja_evaluacion.class));

    }

}


