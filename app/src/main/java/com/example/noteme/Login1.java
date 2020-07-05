package com.example.noteme;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Login1 extends AppCompatActivity {
    Button loginbutton;
    TextView welcome;
    static ActivityOptions option;

    @Override
    public void finish() {
        super.finish();
        Intent go =new Intent(getApplicationContext(),slider.class);
        startActivity(go);
        overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login1);
        loginbutton =findViewById(R.id.loginbutton);
        welcome =findViewById(R.id.welcome_textview);

        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go=new Intent(Login1.this,Login2.class);


                Pair[] pairs =new Pair[2];

                pairs [0] = new Pair<View , String> (loginbutton,"login_button");
                pairs [1] = new Pair<View , String> (welcome,"title");

                option = ActivityOptions.makeSceneTransitionAnimation(Login1.this,pairs);
                startActivity(go ,option.toBundle());

            }
        });
    }
}