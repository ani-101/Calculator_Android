package com.example.implicit_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b,b2,b3,b4;
    EditText t1,t2;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.text1);
        t2 = findViewById(R.id.text2);
        b = findViewById(R.id.button);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        txt = findViewById(R.id.txt);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(t1.getText().toString());
                int b = Integer.parseInt(t2.getText().toString());
                int c = a+b;
                txt.setText(String.valueOf(c)); //for addition
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(t1.getText().toString());
                int b = Integer.parseInt(t2.getText().toString());
                int c = a-b;
                txt.setText(String.valueOf(c)); //for addition
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(t1.getText().toString());
                int b = Integer.parseInt(t2.getText().toString());
                int c = a*b;
                txt.setText(String.valueOf(c)); //for addition
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(t1.getText().toString());
                int b = Integer.parseInt(t2.getText().toString());
                int c = a/b;
                txt.setText(String.valueOf(c)); //for addition
            }
        });
    }
}