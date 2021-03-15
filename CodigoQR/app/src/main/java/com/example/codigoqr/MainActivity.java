package com.example.codigoqr;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class MainActivity extends AppCompatActivity {

    TextView txtLink;
    Button btnScan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnScan = findViewById(R.id.btnScan);
        txtLink = findViewById(R.id.txtLink);

        btnScan.setOnClickListener(v -> {

            IntentIntegrator integrador = new IntentIntegrator(MainActivity.this);
            integrador.setDesiredBarcodeFormats(IntentIntegrator.ALL_CODE_TYPES);
            integrador.setPrompt("Lector - CDP");
            integrador.setCameraId(0);
            integrador.setBeepEnabled(true);
            integrador.setBarcodeImageEnabled(true);
            integrador.initiateScan();


        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {


        IntentResult result = IntentIntegrator.parseActivityResult(requestCode,resultCode,data);

        if(result != null){
            if(result.getContents() == null){
                Toast.makeText(this,"Lectura Cancelada", Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(this,result.getContents(), Toast.LENGTH_SHORT).show();
                txtLink.setText(result.getContents());
            }
        }else{
            super.onActivityResult(requestCode, resultCode, data);
        }

        String datos = result.getContents();

        txtLink.setText(datos);
    }
}