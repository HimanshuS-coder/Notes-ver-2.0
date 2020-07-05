package com.example.noteme;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;


public class Login2 extends AppCompatActivity {
    ImageView back_arrow;
    TextView register_text;
    TextView hello_title;
    EditText usernam;
    TextInputLayout passwor;
    Button login_but;

    public void back (View view){
        Intent goback = new Intent(Login2.this,Login1.class);

        startActivity(goback);
        overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
    }

    public void reg (View view){
        Intent registerbut = new Intent(Login2.this,Register.class);

        Pair [] pairs = new Pair[4];

        pairs[0] = new Pair<View , String> (hello_title,"title");
        pairs[1] = new Pair<View , String> (usernam,"user_name");
        pairs[2] = new Pair<View , String> (passwor,"pass_word");
        pairs[3] = new Pair<View , String> (login_but,"login_button");


        ActivityOptions options =ActivityOptions.makeSceneTransitionAnimation(Login2.this,pairs);

        startActivity(registerbut , options.toBundle());
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        back_arrow=findViewById(R.id.back_arrow1);
        register_text = findViewById(R.id.register_textview);
        hello_title = findViewById(R.id.hello_title);
        usernam = findViewById(R.id.username1);
        passwor = findViewById(R.id.password_editText);
        login_but = findViewById(R.id.loginbutton2);

    }
}