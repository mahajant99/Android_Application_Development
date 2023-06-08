package com.mahajant99.collegeten;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1;
    Spinner s1;
    EditText e1;

    int wordCount(String n){
        int c=1;
        for (int i = 0; i <n.length(); i++) {
            if(n.charAt(i)==' ')
                c++;
        }
        return c;
    }

    int vowelCount(String n){
        n=n.toUpperCase();
        int c=0;
        for (int i = 0; i < n.length(); i++) {
            if(n.charAt(i)=='A' ||n.charAt(i)=='E' ||n.charAt(i)=='I' ||n.charAt(i)=='O' ||n.charAt(i)=='U' )
                c++;
        }
        return c;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=findViewById(R.id.b1);
        e1=findViewById(R.id.e1);
        s1=findViewById(R.id.s1);

        String data[]={"No. of words","each word print","vowel count"};

        ArrayAdapter aa=new ArrayAdapter(getApplicationContext(),
                android.R.layout.simple_spinner_item,data);

        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s1.setAdapter(aa);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String z=s1.getSelectedItem().toString();
                if(z.equalsIgnoreCase("No. of words")){
                    Toast.makeText(getApplicationContext(),"No. of Words = "+wordCount(e1.getText().toString()),Toast.LENGTH_LONG).show();
                }
                else if(z.equalsIgnoreCase("each word print")){
                    String x=e1.getText().toString();
                    String b="";
                    for (int i = 0; i <x.length() ; i++) {
                        if(x.charAt(i)!=' ')
                            b=b+x.charAt(i);
                        else
                            b+="\n";
                    }
                    Toast.makeText(getApplicationContext(),b,Toast.LENGTH_SHORT).show();
                }
                else if(z.equalsIgnoreCase("vowel count")) {
                    Toast.makeText(getApplicationContext(), "Vowel Count = "+vowelCount(e1.getText().toString()), Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}