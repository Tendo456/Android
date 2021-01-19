package com.example.almacen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.View;
import android.widget.Toast;

public class Cformulario extends AppCompatActivity {
    EditText et_producto, et_descripcion, et_precio, et_codigo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formulario);

        et_codigo=(EditText)findViewById(R.id.et_codigo);
        et_producto=(EditText)findViewById(R.id.et_producto);
        et_descripcion=(EditText)findViewById(R.id.et_descripcion);
        et_precio=(EditText)findViewById(R.id.et_precio);

    }

    public void guardar (View view) {
        SQLite admin = new SQLite(this, "administracion", null, 1);
        SQLiteDatabase bd = admin.getWritableDatabase();
        String codigo = et_codigo.getText().toString();
        String producto = et_producto.getText().toString();
        String descripcion = et_descripcion.getText().toString();
        String precio = et_precio.getText().toString();
        ContentValues almacen = new ContentValues();
        almacen.put("codigo", codigo);
        almacen.put("producto", producto);
        almacen.put("descripcion", descripcion);
        almacen.put("precio", precio);
        bd.insert("almacen", null, almacen);
        bd.close();
        et_codigo.setText("");
        et_producto.setText("");
        et_descripcion.setText("");
        et_precio.setText("");
        Toast.makeText(this, "PRODUCTO REGISTRADO", Toast.LENGTH_SHORT).show();
    }

    public void buscar (View view) {
        SQLite admin = new SQLite(this,"administracion", null, 1);
        SQLiteDatabase bd = admin.getWritableDatabase();
        String codigo = et_codigo.getText().toString();
        Cursor fila = bd.rawQuery("select producto, descripcion, precio from almacen where codigo="+codigo, null);
        if (fila.moveToFirst()) {
            et_producto.setText(fila.getString(0));
            et_descripcion.setText(fila.getString(1));
            et_precio.setText(fila.getString(2));
        }
        else {
            Toast.makeText(this, "PRODUCTO NO ENCONTRADO", Toast.LENGTH_SHORT).show();
            bd.close();
        }
    }

    public void eliminar (View view) {
        SQLite admin = new SQLite(this,"administracion", null, 1);
        SQLiteDatabase bd = admin.getWritableDatabase();
        String codigo = et_codigo.getText().toString();
        int cant = bd.delete("almacen", "codigo=" + codigo, null);
        bd.close();
        et_codigo.setText("");
        et_producto.setText("");
        et_descripcion.setText("");
        et_precio.setText("");

        if (cant == 1) {
            Toast.makeText(this, "PRODUCTO ELIMINADO", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this,"PRODUCTO NO ENCONTRADO", Toast.LENGTH_SHORT).show();
        }
    }

    public void editar (View view) {
        SQLite admin = new SQLite(this,"administracion", null, 1);
        SQLiteDatabase bd = admin.getWritableDatabase();
        String codigo = et_codigo.getText().toString();
        String producto = et_producto.getText().toString();
        String descripcion = et_descripcion.getText().toString();
        String precio = et_precio.getText().toString();
        ContentValues almacen = new ContentValues();
        almacen.put("producto", producto);
        almacen.put("descripcion", descripcion);
        almacen.put("precio", precio);
        int cant = bd.update("almacen", almacen, "codigo=" + codigo, null);
        bd.close();
        et_codigo.setText("");
        et_producto.setText("");
        et_descripcion.setText("");
        et_precio.setText("");
        if (cant == 1) {
            Toast.makeText(this, "SE MODIFICÓ LA INFORMACIÓN", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "PRODUCTO NO ENCONTRADO", Toast.LENGTH_SHORT).show();
        }
    }

    public void mostrar (View view){
        Intent most = new Intent(Cformulario.this,registros.class);
        startActivity(most);

    }

    public void salir (View view) {
        finish();
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

}

