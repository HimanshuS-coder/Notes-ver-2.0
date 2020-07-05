package com.example.noteme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import static maes.tech.intentanim.CustomIntent.customType;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 2000;

    ImageView logo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logo = findViewById(R.id.imageView);

        logo.animate().alpha(1).setDuration(1000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent go =new Intent(getApplicationContext() , slider.class);
                startActivity(go);
                customType(MainActivity.this,"fadein-to-fadeout");
                finish();
            }
        },SPLASH_TIME_OUT);

    }
}