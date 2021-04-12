package com.example.codigoqr;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Vibrator;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    TextView txtLink;
    Button btnScan;
    String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnScan = findViewById(R.id.btnScan);
        txtLink = findViewById(R.id.txtLink);

        btnScan.setOnClickListener(v -> { Scan(); });

        ImageSlider imageSlider = findViewById(R.id.banner);

        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.admision,"Imagen 1"));
        slideModels.add(new SlideModel("http://190.119.144.250:83/hoja_evaluacion/img/audiometria.jpg","Imagen 2"));
        slideModels.add(new SlideModel("http://190.119.144.250:83/hoja_evaluacion/img/pasillo.jpg","Imagen 3"));
        slideModels.add(new SlideModel("http://190.119.144.250:83/hoja_evaluacion/img/psicologia.jpg","Imagen 4"));
        slideModels.add(new SlideModel("http://190.119.144.250:83/hoja_evaluacion/img/radiologia.jpg","Imagen 5"));
        imageSlider.setImageList(slideModels,true);

        imageSlider.setItemClickListener(i -> Toast.makeText(getApplicationContext(), slideModels.get(i).getTitle(),Toast.LENGTH_SHORT).show());


    }

    public void Scan (){
        IntentIntegrator integrador = new IntentIntegrator(MainActivity.this);
        integrador.setDesiredBarcodeFormats(IntentIntegrator.ALL_CODE_TYPES);
        integrador.setPrompt("Lector - CDP");
        integrador.setCameraId(0);
        integrador.setOrientationLocked(false);
        integrador.setBeepEnabled(true);
        integrador.setBarcodeImageEnabled(false);
        integrador.initiateScan();

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {


        IntentResult result = IntentIntegrator.parseActivityResult(requestCode,resultCode,data);

        if(result != null){
            if(result.getContents() == null){
                Toast.makeText(this,"Lectura Cancelada", Toast.LENGTH_SHORT).show();
            }else {
                Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){v.vibrate(VibrationEffect.createOneShot(500, VibrationEffect.DEFAULT_AMPLITUDE));}
                Toast.makeText(this,result.getContents(), Toast.LENGTH_SHORT).show();
                txtLink.setText(result.getContents());
            }
        }else{
            super.onActivityResult(requestCode, resultCode, data);
        }
    }

    public void urls (View view){

        url=txtLink.getText().toString();

        try{
        if (url == null){
            Toast.makeText(this,"texto vacio",Toast.LENGTH_SHORT).show();
        }else{
        Uri link = Uri.parse(url);
        Intent i = new Intent(Intent.ACTION_VIEW,link);
        startActivity(i);
        }}
        catch (ActivityNotFoundException e){
            Toast.makeText(this, "No Formato URL", Toast.LENGTH_LONG).show();
        }
    }
}