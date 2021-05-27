package com.example.aksharas.quiz;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.aksharas.R;

import com.example.aksharas.learning;

public class Question2 extends AppCompatActivity {

    Button boy1,girl1,fruit1,back1,nxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);

        boy1 = (Button) findViewById(R.id.boy12);
        boy1.setOnClickListener(v -> openboyW());

        girl1 = (Button) findViewById(R.id.girl12);
        girl1.setOnClickListener(v -> opengirlC());

        fruit1 = (Button) findViewById(R.id.fruit12);
        fruit1.setOnClickListener(v -> openfruitW());

        back1 = (Button) findViewById(R.id.back12);
        back1.setOnClickListener(v -> openmain());

        nxt = (Button) findViewById(R.id.nxt2);
        nxt.setOnClickListener(v -> opennext());


    }

    public void openboyW(){
        Intent intent = new Intent(this, boyW.class);
        startActivity(intent);
    }

    public void opengirlC(){
        Intent intent = new Intent(this, girlC.class);
        startActivity(intent);
    }

    public void openfruitW(){
        Intent intent = new Intent(this, fruitW.class);
        startActivity(intent);
    }

    public void openmain(){
        Intent intent = new Intent(this, learning.class);
        startActivity(intent);
    }

    public void opennext(){
        Intent intent = new Intent(this, Question3.class);
        startActivity(intent);
    }
}

