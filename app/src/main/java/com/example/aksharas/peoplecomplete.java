package com.example.aksharas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class peoplecomplete extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peoplecomplete);
        Button main=(Button) findViewById(R.id.button58);
        main.setOnClickListener(v -> mainz());
    }
    public void mainz(){
        Intent i = new Intent(this, learning.class);
        startActivity(i);
    }
}