package com.example.temperaturas.Actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.temperaturas.R;

import java.util.Objects;

public class inicio extends AppCompatActivity {

    TextView tendo;
    ImageView logo;
    private Window window;
    String primaryDark = "#3F51B5";
    String primary = "#3F51B5";
    String background = "#303F9F";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_inicio);

        repro();

        this.window = getWindow();

        Objects.requireNonNull(getSupportActionBar()).setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.logo);

        color(primaryDark,primary,background);

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
        },5000);

    }

    public void repro(){
        MediaPlayer mp = MediaPlayer.create(this, R.raw.windows_xp);
        mp.start();
    }

    public void color (String primaryDark, String primary, String background){

        window.setStatusBarColor(Color.parseColor(primaryDark));

        Objects.requireNonNull(getSupportActionBar()).setBackgroundDrawable(new ColorDrawable(Color.parseColor(primary)));

        //window.setBackgroundDrawable(new ColorDrawable(Color.parseColor(background)));

        window.setNavigationBarColor(Color.parseColor(primary));

    }
}