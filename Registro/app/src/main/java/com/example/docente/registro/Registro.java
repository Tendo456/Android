package com.example.docente.registro;

import android.support.v7.app.AppCompatActivity;
import android.database.Cursor;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.support.annotation.Nullable;

public class Registro extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro);
        cargar();

    }
    public void cargar(){
        SQLite admin = new SQLite(this,"administracion", null, 1);
        SQLiteDatabase bd = admin.getWritableDatabase();
        if (bd!=null) {
            Cursor c=bd.rawQuery("select * from estudiantes order by apellidos",null);
            int cantidad = c.getCount();
            int i=0;
            String[] arreglo = new String[cantidad];
            if (c.moveToFirst()){
                do{
                    String linea ="Código: "+ c.getString(0)+"\nApellidos: "+c.getString(1)+"\nNombres: "+c.getString(2)+"\nE-mail: "+c.getString(3)+"\nSemestre: "+c.getString(4)+"\nTurno: "+c.getString(5);
                    arreglo[i] = linea;
                    i++;
                }while (c.moveToNext());
            }
            ArrayAdapter<String>adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arreglo);
            ListView lista = (ListView)findViewById(R.id.lv_lista);
            lista.setAdapter(adapter);
        }
    }
    public void regresar (View view) {
        finish();
    }
}
