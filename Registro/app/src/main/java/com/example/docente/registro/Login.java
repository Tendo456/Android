package com.example.docente.registro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button ingresar = (Button)findViewById(R.id.btn_ingresar);
        ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = ((EditText)findViewById(R.id.et_usuario)).getText().toString();
                String cont = ((EditText)findViewById(R.id.et_pass)).getText().toString();
                if (usuario.equals("admin")&& cont.equals("admin20"))
                {
                    Intent form = new Intent(Login.this,Cformulario.class);
                    startActivity(form);

                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Usuario Incorrecto", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
