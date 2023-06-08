package com.example.menubar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.*;
import android.view.*;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.mymenu1,menu);
        return true;
}

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        int id=item.getItemId();
        switch (id){
            case R.id.f1:
                Toast.makeText(getApplicationContext(),"file",Toast.LENGTH_SHORT).show();
                break;
            case R.id.c1:
                Toast.makeText(getApplicationContext(),"copy",Toast.LENGTH_SHORT).show();
                break;
            case R.id.c2:
                Toast.makeText(getApplicationContext(),"cut",Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}