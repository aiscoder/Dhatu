package com.example.aksharas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class thesaurus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thesaurus);

        Button button11 = (Button) findViewById(R.id.button11);
        button11.setOnClickListener(v -> opendictionary());

        Button button19 = (Button) findViewById(R.id.button19);
        button19.setOnClickListener(v -> openactualthesaurus());
    }
    public void opendictionary(){
        Intent intent = new Intent(this, dictionary.class);
        startActivity(intent);
    }


    public void openactualthesaurus(){
        Intent intent = new Intent(this, actualthesaurus.class);
        startActivity(intent);
    }

}

/*public class thesaurus extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.activity_thesaurus, container, false);
    }

} */