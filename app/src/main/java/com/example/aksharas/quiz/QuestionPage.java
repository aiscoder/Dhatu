package com.example.aksharas.quiz;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.aksharas.R;
import com.example.aksharas.learning;

public class QuestionPage extends AppCompatActivity {

    Button boy1,girl1,fruit1,back1,next1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions1);

        boy1 = (Button) findViewById(R.id.boy1);
        boy1.setOnClickListener(v -> openboyC());

        girl1 = (Button) findViewById(R.id.girl1);
        girl1.setOnClickListener(v -> opengirlW());

        fruit1 = (Button) findViewById(R.id.fruit1);
        fruit1.setOnClickListener(v -> openfruitW());

        back1 = (Button) findViewById(R.id.back1);
        back1.setOnClickListener(v -> openmain());

        next1 = (Button) findViewById(R.id.next1);
        next1.setOnClickListener(v -> opennext());


    }

    public void openboyC(){
        Intent intent = new Intent(this, boyC.class);
        startActivity(intent);
    }

    public void opengirlW(){
        Intent intent = new Intent(this, girlW.class);
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
        Intent intent = new Intent(this, Question2.class);
        startActivity(intent);
    }
}