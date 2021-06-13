package com.example.aksharas.quiz;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.aksharas.R;

import com.example.aksharas.learning;

public class Question2 extends AppCompatActivity {

    public static final String SHARED_PREFS_POINTS = "sharedprefsp";
    public static final String SHARED_PREFS_CURRENCY = "sharedprefsc";
    public static final String CURRENCY = "0";
    public static final String POINTS = "0";
    String currency = "", points = "";
    TextView score1, score2;

    Button boy1,girl1,fruit1,back1,nxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);

        currency = getIntent().getExtras().getString("currency");
        points = getIntent().getExtras().getString("points");
        save();
        load();
        updateViews();

        boy1 = (Button) findViewById(R.id.boy12);
        boy1.setOnClickListener(v -> openboyW());

        girl1 = (Button) findViewById(R.id.girl12);
        girl1.setOnClickListener(v -> opengirlC());

        fruit1 = (Button) findViewById(R.id.fruit12);
        fruit1.setOnClickListener(v -> openfruitW());

        back1 = (Button) findViewById(R.id.back12);
        back1.setOnClickListener(v -> openmain());

        nxt = (Button) findViewById(R.id.nxt2);
        nxt.setOnClickListener(v -> opennext());


    }

    public void openboyW(){
        Intent intent = new Intent(this, boyW.class);
        intent.putExtra("currency", currency);
        intent.putExtra("points", points);
        startActivity(intent);
    }

    public void opengirlC(){
        Intent intent = new Intent(this, girlC.class);
        intent.putExtra("currency", currency);
        intent.putExtra("points", points);
        startActivity(intent);
    }

    public void openfruitW(){
        Intent intent = new Intent(this, fruitW.class);
        intent.putExtra("currency", currency);
        intent.putExtra("points", points);
        startActivity(intent);
    }

    public void openmain(){
        Intent intent = new Intent(this, learning.class);
        startActivity(intent);
    }

    public void opennext(){
        Intent intent = new Intent(this, Question3.class);
        startActivity(intent);
    }

    public void save()
    {
        SharedPreferences sp1 = getSharedPreferences(SHARED_PREFS_POINTS, MODE_PRIVATE);
        SharedPreferences sp2 = getSharedPreferences(SHARED_PREFS_CURRENCY, MODE_PRIVATE);
        SharedPreferences.Editor e1 = sp1.edit();
        SharedPreferences.Editor e2 = sp2.edit();
        e1.putString(POINTS, points);
        e2.putString(CURRENCY, currency);
        e1.apply();
        e2.apply();
    }
    public void load()
    {
        SharedPreferences sp1 = getSharedPreferences(SHARED_PREFS_POINTS, MODE_PRIVATE);
        SharedPreferences sp2 = getSharedPreferences(SHARED_PREFS_CURRENCY, MODE_PRIVATE);
        points = sp1.getString(POINTS, "0");
        currency = sp2.getString(CURRENCY, "0");
    }
    public void updateViews()
    {
        score1 = (TextView)findViewById(R.id.score7);
        score2 = (TextView)findViewById(R.id.score8);
        score1.setText("Points: ".concat(points));
        score2.setText("Currency: ".concat(currency));
    }
}

