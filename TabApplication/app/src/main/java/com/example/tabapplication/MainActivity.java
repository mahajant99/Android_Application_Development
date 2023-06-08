package com.example.tabapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {
    TabHost tabh;
    EditText e1,e2,e3,e4,e5,e6;
    Button login,submit;
    String s1,s2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabh=findViewById(R.id.tabh);
        e1=findViewById(R.id.et1);
        e2=findViewById(R.id.et2);
        e3=findViewById(R.id.et3);
        e4=findViewById(R.id.et4);
        e5=findViewById(R.id.et5);
        e6=findViewById(R.id.et6);
        login=findViewById(R.id.login);
        submit=findViewById(R.id.submit);

        tabh.setup();

        TabHost.TabSpec tab1=tabh.newTabSpec("Tab1");
        tab1.setIndicator("LOGIN");
        tab1.setContent(R.id.tab1);

        TabHost.TabSpec tab2=tabh.newTabSpec("Tab2");
        tab2.setIndicator("REGISTER");
        tab2.setContent(R.id.tab2);

        tabh.addTab(tab1);
        tabh.addTab(tab2);

        tabh.setCurrentTab(0);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=e1.getText().toString();
                s2=e2.getText().toString();

                if (s1.equals("sia") && s2.equals("1234")){
                    Toast.makeText(getApplicationContext(),"Login successful!!",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Invalid credentials!",Toast.LENGTH_SHORT).show();
                }
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Data saved!!",Toast.LENGTH_SHORT).show();
            }
        });



    }
}