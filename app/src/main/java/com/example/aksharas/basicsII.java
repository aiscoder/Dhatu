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
    boolean l = true, r = false;
    MediaPlayer boy, girl, fruit;
    boolean ans1 = false, ans2 = false, ans3 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basics2);
        b1 = (Button)findViewById(R.id.button6);
        b2 = (Button)findViewById(R.id.button);
        b3 = (Button)findViewById(R.id.button10);
        br1 = (ImageButton)findViewById(R.id.imageButton);
        br2 = (ImageButton)findViewById(R.id.imageButton2);
        br3 = (ImageButton)findViewById(R.id.imageButton3);
        b1.setOnClickListener(v -> but1());
        b2.setOnClickListener(v -> but2());
        b3.setOnClickListener(v -> but3());

        boy = MediaPlayer.create(basicsII.this, R.raw.boy);
        final MediaPlayer agni = MediaPlayer.create(this, R.raw.boy);

        girl = MediaPlayer.create(basicsII.this, R.raw.girl);
        final MediaPlayer amba = MediaPlayer.create(this, R.raw.girl);

        fruit = MediaPlayer.create(basicsII.this, R.raw.fruit);
        final MediaPlayer arti = MediaPlayer.create(this, R.raw.fruit);

        br1.setOnClickListener(v -> butt1());
        br2.setOnClickListener(v -> butt2());
        br3.setOnClickListener(v -> butt3());
    }


    public void but1()
    {
        fruit.start();
        if(ans1)
        {
            b2.setEnabled(false);
            br1.setEnabled(false);
        }
        if(ans2)
        {
            b3.setEnabled(false);
            br2.setEnabled(false);
        }
        if(ans3)
        {
            b1.setEnabled(false);
            br3.setEnabled(false);
        }
        if (l == true)
        {
            b1.setEnabled(false);
            l = false;
            r = true;
        }
    }


    public void but2()
    {
         boy.start();
        if(ans1)
        {
            b2.setEnabled(false);
            br1.setEnabled(false);
        }
        if(ans2)
        {
            b3.setEnabled(false);
            br2.setEnabled(false);
        }
        if(ans3)
        {
            b1.setEnabled(false);
            br3.setEnabled(false);
        }
        if (l == true)
        {
            b1.setEnabled(false);
            l = false;
            r = true;
        }

    }


    public void but3()
    {
        girl.start();
        if (ans1) {
            b2.setEnabled(false);
            br1.setEnabled(false);
        }
        if (ans2) {
            b3.setEnabled(false);
            br2.setEnabled(false);
        }
        if (ans3) {
            b1.setEnabled(false);
            br3.setEnabled(false);
        }
        if (l == true) {
            b1.setEnabled(false);
            l = false;
            r = true;
        }
    }

        public void butt1()
        {
            if(ans1)
            {
                b2.setEnabled(false);
                br1.setEnabled(false);
            }
            if(ans2)
            {
                b3.setEnabled(false);
                br2.setEnabled(false);
            }
            if(ans3)
            {
                b1.setEnabled(false);
                br3.setEnabled(false);
            }
            if(r == true)
            {
                br1.setEnabled(false);
                l = true;
                r = false;
            }
            if(!(b2.isEnabled()))
            {
                ans1 = true;
            }
            else
            {
                b3.setEnabled(true);
                b1.setEnabled(true);
                br1.setEnabled(true);
            }
        }


        public void butt2()
        {
            if(ans1)
            {
                b2.setEnabled(false);
                br1.setEnabled(false);
            }
            if(ans2)
            {
                b3.setEnabled(false);
                br2.setEnabled(false);
            }
            if(ans3)
            {
                b1.setEnabled(false);
                br3.setEnabled(false);
            }
            if(r == true)
            {
                br2.setEnabled(false);
                l = true;
                r = false;
            }
            if(!(b3.isEnabled()))
            {
                ans2 = true;
            }
            else
            {
                b1.setEnabled(true);
                b2.setEnabled(true);
                br2.setEnabled(true);
            }
        }


        public void butt3()
        {
            if(ans1)
            {
                b2.setEnabled(false);
                br1.setEnabled(false);
            }
            if(ans2)
            {
                b3.setEnabled(false);
                br2.setEnabled(false);
            }
            if(ans3)
            {
                b1.setEnabled(false);
                br3.setEnabled(false);
            }
            if(r == true)
            {
                br3.setEnabled(false);
                l = true;
                r = false;
            }
            if(!(b1.isEnabled()))
            {
                ans3 = true;
            }
            else
            {
                b2.setEnabled(true);
                b3.setEnabled(true);
                br3.setEnabled(true);
            }
        }
    }
