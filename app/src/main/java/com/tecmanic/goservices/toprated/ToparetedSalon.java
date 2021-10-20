package com.tecmanic.goservices.toprated;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.tecmanic.goservices.R;

import java.util.ArrayList;

public class ToparetedSalon extends AppCompatActivity {

    RecyclerView rv;
    TopretedAdapter adapter;
    ArrayList<Topratedbean>topratedbeans;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topareted_salon);
        rv=findViewById(R.id.rv);
        topratedbeans= new ArrayList<>();
        topratedbeans.add(new Topratedbean(R.drawable.apploco,"Banganga, indore","Beauti Salon","Opentime : 10AM","Closetime : 10PM"));
        topratedbeans.add(new Topratedbean(R.drawable.apploco,"Banganga, indore","Beauti Salon","Opentime : 10AM","Closetime : 10PM"));
        topratedbeans.add(new Topratedbean(R.drawable.apploco,"Banganga, indore","Beauti Salon","Opentime : 10AM","Closetime : 10PM"));
        topratedbeans.add(new Topratedbean(R.drawable.apploco,"Banganga, indore","Beauti Salon","Opentime : 10AM","Closetime : 10PM"));   topratedbeans.add(new Topratedbean(R.drawable.apploco,"Banganga, indore","Beauti Salon","Opentime : 10AM","Closetime : 10PM"));   topratedbeans.add(new Topratedbean(R.drawable.apploco,"Banganga, indore","Beauti Salon","Opentime : 10AM","Closetime : 10PM"));
        topratedbeans.add(new Topratedbean(R.drawable.apploco,"Banganga, indore","Beauti Salon","Opentime : 10AM","Closetime : 10PM"));
       adapter = new TopretedAdapter(this,topratedbeans);
       rv.setAdapter(adapter);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        rv.setLayoutManager(manager);


    }
}