package com.example.quickchangeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    RelativeLayout layout;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = findViewById(R.id.layout);
        radioGroup = findViewById(R.id.rgroup);

       radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(RadioGroup group, int checkedId) {
               switch (checkedId){
                   case R.id.rbtnblue:
                       layout.setBackgroundColor(Color.parseColor("#74B9FF"));
                       break;
                   case R.id.rbtnred:
                       layout.setBackgroundColor(Color.parseColor("#FF3E4D"));
                       break;
                   case R.id.rbtngreen:
                       layout.setBackgroundColor(Color.parseColor("#45CE30"));
                       break;
               }
           }
       });
    }
}
