package com.example.aksharas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class people3 extends AppCompatActivity {
    Button b1,b2,b3,b4;
    Button nxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_people3);
        b1 = (Button) findViewById(R.id.button48);
        b1.setOnClickListener(v -> openb1());

        b2 = (Button) findViewById(R.id.button47);
        b2.setOnClickListener(v -> openb2());

        b3 = (Button) findViewById(R.id.button49);
        b3.setOnClickListener(v -> openb3());

        b4 = (Button) findViewById(R.id.button50);
        b4.setOnClickListener(v -> openb4());

        nxt=(Button) findViewById(R.id.button51);
        nxt.setOnClickListener(v -> next());
    }
    public void openb1(){
        Intent i = new Intent(this, peoplec.class);
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
    public void next(){
        Intent i = new Intent(this, people4.class);
        startActivity(i);
    }

}