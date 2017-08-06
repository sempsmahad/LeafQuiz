package com.example.resses.thistym;

import android.content.ClipData;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.function.LongConsumer;

public class QuizThree extends AppCompatActivity {
    TextView tx1,tx2,tx3,tx4,tx5,tx6,tx7,tx8,stalk,branch,blade,apex,vein,stipule,midrib,axil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_three);

        tx1 = (TextView) findViewById(R.id.stalk);tx2 = (TextView) findViewById(R.id.midrib);tx3 = (TextView) findViewById(R.id.stipule);
        tx4 = (TextView) findViewById(R.id.axil);tx5 = (TextView) findViewById(R.id.lamina);tx6 = (TextView) findViewById(R.id.leafvein);
        tx7 = (TextView) findViewById(R.id.apex);tx8 = (TextView) findViewById(R.id.branch);

        stalk = (TextView) findViewById(R.id.tx1); midrib = (TextView) findViewById(R.id.tx2); stipule = (TextView) findViewById(R.id.tx3);
        axil = (TextView) findViewById(R.id.tx4); blade = (TextView) findViewById(R.id.tx5); vein = (TextView) findViewById(R.id.tx6);
        apex = (TextView) findViewById(R.id.tx7); branch = (TextView) findViewById(R.id.tx8);

        stalk.setOnLongClickListener(longClickListener);midrib.setOnLongClickListener(longClickListener);stipule.setOnLongClickListener(longClickListener);
        axil.setOnLongClickListener(longClickListener);blade.setOnLongClickListener(longClickListener);vein.setOnLongClickListener(longClickListener);
        apex.setOnLongClickListener(longClickListener);branch.setOnLongClickListener(longClickListener);

        tx1.setOnDragListener(dragLisener);tx2.setOnDragListener(dragLisener);tx3.setOnDragListener(dragLisener);
        tx4.setOnDragListener(dragLisener);tx5.setOnDragListener(dragLisener);tx6.setOnDragListener(dragLisener);
        tx7.setOnDragListener(dragLisener);tx8.setOnDragListener(dragLisener);

    }

    View.OnLongClickListener longClickListener = new View.OnLongClickListener() {
        @Override
        public boolean onLongClick(View v) {
            ClipData data = ClipData.newPlainText("","");
            View.DragShadowBuilder myShadoBuilder =new View.DragShadowBuilder(v);
            v.startDrag(data,myShadoBuilder,v,0);


            return true;
        }
    };
    View.OnDragListener dragLisener = new View.OnDragListener() {
        @Override
        public boolean onDrag(View view, DragEvent event) {
           int dragEvent = event.getAction();
            final View view1 = (View) event.getLocalState();
            switch (dragEvent){
                case DragEvent.ACTION_DRAG_ENTERED:
                    break;
                case DragEvent.ACTION_DRAG_EXITED:
                    break;
                case DragEvent.ACTION_DROP:

                    if (view1.getId()==R.id.tx1){
                        tx1.setText("");

                    view1.animate()
                            .x(tx1.getX())
                            .y(tx1.getY())
                            .setDuration(700)
                            .start();
                    }
                    if (view1.getId()==R.id.tx2){
                        tx2.setText("");

                        view1.animate()
                                .x(tx2.getX())
                                .y(tx2.getY())
                                .setDuration(700)
                                .start();
                    }
                    if (view1.getId()==R.id.tx3){
                        tx3.setText("");

                        view1.animate()
                                .x(tx3.getX())
                                .y(tx3.getY())
                                .setDuration(700)
                                .start();
                    }
                    if (view1.getId()==R.id.tx4){
                        tx4.setText("");

                        view1.animate()
                                .x(tx4.getX())
                                .y(tx4.getY())
                                .setDuration(700)
                                .start();
                    }
                    if (view1.getId()==R.id.tx5){
                        tx5.setText("");

                        view1.animate()
                                .x(tx5.getX())
                                .y(tx5.getY())
                                .setDuration(700)
                                .start();
                    }
                    if (view1.getId()==R.id.tx6){
                        tx6.setText("");

                        view1.animate()
                                .x(tx6.getX())
                                .y(tx6.getY())
                                .setDuration(700)
                                .start();
                    }
                    if (view1.getId()==R.id.tx7){
                        tx7.setText("");

                        view1.animate()
                                .x(tx7.getX())
                                .y(tx7.getY())
                                .setDuration(700)
                                .start();
                    }
                    if (view1.getId()==R.id.tx8){
                        tx8.setText("");

                        view1.animate()
                                .x(tx8.getX())
                                .y(tx8.getY())
                                .setDuration(700)
                                .start();
                    }


                    break;
            }
            return true;
        }

        };
    }
