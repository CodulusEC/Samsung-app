package com.example.con1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class congrattext extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_congrattext);

        Button one = (Button) findViewById(R.id.buttonspec);

        View.OnClickListener status2 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(congrattext.this, MainActivity.class);
                startActivity(intent);
            }
        };
        one.setOnClickListener(status2);

    }
}