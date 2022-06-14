package com.example.ingreso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.textclassifier.TextLinks;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import java.util.HashMap;
import java.util.Map;
import static android.provider.ContactsContract.CommonDataKinds.Website.URL;

public class login extends AppCompatActivity {

    EditText edtUsuario, edtPassword;
    Button btnLogin;
    TextView txtTipo;
    String txtvariable;
    RadioButton RbtnRuta,RbtnClinica,RbtnMaster;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtUsuario=findViewById(R.id.edtUsuario);
        edtPassword=findViewById(R.id.edtPassword);
        btnLogin=findViewById(R.id.btnLogin);
        txtTipo=findViewById(R.id.txtView);
        txtvariable=txtTipo.getText().toString();
        RbtnRuta=(RadioButton)findViewById(R.id.RbtnRuta);
        RbtnClinica=(RadioButton)findViewById(R.id.RbtnClinica);
        RbtnMaster=(RadioButton)findViewById(R.id.RbtnMaster);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validarUsuario("http://acceso-tendo.000webhostapp.com/acceso/validar_usuario.php");


            }

        });
    }


    public void ventana (View view){
        if(RbtnRuta.isChecked()){
            txtTipo.setText("ruta");
            txtvariable=txtTipo.getText().toString();


        }
        else if(RbtnClinica.isChecked()){
            txtTipo.setText("clinica");
            txtvariable=txtTipo.getText().toString();


        }
        else if(RbtnMaster.isChecked()){
            txtTipo.setText("administrador");
            txtvariable=txtTipo.getText().toString();

            }

        else{
            Toast.makeText(login.this, "Error1234", Toast.LENGTH_LONG).show();
        }
    }


    private void validarUsuario(String URL){

        StringRequest stringRequest = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                if (!response.isEmpty() && txtvariable.equals("ruta")){
                    Intent intento = new Intent(getApplicationContext(),seleccion.class);
                    startActivity(intento);
                    limpia();

                }else if(!response.isEmpty() && txtvariable.equals("clinica")){
                    Intent intento = new Intent(getApplicationContext(),seleccion.class);
                    startActivity(intento);
                    limpia();
                }
                else if(!response.isEmpty() && txtvariable.equals("administrador")){
                    Intent intento = new Intent(getApplicationContext(),seleccion.class);
                    startActivity(intento);
                    limpia();

                }
                else {
                    Toast.makeText(login.this, "Usuario o Contraseña Invalidos", Toast.LENGTH_LONG).show();
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(login.this, "Error de Conexión", Toast.LENGTH_LONG).show();
            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> parametros = new HashMap<String, String>();
                parametros.put("usuario", edtUsuario.getText().toString());
                parametros.put("contraseña", edtPassword.getText().toString());
                parametros.put("tipo_usuario", txtTipo.getText().toString());
                return parametros;
            }
        };

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);



    }

    public void limpia(){
        edtUsuario.setText("");
        edtPassword.setText("");
    }



}