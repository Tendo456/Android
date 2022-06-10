package com.example.screeningapp.actividades;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.SearchView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.example.screeningapp.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class llavesAsig extends AppCompatActivity {

    RecyclerView KeyList;
    SearchView buscarKey;
    SwipeRefreshLayout refreshKey;
    FloatingActionButton addKey;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_llaves_asig);

        KeyList = findViewById(R.id.KeysList);
        buscarKey = findViewById(R.id.buscarKey);
        refreshKey = findViewById(R.id.refreshKey);
        addKey = findViewById(R.id.addKey);

        addKey.setOnClickListener(view -> addAsig());
    }

    public void addAsig (){
        Intent intent = new Intent(llavesAsig.this, AddAsig.class);
        //intent.putExtra("DisplayUser",nombre.getText().toString());
        //intent.putExtra("EmailUser",emailuserME);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_item, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.title_llave) {
            startActivity(new Intent(getApplicationContext(), llaves.class));
            //Toast.makeText(MainActivity.this,"No Tiene Permisos de Administrador",Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}