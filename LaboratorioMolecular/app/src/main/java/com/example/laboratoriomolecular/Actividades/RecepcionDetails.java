package com.example.laboratoriomolecular.Actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.laboratoriomolecular.Modelos.RecepcionResponse;
import com.example.laboratoriomolecular.R;

public class RecepcionDetails extends AppCompatActivity {

    TextView RDfecha,RDhora,RDn_envio,RDq_muestras,RDoperador,RDdni;
    RecepcionResponse recepcionResponse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recepcion_details);

        RDfecha = findViewById(R.id.RDfecha);
        RDhora = findViewById(R.id.RDhora);
        RDn_envio = findViewById(R.id.RDn_envio);
        RDq_muestras = findViewById(R.id.RDq_muestras);
        RDoperador = findViewById(R.id.RDoperador);
        RDdni = findViewById(R.id.RDdni);

        Intent intent = getIntent();
        if(intent.getExtras() !=null){
            recepcionResponse = (RecepcionResponse) intent.getSerializableExtra("data");

            String RDfecha1 = recepcionResponse.getFecha();
            String RDhora1 = recepcionResponse.getHora();
            String RDn_envio1 = recepcionResponse.getN_envio();
            String RDq_muestras1 = recepcionResponse.getQ_muestras();
            String RDoperador1 = recepcionResponse.getOperador();
            String RDdni1 = recepcionResponse.getDni();

            RDfecha.setText(RDfecha1);
            RDhora.setText(RDhora1);
            RDn_envio.setText(RDn_envio1);
            RDq_muestras.setText(RDq_muestras1);
            RDoperador.setText(RDoperador1);
            RDdni.setText(RDdni1);
        }
    }
}