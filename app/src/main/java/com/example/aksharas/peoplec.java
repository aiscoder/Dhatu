package com.example.aksharas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class peoplec extends AppCompatActivity
{
    String s;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        s = getIntent().getExtras().getString("nav");
        setContentView(R.layout.activity_peoplec);
        Handler h = new Handler();
        h.postDelayed(new Runnable() {

            @Override
            public void run()
            {
                if(s.equals("1"))
                {
                    Intent i = new Intent(peoplec.this, people2.class);
                    startActivity(i);
                }
                if(s.equals("2"))
                {
                    Intent i = new Intent(peoplec.this, people3.class);
                    startActivity(i);
                }
                if(s.equals("3"))
                {
                    Intent i = new Intent(peoplec.this, people4.class);
                    startActivity(i);
                }
                if(s.equals("4"))
                {
                    Intent i = new Intent(peoplec.this, peoplecomplete.class);
                    startActivity(i);
                }
            }
        }, 2000);
    }


    @Override
    public void onBackPressed()
    {
    }
}