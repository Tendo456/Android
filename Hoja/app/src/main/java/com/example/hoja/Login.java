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
import com.firebase.ui.auth.AuthUI;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Login extends AppCompatActivity {

    FirebaseAuth mfirebaseAutH;
    FirebaseAuth.AuthStateListener mAuthListener;
    Button cerrarSesion,continuar;
    TextView email,nombre,codigo;
    ImageView foto;

    public static final int REQUEST_CODE = 1234;

    List<AuthUI.IdpConfig> provider = Collections.singletonList(
            new AuthUI.IdpConfig.GoogleBuilder().build()
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        foto = findViewById(R.id.foto);
        email = findViewById(R.id.email);
        nombre = findViewById(R.id.nombre);
        codigo = findViewById(R.id.codigo);
        cerrarSesion = findViewById(R.id.cerrarSesion);
        continuar = findViewById(R.id.continuar);
        mfirebaseAutH  = FirebaseAuth.getInstance();
        mAuthListener = firebaseAuth -> {
            FirebaseUser user = firebaseAuth.getCurrentUser();
            if(user !=null){
                Toast.makeText(Login.this,"Bienvenido",Toast.LENGTH_SHORT).show();
                continuar.setEnabled(true);
                email.setText(user.getEmail());
                nombre.setText(user.getDisplayName());
                codigo.setText(user.getProviderId());
                Glide.with(this).load(user.getPhotoUrl()).into(foto);

            }
            else{
                startActivityForResult(AuthUI.getInstance()
                        .createSignInIntentBuilder()
                        .setAvailableProviders(provider)
                        .setIsSmartLockEnabled(false)
                        .build(),REQUEST_CODE
                );
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