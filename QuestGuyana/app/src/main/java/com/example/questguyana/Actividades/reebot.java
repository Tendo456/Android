package com.example.questguyana.Actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.questguyana.R;

public class reebot extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_reebot);

        Animation animation1 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_arriba);
        Animation animation2 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_abajo);

        TextView gracias = findViewById(R.id.gracias);
        ImageView logo1 = findViewById(R.id.logo1);
        ImageView aspa = findViewById(R.id.aspa);

        logo1.setAnimation(animation1);
        aspa.setAnimation(animation2);
        gracias.setAnimation(animation2);


        new Handler().postDelayed(() -> {
            Intent intent = new Intent(reebot.this, Quest.class);
            startActivity(intent);
            finish();
        }, 4000);
    }
}