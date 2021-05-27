package com.example.aksharas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class aksharas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aksharas);
        Button button = (Button) findViewById(R.id.al);
        button.setOnClickListener(v -> opena ());

    }
    public void opena () {
        Intent intent = new Intent(this, a.class);
        startActivity(intent);
    }

}