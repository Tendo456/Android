package com.example.screeningapp.actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;

import com.example.screeningapp.R;
import com.google.android.material.textfield.TextInputEditText;

public class AddAsig extends AppCompatActivity {

    RadioButton Asig, Prest;
    RadioButton AsigActi, AsigInact;
    TextInputEditText AsigDoc, AsigNom, AsigKey, AsigObs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_asig);
    }
}