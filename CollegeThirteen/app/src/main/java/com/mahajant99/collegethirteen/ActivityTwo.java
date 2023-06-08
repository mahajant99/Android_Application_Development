package com.mahajant99.collegethirteen;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityTwo extends AppCompatActivity {
    TextView t3;
    Button b2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        t3 = findViewById(R.id.t3);
        b2 = findViewById(R.id.b2);

        Intent i = getIntent();

        String s = i.getExtras().getString("abc");
        String s1 = i.getExtras().getString("xyz");

        if(s.equals("admin")&& s1.equals("admin1234")){
            t3.setText("Welcome");
        }
        else {
            t3.setText("Error");
        }

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i2);
            }
        });

    }
}