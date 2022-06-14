package com.example.laboratoriomolecular.Actividades;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.laboratoriomolecular.R;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        Animation animation1 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_arriba);
        Animation animation2 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_abajo);

        TextView tendo = findViewById(R.id.tendo);
        ImageView logo = findViewById(R.id.logo);

        tendo.setAnimation(animation2);
        logo.setAnimation(animation1);

        new Handler().postDelayed(() -> {
            Intent intent = new Intent(MainActivity.this, Formularios.class);
            startActivity(intent);
            finish();
        }, 5000);

    }




}