package com.mahajant99.collegethree;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button one,two,three,four,five,six,seven,eight,nine,zero;
    Button add,minus,multiply,divide,clear,equal,dot;
    EditText e1;
    float num1, num2;
    boolean Addition, Subtract, Multiplication,Division;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one=findViewById(R.id.one);
        two=findViewById(R.id.two);
        three=findViewById(R.id.three);
        four=findViewById(R.id.four);
        five=findViewById(R.id.five);
        six=findViewById(R.id.six);
        seven=findViewById(R.id.seven);
        eight=findViewById(R.id.eight);
        seven=findViewById(R.id.seven);
        nine=findViewById(R.id.nine);
        zero=findViewById(R.id.zero);
        add=findViewById(R.id.add);
        minus=findViewById(R.id.minus);
        multiply=findViewById(R.id.multiply);
        divide=findViewById(R.id.divide);
        clear=findViewById(R.id.clear);
        equal=findViewById(R.id.equal);
        e1=findViewById(R.id.e1);
        dot=findViewById(R.id.dot);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                e1.setText(e1.getText()+"1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText()+"2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText()+"3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText()+"4");
            }
        });


        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText()+"5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText()+"6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText()+"7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText()+"8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText()+"9");
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText()+"0");
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText("");
            }
        });


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (e1 == null){
                    e1.setText("");
                }else{
                    num1 = Float.parseFloat(e1.getText()+"");
                    Addition = true;
                    e1.setText(null);
                }
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (e1 == null){
                    e1.setText("");
                }else{
                    num1 = Float.parseFloat(e1.getText()+"");
                    Subtract = true;
                    e1.setText(null);
                }
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (e1 == null){
                    e1.setText("");
                }else{
                    num1 = Float.parseFloat(e1.getText()+"");
                    Multiplication = true;
                    e1.setText(null);
                }
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (e1 == null){
                    e1.setText("");
                }else{
                    num1 = Float.parseFloat(e1.getText()+"");
                    Division = true;
                    e1.setText(null);
                }
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num2 = Float.parseFloat(e1.getText() + "");
                if (Addition == true) {
                    e1.setText(num1 + num2 + "");
                    Addition = false;
                }
                if (Subtract == true) {
                    e1.setText(num1 - num2 + "");
                    Subtract = false;
                }
                if (Multiplication == true) {
                    e1.setText(num1 * num2 + "");
                    Multiplication = false;
                }
                if (Division == true) {
                    e1.setText(num1 / num2 + "");
                    Division = false;
                }
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText() + ".");
            }
        });

    }
}