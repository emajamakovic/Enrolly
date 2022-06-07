package com.example.enrolly;

import static com.example.enrolly.R.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Interesi extends AppCompatActivity  implements View.OnClickListener {

    Button registracija, umjetnost, arhitektura, pravo, muzika, filozofija, novinarstvo, modniDizajn, grafickiDizajn, matematika, fizika, medicina, jezici;

    int clicked = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_interesi);

        registracija = findViewById(id.registracija);
        umjetnost = findViewById(id.umjetnost);
        arhitektura = findViewById(id.arhitektura);
        pravo = findViewById(id.pravo);
        muzika = findViewById(id.muzika);
        filozofija = findViewById(id.filozofija);
        novinarstvo = findViewById(id.novinarstvo);
        modniDizajn = findViewById(id.modni_dizajn);
        grafickiDizajn = findViewById(id.graficki_dizajn);
        matematika = findViewById(id.matematika);
        fizika = findViewById(id.fizika);
        medicina = findViewById(id.medicina);
        jezici = findViewById(id.jezici);

        umjetnost.setOnClickListener(this);
        arhitektura.setOnClickListener(this);
        pravo.setOnClickListener(this);
        muzika.setOnClickListener(this);
        filozofija.setOnClickListener(this);
        novinarstvo.setOnClickListener(this);
        modniDizajn.setOnClickListener(this);
        grafickiDizajn.setOnClickListener(this);
        matematika.setOnClickListener(this);
        fizika.setOnClickListener(this);
        medicina.setOnClickListener(this);
        jezici.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        clicked += 1;
        if(clicked > 2) clicked = 1;

        switch (v.getId()) {
            case id.umjetnost:
                if (clicked == 1) {
                    umjetnost.setBackgroundDrawable(getResources().getDrawable(drawable.btn_bg_cselected));
                } else {
                    umjetnost.setBackgroundDrawable(getResources().getDrawable(drawable.btn_bg));
                }
                break;
            case id.arhitektura:
                if (clicked == 1) {
                    arhitektura.setBackgroundDrawable(getResources().getDrawable(drawable.btn_bg_cselected));
                } else {
                    arhitektura.setBackgroundDrawable(getResources().getDrawable(drawable.btn_bg));
                }
                break;
            case id.pravo:
                if (clicked == 1) {
                    pravo.setBackgroundDrawable(getResources().getDrawable(drawable.btn_bg_cselected));
                } else {
                    pravo.setBackgroundDrawable(getResources().getDrawable(drawable.btn_bg));
                }
                break;
            case id.muzika:
                if (clicked == 1) {
                    muzika.setBackgroundDrawable(getResources().getDrawable(drawable.btn_bg_cselected));
                } else {
                    muzika.setBackgroundDrawable(getResources().getDrawable(drawable.btn_bg));
                }
                break;
            case id.filozofija:
                if (clicked == 1) {
                    filozofija.setBackgroundDrawable(getResources().getDrawable(drawable.btn_bg_cselected));
                } else {
                    filozofija.setBackgroundDrawable(getResources().getDrawable(drawable.btn_bg));
                }
                break;
            case id.novinarstvo:
                if (clicked == 1) {
                    novinarstvo.setBackgroundDrawable(getResources().getDrawable(drawable.btn_bg_cselected));
                } else {
                    novinarstvo.setBackgroundDrawable(getResources().getDrawable(drawable.btn_bg));
                }
                break;
            case id.modni_dizajn:
                if (clicked == 1) {
                    modniDizajn.setBackgroundDrawable(getResources().getDrawable(drawable.btn_bg_cselected));
                } else {
                    modniDizajn.setBackgroundDrawable(getResources().getDrawable(drawable.btn_bg));
                }
                break;
            case id.graficki_dizajn:
                if (clicked == 1) {
                    grafickiDizajn.setBackgroundDrawable(getResources().getDrawable(drawable.btn_bg_cselected));
                } else {
                    grafickiDizajn.setBackgroundDrawable(getResources().getDrawable(drawable.btn_bg));
                }
                break;
            case id.matematika:
                if (clicked == 1) {
                    matematika.setBackgroundDrawable(getResources().getDrawable(drawable.btn_bg_cselected));
                } else {
                    matematika.setBackgroundDrawable(getResources().getDrawable(drawable.btn_bg));
                }
                break;
            case id.fizika:
                if (clicked == 1) {
                    fizika.setBackgroundDrawable(getResources().getDrawable(drawable.btn_bg_cselected));
                } else {
                    fizika.setBackgroundDrawable(getResources().getDrawable(drawable.btn_bg));
                }
                break;
            case id.medicina:
                if (clicked == 1) {
                    medicina.setBackgroundDrawable(getResources().getDrawable(drawable.btn_bg_cselected));
                } else {
                    medicina.setBackgroundDrawable(getResources().getDrawable(drawable.btn_bg));
                }
                break;
            case id.jezici:
                if (clicked == 1) {
                    jezici.setBackgroundDrawable(getResources().getDrawable(drawable.btn_bg_cselected));
                } else {
                    jezici.setBackgroundDrawable(getResources().getDrawable(drawable.btn_bg));
                }
                break;
        }


    }


    public void onRegistrujse(View view) {
        Intent intent=new Intent(this, Dashboard.class);
        startActivity(intent);
    }

    public void onSkip(View view) {
        Intent intent=new Intent(this, Dashboard.class);
        startActivity(intent);
    }
}