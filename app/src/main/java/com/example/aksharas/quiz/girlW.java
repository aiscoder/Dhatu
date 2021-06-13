package com.example.aksharas.quiz;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.aksharas.R;

import com.example.aksharas.learning;

public class girlW extends AppCompatActivity
{

    public static final String SHARED_PREFS_POINTS = "sharedprefsp";
    public static final String SHARED_PREFS_CURRENCY = "sharedprefsc";
    public static final String CURRENCY = "0";
    public static final String POINTS = "0";
    String currency = "", points = "";
    TextView score1, score2;

    ImageButton girlsound;
    Button back3;
    MediaPlayer girlsoundbruh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_girlw);

        currency = getIntent().getExtras().getString("currency");
        points = getIntent().getExtras().getString("points");
        save();
        load();
        updateViews();

        back3 = (Button) findViewById(R.id.back3);
        back3.setOnClickListener(v -> openquestion());
        girlsoundbruh = MediaPlayer.create(girlW.this, R.raw.girl);
        final MediaPlayer boysoundbruh = MediaPlayer.create(this, R.raw.girl);


        girlsound = (ImageButton) findViewById(R.id.girlsound);
        girlsound.setOnClickListener(v -> playBoy());
    }

    private void openquestion(){
        Intent intent = new Intent(this, learning.class);
        startActivity(intent);
    }

    public void playBoy(){
        girlsoundbruh.start();
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
        score1 = (TextView)findViewById(R.id.score11);
        score2 = (TextView)findViewById(R.id.score12);
        score1.setText("Points: ".concat(points));
        score2.setText("Currency: ".concat(currency));
    }

}