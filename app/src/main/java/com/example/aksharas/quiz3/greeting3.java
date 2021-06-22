package com.example.aksharas.quiz3;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import com.example.aksharas.R;

public class greeting3 extends AppCompatActivity
{
    Button b1, b2, b3, b4;
    MediaPlayer g1, g2, g3, g4;
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting3);

        b1 = (Button)findViewById(R.id.button29);
        b2 = (Button)findViewById(R.id.button30);
        b3 = (Button)findViewById(R.id.button31);
        b4 = (Button)findViewById(R.id.button32);

        g1 = MediaPlayer.create(greeting3.this, R.raw.whatnamemale);
        g2 = MediaPlayer.create(greeting3.this, R.raw.whatnamefemale);
        g3 = MediaPlayer.create(greeting3.this, R.raw.ram);
        g4 = MediaPlayer.create(greeting3.this, R.raw.sita);

        b1.setOnClickListener(v -> g1.start());
        b2.setOnClickListener(v -> g2.start());
        b3.setOnClickListener(v -> g3.start());
        b4.setOnClickListener(v -> g4.start());
    }
}