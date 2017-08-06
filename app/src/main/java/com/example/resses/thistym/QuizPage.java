package com.example.resses.thistym;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuizPage extends AppCompatActivity {
Button quiz1,quiz2,quiz3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_page);

        quiz1= (Button) findViewById(R.id.quiz1);
        quiz2= (Button) findViewById(R.id.quiz2);
        quiz3= (Button) findViewById(R.id.quiz3);

        quiz1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(QuizPage.this, QuizOne.class));
            }
        });
        quiz2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(QuizPage.this, QuizTwo.class));
            }
        });
        quiz3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(QuizPage.this, QuizThree.class));
            }
        });
            }

}
