package com.example.con1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final int[] sign = {0};

        ImageButton boobsbutton = (ImageButton) findViewById(R.id.boobsbutton2);
        ImageButton difstatus1 = (ImageButton) findViewById(R.id.armbut);
        ImageButton difstatus2 = (ImageButton) findViewById(R.id.legsbut);
        ImageButton difstatus3 = (ImageButton) findViewById(R.id.spinebut);
        Button startbuttnon = (Button) findViewById(R.id.startbutton);
        ImageView changesthing = (ImageView) findViewById(R.id.difstatus);
        ImageButton faqy = (ImageButton) findViewById(R.id.button888);

        View.OnClickListener faqus = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FAQ.class);
                startActivity(intent);
            }
        };
        faqy.setOnClickListener(faqus);

        View.OnClickListener status1 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sign[0] = 1;
                changesthing.setImageResource(R.drawable.state1);
            }
        };
        difstatus1.setOnClickListener(status1);

        View.OnClickListener status2 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sign[0] = 2;
                changesthing.setImageResource(R.drawable.state2);
            }
        };
        difstatus2.setOnClickListener(status2);

        View.OnClickListener status3 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sign[0] = 3;
                changesthing.setImageResource(R.drawable.state3);
            }
        };
        difstatus3.setOnClickListener(status3);

        View.OnClickListener oclboobsbutton = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Books.class);
                startActivity(intent);
            }
        };
        boobsbutton.setOnClickListener(oclboobsbutton);

        View.OnClickListener starnut = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sign[0] == 3) {
                    Intent intent = new Intent(MainActivity.this, sportthing.class);
                    startActivity(intent);
                }
                if (sign[0] == 2) {
                    Intent intente = new Intent(MainActivity.this, legsportthing.class);
                    startActivity(intente);
                }
                if (sign[0] == 1) {
                    Intent intente = new Intent(MainActivity.this, armsthing.class);
                    startActivity(intente);
                }
            }
        };
        startbuttnon.setOnClickListener(starnut);

    }
}