package com.example.resses.thistym;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

    public class QuizOne extends AppCompatActivity {
	
    private QuizOneLib mQuizOneLib = new QuizOneLib();
    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mQuit;
    private String mAnswer;
    private int mScore = 0;
    private int mQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_one);

        mQuit = (Button) findViewById(R.id.quit);
        mScoreView = (TextView) findViewById(R.id.score);
        mQuestionView = (TextView) findViewById(R.id.question);
        mButtonChoice1 = (Button) findViewById(R.id.choice1);
        mButtonChoice2 = (Button) findViewById(R.id.choice2);
        mButtonChoice3 = (Button) findViewById(R.id.choice3);
        updateQuestion();
        
		
		mQuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(QuizOne.this, MainActivity.class));
            }
        });
		

        
		mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mButtonChoice1.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    Toast.makeText(QuizOne.this, "correct", Toast.LENGTH_SHORT).show();
                    if (mQuestionNumber == QuizOneLib.mQuestions.length) {
                        Intent i = new Intent(QuizOne.this, CongsActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", mScore);
                        i.putExtras(bundle);
                        QuizOne.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();
                    }
                } else {

                    updateQuestion();
                    if (mQuestionNumber == QuizOneLib.mQuestions.length) {
                        Intent i = new Intent(QuizOne.this, CongsActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", mScore);
                        i.putExtras(bundle);
                        QuizOne.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();
                    }


                }
            }
        });
        mButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mButtonChoice2.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    Toast.makeText(QuizOne.this, "correct", Toast.LENGTH_SHORT).show();

                    if (mQuestionNumber == QuizOneLib.mQuestions.length) {
                        Intent i = new Intent(QuizOne.this, CongsActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", mScore);
                        i.putExtras(bundle);
                        QuizOne.this.finish();
                        startActivity(i);
                        updateQuestion();


                    } else {
                        updateQuestion();
                    }
                } else {
                    updateQuestion();
                    if (mQuestionNumber == QuizOneLib.mQuestions.length) {
                        Intent i = new Intent(QuizOne.this, CongsActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", mScore);
                        i.putExtras(bundle);
                        QuizOne.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();
                    }


                }
            }

        });

        mButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mButtonChoice3.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    Toast.makeText(QuizOne.this, "correct", Toast.LENGTH_SHORT).show();

                    if (mQuestionNumber == QuizOneLib.mQuestions.length) {
                        Intent i = new Intent(QuizOne.this, CongsActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", mScore);
                        i.putExtras(bundle);
                        QuizOne.this.finish();
                        startActivity(i);
                        updateQuestion();
                    } else {
                        updateQuestion();
                    }
                } else {
                    if (mQuestionNumber == QuizOneLib.mQuestions.length) {
                        Intent i = new Intent(QuizOne.this, CongsActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", mScore);
                        i.putExtras(bundle);
                        QuizOne.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();
                    }


                }


            }

        });


    }
    private void updateQuestion(){
        mQuestionView.setText(mQuizOneLib.getQuestion(mQuestionNumber));
        mButtonChoice1.setText(mQuizOneLib.getChoice1(mQuestionNumber));
        mButtonChoice2.setText(mQuizOneLib.getChoice2(mQuestionNumber));
        mButtonChoice3.setText(mQuizOneLib.getChoice3(mQuestionNumber));
        mAnswer = mQuizOneLib.getCorrectAnswer(mQuestionNumber);
        mQuestionNumber++;
    }
    private void updateScore(int point) {
        mScoreView.setText("" + mScore);
    }
    public void clickExit(View view) {
        askToClose();
    }
    @Override
    public void onBackPressed() {
        askToClose();
    }
    private void askToClose (){
        AlertDialog.Builder builder = new AlertDialog.Builder(QuizOne.this);
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
