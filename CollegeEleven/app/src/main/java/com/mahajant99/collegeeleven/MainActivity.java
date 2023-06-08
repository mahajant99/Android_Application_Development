package com.mahajant99.collegeeleven;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner sp1,sp2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp1=findViewById(R.id.sp1);
        sp2=findViewById(R.id.sp2);

        String ele[]={"Programming Language","Operating System","Application"};

        ArrayAdapter aa=new ArrayAdapter(
                getApplicationContext(),
                android.R.layout.simple_spinner_item,ele);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp1.setAdapter(aa);

        sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView parent, View v, int i, long b) {
                String ss=sp1.getSelectedItem().toString();

                ArrayAdapter aa1=null;

                String pl[]={"C++","Java","PHP"};
                String os[]={"Windows","MacOS","Linux"};
                String ap[]={"MSWord","Paint","Notepad"};

                if(ss.equals("Programming Language")){
                    aa1=new ArrayAdapter(
                            getApplicationContext(),
                            android.R.layout.simple_spinner_item,pl);
                }if(ss.equals("Operating System")){
                    aa1=new ArrayAdapter(
                            getApplicationContext(),
                            android.R.layout.simple_spinner_item,os);
                }if(ss.equals("Application")){
                    aa1=new ArrayAdapter(
                            getApplicationContext(),
                            android.R.layout.simple_spinner_item,ap);
                }

                aa1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                sp2.setAdapter(aa1);
            }

            @Override
            public void onNothingSelected(AdapterView parent) {

            }
        });

    }
}