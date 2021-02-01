package com.example.hojadecalificacion;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.firebase.ui.auth.AuthUI;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.Arrays;
import java.util.List;

import cz.msebera.android.httpclient.auth.AUTH;

public class Login extends AppCompatActivity {
    FirebaseAuth mfirebaseAutH;
    FirebaseAuth.AuthStateListener mAuthListener;

    public static final int REQUEST_CODE = 1234;

    List<AuthUI.IdpConfig> provider = Arrays.asList(
    new AuthUI.IdpConfig.FacebookBuilder().build(),
            new AuthUI.IdpConfig.GoogleBuilder().build()
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mfirebaseAutH  = FirebaseAuth.getInstance();
        mAuthListener = firebaseAuth -> {
            FirebaseUser user = firebaseAuth.getCurrentUser();
            if(user != null){
                Toast.makeText(Login.this,"Bienvenido",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Login.this, MainActivity.class);
                startActivity(intent);
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

    public void cerrarsession (View view){

        AuthUI.getInstance().signOut(this).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                Toast.makeText(Login.this,"Sesion Cerrada", Toast.LENGTH_SHORT).show();
            }
        });

    }
}