package com.example.ingreso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class iniciar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_iniciar);

        Animation animation1 = AnimationUtils.loadAnimation(this, R.anim.desplazar_arriba);
        Animation animation2 = AnimationUtils.loadAnimation(this, R.anim.desplazar_abajo);

        TextView tendo = findViewById(R.id.tendo);
        ImageView logo = findViewById(R.id.logo);

        tendo.setAnimation(animation2);
        logo.setAnimation(animation1);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(iniciar.this, login.class);
                startActivity(intent);
                finish();
            }
        }, 4000);
    }
}