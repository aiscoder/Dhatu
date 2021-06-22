package com.example.aksharas;

import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class basicsIImsgC extends AppCompatActivity
{
    @Override
    protected void onCreate( Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_msgc);
        Handler h = new Handler();
        h.postDelayed(new Runnable() {

            @Override
            public void run() {
                finish();
            }
        }, 2000);

    }
}
