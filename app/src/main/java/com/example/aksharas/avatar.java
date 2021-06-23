package com.example.aksharas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class avatar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avatarpage);
        Button back=(Button) findViewById(R.id.button57);
        back.setOnClickListener(v -> backz());
    }
    @Override
    public void onBackPressed()
    {
    }
    public void backz(){
        Intent intent = new Intent(this, homepage.class);
        startActivity(intent);
    }
}


