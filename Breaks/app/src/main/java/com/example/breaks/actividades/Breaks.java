package com.example.breaks.actividades;

import androidx.appcompat.app.AppCompatActivity;

import com.example.breaks.R;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Breaks extends AppCompatActivity {

    TextView BTiempo,BProg;

    String Bdate, Btime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breaks);

        BTiempo = findViewById(R.id.BTiempo);
        BProg = findViewById(R.id.BProg);

        Bfecha();
        Bhora();
    }

    public void Bfecha (){
        final Calendar calendar = Calendar.getInstance();
        @SuppressLint("SimpleDateFormat") Format formatter = new SimpleDateFormat("yyyy-MM-dd");
        Bdate = formatter.format(calendar.getTime());
        //date.setText(s);
    }

    public void Bhora (){
        Date date = new Date();
        @SuppressLint("SimpleDateFormat") Format h = new SimpleDateFormat("HH:mm:ss");
        Btime = h.format(date);
        //time.setText(ho);

        BTiempo.setText(Bdate+" "+Btime);
    }
}