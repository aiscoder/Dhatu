package com.example.aksharas.quiz;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.aksharas.R;
import com.example.aksharas.learning;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class QuestionPage extends AppCompatActivity
{
    public static final String SHARED_PREFS_POINTS = "sharedprefsp";
    public static final String SHARED_PREFS_CURRENCY = "sharedprefsc";
    public static final String CURRENCY = "0";
    public static final String POINTS = "0";
    String currency = "", points = "";
    Button boy1,girl1,fruit1,back1,next1;
    TextView score1, score2;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions1);

        boy1 = (Button) findViewById(R.id.boy1);
        boy1.setOnClickListener(v -> openboyC());

        girl1 = (Button) findViewById(R.id.girl1);
        girl1.setOnClickListener(v -> opengirlW());

        fruit1 = (Button) findViewById(R.id.fruit1);
        fruit1.setOnClickListener(v -> openfruitW());

        back1 = (Button) findViewById(R.id.back1);
        back1.setOnClickListener(v -> openmain());

        next1 = (Button) findViewById(R.id.next1);
        next1.setOnClickListener(v -> opennext());

        load();
        updateViews();

    }

    public void openboyC(){
        Intent intent = new Intent(this, boyC.class);
        intent.putExtra("currency", currency);
        intent.putExtra("points", points);
        startActivity(intent);
    }

    public void opengirlW(){
        Intent intent = new Intent(this, girlW.class);
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
        Intent intent = new Intent(this, Question2.class);
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
        score1 = (TextView)findViewById(R.id.score1);
        score2 = (TextView)findViewById(R.id.score2);
        score1.setText("Points: ".concat(points));
        score2.setText("Currency: ".concat(currency));
    }
}