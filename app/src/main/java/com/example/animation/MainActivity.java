package com.example.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView welcome;

    Button Scale,Rotate,Translate,Alpha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        welcome = findViewById(R.id.welcome);
        Scale = findViewById(R.id.Scale);
        Rotate = findViewById(R.id.Rotate);
        Translate = findViewById(R.id.Translate);
        Alpha = findViewById(R.id.Alpha);

        Scale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Animation scale = AnimationUtils.loadAnimation(MainActivity.this,R.anim.scale);
                welcome.startAnimation(scale);
            }
        });

        Rotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Animation rotate = AnimationUtils.loadAnimation(MainActivity.this,R.anim.rotate);
                welcome.startAnimation(rotate);
            }
        });

        Translate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Animation translate = AnimationUtils.loadAnimation(MainActivity.this,R.anim.translate);
                welcome.startAnimation(translate);
            }
        });

        Alpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Animation alpha = AnimationUtils.loadAnimation(MainActivity.this,R.anim.alpha);
                welcome.startAnimation(alpha);
            }
        });

    }
}