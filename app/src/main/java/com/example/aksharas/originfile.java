package com.example.aksharas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class originfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_originfile);

        Button button = (Button) findViewById(R.id.mahesh);
        button.setOnClickListener(v -> openmahesh());

    }
    public void openmahesh(){
        Intent intent = new Intent(this, maheswarasutra.class);
        startActivity(intent);
    }
}