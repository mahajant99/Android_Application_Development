package com.mahajant99.collegefour;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1, b2;
    EditText t1,t2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = t1.getText().toString();

                String nstr="";
                char ch;

                for (int i=0; i<s1.length(); i++)
                {
                    ch= s1.charAt(i); //extracts each character
                    nstr= ch+nstr; //adds each character in front of the existing string
                }
                Toast.makeText(getApplicationContext(),"Reverse: "+nstr+ ", Length: " + s1.length(), Toast.LENGTH_SHORT).show();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number, number1, digit, sum = 0;
                int reverse=0;
                String s2 = t2.getText().toString();
                number = Integer.parseInt(s2);
                number1 = Integer.parseInt(s2);

                while(number > 0)
                {
                    digit = number % 10;
                    sum = sum + digit;
                    number = number / 10;
                }

                for( ;number1 != 0; number1=number1/10)
                {
                    int remainder = number1 % 10;
                    reverse = reverse * 10 + remainder;
                }

                Toast.makeText(getApplicationContext(),"Sum: "+sum + ", Reverse: " + reverse, Toast.LENGTH_SHORT).show();

            }
        });



    }
}