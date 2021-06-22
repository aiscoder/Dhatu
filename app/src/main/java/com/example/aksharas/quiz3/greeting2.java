package com.example.aksharas.quiz3;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import com.example.aksharas.R;

public class greeting2 extends AppCompatActivity
{
    Button b;
    MediaPlayer gm;
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting2);

        b = (Button)findViewById(R.id.button33);
        gm = MediaPlayer.create(greeting2.this, R.raw.hello);

        b.setOnClickListener(v -> gm.start());
    }
}