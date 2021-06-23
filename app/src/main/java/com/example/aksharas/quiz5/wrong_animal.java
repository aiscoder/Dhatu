package com.example.aksharas.quiz5;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.aksharas.R;

public class wrong_animal extends AppCompatActivity
{
    Button b;
    String inc;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wrong_animal);

        inc = getIntent().getExtras().getString("animals");
        b = (Button)findViewById(R.id.button37);
        b.setOnClickListener(v -> revert());
    }


    public void revert()
    {
        Intent intent = new Intent(this, chart_animals.class);
        intent.putExtra("animals", inc);
        startActivity(intent);
    }

    @Override
    public void onBackPressed()
    {
    }
}
