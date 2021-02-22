package com.example.temperaturas.Actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.temperaturas.R;

public class inicio extends AppCompatActivity {

    TextView tendo;
    ImageView logo;
    SoundPool sp;
    int sonido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_inicio);

        repro();

        Animation animation1 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_arriba);
        Animation animation2 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_abajo);

        tendo = findViewById(R.id.tendo);
        logo = findViewById(R.id.logo);

        logo.setAnimation(animation1);
        tendo.setAnimation(animation2);

        new Handler().postDelayed(() -> {
            Intent intent = new Intent(inicio.this, Seleccion.class);
            startActivity(intent);
            finish();
        },4000);

    }

    public void repro(){
        MediaPlayer mp = MediaPlayer.create(this, R.raw.windows_xp);
        mp.start();
    }
}