package com.example.breaks.actividades;

import androidx.appcompat.app.AppCompatActivity;

import com.example.breaks.Modelos.MarcasResponse;
import com.example.breaks.R;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MarcasDetails extends AppCompatActivity {

    EditText UDMarca, UDStock;
    TextView UDFecha;
    RadioButton UDGalleta, UDBebida;
    RadioButton UDActivo, UDInactivo;
    Button AtcMarca;
    String UDMarcaSt,UDStockSt,UDFechaSt,UDTipo,UDEstado;
    MarcasResponse marcasResponse;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marcas_details);

        UDMarca = findViewById(R.id.UDMarca);
        UDStock = findViewById(R.id.UDStock);
        UDFecha = findViewById(R.id.UDFecha);
        UDGalleta = findViewById(R.id.UDGalleta);
        UDBebida = findViewById(R.id.UDBebida);
        UDActivo = findViewById(R.id.UDActivo);
        UDInactivo = findViewById(R.id.UDInactivo);
        AtcMarca = findViewById(R.id.ActMarca);

        Intent intent = getIntent();
        if(intent.getExtras() !=null){
            marcasResponse = (MarcasResponse) intent.getSerializableExtra("data");

            String idMarca = marcasResponse.getId_marcas();
            String Marca = marcasResponse.getMarca();
            String Stock = marcasResponse.getStock();
            String Fecha = marcasResponse.getFecha();
            String Tipo = marcasResponse.getTipo();
            String Estado = marcasResponse.getEstado();


            UDMarca.setText(Marca);
            UDStock.setText(Stock);
            UDFecha.setText(Fecha);
            //UDGalleta.setText(String.valueOf(Tipo));
            //UDBebida.setText(String.valueOf(userid));
            //UDActivo.setText(String.valueOf(userid));
            //UDInactivo.setText(String.valueOf(userid));
        }
    }


}