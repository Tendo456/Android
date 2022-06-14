package com.example.tendo21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.shuhart.stepview.StepView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    StepView step_view;
    int count = 0;
    Button next,back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        step_view = findViewById(R.id.step_view);
        next = findViewById(R.id.next);
        back = findViewById(R.id.back);

        step_view.setOnStepClickListener(step -> {
            Toast.makeText(MainActivity.this, "Step " + step, Toast.LENGTH_SHORT).show();
        });

        paso();

    }

    public void paso(){

        next.setOnClickListener(v -> {
            if (count < step_view.getStepCount() -1){
                count++;
                step_view.go(count,true);
            } else {
                step_view.done(true);
            }
        });

        back.setOnClickListener(v -> {
            if(count > 0){
                count--;
            }
            step_view.done(false);
            step_view.go(count,true);
        });


    }
}