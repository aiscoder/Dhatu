package com.example.aksharas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;

import com.example.aksharas.quiz.fruitW;

public class people1 extends AppCompatActivity {
    Button b1,b2,b3,b4;
    Button nxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_people1);

        b1 = (Button) findViewById(R.id.button38);
        b1.setOnClickListener(v -> openb1());

        b2 = (Button) findViewById(R.id.button39);
        b2.setOnClickListener(v -> openb2());

        b3 = (Button) findViewById(R.id.button40);
        b3.setOnClickListener(v -> openb3());

        b4 = (Button) findViewById(R.id.button41);
        b4.setOnClickListener(v -> openb4());
    }
    @Override
    public void onBackPressed()
    {
    }
    public void openb1()
    {
        Intent i = new Intent(this, peoplec.class);
        peoplec.x=2;
        startActivity(i);
    }

    public void openb2(){
        Intent i = new Intent(this, basicsIImsgW.class);
        startActivity(i);
    }

    public void openb3(){
        Intent i = new Intent(this, basicsIImsgW.class);
        startActivity(i);
    }

    public void openb4(){
        Intent i = new Intent(this, basicsIImsgW.class);
        startActivity(i);
    }

}