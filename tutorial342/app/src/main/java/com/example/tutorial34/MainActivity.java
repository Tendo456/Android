package com.example.tutorial34;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CalendarView;
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
import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText etFechaEntrada, etFechaSalida, etHabitacion;
    Button btnGuardar, btnCargar;
    ListView listaResultado;
    String uno, dos,tres;
    private int dia,mes,año;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etFechaEntrada = (EditText)findViewById(R.id.etFechaEntrada);
        etFechaSalida = (EditText)findViewById(R.id.etFechaSalida);
        etHabitacion = (EditText)findViewById(R.id.etHabitacion);
        btnGuardar = (Button)findViewById(R.id.btnSave);
        btnCargar = (Button)findViewById(R.id.btnLoad);
        listaResultado = (ListView)findViewById(R.id.lvLista);

        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String registro = "http://192.168.1.5/Hotel/registrarReserva.php?idr=NULL&NHab="
                        +etHabitacion.getText()+"&fe="+etFechaEntrada.getText()+"&fs="+etFechaSalida.getText();
                EnviarRecibirDatos(registro);

            }
        });

        btnCargar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String consulta = "http://192.168.1.5/Hotel/consultarReserva.php";
                EnviarRecibirDatos(consulta);

            }
        });

        fecha();
    }

    public void EnviarRecibirDatos(String URL){
        Toast.makeText(getApplicationContext(),""+URL, Toast.LENGTH_SHORT).show();

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

            }
        });

        queue.add(stringRequest);


    }

    public void CargarListView(JSONArray ja){
        ArrayList<String> lista = new ArrayList<>();

        for(int i=0;i<ja.length();i+=4){

            try {

                lista.add(ja.getString(i)+" "+ja.getString(i+1)+" "+ja.getString(i+2)+" "+ja.getString(i+3));
            } catch (JSONException e) {
                e.printStackTrace();
            }

        }


        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lista);
        listaResultado.setAdapter(adaptador);


    }

    public void fecha (){
        final Calendar calendar = Calendar.getInstance();
        dia =calendar.get(Calendar.DAY_OF_MONTH);
        mes= calendar.get(Calendar.MONTH);
        año = calendar.get(Calendar.YEAR);
        uno = String.valueOf(año);
        dos = String.valueOf(mes);
        tres = String.valueOf(dia);

        etFechaEntrada.setText(uno+"-"+dos+"-"+tres);
    }
}