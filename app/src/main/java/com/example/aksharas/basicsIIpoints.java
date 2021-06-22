package com.example.aksharas;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class basicsIIpoints extends AppCompatActivity
{
    Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basics2_points);
        back = (Button) findViewById(R.id.button20);
        back.setOnClickListener(v -> learn());
    }

    public void learn()
    {
        Intent i = new Intent(this, learning.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }
}
