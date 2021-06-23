package com.example.aksharas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;

public class peoplec extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peoplec);
        Handler h = new Handler();
        h.postDelayed(new Runnable() {

            @Override
            public void run() {
                finish();
            }
        }, 2000);
    }
}