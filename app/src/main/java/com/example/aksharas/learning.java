package com.example.aksharas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.aksharas.quiz.QuestionPage;

public class learning extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning);

        CardView button = (CardView) findViewById(R.id.basics);
        button.setOnClickListener(v -> openquiz());

    }

    public void openquiz(){
        Intent intent = new Intent(this, QuestionPage.class);
        startActivity(intent);
    }
}

   /* public class learning extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.activity_learning, container, false);
    }
} */

