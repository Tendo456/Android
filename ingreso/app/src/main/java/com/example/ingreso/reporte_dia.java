package com.example.ingreso;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
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

import java.sql.Time;
import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class reporte_dia extends AppCompatActivity {

    TextView fechaReporte;
    ListView listReporteDia;
    private int dia,mes,año;
    Button consultar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reporte_dia);

        fechaReporte = findViewById(R.id.fechaReporte);
        listReporteDia = findViewById(R.id.listReporteDia);
        consultar = findViewById(R.id.Consultar);

        consultar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Consult = "https://acceso-tendo.000webhostapp.com/acceso/RegistrosD%C3%ADa.php?fecha="+fechaReporte.getText();
                registros_dia(Consult);

            }
        });




    }

    public void registros_dia(String URL){
        Toast.makeText(getApplicationContext(),"cargando", Toast.LENGTH_SHORT).show();

        RequestQueue queue = Volley.newRequestQueue(this);
        StringRequest stringRequest = new StringRequest(Request.Method.GET, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                response = response.replace("][", ",");
                if (response.length() > 0) {
                    try {
                        JSONArray ja = new JSONArray(response);
                        Log.i("sizejson", "" + ja.length());
                        cargar_registros(ja);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(), "Error",Toast.LENGTH_SHORT).show();
            }
        });

        queue.add(stringRequest);


    }

    public void cargar_registros(JSONArray ja){
        ArrayList<String> listaReporteDia = new ArrayList<>();

        for(int i=0;i<ja.length();i+=4){

            try {

                listaReporteDia.add("Nombre: "+ja.getString(i)+"\nT-AM: "+ja.getString(i+1)+" / T-PM: "+ja.getString(i+2)+"\nFecha: "+ja.getString(i+3));
            } catch (JSONException e) {
                e.printStackTrace();
            }

        }

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listaReporteDia);
        listReporteDia.setAdapter(adaptador);


    }

    public void fechaR (View view) {

        SimpleDateFormat dateParser = new SimpleDateFormat("MM-dd-yyyy",
                Locale.ENGLISH);

        final Calendar calendar = Calendar.getInstance();

        dia =calendar.get(Calendar.DAY_OF_MONTH);
        mes= calendar.get(Calendar.MONTH);
        año = calendar.get(Calendar.YEAR);

        DatePickerDialog dateDlg = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener()
        {

            public void onDateSet(DatePicker view, int year,int monthOfYear, int dayOfMonth)
            {
                fechaReporte.setText(year+"-"+(monthOfYear+1)+"-"+dayOfMonth);

                Calendar cal = Calendar.getInstance();
                cal.setTimeInMillis(0);
                cal.set(year, monthOfYear, dayOfMonth, 0, 0, 0);
                Date chosenDate = cal.getTime();

                DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                String s = formatter.format(chosenDate);
                fechaReporte.setText(s);


            }} ,año,mes,dia);
        dateDlg.show();





    }

}