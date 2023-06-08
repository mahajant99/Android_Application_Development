package com.mahajant99.collegefourteen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    Button b1;
    EditText e1,e2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.b1);
        e1 = findViewById(R.id.et1);
        e2 = findViewById(R.id.et2);

        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                String n = e1.getText().toString();
                String m = e2.getText().toString();

                if(n.equals("user") && m.equals("pass"))
                {
                    Intent i = new Intent(MainActivity.this,MainActivity2.class);
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(getBaseContext(),"Enter Username or Password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    };
}
