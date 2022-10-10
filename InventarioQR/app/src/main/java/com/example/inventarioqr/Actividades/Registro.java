package com.example.inventarioqr.Actividades;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
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
import com.google.android.material.textfield.TextInputEditText;
import com.google.zxing.BarcodeFormat;
import com.journeyapps.barcodescanner.BarcodeEncoder;

import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Registro extends AppCompatActivity {

    ImageView createQR;
    TextInputEditText sendID,sendEquipo, sendSerie, sendDescripcion;
    Button btnSave, btnShare;
    String saveEquipo, saveSerie, saveDescripcion;
    String idR = null;
    String equipoR = null;
    String serieR = null;
    String descripcionR = null;
    private int storage = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        createQR = findViewById(R.id.createQR);
        sendEquipo = findViewById(R.id.sendEquipo);
        sendSerie = findViewById(R.id.sendSerie);
        sendDescripcion = findViewById(R.id.sendDescripcion);
        btnSave = findViewById(R.id.btnSave);
        btnShare = findViewById(R.id.btnShare);
        sendID =findViewById(R.id.sendID);

        btnSave.setOnClickListener(v -> comfirmPC());

        createQR.setImageResource(R.drawable.codigo_qr);

        sendID.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if(editable.toString().length()>=1){
                    Objects.requireNonNull(sendEquipo.getText()).clear();
                    Objects.requireNonNull(sendSerie.getText()).clear();
                    Objects.requireNonNull(sendDescripcion.getText()).clear();
                    //contador = Objects.requireNonNull(datoID.getText()).toString();
                    //Toast.makeText(Lector.this, "Buscando: "+contador, Toast.LENGTH_SHORT).show();
                    segundos();
                }else {
                    createQR.setImageResource(R.drawable.codigo_qr);
                }
            }
        });

        btnShare.setOnClickListener(view -> {
            if(ContextCompat.checkSelfPermission(
                    getApplicationContext(), Manifest.permission.WRITE_EXTERNAL_STORAGE)== PackageManager.PERMISSION_DENIED){
                ActivityCompat.requestPermissions(Registro.this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},storage);
            }else {
                shareQR();
            }
        });
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(requestCode == storage){
            shareQR();
        }else {
            Toast.makeText(Registro.this, "Conceder Permisos", Toast.LENGTH_SHORT).show();
        }
    }

    public void segundos(){
        new Handler(Looper.getMainLooper()).postDelayed(this::GenerarQR,2000);
    }

    public void hilo(){
        new Handler(Looper.getMainLooper()).postDelayed(this::LastReg,1000);
    }

    public void comfirmPC (){
        AlertDialog.Builder opcion = new AlertDialog.Builder(this);
        opcion.setMessage("Agregar Equipo?");
        opcion.setPositiveButton("Agregar", (dialog, which) -> savePC());
        opcion.setNegativeButton("Cancelar", (dialog, which) -> dialog.cancel());

        AlertDialog dialog = opcion.create();
        dialog.show();
    }

    public void savePC () {

        if (Objects.requireNonNull(sendEquipo.getText()).toString().isEmpty()) {
            sendEquipo.setError("Vacío");
        } else if (Objects.requireNonNull(sendSerie.getText()).toString().isEmpty()) {
            sendSerie.setError("Vacio");
        } else {

            saveEquipo = Objects.requireNonNull(sendEquipo.getText()).toString();
            saveSerie = Objects.requireNonNull(sendSerie.getText().toString());
            saveDescripcion = Objects.requireNonNull(sendDescripcion.getText()).toString();

        Call<LectorResponse> inPC = ApiClient.getUserService().insertEquipo(saveEquipo, saveSerie, saveDescripcion);
        inPC.enqueue(new Callback<LectorResponse>() {
            @Override
            public void onResponse(@NonNull Call<LectorResponse> call, @NonNull Response<LectorResponse> response) {
                if (response.isSuccessful()) {
                    LectorResponse mensage = response.body();
                    assert mensage != null;
                    Toast.makeText(Registro.this, mensage.getMensage() + " " + response.code(), Toast.LENGTH_SHORT).show();
                    hilo();
                } else {
                    LectorResponse mensage = response.body();
                    assert mensage != null;
                    Toast.makeText(Registro.this, mensage.getMensage() + " " + response.code(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(@NonNull Call<LectorResponse> call, @NonNull Throwable t) {
                Toast.makeText(Registro.this, "Error Code: " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
    }

    public void LastReg(){
        Call<List<LectorResponse>> last = ApiClient.getUserService().lastPC();
        last.enqueue(new Callback<List<LectorResponse>>() {
            @Override
            public void onResponse(@NonNull Call<List<LectorResponse>> call, @NonNull Response<List<LectorResponse>> response) {
                if (response.isSuccessful()){
                    List<LectorResponse> lectorResponses = response.body();
                    assert lectorResponses !=null;
                    for (LectorResponse lectorResponse: lectorResponses){
                        idR = lectorResponse.getId();
                        equipoR = lectorResponse.getEquipo();
                        serieR = lectorResponse.getSerie();
                        descripcionR = lectorResponse.getDescripcion();
                    }
                    if (idR == null){
                        Toast.makeText(Registro.this, "Error", Toast.LENGTH_SHORT).show();
                    }else{
                        sendID.setText(idR);
                        sendEquipo.setText(equipoR);
                        sendSerie.setText(serieR);
                        sendDescripcion.setText(descripcionR);
                    }
                }
            }

            @Override
            public void onFailure(@NonNull Call<List<LectorResponse>> call, @NonNull Throwable t) {
                Toast.makeText(Registro.this, "Error Code: " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void GenerarQR (){
        try{
            BarcodeEncoder barcodeEncoder = new BarcodeEncoder();
            Bitmap bitmap = barcodeEncoder.encodeBitmap(sendID.getText().toString(), BarcodeFormat.QR_CODE, 600,600);
            createQR.setImageBitmap(bitmap);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void shareQR (){
        createQR.buildDrawingCache();
        Bitmap bitmap = createQR.getDrawingCache();
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