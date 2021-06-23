package com.example.aksharas.quiz5;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.aksharas.R;
import com.example.aksharas.basicsII;

public class cow extends AppCompatActivity
{
    ImageButton b1, b2, b3, b4, sound;
    MediaPlayer s;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cow);

        Button b = (Button)findViewById(R.id.button56);
        b.setOnClickListener(v -> back());

        b1 = (ImageButton)findViewById(R.id.imageButton9);
        b2 = (ImageButton)findViewById(R.id.imageButton10);
        b3 = (ImageButton)findViewById(R.id.imageButton11);
        b4 = (ImageButton)findViewById(R.id.imageButton12);
        sound = (ImageButton)findViewById(R.id.imageButton4);

        s = MediaPlayer.create(cow.this, R.raw.cow);

        b1.setOnClickListener(v -> wrong());
        b2.setOnClickListener(v -> wrong());
        b3.setOnClickListener(v -> wrong());
        b4.setOnClickListener(v -> right());
        sound.setOnClickListener(v -> s.start());
    }

    public void wrong()
    {
        Intent intent = new Intent(this, wrong_animal.class);
        intent.putExtra("animals", "cow");
        startActivity(intent);
    }

    public void right()
    {
        Intent intent = new Intent(this, lion.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed()
    {
    }

    public void back()
    {
        Intent intent = new Intent(this, chart_animals.class);
        intent.putExtra("animals", "cow");
        startActivity(intent);
    }
}