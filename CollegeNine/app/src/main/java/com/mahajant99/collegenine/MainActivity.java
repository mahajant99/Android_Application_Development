package com.mahajant99.collegenine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1;
    Spinner s1;
    EditText e1;

    int checkPrime(int n){
        int c =0;
        for(int i = 1; i<=n;i++){
            if(n%i==0){
                c++;
            }
        }
        return c;
    }

    int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }

    String isoddeven(int n){
        if(n%2!=0) {
            return "odd";
        }else {
            return "even";
        }
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=findViewById(R.id.b1);
        s1=findViewById(R.id.s1);
        e1=findViewById(R.id.e1);


        String s []={"Check Prime" , "Factorial" , "Odd/Even"};

        ArrayAdapter aa = new ArrayAdapter(
                getApplicationContext(),
                android.R.layout.simple_spinner_item,s);

        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s1.setAdapter(aa);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String abc = s1.getSelectedItem().toString();
                if(abc.equals("Check Prime")){
                    if(checkPrime(Integer.parseInt(e1.getText().toString()))==2){
                        Toast.makeText(getApplicationContext(),
                                "Prime Number", Toast.LENGTH_SHORT).show();
                    }else{
                        Toast.makeText(getApplicationContext(),
                                "Not a Prime Number", Toast.LENGTH_SHORT).show();
                    }
                }
                else if (abc.equals("Factorial")){
                    int x=factorial(Integer.parseInt(e1.getText().toString()));
                    Toast.makeText(getApplicationContext(),
                            "Factorial = "+x, Toast.LENGTH_SHORT).show();
                }
                else if(abc.equals("Odd/Even")){
                    Toast.makeText(getApplicationContext(),
                            isoddeven(Integer.parseInt(e1.getText().toString())),
                            Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}