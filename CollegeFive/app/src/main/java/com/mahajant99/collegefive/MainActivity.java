package com.mahajant99.collegefive;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1;
    EditText e1;
    TextView t1;
    CheckBox c1,c2,c3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.b1);
        e1 = findViewById(R.id.e1);
        t1 = findViewById(R.id.t1);
        c1 = findViewById(R.id.c1);
        c2 = findViewById(R.id.c2);
        c3 = findViewById(R.id.c3);

        b1.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view)
            {
                String n1 = e1.getText().toString();
                String hexNum1 = "";
                String hexNum2 = "";
                if(c1.isChecked()==false && c2.isChecked()==false && c3.isChecked()==false)
                {
                    t1.setText(n1);
                }
                if(c1.isChecked())
                {
                    Integer dec1 = Integer.parseInt(n1);
                    String hexNum = Integer.toHexString(dec1);
                    t1.setText(hexNum);
                    hexNum1 = hexNum;
                }
                if(c2.isChecked())
                {
                    Integer dec1 = Integer.parseInt(n1);
                    String hexNum = Integer.toOctalString(dec1);
                    t1.setText(hexNum1  + '\n' +  hexNum);
                    hexNum2 =  hexNum1 + '\n' + hexNum;
                }
                if(c3.isChecked())
                {
                    Integer dec1 = Integer.parseInt(n1);
                    String hexNum = Integer.toBinaryString(dec1);
                    if(c2.isChecked())
                    {
                        t1.setText(hexNum2 + '\n' + hexNum);
                    }
                    else if(c1.isChecked())
                    {
                        t1.setText(hexNum1 + '\n' + hexNum);
                    }
                    else if(c3.isChecked())
                    {
                        t1.setText(hexNum);
                    }
                }
            }
        });

    }
}