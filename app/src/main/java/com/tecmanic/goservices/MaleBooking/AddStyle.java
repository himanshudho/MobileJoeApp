package com.tecmanic.goservices.MaleBooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.tecmanic.goservices.HomePageActivity;
import com.tecmanic.goservices.R;

public class AddStyle extends AppCompatActivity {
    ImageView backbutton;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_style);
        backbutton = findViewById(R.id.backbutton);
        submit = findViewById(R.id.submit);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}