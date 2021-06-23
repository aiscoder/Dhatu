package com.example.aksharas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class peoplecomplete extends AppCompatActivity
{
    TextView score1, score2;
    public static final String SHARED_PREFS_POINTS = "sharedprefsp";
    public static final String SHARED_PREFS_CURRENCY = "sharedprefsc";
    public static final String CURRENCY = "0";
    public static final String POINTS = "0";
    String currency = "", points = "";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peoplecomplete);

        load();
        currency = Integer.toString(Integer.parseInt(currency) + 50);
        points = Integer.toString(Integer.parseInt(points) + 30);
        save();
        updateViews();

        Button main=(Button) findViewById(R.id.button58);
        main.setOnClickListener(v -> mainz());
    }
    @Override
    public void onBackPressed()
    {
    }
    public void mainz(){
        Intent i = new Intent(this, learning.class);
        startActivity(i);
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
        score1 = (TextView)findViewById(R.id.textView42);
        score2 = (TextView)findViewById(R.id.textView44);
        score1.setText("Points: ".concat(points));
        score2.setText("Currency: ".concat(currency));
    }
}