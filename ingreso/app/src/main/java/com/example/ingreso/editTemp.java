package com.example.ingreso;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class editTemp extends AppCompatActivity {

    EditText TempAc1,TempAc2,idEDTP,calenda2;
    TextView NOMEDTP;
    Button btnActualizar;
    RadioButton radTemp1,radTemp2;
    String calenda,calenda1;
    int position;
    RequestQueue requestQueue;

    private int dia,mes,año;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_temp);

        TempAc1=findViewById(R.id.txtTempAc1);
        TempAc1.setEnabled(false);
        TempAc2=findViewById(R.id.txtTempAc2);
        TempAc2.setEnabled(false);
        idEDTP=findViewById(R.id.idEDTP);
        NOMEDTP=findViewById(R.id.NOMEDTP);
        calenda2=findViewById(R.id.calendario);
        btnActualizar=findViewById(R.id.btnActualizar);
        radTemp1=findViewById(R.id.radTemp1);
        radTemp2=findViewById(R.id.radTemp2);

        Intent intent = getIntent();
        position=intent.getExtras().getInt("position");
        idEDTP.setText(Home.users.get(position).getId_Personal());
        NOMEDTP.setText(Home.users.get(position).getNombres());


        buscarTem("http://acceso-tendo.000webhostapp.com/acceso/mosTemp.php?id_personal="+idEDTP.getText()+"");
        dias();
    }


    public void cualtemp(View view){
        if(radTemp1.isChecked() && calenda.equals(calenda1) ){
            TempAc1.setEnabled(true);
            TempAc2.setEnabled(false);
        }
        else if(radTemp2.isChecked() && calenda.equals(calenda1)){
            TempAc1.setEnabled(false);
            TempAc2.setEnabled(true);

        }
        else {
        Toast.makeText(this,"No se Puede Editar",Toast.LENGTH_SHORT).show();}
    }



    public void actuTemp (View view){
        final String calend=calenda2.getText().toString().trim();
        final String te1=TempAc1.getText().toString().trim();
        final String te2=TempAc2.getText().toString().trim();
        final String idper=idEDTP.getText().toString().trim();

        final ProgressDialog progressDialog=new ProgressDialog(this);
        progressDialog.setMessage("Cargando....");
        progressDialog.show();

        StringRequest request = new StringRequest(Request.Method.POST, "http://acceso-tendo.000webhostapp.com/acceso/actuTemp.php",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        Toast.makeText(editTemp.this, response, Toast.LENGTH_SHORT).show();
                        finish();
                        progressDialog.dismiss();
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                Toast.makeText(editTemp.this, error.getMessage(),Toast.LENGTH_SHORT).show();
                progressDialog.dismiss();

            }
        }){

            @Override
            protected Map<String, String> getParams() throws AuthFailureError {

                Map<String,String> params = new HashMap<String,String>();


                params.put("temperatura1",te1);
                params.put("temperatura2",te2);
                params.put("fecha",calend);
                params.put("id_personal",idper);


                return params;
            }
        };

        RequestQueue requestQueue = Volley.newRequestQueue(editTemp.this);
        requestQueue.add(request);

    }

    public void dias (){
        final Calendar calendar = Calendar.getInstance();
        dia =calendar.get(Calendar.DAY_OF_MONTH);
        mes= calendar.get(Calendar.MONTH);
        año = calendar.get(Calendar.YEAR);
        Format formatter = new SimpleDateFormat("yyyy-MM-dd");
        String s = formatter.format(calendar.getTime());

        calenda=s;
    }

    private void buscarTem (String URL){
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(URL, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                JSONObject jsonObject = null;
                for (int i = 0; i < response.length(); i++) {
                    try {
                        jsonObject = response.getJSONObject(i);
                        TempAc1.setText(jsonObject.getString("temperatura1"));
                        TempAc2.setText(jsonObject.getString("temperatura2"));
                        calenda2.setText(jsonObject.getString("fecha"));
                        calenda1=calenda2.getText().toString();
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