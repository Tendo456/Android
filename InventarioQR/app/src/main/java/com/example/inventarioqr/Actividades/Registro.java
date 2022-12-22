package com.example.inventarioqr.Actividades;

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
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.print.PrintHelper;

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

public class Registro extends AppCompatActivity {

    private final int storage = 100;
    ImageView createQR;
    TextInputEditText sendID, sendEquipo, sendSerie, sendMarca, sendModelo, sendDescripcion, sendUser, sendSede;
    Button btnSave, btnNuevo;
    String saveEquipo, saveSerie, saveMarca, saveModelo, saveUsuario, saveSede, saveDescripcion;
    String idR = null;
    String equipoR = null;
    String serieR = null;
    String marcaR = null;
    String modeloR = null;
    String usuarioR = null;
    String sedeR = null;
    String descripcionR = null;
    FloatingActionButton btnShareR, scanSerie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        createQR = findViewById(R.id.createQR);
        sendEquipo = findViewById(R.id.sendEquipo);
        sendSerie = findViewById(R.id.sendSerie);
        sendModelo = findViewById(R.id.sendModelo);
        sendMarca = findViewById(R.id.sendMarca);
        sendDescripcion = findViewById(R.id.sendDescripcion);
        btnSave = findViewById(R.id.btnSave);
        btnShareR = findViewById(R.id.btnShareR);
        scanSerie = findViewById(R.id.scanSerie);
        sendID = findViewById(R.id.sendID);
        sendUser = findViewById(R.id.sendUser);
        sendSede = findViewById(R.id.sendSede);
        btnNuevo = findViewById(R.id.btnNuevo);

        btnSave.setOnClickListener(v -> comfirmPC());
        btnNuevo.setOnClickListener(v -> nuevo());

        createQR.setImageResource(R.drawable.codigo_qr);
        scanSerie.setOnClickListener(v -> tag());

        sendID.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editable.toString().length() >= 1) {
                    Objects.requireNonNull(sendEquipo.getText()).clear();
                    Objects.requireNonNull(sendSerie.getText()).clear();
                    Objects.requireNonNull(sendModelo.getText()).clear();
                    Objects.requireNonNull(sendDescripcion.getText()).clear();
                    segundos();
                    btnShareR.setEnabled(true);
                } else {
                    createQR.setImageResource(R.drawable.codigo_qr);
                    btnShareR.setEnabled(false);
                }
            }
        });

        btnShareR.setOnClickListener(view -> {
            if (ContextCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED) {
                ActivityCompat.requestPermissions(Registro.this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, storage);
            } else {
                printQR();
            }
        });
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == storage) {
            shareQR();
        } else {
            Toast.makeText(Registro.this, "Conceder Permisos", Toast.LENGTH_SHORT).show();
        }
    }

    public void segundos() {
        new Handler(Looper.getMainLooper()).postDelayed(this::GenerarQR, 2000);
    }

    public void hilo() {
        new Handler(Looper.getMainLooper()).postDelayed(this::LastReg, 1000);
    }

    public void comfirmPC() {
        AlertDialog.Builder opcion = new AlertDialog.Builder(this);
        opcion.setMessage("Agregar Equipo?");
        opcion.setPositiveButton("Agregar", (dialog, which) -> savePC());
        opcion.setNegativeButton("Cancelar", (dialog, which) -> dialog.cancel());

        AlertDialog dialog = opcion.create();
        dialog.show();
    }

    public void savePC() {

        if (Objects.requireNonNull(sendEquipo.getText()).toString().isEmpty()) {
            sendEquipo.setError("Vacío");
        } else if (Objects.requireNonNull(sendSerie.getText()).toString().isEmpty()) {
            sendSerie.setError("Vacio");
        } else if (Objects.requireNonNull(sendMarca.getText()).toString().isEmpty()) {
            sendMarca.setError("Vacio");
        } else if (Objects.requireNonNull(sendModelo.getText()).toString().isEmpty()) {
            sendModelo.setError("Vacio");
        } else if (Objects.requireNonNull(sendUser.getText()).toString().isEmpty()) {
            sendUser.setError("Vacio");
        } else if (Objects.requireNonNull(sendSede.getText()).toString().isEmpty()) {
            sendSede.setError("Vacio");
        } else {

            if (Objects.requireNonNull(sendDescripcion.getText()).toString().isEmpty()) {
                saveDescripcion = "Vacio";
            } else {
                saveDescripcion = Objects.requireNonNull(sendDescripcion.getText()).toString();
            }

            saveEquipo = Objects.requireNonNull(sendEquipo.getText()).toString();
            saveSerie = Objects.requireNonNull(sendSerie.getText().toString());
            saveUsuario = sendUser.getText().toString();
            saveSede = sendSede.getText().toString();
            saveModelo = sendModelo.getText().toString();
            saveMarca = sendMarca.getText().toString();


            Call<LectorResponse> inPC = ApiClient.getUserService().insertEquipo(saveEquipo, saveSerie, saveMarca, saveModelo, saveUsuario, saveSede, saveDescripcion);
            inPC.enqueue(new Callback<LectorResponse>() {
                @Override
                public void onResponse(@NonNull Call<LectorResponse> call, @NonNull Response<LectorResponse> response) {
                    if (response.isSuccessful()) {
                        LectorResponse mensage = response.body();
                        assert mensage != null;
                        Toast.makeText(Registro.this, mensage.getMensage() + " " + response.code(), Toast.LENGTH_SHORT).show();
                        hilo();
                        btnNuevo.setEnabled(true);
                        btnSave.setEnabled(false);
                        sendEquipo.setEnabled(false);
                        sendSerie.setEnabled(false);
                        sendMarca.setEnabled(false);
                        sendModelo.setEnabled(false);
                        sendDescripcion.setEnabled(false);
                        sendUser.setEnabled(false);
                        sendSede.setEnabled(false);
                        scanSerie.setEnabled(false);
                    } else {
                        Toast.makeText(Registro.this, "Error: (" + response.code() + ")", Toast.LENGTH_SHORT).show();
                    }
                }

                @Override
                public void onFailure(@NonNull Call<LectorResponse> call, @NonNull Throwable t) {
                    Toast.makeText(Registro.this, "Error Code: " + t.getMessage(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

    public void LastReg() {
        if (Objects.requireNonNull(sendSerie.getText()).toString().isEmpty()) {
            sendSerie.setError("Vacio");
        } else {

            saveSerie = Objects.requireNonNull(sendSerie.getText().toString());

            Call<List<LectorResponse>> last = ApiClient.getUserService().lastReg(saveSerie);
            last.enqueue(new Callback<List<LectorResponse>>() {
                @Override
                public void onResponse(@NonNull Call<List<LectorResponse>> call, @NonNull Response<List<LectorResponse>> response) {
                    if (response.isSuccessful()) {
                        List<LectorResponse> lectorResponses = response.body();
                        assert lectorResponses != null;
                        for (LectorResponse lectorResponse : lectorResponses) {
                            idR = lectorResponse.getId();
                            equipoR = lectorResponse.getEquipo();
                            serieR = lectorResponse.getSerie();
                            marcaR = lectorResponse.getMarca();
                            modeloR = lectorResponse.getModelo();
                            usuarioR = lectorResponse.getUsuario();
                            sedeR = lectorResponse.getSede();
                            descripcionR = lectorResponse.getDescripcion();
                        }
                        if (idR == null) {
                            Toast.makeText(Registro.this, "Error", Toast.LENGTH_SHORT).show();
                        } else {
                            sendID.setText(idR);
                            sendEquipo.setText(equipoR);
                            sendSerie.setText(serieR);
                            sendMarca.setText(marcaR);
                            sendModelo.setText(modeloR);
                            sendUser.setText(usuarioR);
                            sendSede.setText(sedeR);
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
    }

    public void GenerarQR() {
        createQR.destroyDrawingCache();
        try {
            BarcodeEncoder barcodeEncoder = new BarcodeEncoder();
            Bitmap bitmap = barcodeEncoder.encodeBitmap(Objects.requireNonNull(sendID.getText()).toString(), BarcodeFormat.QR_CODE, 600, 600);
            createQR.setImageBitmap(bitmap);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void shareQR() {
        createQR.buildDrawingCache();
        Bitmap bitmap = createQR.getDrawingCache();
        //Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.codigo_qr);
        Intent share = new Intent(Intent.ACTION_SEND);
        share.setType("image/jpeg");
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, bytes);
        String path = MediaStore.Images.Media.insertImage(getContentResolver(), bitmap, "title", null);
        Uri imageUri = Uri.parse(path);
        share.putExtra(Intent.EXTRA_STREAM, imageUri);
        startActivity(Intent.createChooser(share, "select"));
    }

    public void printQR() {
        PrintHelper photoPrinter = new PrintHelper(this);
        photoPrinter.setScaleMode(PrintHelper.SCALE_MODE_FIT);
        //Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.droids);
        createQR.buildDrawingCache();
        Bitmap bitmap = createQR.getDrawingCache();
        photoPrinter.printBitmap("droids.jpg - test print", bitmap);
    }

    public void tag() {
        IntentIntegrator integrador = new IntentIntegrator(Registro.this);
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

        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);

        if (result != null) {
            if (result.getContents() == null) {
                Toast.makeText(this, "Lectura Cancelada", Toast.LENGTH_SHORT).show();
            } else {
                Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    v.vibrate(VibrationEffect.createOneShot(500, VibrationEffect.DEFAULT_AMPLITUDE));
                }
                Toast.makeText(this, "Serie: " + result.getContents(), Toast.LENGTH_SHORT).show();
                sendSerie.setText(result.getContents());
            }
        } else {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }

    public void nuevo() {
        Objects.requireNonNull(sendEquipo.getText()).clear();
        Objects.requireNonNull(sendSerie.getText()).clear();
        Objects.requireNonNull(sendMarca.getText()).clear();
        Objects.requireNonNull(sendModelo.getText()).clear();
        Objects.requireNonNull(sendDescripcion.getText()).clear();
        Objects.requireNonNull(sendUser.getText()).clear();
        Objects.requireNonNull(sendSede.getText()).clear();
        btnSave.setEnabled(true);
        sendEquipo.setEnabled(true);
        sendSerie.setEnabled(true);
        sendMarca.setEnabled(true);
        sendModelo.setEnabled(true);
        sendDescripcion.setEnabled(true);
        sendUser.setEnabled(true);
        sendSede.setEnabled(true);
        scanSerie.setEnabled(true);

    }
}