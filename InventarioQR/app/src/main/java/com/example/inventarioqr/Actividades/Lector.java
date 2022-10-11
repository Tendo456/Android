package com.example.inventarioqr.Actividades;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.provider.MediaStore;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.inventarioqr.Modelos.LectorResponse;
import com.example.inventarioqr.R;
import com.example.inventarioqr.RetrofitData.ApiClient;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;
import com.journeyapps.barcodescanner.BarcodeEncoder;

import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Lector extends AppCompatActivity {

    TextInputEditText datoID, datoEquipo, datoSerie, datoDescripcion;
    Button btnScan, btnUpdate;
    String contador;
    String equipo = null;
    String serie = null;
    String descripcion = null;
    SwitchCompat Activar;
    ImageView datoQR;
    private final int almacenamiento = 100;
    FloatingActionButton btnShare;
    String upID, upEquipo, upSerie, upDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lector);

        datoID = findViewById(R.id.datoID);
        datoEquipo = findViewById(R.id.datoEquipo);
        datoSerie = findViewById(R.id.datoSerie);
        datoDescripcion = findViewById(R.id.datoDescripcion);
        btnScan = findViewById(R.id.btnScan);
        btnUpdate = findViewById(R.id.btnUpdate);
        Activar = findViewById(R.id.Activar);
        datoQR = findViewById(R.id.datoQR);
        btnShare = findViewById(R.id.btnShare);

        datoQR.setImageResource(R.drawable.codigo_qr);

        btnScan.setOnClickListener(v -> Scan());

        datoID.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(s.toString().length()>=1){
                    Objects.requireNonNull(datoEquipo.getText()).clear();
                    Objects.requireNonNull(datoSerie.getText()).clear();
                    Objects.requireNonNull(datoDescripcion.getText()).clear();
                    contador = Objects.requireNonNull(datoID.getText()).toString();
                    Toast.makeText(Lector.this, "Buscando: "+contador, Toast.LENGTH_SHORT).show();
                    btnUpdate.setEnabled(true);
                    btnShare.setEnabled(true);
                    getData();
                    timer();
                }else {
                    btnUpdate.setEnabled(false);
                    datoQR.setImageResource(R.drawable.codigo_qr);
                    btnShare.setEnabled(false);
                }
            }
        });

        btnShare.setOnClickListener(v -> {
            if(ContextCompat.checkSelfPermission(
                    getApplicationContext(), Manifest.permission.WRITE_EXTERNAL_STORAGE)== PackageManager.PERMISSION_DENIED){
                ActivityCompat.requestPermissions(Lector.this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},almacenamiento);
            }else {
                comparteQR();
            }
        });

        btnUpdate.setOnClickListener(v -> updateData());
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(requestCode == almacenamiento){
            comparteQR();
        }else {
            Toast.makeText(Lector.this, "Conceder Permisos", Toast.LENGTH_SHORT).show();
        }
    }

    public void timer (){
        new Handler(Looper.getMainLooper()).postDelayed(this::crearQR,2000);
    }


    public void Scan (){
        IntentIntegrator integrador = new IntentIntegrator(Lector.this);
        integrador.setDesiredBarcodeFormats(IntentIntegrator.ALL_CODE_TYPES);
        integrador.setPrompt("Lector - QR");
        integrador.setCameraId(0);
        integrador.setOrientationLocked(false);
        integrador.setCaptureActivity(com.example.inventarioqr.Actividades.orientacion.class);
        integrador.setBeepEnabled(true);
        integrador.setBarcodeImageEnabled(true);
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
                Toast.makeText(this,"Buscando: "+result.getContents(), Toast.LENGTH_SHORT).show();
                datoID.setText(result.getContents());
            }
        }else{
            super.onActivityResult(requestCode, resultCode, data);
        }
    }

    public void getData (){

        Call<List<LectorResponse>> pc = ApiClient.getUserService().getEquipo(contador);
        pc.enqueue(new Callback<List<LectorResponse>>() {
            @Override
            public void onResponse(@NonNull Call<List<LectorResponse>> call, @NonNull Response<List<LectorResponse>> response) {
                if (response.isSuccessful()){
                    Objects.requireNonNull(datoEquipo.getText()).clear();

                    List<LectorResponse> lectorResponses = response.body();
                    assert lectorResponses !=null;
                    for (LectorResponse lectorResponse: lectorResponses){
                        equipo = lectorResponse.getEquipo();
                        serie = lectorResponse.getSerie();
                        descripcion = lectorResponse.getDescripcion();
                    }
                    if (equipo == null){
                        Toast.makeText(Lector.this, "No Encontrado", Toast.LENGTH_SHORT).show();
                    }else{
                        datoEquipo.setText(equipo);
                        datoSerie.setText(serie);
                        datoDescripcion.setText(descripcion);
                    }
                }
            }

            @Override
            public void onFailure(@NonNull Call<List<LectorResponse>> call, @NonNull Throwable t) {
                Toast.makeText(Lector.this, "Error Code: " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void updateData(){
        if(Objects.requireNonNull(datoID.getText()).toString().isEmpty()){
            datoID.setError("Vacio");
        }else if(Objects.requireNonNull(datoEquipo.getText()).toString().isEmpty()){
            datoEquipo.setError("Vacio");
        }else if(Objects.requireNonNull(datoSerie.getText()).toString().isEmpty()){
            datoSerie.setError("Vacio");
        }else {
            upID = datoID.getText().toString();
            upEquipo = datoEquipo.getText().toString();
            upSerie = datoSerie.getText().toString();
            upDesc = Objects.requireNonNull(datoDescripcion.getText()).toString();

            Call<LectorResponse> updata = ApiClient.getUserService().updateEquipo(upID, upEquipo, upSerie, upDesc);
            updata.enqueue(new Callback<LectorResponse>() {
                @Override
                public void onResponse(@NonNull Call<LectorResponse> call, @NonNull Response<LectorResponse> response) {
                    if (response.isSuccessful()){
                        LectorResponse mensage = response.body();
                        assert mensage != null;
                        Toast.makeText(Lector.this, mensage.getMensage() + " " + response.code(), Toast.LENGTH_SHORT).show();
                    } else {
                        LectorResponse mensage = response.body();
                        assert mensage != null;
                        Toast.makeText(Lector.this, mensage.getMensage() + " " + response.code(), Toast.LENGTH_SHORT).show();
                    }
                }

                @Override
                public void onFailure(@NonNull Call<LectorResponse> call, @NonNull Throwable t) {
                    Toast.makeText(Lector.this, "Error Code: " + t.getMessage(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

    public void ActivarProg (View view){
        if(Activar.isChecked()){
            datoID.setEnabled(true);
            datoEquipo.setEnabled(true);
            datoSerie.setEnabled(true);
            datoDescripcion.setEnabled(true);
        }else {
            datoID.setEnabled(false);
            datoEquipo.setEnabled(false);
            datoSerie.setEnabled(false);
            datoDescripcion.setEnabled(false);
        }
    }

    public void crearQR (){
        try{
            BarcodeEncoder barcodeEncoder = new BarcodeEncoder();
            Bitmap bitmap = barcodeEncoder.encodeBitmap(Objects.requireNonNull(datoID.getText()).toString(), BarcodeFormat.QR_CODE, 600,600);
            datoQR.setImageBitmap(bitmap);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void comparteQR (){
        datoQR.buildDrawingCache();
        Bitmap bitmap = datoQR.getDrawingCache();
        //Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.codigo_qr);
        Intent share = new Intent(Intent.ACTION_SEND);
        share.setType("image/jpeg");
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100,bytes);
        String path = MediaStore.Images.Media.insertImage(getContentResolver(), bitmap, "title", null);
        Uri imageUri = Uri.parse(path);
        share.putExtra(Intent.EXTRA_STREAM, imageUri);
        startActivity(Intent.createChooser(share, "select"));
    }
}