package com.example.breaks.actividades;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import com.example.breaks.Modelos.ProgramacionResponse;
import com.example.breaks.Modelos.StockResponse;
import com.example.breaks.R;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ProgramacionDetails extends AppCompatActivity {

    TextView PROGID, PROGMarcaD, PROGFechaD;
    EditText PROGCantD;
    SwitchCompat ActiPROG;
    Button ActuPROG;
    ProgramacionResponse programacionResponse;
    String ProgID, ProgCant, ProgFecha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programacion_details);

        PROGID = findViewById(R.id.PROGID);
        PROGMarcaD = findViewById(R.id.PROGMarcaD);
        PROGFechaD = findViewById(R.id.PROGFechaD);
        PROGCantD = findViewById(R.id.PROGCantD);
        ActuPROG = findViewById(R.id.ActuPROG);
        ActiPROG = findViewById(R.id.ActiPROG);


        Intent intent = getIntent();
        if(intent.getExtras() !=null){
            programacionResponse = (ProgramacionResponse) intent.getSerializableExtra("datoProg");

            String id_prog = programacionResponse.getId_programacion();
            String marcaPROG = programacionResponse.getMarca();
            String cant = programacionResponse.getCantidad_marc();
            String fecha_prog = programacionResponse.getFecha_prog();


            PROGID.setText(id_prog);
            PROGMarcaD.setText(marcaPROG);
            PROGCantD.setText(cant);
            PROGFechaD.setText(fecha_prog);
        }


    }
}