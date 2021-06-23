package com.example.aksharas.quiz5;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.example.aksharas.R;

public class chart_animals extends AppCompatActivity
{
    Button b1, b2, b3, b4, n;
    MediaPlayer cat, dog, lion, cow;
    String animals;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_chart);

        animals = getIntent().getExtras().getString("animals");

        cat = MediaPlayer.create(chart_animals.this, R.raw.boy);
        dog = MediaPlayer.create(chart_animals.this, R.raw.boy);
        cow = MediaPlayer.create(chart_animals.this, R.raw.boy);
        lion = MediaPlayer.create(chart_animals.this, R.raw.boy);

        b1 = (Button) findViewById(R.id.cat);
        b2 = (Button) findViewById(R.id.dog);
        b3 = (Button) findViewById(R.id.lion);
        b4 = (Button) findViewById(R.id.cow);
        n = (Button) findViewById(R.id.nxtt);

        b1.setOnClickListener(v -> cat.start());
        b2.setOnClickListener(v -> dog.start());
        b3.setOnClickListener(v -> cow.start());
        b4.setOnClickListener(v -> lion.start());
        n.setOnClickListener(v -> next());

    }



    public void next()
    {
        if(animals.equals("cat") || animals.equals("none"))
        {
            Intent intent = new Intent(this, cat.class);
            startActivity(intent);
        }
        if(animals.equals("dog"))
        {
            Intent intent = new Intent(this, dog.class);
            startActivity(intent);
        }
        if(animals.equals("cow"))
        {
            Intent intent = new Intent(this, cow.class);
            startActivity(intent);
        }
        if(animals.equals("lion"))
        {
            Intent intent = new Intent(this, lion.class);
            startActivity(intent);
        }
    }

}
