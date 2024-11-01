package com.example.inventarioqr.Actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.inventarioqr.R;
import com.firebase.ui.auth.AuthUI;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.Arrays;
import java.util.List;

public class Logueo extends AppCompatActivity {

    private FirebaseAuth mfirebaseAutH;
    private FirebaseAuth.AuthStateListener mAuthListener;
    TextView email,nombre,codigo;
    ImageView foto,imgUser;
    FloatingActionButton continuar,cerrar;
    String urlIMG = "http://190.119.144.250:83/hoja_evaluacion/img/user.png";
    private Window window;
    public static final int REQUEST_CODE = 5678;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logueo);

        this.window = getWindow();

        foto = findViewById(R.id.foto);
        imgUser = findViewById(R.id.imgUser);
        email = findViewById(R.id.email);
        nombre = findViewById(R.id.nombre);
        codigo = findViewById(R.id.codigo);
        continuar = findViewById(R.id.continuar);
        cerrar = findViewById(R.id.cerrar);

        continuar.setOnClickListener(v -> continuar());
        cerrar.setOnClickListener(v -> cerrarsesion());

        sesion();
    }

    private void  sesion(){

        List<AuthUI.IdpConfig> provider = Arrays.asList(
                //new AuthUI.IdpConfig.GoogleBuilder().build(),
                //new AuthUI.IdpConfig.EmailBuilder().build(),
                new AuthUI.IdpConfig.MicrosoftBuilder().build());

        //https://origen-isos1.firebaseapp.com/__/auth/handler

        mfirebaseAutH = FirebaseAuth.getInstance();


        mAuthListener = firebaseAuth -> {
            FirebaseUser user = firebaseAuth.getCurrentUser();
            if (user != null) {

                continuar.setEnabled(true);
                continuar.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.indigo_500)));
                cerrar.setEnabled(true);
                cerrar.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.indigo_500)));
                email.setText(user.getEmail());
                nombre.setText(user.getDisplayName());
                codigo.setText(user.getProviderId());
                Glide.with(this).load(user.getPhotoUrl()).apply(RequestOptions.circleCropTransform()).into(imgUser);
                Toast.makeText(Logueo.this, "Bienvenido "+user.getDisplayName(), Toast.LENGTH_SHORT).show();

            } else {
                continuar.setEnabled(false);
                continuar.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.gray_500)));
                cerrar.setEnabled(false);
                cerrar.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.gray_500)));
                startActivityForResult(AuthUI.getInstance()
                        .createSignInIntentBuilder()
                        .setAvailableProviders(provider)
                        .setIsSmartLockEnabled(false)
                        .build(), REQUEST_CODE);
                Glide.with(this).load(urlIMG).apply(RequestOptions.circleCropTransform()).into(imgUser);
            }
        };
    }

    @Override
    protected void onStart() {

        super.onStart();
        mfirebaseAutH.addAuthStateListener(mAuthListener);

    }

    @Override
    protected void onPause() {

        super.onPause();
        mfirebaseAutH.removeAuthStateListener(mAuthListener);

    }

    public void cerrarsesion (){

        AuthUI.getInstance().signOut(this).addOnCompleteListener(task -> Toast.makeText(Logueo.this,"Sesion Cerrada", Toast.LENGTH_SHORT).show());
        finish();
    }

    public void continuar (){
        Intent intent = new Intent(Logueo.this, Menu.class);
        intent.putExtra("EmailUser",email.getText().toString());
        startActivity(intent);

    }

}