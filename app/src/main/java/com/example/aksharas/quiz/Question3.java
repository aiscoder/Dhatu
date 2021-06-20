package com.example.aksharas.quiz;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.aksharas.R;

import com.example.aksharas.learning;

public class Question3 extends AppCompatActivity {
    public static final String SHARED_PREFS_POINTS = "sharedprefsp";
    public static final String SHARED_PREFS_CURRENCY = "sharedprefsc";
    public static final String SHARED_PREFS_RIGHT = "sharedprefsr";
    public static final String CURRENCY = "0";
    public static final String POINTS = "0";
    public static final String RIGHT = "0";
    String currency = "", points = "", right = "";
    TextView score1, score2;

    Button boy1,girl1,fruit1,back1,nxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);

        currency = getIntent().getExtras().getString("currency");
        points = getIntent().getExtras().getString("points");
        right = "2";

        save();
        load();
        updateViews();

        boy1 = (Button) findViewById(R.id.boy13);
        boy1.setOnClickListener(v -> openboyW());

        girl1 = (Button) findViewById(R.id.girl13);
        girl1.setOnClickListener(v -> opengirlW());

        fruit1 = (Button) findViewById(R.id.fruit13);
        fruit1.setOnClickListener(v -> openfruitC());


    }

    @Override
    public void onBackPressed()
    {
    }

    public void openboyW(){
        Intent intent = new Intent(this, boyW.class);
        intent.putExtra("currency", currency);
        intent.putExtra("points", points);
        intent.putExtra("right", right);
        startActivity(intent);
    }

    public void opengirlW(){
        Intent intent = new Intent(this, girlW.class);
        intent.putExtra("currency", currency);
        intent.putExtra("points", points);
        intent.putExtra("right", right);
        startActivity(intent);
    }

    public void openfruitC(){
        Intent intent = new Intent(this, fruitC.class);
        intent.putExtra("currency", currency);
        intent.putExtra("points", points);
        intent.putExtra("right", right);
        startActivity(intent);
    }


    public void save()
    {
        SharedPreferences sp1 = getSharedPreferences(SHARED_PREFS_POINTS, MODE_PRIVATE);
        SharedPreferences sp2 = getSharedPreferences(SHARED_PREFS_CURRENCY, MODE_PRIVATE);
        SharedPreferences sp3 = getSharedPreferences(SHARED_PREFS_RIGHT, MODE_PRIVATE);
        SharedPreferences.Editor e1 = sp1.edit();
        SharedPreferences.Editor e2 = sp2.edit();
        SharedPreferences.Editor e3 = sp3.edit();
        e1.putString(POINTS, points);
        e2.putString(CURRENCY, currency);
        e3.putString(RIGHT, right);
        e1.apply();
        e2.apply();
        e3.apply();
    }
    public void load()
    {
        SharedPreferences sp1 = getSharedPreferences(SHARED_PREFS_POINTS, MODE_PRIVATE);
        SharedPreferences sp2 = getSharedPreferences(SHARED_PREFS_CURRENCY, MODE_PRIVATE);
        SharedPreferences sp3 = getSharedPreferences(SHARED_PREFS_RIGHT, MODE_PRIVATE);
        points = sp1.getString(POINTS, "0");
        currency = sp2.getString(CURRENCY, "0");
        right = sp3.getString(RIGHT, "0");
    }
    public void updateViews()
    {
        score1 = (TextView)findViewById(R.id.score13);
        score2 = (TextView)findViewById(R.id.score14);
        score1.setText("Points: ".concat(points));
        score2.setText("Currency: ".concat(currency));
    }
}
