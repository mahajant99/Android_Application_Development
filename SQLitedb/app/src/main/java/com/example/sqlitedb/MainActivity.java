package com.example.sqlitedb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.database.sqlite.*;
import android.widget.*;
import android.view.*;

public class MainActivity extends AppCompatActivity {
    SQLiteDatabase db;
    Cursor cr;
    EditText e1,e2;
    Button b1,b2,b3,b4,b5,b6;
    String s1,s2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=findViewById(R.id.pno);
        e2=findViewById(R.id.pname);
        b1=findViewById(R.id.add);
        b2=findViewById(R.id.insert);
        b3=findViewById(R.id.next);
        b4=findViewById(R.id.prev);
        b5=findViewById(R.id.first);
        b6=findViewById(R.id.last);

        db=openOrCreateDatabase("Mydb", Context.MODE_PRIVATE,null);
        db.execSQL("create table if not exists Mydb(pno varchar(3),pname varchar(15))");

        cr= db.rawQuery("select * from Mydb",null);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(" ");
                e2.setText(" ");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=e1.getText().toString();
                s2=e2.getText().toString();
                db.execSQL("insert into Mydb values('"+s1+"','"+s2+"')");
                Toast.makeText(getApplicationContext(),"Record added successfully",Toast.LENGTH_SHORT).show();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cr= db.rawQuery("select * from Mydb",null);
                cr.moveToNext();
                e1.setText(cr.getString(0));
                e2.setText(cr.getString(1));

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cr= db.rawQuery("select * from Mydb",null);
                cr.moveToPrevious();
                e1.setText(cr.getString(0));
                e2.setText(cr.getString(1));
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cr= db.rawQuery("select * from Mydb",null);
                cr.moveToFirst();
                e1.setText(cr.getString(0));
                e2.setText(cr.getString(1));
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cr= db.rawQuery("select * from Mydb",null);
                cr.moveToLast();
                e1.setText(cr.getString(0));
                e2.setText(cr.getString(1));
            }
        });


    }

}