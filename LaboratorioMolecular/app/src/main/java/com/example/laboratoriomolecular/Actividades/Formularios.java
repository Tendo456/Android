package com.example.laboratoriomolecular.Actividades;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.laboratoriomolecular.R;

public class Formularios extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formularios);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_titulos, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        switch (item.getItemId()){
            case R.id.title_recepcion:
                startActivity(new Intent(getApplicationContext(),recepcion.class));

                return true;
            case R.id.title_alicuotado:
                startActivity(new Intent(getApplicationContext(),alicuotado.class));

                return true;
            case R.id.title_extraccion:
                startActivity(new Intent(getApplicationContext(),extraccion.class));

                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}