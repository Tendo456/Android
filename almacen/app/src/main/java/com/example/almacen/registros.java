package com.example.almacen;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.database.Cursor;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;

public class registros extends AppCompatActivity {
    EditText et_buscar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registros);
        cargar();

    }

    public void cargar(){
        SQLite admin = new SQLite(this,"administracion", null, 1);
        SQLiteDatabase bd = admin.getWritableDatabase();
        if (bd!=null) {
            Cursor c=bd.rawQuery("select * from almacen order by producto",null);
            int cantidad = c.getCount();
            int i=0;
            String[] arreglo = new String[cantidad];
            if (c.moveToFirst()){
                do{
                    String linea ="Código: "+ c.getString(0)+"\nProducto: "+c.getString(1)+"\nDescripcíon: "+c.getString(2)+"\nPrecio: "+c.getString(3);
                    arreglo[i] = linea;
                    i++;
                }while (c.moveToNext());
            }
            ArrayAdapter<String>adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arreglo);
            ListView lista = (ListView)findViewById(R.id.lv_lista);
            lista.setAdapter(adapter);
        }
    }

    public void busqueda(View view){
        SQLite admin = new SQLite(this,"administracion", null, 1);
        SQLiteDatabase bd = admin.getWritableDatabase();

        if (bd!=null) {
            String search = et_buscar.getText().toString();
            Cursor c=bd.rawQuery("select * from almacen where producto ='"+search+"' ",null);
            int cantidad = c.getCount();
            int i=0;
            String[] arreglo = new String[cantidad];
            if (c.moveToFirst()){
                do{
                    String linea ="Código: "+ c.getString(0)+"\nProducto: "+c.getString(1)+"\nDescripcíon: "+c.getString(2)+"\nPrecio: "+c.getString(3);
                    arreglo[i] = linea;
                    i++;
                }while (c.moveToNext());
            }
            ArrayAdapter<String>adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arreglo);
            ListView lista = (ListView)findViewById(R.id.lv_lista);
            lista.setAdapter(adapter);
        }
    }

}
