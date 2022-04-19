package com.example.breaks.actividades;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.RadioButton;

import com.example.breaks.R;
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