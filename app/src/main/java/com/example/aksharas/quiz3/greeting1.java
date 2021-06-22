package com.example.aksharas.quiz3;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import com.example.aksharas.R;

public class greeting1 extends AppCompatActivity
{
    Button b;
    MediaPlayer gm;
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting1);

        b = (Button)findViewById(R.id.button34);
        gm = MediaPlayer.create(greeting1.this, R.raw.goodmorning);

        b.setOnClickListener(v -> gm.start());
    }
}
