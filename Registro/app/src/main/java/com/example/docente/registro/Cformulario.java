package com.example.docente.registro;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.os.Bundle;


public class Cformulario extends AppCompatActivity {

    EditText et_codigo, et_apellidos, et_nombres, et_email, et_semestre, et_turno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formulario);

        et_codigo=(EditText)findViewById(R.id.et_codigo);
        et_apellidos=(EditText)findViewById(R.id.et_apellidos);
        et_nombres=(EditText)findViewById(R.id.et_nombres);
        et_email=(EditText)findViewById(R.id.et_email);
        et_semestre=(EditText)findViewById(R.id.et_semestre);
        et_turno=(EditText)findViewById(R.id.et_turno);
    }
    public void guardar (View view) {
        SQLite admin = new SQLite(this, "administracion", null, 1);
        SQLiteDatabase bd = admin.getWritableDatabase();
        String codigo = et_codigo.getText().toString();
        String apellidos = et_apellidos.getText().toString();
        String nombres = et_nombres.getText().toString();
        String email = et_email.getText().toString();
        String semestre = et_semestre.getText().toString();
        String turno = et_turno.getText().toString();
        ContentValues registro = new ContentValues();
        registro.put("codigo", codigo);
        registro.put("apellidos", apellidos);
        registro.put("nombres", nombres);
        registro.put("email", email);
        registro.put("semestre", semestre);
        registro.put("turno", turno);
        bd.insert("estudiantes", null, registro);
        bd.close();
        et_codigo.setText("");
        et_apellidos.setText("");
        et_nombres.setText("");
        et_email.setText("");
        et_semestre.setText("");
        et_turno.setText("");
        Toast.makeText(this, "ESTUDIANTE REGISTRADO", Toast.LENGTH_SHORT).show();

    }

    public void buscar (View view) {
        SQLite admin = new SQLite(this,"administracion", null, 1);
        SQLiteDatabase bd = admin.getWritableDatabase();
        String codigo = et_codigo.getText().toString();
        Cursor fila = bd.rawQuery("select apellidos, nombres, email, semestre, turno from estudiantes where codigo="+codigo, null);
        if (fila.moveToFirst()) {
            et_apellidos.setText(fila.getString(0));
            et_nombres.setText(fila.getString(1));
            et_email.setText(fila.getString(2));
            et_semestre.setText(fila.getString(3));
            et_turno.setText(fila.getString(4));
        }
        else {
            Toast.makeText(this, "ESTUDIANTE NO ENCONTRADO", Toast.LENGTH_SHORT).show();
            bd.close();
        }
    }

    public void eliminar (View view) {
        SQLite admin = new SQLite(this,"administracion", null, 1);
        SQLiteDatabase bd = admin.getWritableDatabase();
        String codigo = et_codigo.getText().toString();
        int cant = bd.delete("estudiantes", "codigo=" + codigo, null);
        bd.close();
        et_codigo.setText("");
        et_apellidos.setText("");
        et_nombres.setText("");
        et_email.setText("");
        et_semestre.setText("");
        et_turno.setText("");
        if (cant == 1) {
            Toast.makeText(this, "ESTUDIANTE ELIMINADO", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this,"ESTUDIANTE NO ENCONTRADO", Toast.LENGTH_SHORT).show();
        }
    }

    public void editar (View view) {
        SQLite admin = new SQLite(this,"administracion", null, 1);
        SQLiteDatabase bd = admin.getWritableDatabase();
        String codigo = et_codigo.getText().toString();
        String apellidos = et_apellidos.getText().toString();
        String nombres = et_nombres.getText().toString();
        String email = et_email.getText().toString();
        String semestre = et_semestre.getText().toString();
        String turno = et_turno.getText().toString();
        ContentValues registro = new ContentValues();
        registro.put("apellidos", apellidos);
        registro.put("nombres", nombres);
        registro.put("email", email);
        registro.put("semestre", semestre);
        registro.put("turno", turno);
        int cant = bd.update("estudiantes", registro, "codigo=" + codigo, null);
        bd.close();
        et_codigo.setText("");
        et_apellidos.setText("");
        et_nombres.setText("");
        et_email.setText("");
        et_semestre.setText("");
        et_turno.setText("");
        if (cant == 1) {
            Toast.makeText(this, "SE MODIFICÓ LA INFORMACIÓN", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "ESTUDIANTE NO ENCONTRADO", Toast.LENGTH_SHORT).show();
        }
    }

    public void mostrar (View view){
            Intent most = new Intent(Cformulario.this,Registro.class);
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

