package com.example.aksharas.quiz;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.aksharas.R;

import com.example.aksharas.learning;

public class girlW extends AppCompatActivity {

    ImageButton girlsound;
    Button back3;
    MediaPlayer girlsoundbruh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_girlw);

        back3 = (Button) findViewById(R.id.back3);
        back3.setOnClickListener(v -> openquestion());
        girlsoundbruh = MediaPlayer.create(girlW.this, R.raw.girl);
        final MediaPlayer boysoundbruh = MediaPlayer.create(this, R.raw.girl);


        girlsound = (ImageButton) findViewById(R.id.girlsound);
        girlsound.setOnClickListener(v -> playBoy());
    }

    private void openquestion(){
        Intent intent = new Intent(this, learning.class);
        startActivity(intent);
    }

    public void playBoy(){
        girlsoundbruh.start();
    }


}