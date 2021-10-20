package com.tecmanic.goservices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.tecmanic.goservices.ServiceInternal.FemaleSalonCategory;
import com.tecmanic.goservices.ServiceInternal.MaleSalonCategory;
import com.tecmanic.goservices.unisex.Unisex;

public class CategoryScreeen extends AppCompatActivity {
    TextView mens,woman,unisex,doorstep;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_screeen);

        mens= findViewById(R.id.mens);
        woman = findViewById(R.id.woman);
        unisex = findViewById(R.id.unisex);
        doorstep = findViewById(R.id.doorstep);
        mens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent = new Intent(CategoryScreeen.this, MaleSalonCategory.class);
                startActivity(intent);

            }
        });
        woman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),  FemaleSalonCategory.class);
                startActivity(intent);
            }
        });
        unisex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MaleSalonCategory.class);
                startActivity(intent);




            }
        });
        doorstep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),DoorStepScreen.class);
                startActivity(intent);


            }
        });

    }
}