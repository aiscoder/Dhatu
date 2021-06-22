package com.example.aksharas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.aksharas.quiz.QuestionPage;

public class learning extends AppCompatActivity {

    public static final String SHARED_PREFS_RIGHT = "sharedprefsr";
    public static final String RIGHT = "0";
    TextView t;
    String right ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning);
        right = "0";
        save();
        load();
        Button button = (Button) findViewById(R.id.basics);
        Button button2 = (Button) findViewById(R.id.cardView23);

        button.setOnClickListener(v -> openquiz());
        button2.setOnClickListener(v -> openquiz2());

    }

    public void openquiz()
    {
        Intent intent = new Intent(this, QuestionPage.class);
        startActivity(intent);
    }

    public void openquiz2()
    {
        Intent intent = new Intent(this, basicsII.class);
        startActivity(intent);
    }


    public void save()
    {

        SharedPreferences sp3 = getSharedPreferences(SHARED_PREFS_RIGHT, MODE_PRIVATE);

        SharedPreferences.Editor e3 = sp3.edit();

        e3.putString(RIGHT, right);

        e3.apply();
    }

    public void load()
    {

        SharedPreferences sp3 = getSharedPreferences(SHARED_PREFS_RIGHT, MODE_PRIVATE);

        right = sp3.getString(RIGHT, "0");
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

