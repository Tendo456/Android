package com.example.temperaturas.Actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.temperaturas.R;
import com.firebase.ui.auth.AuthUI;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Terceros extends AppCompatActivity {

    private FirebaseAuth mfirebaseAutH;
    private FirebaseAuth.AuthStateListener mAuthListener;
    Button cerrarSesion;
    TextView email,nombre,codigo;
    ImageView foto,imgUser;
    FloatingActionButton continuar;
    String urlIMG = "http://190.119.144.250:83/hoja_evaluacion/img/user.png";

    public static final int REQUEST_CODE = 1234;

    List<AuthUI.IdpConfig> provider = Arrays.asList(
            new AuthUI.IdpConfig.GoogleBuilder().build(),
            new AuthUI.IdpConfig.EmailBuilder().build()
            //new AuthUI.IdpConfig.MicrosoftBuilder().build()

            //https://origen-isos1.firebaseapp.com/__/auth/handler
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceros);

        Objects.requireNonNull(getSupportActionBar()).setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.logo);

        foto = findViewById(R.id.foto);
        imgUser = findViewById(R.id.imgUser);
        email = findViewById(R.id.email);
        nombre = findViewById(R.id.nombre);
        codigo = findViewById(R.id.codigo);
        cerrarSesion = findViewById(R.id.cerrarSesion);
        continuar = findViewById(R.id.continuar);





        cerrarSesion.setOnClickListener(v -> cerrarsesion());
        continuar.setOnClickListener(v -> continuar());

        sesion();


    }

    private void  sesion(){
        mfirebaseAutH = FirebaseAuth.getInstance();


        mAuthListener = firebaseAuth -> {
            FirebaseUser user = firebaseAuth.getCurrentUser();
            if (user != null) {

                continuar.setEnabled(true);
                email.setText(user.getEmail());
                nombre.setText(user.getDisplayName());
                codigo.setText(user.getProviderId());
                Glide.with(this).load(user.getPhotoUrl()).apply(RequestOptions.circleCropTransform()).into(imgUser);
                Toast.makeText(Terceros.this, "Bienvenido "+user.getDisplayName(), Toast.LENGTH_SHORT).show();

            } else {
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
    protected void onResume() {
        super.onResume();
        mfirebaseAutH.addAuthStateListener(mAuthListener);
    }

    @Override
    protected void onPause() {
        super.onPause();
        mfirebaseAutH.removeAuthStateListener(mAuthListener);
    }

    public void cerrarsesion (){

        AuthUI.getInstance().signOut(this).addOnCompleteListener(task -> Toast.makeText(Terceros.this,"Sesion Cerrada", Toast.LENGTH_SHORT).show());
        finish();
    }
    public void continuar (){
        Intent intent = new Intent(Terceros.this, listar.class);
        intent.putExtra("DisplayUser",nombre.getText().toString());
        intent.putExtra("EmailUser",email.getText().toString());
        startActivity(intent);

    }

    @Override
    public void onBackPressed() {
        cerrarsesion();
        super.onBackPressed();
    }
}