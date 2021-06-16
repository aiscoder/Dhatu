package com.example.aksharas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class database extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database);

        Button button = (Button) findViewById(R.id.button12);
        button.setOnClickListener(v -> openaksharas ());

        Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(v -> openoriginfile ());
    }
    public void openaksharas () {
        Intent intent = new Intent(this, aksharas.class);
        startActivity(intent);
    }

    public void openoriginfile () {
        Intent intent = new Intent(this, originfile.class);
        startActivity(intent);
    }
}
    /*public class database extends Fragment {
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment
            return inflater.inflate(R.layout.activity_database, container, false);
        }

    } */