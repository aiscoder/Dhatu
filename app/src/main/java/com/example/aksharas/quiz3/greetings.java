package com.example.aksharas.quiz3;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.aksharas.R;

public class greetings extends AppCompatActivity
{
    Button b1, b2, b3, b4, b5;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greetings);

        b1 = (Button) findViewById(R.id.button22);
        b2 = (Button) findViewById(R.id.button23);
        b3 = (Button) findViewById(R.id.button24);
        b4 = (Button) findViewById(R.id.button25);
        b5 = (Button) findViewById(R.id.button26);

        b1.setOnClickListener(v -> s1());
        b2.setOnClickListener(v -> s2());
        b3.setOnClickListener(v -> s3());
        b4.setOnClickListener(v -> s4());
        b5.setOnClickListener(v -> s5());

    }


    public void s1()
    {
        Intent i = new Intent(this, greeting1.class);
        startActivity(i);
    }


    public void s2()
    {
        Intent i = new Intent(this, greeting2.class);
        startActivity(i);
    }


    public void s3()
    {
        Intent i = new Intent(this, greeting3.class);
        startActivity(i);
    }


    public void s4()
    {
        Intent i = new Intent(this, greeting4.class);
        startActivity(i);
    }


    public void s5()
    {
        Intent i = new Intent(this, greeting5.class);
        startActivity(i);
    }
}
