package com.example.aksharas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class peoplec extends AppCompatActivity {
    public static int x=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peoplec);
        Handler h = new Handler();
        h.postDelayed(new Runnable() {

            @Override
            public void run() {
                finish();
                if (x == 2) {
                    Intent mainIntent = new Intent(peoplec.this, people2.class);
                    peoplec.this.startActivity(mainIntent);
                    peoplec.this.finish();
                }
                if (x == 3) {
                    Intent mainIntent = new Intent(peoplec.this, people3.class);
                    peoplec.this.startActivity(mainIntent);
                    peoplec.this.finish();
                }
                if (x == 4) {
                    Intent mainIntent = new Intent(peoplec.this, people4.class);
                    peoplec.this.startActivity(mainIntent);
                    peoplec.this.finish();
                }
                if (x == 5) {
                    Intent mainIntent = new Intent(peoplec.this, peoplecomplete.class);
                    peoplec.this.startActivity(mainIntent);
                    peoplec.this.finish();
                }
            }
        }, 2000);
    }
}