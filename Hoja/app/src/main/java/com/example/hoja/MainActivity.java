package com.example.hoja;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    String dato1,dato2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String NameUser = getIntent().getStringExtra("DisplayUser");
        dato1 = NameUser;
        String EmailU = getIntent().getStringExtra("EmailUser");
        dato2 = EmailU;

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
}