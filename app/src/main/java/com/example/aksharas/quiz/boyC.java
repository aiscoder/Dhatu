package com.example.aksharas.quiz;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.aksharas.R;

public class boyC extends AppCompatActivity {

    ImageButton boysound;
    Button back2,nxt;
    MediaPlayer boysoundbruh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boyc);

        back2 = (Button) findViewById(R.id.back2);
        back2.setOnClickListener(v -> openquestion());
        boysoundbruh = MediaPlayer.create(boyC.this, R.raw.boy);
        final MediaPlayer boysoundbruh = MediaPlayer.create(this, R.raw.boy);


        boysound = (ImageButton) findViewById(R.id.boysound);
        boysound.setOnClickListener(v -> playBoy());

        nxt = (Button) findViewById(R.id.nxt);
        nxt.setOnClickListener(v -> opennext());
    }


    private void openquestion(){
        Intent intent = new Intent(this, QuestionPage.class);
        startActivity(intent);
    }

    public void playBoy(){
        boysoundbruh.start();
    }

    private void opennext(){
        Intent intent = new Intent(this, Question2.class);
        startActivity(intent);
    }


}