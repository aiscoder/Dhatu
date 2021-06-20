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
    public static final String SHARED_PREFS_RIGHT = "sharedprefsr";
    public static final String CURRENCY = "0";
    public static final String POINTS = "0";
    public static final String RIGHT = "0";
    String currency = "", points = "", right = "";
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
        right = getIntent().getExtras().getString("right");

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

    @Override
    public void onBackPressed()
    {
    }

    private void openquestion(){
        if(right.equals("0"))
        {
            Intent intent = new Intent(this, Question2.class);
            intent.putExtra("currency", currency);
            intent.putExtra("points", points);
            intent.putExtra("right", right);
            startActivity(intent);
        }
        else
        {
            Intent intent = new Intent(this, learning.class);
            intent.putExtra("currency", currency);
            intent.putExtra("points", points);
            intent.putExtra("right", right);
            startActivity(intent);
        }
    }

    public void playBoy(){
        girlsoundbruh.start();
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
        score1 = (TextView)findViewById(R.id.score11);
        score2 = (TextView)findViewById(R.id.score12);
        score1.setText("Points: ".concat(points));
        score2.setText("Currency: ".concat(currency));
    }

}