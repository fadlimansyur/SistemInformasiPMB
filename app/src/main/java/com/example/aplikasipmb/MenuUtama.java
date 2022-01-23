package com.example.aplikasipmb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


import android.content.Intent;

import android.os.Bundle;

import android.view.View;

import android.widget.Button;

import android.widget.EditText;

import android.widget.Toast;

public class MenuUtama extends AppCompatActivity {
    private CardView btn1, btn2, btn3, btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);
        Button logout=findViewById(R.id.logout);
        btn1 =findViewById(R.id.btn1);
        btn2 =findViewById(R.id.btn2);
        btn3 =findViewById(R.id.btn3);
        btn4 =findViewById(R.id.btn4);



        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    startActivity(new Intent(MenuUtama.this, MainActivity.class));
                }
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    startActivity(new Intent(MenuUtama.this, profilte.class));
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    startActivity(new Intent(MenuUtama.this, infopendaftaran.class));
                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    startActivity(new Intent(MenuUtama.this, p2kk.class));
                }
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    startActivity(new Intent(MenuUtama.this, pesmaba.class));
                }
            }
        });

    }
}