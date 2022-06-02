package com.example.materialdesign2.Part01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.materialdesign2.R;


public class Login_Ebook_Activity extends AppCompatActivity {

    CardView cardLogin, cardRegister;
    Button btnLogin, btnRegister;
    ImageView imgBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_ebook);

        btnLogin = findViewById(R.id.btn_Login);
        btnRegister = findViewById(R.id.btn_register);

        cardLogin = findViewById(R.id.card_Login);
        cardRegister = findViewById(R.id.card_Register);

        imgBack = findViewById(R.id.img_Back);

        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cardRegister.setVisibility(View.GONE);
                cardLogin.setVisibility(View.VISIBLE);
            }
        });


        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cardLogin.setVisibility(View.GONE);
                cardRegister.setVisibility(View.VISIBLE);
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Login_Ebook_Activity.this, Home_Ebook_Activity.class));
            }
        });
    }
}