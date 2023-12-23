package com.example.exc0614;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView text3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        text3 = findViewById(R.id.text3);
    }
    int counter = 0 ;
    public void ace(View view) {
        counter += 1 ;
        text3.setTextSize(50);
        text3.setText("This is a click number:" + counter);
        if (counter % 7 == 0)
            text3.setText("kaboom!!!");


    }
}