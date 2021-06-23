package com.example.aksharas;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.aksharas.quiz.QuestionPage;

public class heyw extends AppCompatActivity
{
    Button b;
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heyw);
        b = (Button) findViewById(R.id.button35);
        b.setOnClickListener(v -> click());
    }

    public void click()
    {
        Intent intent = new Intent(this, welcome.class);
        startActivity(intent);
    }
}
