package com.example.aksharas.quiz5;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.aksharas.R;

public class dog extends AppCompatActivity
{
    ImageButton b1, b2, b3, b4;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dog);

        b1 = (ImageButton)findViewById(R.id.imageButton9);
        b2 = (ImageButton)findViewById(R.id.imageButton10);
        b3 = (ImageButton)findViewById(R.id.imageButton11);
        b4 = (ImageButton)findViewById(R.id.imageButton12);

        b1.setOnClickListener(v -> wrong());
        b2.setOnClickListener(v -> wrong());
        b3.setOnClickListener(v -> right());
        b4.setOnClickListener(v -> wrong());
    }

    public void wrong()
    {
        Intent intent = new Intent(this, wrong_animal.class);
        intent.putExtra("animals", "dog");
        startActivity(intent);
    }

    public void right()
    {
        Intent intent = new Intent(this, cow.class);
        startActivity(intent);
    }
}