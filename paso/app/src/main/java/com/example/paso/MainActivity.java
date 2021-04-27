package com.example.paso;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

import com.baoyachi.stepview.HorizontalStepView;
import com.baoyachi.stepview.VerticalStepView;
import com.baoyachi.stepview.bean.StepBean;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    HorizontalStepView horizontalStepView;
    RadioButton pr1,pr2,pr3,pr4,pr5;
    int p1=-1,p2=-1,p3=-1,p4=-1,p5=-1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        horizontalStepView = findViewById(R.id.horizontalStepView);
        pr1 = findViewById(R.id.pr1);
        pr2 = findViewById(R.id.pr2);
        pr3 = findViewById(R.id.pr3);
        pr4 = findViewById(R.id.pr4);
        pr5 = findViewById(R.id.pr5);

        estado();
        
    }

    public void radio (View view){
        if(pr1.isChecked()){
            p1=1;
            p2=0;
            p3=-1;
            estado();
        }else if(pr2.isChecked()){
            p2=1;
            p3=0;
            p4=-1;
            estado();
        }else if(pr3.isChecked()){
            p3=1;
            p4=0;
            estado();
        }else if(pr4.isChecked()){
            p4=1;
            p5=0;

            estado();
        }else if(pr5.isChecked()){
            p5=1;
            estado();
        }
    }

    public void estado(){
        List<StepBean> sources = new ArrayList<>();
        sources.add(new StepBean("Start",p1));
        sources.add(new StepBean("Desing",p2));
        sources.add(new StepBean("Coding",p3));
        sources.add(new StepBean("Testing",p4));
        sources.add(new StepBean("Delivery",p5));

        horizontalStepView.setStepViewTexts(sources)
                .setTextSize(12)
                .setStepsViewIndicatorCompletedLineColor(Color.parseColor("#FFFF00"))
                .setStepViewComplectedTextColor(Color.parseColor("#FFFF00"))
                .setStepViewUnComplectedTextColor(ContextCompat.getColor(this,R.color.uncompleted_text_color))
                .setStepsViewIndicatorCompletedLineColor(Color.parseColor("#FFFF00"))
                .setStepsViewIndicatorCompleteIcon(ContextCompat.getDrawable(this,R.drawable.complted))
                .setStepsViewIndicatorAttentionIcon(ContextCompat.getDrawable(this,R.drawable.attention))
                .setStepsViewIndicatorDefaultIcon(ContextCompat.getDrawable(this,R.drawable.default_icon));
    }
}