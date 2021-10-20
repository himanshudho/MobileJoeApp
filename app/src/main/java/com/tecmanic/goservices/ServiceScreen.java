package com.tecmanic.goservices;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.tecmanic.goservices.FemaleBooking.Female2Fragment.Female2Adapter;
import com.tecmanic.goservices.FemaleBooking.Female2Fragment.Female2bean;

import java.util.ArrayList;

public class ServiceScreen extends AppCompatActivity {
    RecyclerView rv;
    ArrayList<Female2bean> female2beans;
    Female2Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_screen);
        rv= findViewById(R.id.rv);
        female2beans = new ArrayList<>();
        female2beans.add(new Female2bean("Pedicure","Price : $20"));
        female2beans.add(new Female2bean("NailPolish","Price : $40"));
        female2beans.add(new Female2bean("Pedicure","Price : $20"));
        female2beans.add(new Female2bean("NailPolish","Price : $40"));
        female2beans.add(new Female2bean("Pedicure","Price : $20"));
        female2beans.add(new Female2bean("NailPolish","Price : $40"));
        female2beans.add(new Female2bean("Pedicure","Price : $20"));
        female2beans.add(new Female2bean("NailPolish","Price : $40"));
        female2beans.add(new Female2bean("Pedicure","Price : $20"));
        female2beans.add(new Female2bean("NailPolish","Price : $40"));
        female2beans.add(new Female2bean("Pedicure","Price : $20"));
        female2beans.add(new Female2bean("NailPolish","Price : $40"));
        female2beans.add(new Female2bean("Pedicure","Price : $20"));
        female2beans.add(new Female2bean("NailPolish","Price : $40"));
        adapter = new Female2Adapter(getApplicationContext(),female2beans);
        rv.setAdapter(adapter);
        LinearLayoutManager manager= new LinearLayoutManager(getApplicationContext());
        rv.setLayoutManager(manager);


    }
}