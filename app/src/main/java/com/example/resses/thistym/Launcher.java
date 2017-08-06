package com.example.resses.thistym;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

public class Launcher extends Activity{

    TextView textOne, textTwo;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);

        textOne = (TextView)findViewById(R.id.textView3);
        textTwo = (TextView)findViewById(R.id.textView4);

        Thread timer = new Thread(){
      public void run(){
     try{
       sleep(3000);
     }catch (InterruptedException e){
         e.printStackTrace();
     }finally {
         Intent launchIntent = new Intent("com.example.resses.thistym.MAIN_ACTIVITY");
         startActivity(launchIntent);
     }
      }
        };
        timer.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
