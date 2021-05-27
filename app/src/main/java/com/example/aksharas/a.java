package com.example.aksharas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;

public class a extends AppCompatActivity {

    MediaPlayer agni, amba, arti, anna, a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        Button button = (Button) findViewById(R.id.button10);
        button.setOnClickListener(v -> openaksharas ());



        agni = MediaPlayer.create(a.this, R.raw.agniactual);
        final MediaPlayer agni = MediaPlayer.create(this, R.raw.agniactual);

        amba = MediaPlayer.create(a.this, R.raw.amba);
        final MediaPlayer amba = MediaPlayer.create(this, R.raw.amba);

        arti = MediaPlayer.create(a.this, R.raw.arti);
        final MediaPlayer arti = MediaPlayer.create(this, R.raw.arti);

        anna = MediaPlayer.create(a.this, R.raw.anna);
        final MediaPlayer anna = MediaPlayer.create(this, R.raw.anna);

        a = MediaPlayer.create(a.this, R.raw.a);
        final MediaPlayer a = MediaPlayer.create(this, R.raw.a);




        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(v -> Playagni());

        Button button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(v -> Playamba());

        Button button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(v -> Playanna());

        Button artibutton = (Button) findViewById(R.id.artibutton);
        artibutton.setOnClickListener(v -> Playarti());

        Button button21 = (Button) findViewById(R.id.button21);
        button21.setOnClickListener(v -> Playa());


    }

    public void Playagni(){ agni.start();
    }
    public void Playamba(){ amba.start();
    }

    public void Playanna(){ anna.start();
    }

    public void Playarti(){ arti.start();
    }

    public void Playa(){ a.start();
    }
    public void openaksharas () {
        Intent intent = new Intent(this, aksharas.class);
        startActivity(intent);
    }





}