package com.example.horas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    TextView uno;
    String time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uno = findViewById(R.id.uno);
        hora();

    }

    public void hora() {
        long total = new Date("2018/09/14 01:10:20").getTime() - new Date("2018/09/13 10:14:00").getTime();
        long horas = TimeUnit.MINUTES.convert(total, TimeUnit.MILLISECONDS);
        //System.out.println("Diferencia en horas: " + horas);
        time = String.valueOf(horas);

        uno.setText("minutos "+time);
    }
}