package com.example.con1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Books extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);

        Button armsall = (Button) findViewById(R.id.butto1);
        Button legsbutton = (Button) findViewById(R.id.butto2);
        Button spinebutton = (Button) findViewById(R.id.butto3);

        View.OnClickListener oclboobsbutton = new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(Books.this, arms.class);
                startActivity(intent);
            }
        };
        armsall.setOnClickListener(oclboobsbutton);


        View.OnClickListener ocllegsbutton = new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(Books.this, Legs.class);
                startActivity(intent);
            }
        };
        legsbutton.setOnClickListener(ocllegsbutton);


        View.OnClickListener oclspinebutton = new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(Books.this, Spine.class);
                startActivity(intent);
            }
        };
        spinebutton.setOnClickListener(oclspinebutton);
    }
}