package com.example.aksharas;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.example.aksharas.quiz.boyW;

public class basicsIImsgC extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        int x = getIntent().getExtras().getInt("value");
        setContentView(R.layout.activity_msgc);


        if (x == 3)
        {
            Intent intent = new Intent(this, basicsIIpoints.class);
            startActivity(intent);
        }
        else
        {
            Handler h = new Handler();
            h.postDelayed(new Runnable() {

                @Override
                public void run() {
                    finish();
                }
            }, 2000);
        }
    }
}
