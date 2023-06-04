package com.example.con1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ProgressBar;
import android.widget.RadioButton;

public class armsthing extends AppCompatActivity {

    private Chronometer chronometer;
    private long pauseOffset;
    private boolean running;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_armsthing);

        Button im1 = (Button) findViewById(R.id.button1);
        Button im2 = (Button) findViewById(R.id.butto2);
        Button im3 = (Button) findViewById(R.id.button3);
        Button im4 = (Button) findViewById(R.id.button5);
        Button im5 = (Button) findViewById(R.id.button6);
        Button im7 = (Button) findViewById(R.id.button7);
        RadioButton rb1 = (RadioButton) findViewById(R.id.radioButton1);
        RadioButton rb2 = (RadioButton) findViewById(R.id.radioButton2);
        RadioButton rb3 = (RadioButton) findViewById(R.id.radioButton3);
        RadioButton rb4 = (RadioButton) findViewById(R.id.radioButton4);
        RadioButton rb5 = (RadioButton) findViewById(R.id.radioButton5);
        RadioButton rb7 = (RadioButton) findViewById(R.id.radioButton7);
        Chronometer chronometer = (Chronometer) findViewById(R.id.timething);
        Button mainthing = (Button) findViewById(R.id.Satrtbutton);
        Button stopthing = (Button) findViewById(R.id.stopbutton);
        ProgressBar pb = (ProgressBar) findViewById(R.id.progressBar);

        chronometer.setFormat("Time: %s");
        chronometer.setBase(SystemClock.elapsedRealtime());


        View.OnClickListener status0 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chronometer.setBase(SystemClock.elapsedRealtime() - pauseOffset);
                chronometer.start();
                running = true;
            }
        };
        mainthing.setOnClickListener(status0);


        View.OnClickListener statusstop = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chronometer.stop();
                pauseOffset = SystemClock.elapsedRealtime() - chronometer.getBase();
                running = false;
            }
        };
        stopthing.setOnClickListener(statusstop);





        View.OnClickListener status1 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rb1.setChecked(true);
            }
        };
        im1.setOnClickListener(status1);

        View.OnClickListener status2 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new CountDownTimer(60000, 1000) {
                    @Override
                    public void onTick(long l) {
                        im2.setText("" + l/1000);
                        pb.setProgress((int) (l/1000));
                    }

                    @Override
                    public void onFinish() {
                        im2.setText("конец перерыва");
                        rb2.setChecked(true);
                    }
                }.start();
            }
        };
        im2.setOnClickListener(status2);

        View.OnClickListener status3 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rb3.setChecked(true);
            }
        };
        im3.setOnClickListener(status3);

        View.OnClickListener status4 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new CountDownTimer(60000, 1000) {
                    @Override
                    public void onTick(long l) {
                        im4.setText("" + l/1000);
                        pb.setProgress((int) (l/1000));
                    }

                    @Override
                    public void onFinish() {
                        im4.setText("конец перерыва");
                        rb4.setChecked(true);
                    }
                }.start();
            }
        };
        im4.setOnClickListener(status4);

        View.OnClickListener status5 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rb5.setChecked(true);
            }
        };
        im5.setOnClickListener(status5);

        View.OnClickListener status7 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rb7.setChecked(true);
                Intent intent = new Intent(armsthing.this, congrattext.class);
                startActivity(intent);
            }
        };
        im7.setOnClickListener(status7);

    }
}