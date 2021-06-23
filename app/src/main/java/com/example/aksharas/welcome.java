package com.example.aksharas;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class welcome extends AppCompatActivity
{
    Button b;
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        b = (Button) findViewById(R.id.button36);
        b.setOnClickListener(v -> click());
    }

    public void click()
    {
        Intent intent = new Intent(this, homepage.class);
        startActivity(intent);
    }
}
