package com.example.ingreso;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class tempIn extends AppCompatActivity {

    TextView id_Ptemp, fechatxt,nombrePtemp;
    EditText tempe1txt, tempe2txt;
    Button btnTempin;
    int position;

    private int dia,mes,año;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp_in);

        id_Ptemp = findViewById(R.id.id_Ptemp);
        nombrePtemp = findViewById(R.id.nombrePtemp);
        fechatxt = findViewById(R.id.fechatxt);
        tempe1txt = findViewById(R.id.tempe1txt);
        tempe2txt = findViewById(R.id.tempe2txt);

        btnTempin = findViewById(R.id.btnTempin);
        btnTempin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InTemp();
            }
        });

        Intent intent = getIntent();
        position=intent.getExtras().getInt("position");
        id_Ptemp.setText(Home.users.get(position).getId_Personal());
        nombrePtemp.setText(Home.users.get(position).getNombres());

        fechaactual();

    }

    private void InTemp(){

        final String idPtemp=id_Ptemp.getText().toString().trim();
        final String fecha=fechatxt.getText().toString().trim();
        final String tempe1=tempe1txt.getText().toString().trim();
        final String tempe2=tempe2txt.getText().toString().trim();

        final ProgressDialog progressDialog=new ProgressDialog(this);

      if (tempe1.isEmpty()){
            tempe1txt.setError("Complete los Campos");
        }
      else {
          progressDialog.show();
          StringRequest request=new StringRequest(Request.Method.POST, "http://acceso-tendo.000webhostapp.com/acceso/inTemp.php", new Response.Listener<String>() {
              @Override
              public void onResponse(String response) {
                  if (response.equalsIgnoreCase("Datos Insertados")){
                      clear();
                      Toast.makeText(tempIn.this,response,Toast.LENGTH_SHORT).show();
                      progressDialog.dismiss();
                      finish();
                  }
                  else{
                      Toast.makeText(tempIn.this,"Error",Toast.LENGTH_SHORT).show();
                      progressDialog.dismiss();
                  }
              }
          }, new Response.ErrorListener(){
              @Override
              public void onErrorResponse(VolleyError error) {
                  Toast.makeText(tempIn.this,"Error",Toast.LENGTH_SHORT).show();
                  progressDialog.dismiss();
              }

          } ){
              @Override
              protected Map<String, String> getParams() throws AuthFailureError {
                  Map<String ,String>params=new HashMap<String, String>();
                  params.put("id_personal",idPtemp);
                  params.put("fecha",fecha);
                  params.put("temperatura1",tempe1);
                  params.put("temperatura2",tempe2);

                  return params;
              }
          };
          RequestQueue requestQueue= Volley.newRequestQueue(tempIn.this);
          requestQueue.add(request);
      }

    }

    public void fechaactual (){
        final Calendar calendar = Calendar.getInstance();
        //dia =calendar.get(Calendar.DAY_OF_MONTH);
        //mes= calendar.get(Calendar.MONTH);
        //año = calendar.get(Calendar.YEAR);
        Format formatter = new SimpleDateFormat("yyyy-MM-dd");
        String s = formatter.format(calendar.getTime());

        fechatxt.setText(s);
    }

    public void clear(){
        id_Ptemp.setText("");
        fechatxt.setText("");
        tempe1txt.setText("");
        tempe2txt.setText("");

    }
}