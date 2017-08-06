package com.example.resses.thistym;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class QuizTwo extends AppCompatActivity {
    private TextView mScoreView, mQuestion;
    private ImageView mImageView;
    private Button mTrueButton, mFalseButton;

    private boolean mAnswer;
    private int mScores = 0;
    private int mQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_two);

        mScoreView = (TextView)findViewById(R.id.points);
        mImageView = (ImageView)findViewById(R.id.imageView);
        mQuestion = (TextView)findViewById(R.id.querry);
        mTrueButton = (Button)findViewById(R.id.trueButton);
        mFalseButton = (Button)findViewById(R.id.falseButton);
        updateQuestion();

        mTrueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mAnswer == true) {
                    mScores++;
                    updateScore(mScores);

                    //perform check before you update the question
                    if (mQuestionNumber == QuizTwoLib.questions.length) {
                        Intent i = new Intent(QuizTwo.this, CongsTwoActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", mScores);
                        i.putExtras(bundle);
                        QuizTwo.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();
                    }
                }
                else {
                    if (mQuestionNumber == QuizTwoLib.questions.length) {
                        Intent i = new Intent(QuizTwo.this, CongsTwoActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", mScores);
                        i.putExtras(bundle);
                        QuizTwo.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();
                    }
                }
            }
        });

        mFalseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mAnswer == false) {
                    mScores++;
                    updateScore(mScores);

                    //perform check before you update the question
                    if (mQuestionNumber == QuizTwoLib.questions.length) {
                        Intent i = new Intent(QuizTwo.this, CongsTwoActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", mScores);
                        i.putExtras(bundle);
                        QuizTwo.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();
                    }
                }
                else {
                    if (mQuestionNumber == QuizTwoLib.questions.length) {
                        Intent i = new Intent(QuizTwo.this, CongsTwoActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", mScores);
                        i.putExtras(bundle);
                        QuizTwo.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();
                    }
                }
            }
        });

    }
    private void updateQuestion() {

        mImageView.setImageResource(QuizTwoLib.images[mQuestionNumber]);
        mQuestion.setText(QuizTwoLib.questions[mQuestionNumber]);
        mAnswer = QuizTwoLib.answers[mQuestionNumber];
        mQuestionNumber++;
    }

    private void updateScore(int point) {

        mScoreView.setText("" + mScores);
    }

    public void clickExit(View view) {
        askToClose();
    }


    @Override
    public void onBackPressed() {
        askToClose();
    }
    private void askToClose (){
        AlertDialog.Builder builder = new AlertDialog.Builder(QuizTwo.this);
        builder.setMessage("Are you sure you want to quit?");
        builder.setCancelable(true);
        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                finish();
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();

            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }
}
