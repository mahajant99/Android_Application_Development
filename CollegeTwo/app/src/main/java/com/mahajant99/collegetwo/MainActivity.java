package com.mahajant99.collegetwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText n1;
    EditText n2;
    Button b1,b2,b3,b4;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1=findViewById(R.id.n1);
        n2=findViewById(R.id.n2);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        t1=findViewById(R.id.t1);

        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                String s1 = n1.getText().toString();
                String s2 = n2.getText().toString();
                int a = Integer.parseInt(s1);
                int b = Integer.parseInt(s2);

                int c = a+b;
                t1.setText(""+c);
                Toast.makeText(getApplicationContext(),"Answer: "+c,Toast.LENGTH_SHORT).show();

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = n1.getText().toString();
                String s2 = n2.getText().toString();
                int a = Integer.parseInt(s1);
                int b = Integer.parseInt(s2);

                int c = a-b;
                t1.setText(""+c);
                Toast.makeText(getApplicationContext(),"Answer: "+c,Toast.LENGTH_SHORT).show();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = n1.getText().toString();
                String s2 = n2.getText().toString();
                int a = Integer.parseInt(s1);
                int b = Integer.parseInt(s2);

                int c = a*b;
                t1.setText(""+c);
                Toast.makeText(getApplicationContext(),"Answer: "+c,Toast.LENGTH_SHORT).show();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = n1.getText().toString();
                String s2 = n2.getText().toString();
                int a = Integer.parseInt(s1);
                int b = Integer.parseInt(s2);

                int c = a/b;
                t1.setText(""+c);

                Toast.makeText(getApplicationContext(),"Answer: "+c,Toast.LENGTH_SHORT).show();
            }
        });

    }
}