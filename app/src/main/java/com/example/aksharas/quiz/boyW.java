package com.example.aksharas.quiz;


import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.aksharas.R;

import com.example.aksharas.learning;

public class boyW extends AppCompatActivity {

    ImageButton boysound;
    Button back2;
    MediaPlayer boysoundbruh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boyw);

        back2 = (Button) findViewById(R.id.back2b);
        back2.setOnClickListener(v -> openquestion());
        boysoundbruh = MediaPlayer.create(boyW.this, R.raw.boy);
        final MediaPlayer boysoundbruh = MediaPlayer.create(this, R.raw.boy);


        boysound = (ImageButton) findViewById(R.id.boysound);
        boysound.setOnClickListener(v -> playBoy());


    }


    private void openquestion(){
        Intent intent = new Intent(this, learning.class);
        startActivity(intent);
    }

    public void playBoy(){
        boysoundbruh.start();
    }

}
