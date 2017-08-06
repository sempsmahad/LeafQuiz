package com.example.resses.thistym;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CongsTwoActivity extends AppCompatActivity {
    TextView mGrades, mFinalScores;
    Button mRetryButtons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_congs_two);

        mGrades = (TextView)findViewById(R.id.grades);
        mFinalScores = (TextView)findViewById(R.id.outOfs);
        mRetryButtons = (Button)findViewById(R.id.retrys);

        Bundle bundle = getIntent().getExtras();
        int mScores = bundle.getInt("finalScores");

        mFinalScores.setText("You scored " + mScores + " out of " + QuizTwoLib.questions.length);
        if (mScores >= 13){
            mGrades.setText("Outstanding");
        }else if (mScores >= 10){
            mGrades.setText("Good Work");
        }else if (mScores >= 7) {
            mGrades.setText("Good Effort");
        }else {
            mGrades.setText("Go over your notes");
        }
        mRetryButtons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CongsTwoActivity.this, QuizTwo.class));
                CongsTwoActivity.this.finish();
            }
        });
        }
    }

