package com.example.tendo21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.shuhart.stepview.StepView;

public class MainActivity extends AppCompatActivity {

    StepView step_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        step_view = findViewById(R.id.step_view);

        step_view.setOnStepClickListener(step -> {

        });
    }
}