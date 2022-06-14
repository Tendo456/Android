package com.example.ingreso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.Calendar;

public class reporteTemp extends AppCompatActivity {
     TextView RTNombre, RTId;
     ListView RTList;
     int lugares;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reporte_temp);

        RTNombre = findViewById(R.id.RTNombre);
        RTId = findViewById(R.id.RTId);
        RTList = findViewById(R.id.RTList);

        Intent intent = getIntent();
        lugares = intent.getExtras().getInt("position");
        RTId.setText(Home.users.get(lugares).getId_Personal());
        RTNombre.setText(Home.users.get(lugares).getNombres());

        String consulta = "https://acceso-tendo.000webhostapp.com/acceso/registroTempe.php?id_personal="+RTId.getText();
        EnviarRecibirDatos(consulta);

    }

    public void EnviarRecibirDatos(String URL){
        Toast.makeText(getApplicationContext(),"Cargando", Toast.LENGTH_SHORT).show();

        RequestQueue queue = Volley.newRequestQueue(this);
        StringRequest stringRequest = new StringRequest(Request.Method.GET, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                response = response.replace("][", ",");
                if (response.length() > 0) {
                    try {
                        JSONArray ja = new JSONArray(response);
                        Log.i("sizejson", "" + ja.length());
                        CargarListView(ja);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(), "Cargando",Toast.LENGTH_SHORT).show();
            }
        });

        queue.add(stringRequest);


    }

    public void CargarListView(JSONArray ja){
        ArrayList<String> lista = new ArrayList<>();

        for(int i=0;i<ja.length();i+=3){

            try {

                lista.add("T-AM: "+ja.getString(i)+" / T-PM: "+ja.getString(i+1)+"\nFecha: "+ja.getString(i+2));
            } catch (JSONException e) {
                e.printStackTrace();
            }

        }


        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lista);
        RTList.setAdapter(adaptador);


    }


}