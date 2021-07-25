package com.example.prueba4;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast toast = Toast.makeText(this,"Sin Conexión a Internet X",Toast.LENGTH_SHORT);
        View view = toast.getView();
        //TextView text = view.findViewById(android.R.id.message);
        //text.setTextColor(Color.WHITE);
        view.getBackground().setColorFilter(Color.parseColor("#B71C1C"), PorterDuff.Mode.SRC_IN);
        toast.show();
    }
}