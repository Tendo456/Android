package com.example.appriesgo.Actividades;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.appriesgo.Modelos.ConsultaResponse;
import com.example.appriesgo.R;
import com.example.appriesgo.RetrofitData.ApiClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Consulta extends AppCompatActivity {

    TextView nombre, comorbilidad;
    EditText numero_doc;
    String num_doc;
    String idName = null;
    String condition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consulta);

        numero_doc = findViewById(R.id.numero_doc);
        nombre = findViewById(R.id.nombre);
        comorbilidad = findViewById(R.id.comorbilidad);

        numero_doc.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if(editable.toString().length()>=8){
                    nombre.setText("");
                    num_doc = numero_doc.getText().toString();
                    Toast.makeText(Consulta.this, "Buscando: "+num_doc, Toast.LENGTH_SHORT).show();
                    hilo();
                }else{
                    comorbilidad.setText("");
                }
            }
        });

    }

    public void hilo(){new Handler(Looper.getMainLooper()).postDelayed(this::casa,2000);
    }

    public void buscar (String num){
        Call<List<ConsultaResponse>> persona = ApiClient.getUserService().getPer(num);
        persona.enqueue(new Callback<List<ConsultaResponse>>() {
            @Override
            public void onResponse(@NonNull Call<List<ConsultaResponse>> call, @NonNull Response<List<ConsultaResponse>> response) {
                if(response.isSuccessful()){
                    nombre.setText("");
                    String name;
                    String nombre1 = null;

                    String condition1 = null;

                    List<ConsultaResponse> consultaResponses = response.body();
                    assert consultaResponses != null;
                    for (ConsultaResponse consultaResponse: consultaResponses){
                        name=consultaResponse.getNombres()+" "+consultaResponse.getApellido_paterno()+" "+consultaResponse.getApellido_materno();
                        nombre1 = name;
                        condition = consultaResponse.getCondicion();
                        condition1 = condition;
                        if(condition1 == null){
                            comorbilidad.setText("Vacio");
                        }else{
                            comorbilidad.append(condition1+"\n");
                        }
                    }
                    if(nombre1 == null){
                        Toast.makeText(Consulta.this, "No Encontrado", Toast.LENGTH_SHORT).show();
                        //GuardarBus.setEnabled(false);
                    }else{
                        nombre.append(nombre1);
                        Toast.makeText(Consulta.this,idName , Toast.LENGTH_SHORT).show();

                    }

                }else {
                    Toast.makeText(Consulta.this, "No Encontrado", Toast.LENGTH_SHORT).show();
                    nombre.setText(response.code());

                }
            }

            @Override
            public void onFailure(@NonNull Call<List<ConsultaResponse>> call, @NonNull Throwable t) {

            }
        });
    }

    public void casa(){
        buscar(num_doc);
    }
}