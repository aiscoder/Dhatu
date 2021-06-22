package com.example.aksharas;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.PorterDuff;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.aksharas.R;


public class basicsII extends AppCompatActivity
{
    Button b1, b2 , b3;
    ImageButton br1, br2, br3;
    MediaPlayer boy, girl, fruit;
    boolean l = true, r = false;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basics2);

        boy = MediaPlayer.create(basicsII.this, R.raw.boy);
        final MediaPlayer agni = MediaPlayer.create(this, R.raw.boy);

        girl = MediaPlayer.create(basicsII.this, R.raw.girl);
        final MediaPlayer amba = MediaPlayer.create(this, R.raw.girl);

        fruit = MediaPlayer.create(basicsII.this, R.raw.fruit);
        final MediaPlayer arti = MediaPlayer.create(this, R.raw.fruit);

        b1 = (Button)findViewById(R.id.button6);
        b2 = (Button)findViewById(R.id.button);
        b3 = (Button)findViewById(R.id.button10);

        br1 = (ImageButton)findViewById(R.id.imageButton);
        br2 = (ImageButton)findViewById(R.id.imageButton2);
        br3 = (ImageButton)findViewById(R.id.imageButton3);

        b1.setOnClickListener(v -> but1());
        b2.setOnClickListener(v -> but2());
        b3.setOnClickListener(v -> but3());

        b1.setOnClickListener(v -> Playfruit());
        b2.setOnClickListener(v -> Playboy());
        b3.setOnClickListener(v -> Playgirl());


    }


    public void but1()
    {
        if (l == true)
        {
            b1.setEnabled(false);
            l = false;
            r = true;
        }
    }


    public void but2()
    {
        if (l == true)
        {
            b1.setEnabled(false);
            l = false;
            r = true;
        }

    }


    public void but3()
    {
        if (l == true)
        {
            b1.setEnabled(false);
            l = false;
            r = true;
        }

    }
    public void Playboy(){ boy.start();
    }
    public void Playgirl(){ girl.start();
    }

    public void Playfruit(){ fruit.start();
    }
}
