package com.tecmanic.goservices.ServiceInternal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.tecmanic.goservices.CategoryScreeen;
import com.tecmanic.goservices.DoorStepScreen;
import com.tecmanic.goservices.FemaleSaloon;
import com.tecmanic.goservices.MaleSallon;
import com.tecmanic.goservices.R;

public class CategoryScreen1 extends AppCompatActivity {
    TextView mens,woman,unisex,doorstep;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_screen1);


        mens= findViewById(R.id.mens);
        woman = findViewById(R.id.woman);
        unisex = findViewById(R.id.unisex);
        doorstep = findViewById(R.id.doorstep);
        mens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MaleSallon.class);
                startActivity(intent);
            }
        });
        woman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), FemaleSaloon.class);
                startActivity(intent);
            }
        });
        unisex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FemaleSaloon.class);
                startActivity(intent);



            }
        });
        doorstep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });
    }
}