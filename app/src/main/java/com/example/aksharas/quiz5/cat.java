package com.example.aksharas.quiz5;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import com.example.aksharas.R;

public class cat extends AppCompatActivity
{
    ImageButton b1, b2, b3, b4,b5;
    Button chart;
    MediaPlayer cat;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat);

        Button b = (Button)findViewById(R.id.button59);
        b.setOnClickListener(v -> back());

        b1 = (ImageButton)findViewById(R.id.imageButton9);
        b2 = (ImageButton)findViewById(R.id.imageButton10);
        b3 = (ImageButton)findViewById(R.id.imageButton11);
        b4 = (ImageButton)findViewById(R.id.imageButton12);
        b5 = (ImageButton)findViewById(R.id.imageButton5);
        chart = (Button)findViewById(R.id.button59);
        cat = MediaPlayer.create(cat.this, R.raw.cat);

        b1.setOnClickListener(v -> wrong());
        b2.setOnClickListener(v -> right());
        b3.setOnClickListener(v -> wrong());
        b4.setOnClickListener(v -> wrong());
        b5.setOnClickListener(v -> cat.start());
        chart.setOnClickListener(v -> back());

    }

    public void wrong()
    {
        Intent intent = new Intent(this, wrong_animal.class);
        intent.putExtra("animals", "cat");
        startActivity(intent);
    }

    public void right()
    {
        Intent intent = new Intent(this, dog.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed()
    {
    }

    public void back()
    {
        Intent intent = new Intent(this, chart_animals.class);
        intent.putExtra("animals", "cat");
        startActivity(intent);
    }
}
