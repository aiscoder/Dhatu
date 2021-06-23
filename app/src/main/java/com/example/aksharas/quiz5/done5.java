package com.example.aksharas.quiz5;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.aksharas.R;
import com.example.aksharas.learning;

public class done5 extends AppCompatActivity
{
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basics2_points);
        b = (Button)findViewById(R.id.button20);
        b.setOnClickListener(v -> back());
    }


    public void back()
    {
        Intent intent = new Intent(this, learning.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }
}
