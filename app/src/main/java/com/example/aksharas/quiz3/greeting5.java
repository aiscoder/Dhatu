package com.example.aksharas.quiz3;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import com.example.aksharas.R;

public class greeting5 extends AppCompatActivity
{
    Button b;
    MediaPlayer gm;
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting5);

        b = (Button)findViewById(R.id.button27);
        gm = MediaPlayer.create(greeting5.this, R.raw.greet);

        b.setOnClickListener(v -> gm.start());
    }
}
