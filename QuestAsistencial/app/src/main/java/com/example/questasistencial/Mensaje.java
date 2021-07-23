package com.example.questasistencial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Mensaje extends AppCompatActivity {

    TextView gracias;
    String places;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_mensaje);

        Animation animation1 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_arriba);
        Animation animation2 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_abajo);

        places = getIntent().getStringExtra("place");

        gracias = findViewById(R.id.gracias);
        ImageView logo1 = findViewById(R.id.logo1);
        ImageView aspa = findViewById(R.id.aspa);

        if(places.equals("Expats")){
            gracias.setText("Thanks");
        }else {
            gracias.setText("Gracias");
        }

        logo1.setAnimation(animation1);
        aspa.setAnimation(animation2);
        gracias.setAnimation(animation2);


        new Handler().postDelayed(() -> {
            Intent intent = new Intent(Mensaje.this, MainActivity.class);
            startActivity(intent);
            finish();
        }, 4000);
    }
}