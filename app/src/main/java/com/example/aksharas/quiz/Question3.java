package com.example.aksharas.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.aksharas.R;

import com.example.aksharas.learning;

public class Question3 extends AppCompatActivity {

    Button boy1,girl1,fruit1,back1,nxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);

        boy1 = (Button) findViewById(R.id.boy13);
        boy1.setOnClickListener(v -> openboyW());

        girl1 = (Button) findViewById(R.id.girl13);
        girl1.setOnClickListener(v -> opengirlW());

        fruit1 = (Button) findViewById(R.id.fruit13);
        fruit1.setOnClickListener(v -> openfruitC());

        back1 = (Button) findViewById(R.id.back13);
        back1.setOnClickListener(v -> openmain());

        nxt = (Button) findViewById(R.id.nxt3);
        nxt.setOnClickListener(v -> opennext());


    }

    public void openboyW(){
        Intent intent = new Intent(this, boyW.class);
        startActivity(intent);
    }

    public void opengirlW(){
        Intent intent = new Intent(this, girlW.class);
        startActivity(intent);
    }

    public void openfruitC(){
        Intent intent = new Intent(this, fruitC.class);
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
