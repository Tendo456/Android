package com.example.ingreso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Detalles extends AppCompatActivity {

    TextView txtNombres, txtDni, txtEdad, txtSexo, txtId_Personal,txtIdruta;
    int position;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles);

        txtId_Personal = findViewById(R.id.txt_Id_PersonalE);
        txtNombres = findViewById(R.id.txt_NombresE);
        txtDni = findViewById(R.id.txt_DniE);
        txtEdad = findViewById(R.id.txt_EdadE);
        txtSexo = findViewById(R.id.txt_SexoE);
        txtIdruta = findViewById(R.id.txt_IdrutaE);


        Intent intent = getIntent();
        position = intent.getExtras().getInt("position");
        txtId_Personal.setText(Home.users.get(position).getId_Personal());
        txtNombres.setText(Home.users.get(position).getNombres());
        txtDni.setText(Home.users.get(position).getDni());
        txtEdad.setText(Home.users.get(position).getEdad());
        txtSexo.setText(Home.users.get(position).getSexo());
        txtIdruta.setText(Home.users.get(position).getIdruta());

    }


}