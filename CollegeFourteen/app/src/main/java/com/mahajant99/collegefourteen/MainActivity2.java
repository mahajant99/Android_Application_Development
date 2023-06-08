package com.mahajant99.collegefourteen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity2 extends AppCompatActivity
{
    Button b;
    Spinner spin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        b = findViewById(R.id.b2);
        spin = findViewById(R.id.s1);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                MainActivity2.this,
                android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.ProCat));
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(adapter);

        b.setOnClickListener(v -> {
            Intent i = new Intent(MainActivity2.this,MainActivity3.class);
            i.putExtra("txt", spin.getSelectedItem().toString());
            startActivity(i);
        });
    }
}
