package com.example.ingreso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class DetalleTemp extends AppCompatActivity {

    TextView temperatura1,temperatura2,fecha,Id_PersonalDT,NombresDT,pro;
    int lugar;


    RequestQueue requestQueue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_temp);

        Id_PersonalDT = findViewById(R.id.txt_Id_PersonalDT);
        NombresDT = findViewById(R.id.txt_NombresDT);
        temperatura1 = findViewById(R.id.txt_Temperatura1DT);
        temperatura2 = findViewById(R.id.txt_Temperatura2DT);
        fecha = findViewById(R.id.txt_FechaDT);

        Intent intent = getIntent();
        lugar = intent.getExtras().getInt("position");
        Id_PersonalDT.setText(Home.users.get(lugar).getId_Personal());
        NombresDT.setText(Home.users.get(lugar).getNombres());


        buscarTemp("http://acceso-tendo.000webhostapp.com/acceso/mosTemp.php?id_personal="+Id_PersonalDT.getText()+""); //https://acceso-tendo.000webhostapp.com/acceso/mosTemp.php


    }

    private void buscarTemp (String URL){
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(URL, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                JSONObject jsonObject = null;
                for (int i = 0; i < response.length(); i++) {
                    try {
                        jsonObject = response.getJSONObject(i);
                        temperatura1.setText(jsonObject.getString("temperatura1"));
                        temperatura2.setText(jsonObject.getString("temperatura2"));
                        fecha.setText(jsonObject.getString("fecha"));
                    } catch (JSONException e) {
                        Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
                    }

                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(), "Error de Conexion",Toast.LENGTH_SHORT).show();
            }
        }
        );

        requestQueue= Volley.newRequestQueue(this);
        requestQueue.add(jsonArrayRequest);
    }

}