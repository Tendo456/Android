package com.example.hoja;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.firebase.ui.auth.AuthUI;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Login extends AppCompatActivity {

    private GoogleApiClient googleApiClient;
    private FirebaseAuth mfirebaseAutH;
    private FirebaseAuth.AuthStateListener mAuthListener;
    Button cerrarSesion;
    TextView email,nombre,codigo;
    ImageView foto,imgUser;
    FloatingActionButton continuar;


    public static final int REQUEST_CODE = 1234;

    List<AuthUI.IdpConfig> provider = Arrays.asList(
            new AuthUI.IdpConfig.GoogleBuilder().build(),
            new AuthUI.IdpConfig.EmailBuilder().build()
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        foto = findViewById(R.id.foto);
        imgUser = findViewById(R.id.imgUser);
        email = findViewById(R.id.email);
        nombre = findViewById(R.id.nombre);
        codigo = findViewById(R.id.codigo);
        cerrarSesion = findViewById(R.id.cerrarSesion);
        continuar = findViewById(R.id.continuar);

        String urlIMG = "http://190.119.144.250:83/hoja_evaluacion/img/user.png";

        mfirebaseAutH = FirebaseAuth.getInstance();

        //google.setOnClickListener(v -> {});


        mAuthListener = firebaseAuth -> {
            FirebaseUser user = firebaseAuth.getCurrentUser();
            if (user != null) {

                continuar.setEnabled(true);
                email.setText(user.getEmail());
                nombre.setText(user.getDisplayName());
                codigo.setText(user.getProviderId());
                Glide.with(this).load(user.getPhotoUrl()).apply(RequestOptions.circleCropTransform()).into(imgUser);
                Toast.makeText(Login.this, "Bienvenido "+user.getDisplayName(), Toast.LENGTH_SHORT).show();

            } else {
                startActivityForResult(AuthUI.getInstance()
                        .createSignInIntentBuilder()
                        .setAvailableProviders(provider)
                        .setIsSmartLockEnabled(false)
                        .build(), REQUEST_CODE);
                Glide.with(this).load(urlIMG).apply(RequestOptions.circleCropTransform()).into(imgUser);
            }
        };

        cerrarSesion.setOnClickListener(v -> cerrarsesion());
        continuar.setOnClickListener(v -> continuar());

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

        AuthUI.getInstance().signOut(this).addOnCompleteListener(task -> Toast.makeText(Login.this,"Sesion Cerrada", Toast.LENGTH_SHORT).show());
    }
    public void continuar (){
        Intent intent = new Intent(Login.this, MainActivity.class);
        startActivity(intent);
    }

}