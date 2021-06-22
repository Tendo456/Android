package com.example.string_split;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    String cadena;
    String[] s1;
    String s2;
    String s3;
    String s4;
    String s5;
    String s6;
    String s7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void count( String args[]){
        cadena = "1-2-3-4-";
        String[] srt = cadena.split("-");

        for(int i=0; i<srt.length; i++){
            s1[i]=srt[1];
        }
    }
}