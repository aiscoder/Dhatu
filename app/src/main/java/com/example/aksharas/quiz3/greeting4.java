package com.example.aksharas.quiz3;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import com.example.aksharas.R;

public class greeting4 extends AppCompatActivity
{
    Button b;
    MediaPlayer gm;
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting4);

        b = (Button)findViewById(R.id.button28);
        gm = MediaPlayer.create(greeting4.this, R.raw.ty);

        b.setOnClickListener(v -> gm.start());
    }
}
