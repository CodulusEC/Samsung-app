package com.example.con1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class timescreen extends AppCompatActivity {

    public TextView tv;
    public ProgressBar pb;
    public Button bt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timescreen);

        tv = findViewById(R.id.textView2);
        pb = findViewById(R.id.progressBar2);

        new CountDownTimer(10000, 1000) {
            @Override
            public void onTick(long l) {
                tv.setText("" + l/1000);
                pb.setProgress((int) (l/1000));
            }

            @Override
            public void onFinish() {
                tv.setText("конец перерыва");
                Intent intent = new Intent(timescreen.this, sportthing.class);
                startActivity(intent);
            }
        }.start();


    }
}