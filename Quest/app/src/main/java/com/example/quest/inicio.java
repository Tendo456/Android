package com.example.quest;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class inicio extends AppCompatActivity {

    TextView tendo, texto;
    ImageView logo;
    Button continuar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_inicio);

        Animation animation1 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_arriba);
        Animation animation2 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_abajo);

        tendo = findViewById(R.id.tendo);
        logo = findViewById(R.id.logo);
        continuar = findViewById(R.id.continuar);
        texto = findViewById(R.id.texto);


        logo.setAnimation(animation1);
        texto.setAnimation(animation1);
        tendo.setAnimation(animation2);
        continuar.setAnimation(animation2);

        continuar.setOnClickListener(v -> continuar());


    }

    private void continuar (){
        Intent intent = new Intent(inicio.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}