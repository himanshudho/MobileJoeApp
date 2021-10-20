package com.tecmanic.goservices.unisex.ViewPagersUnisex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.widget.ImageView;
import com.tecmanic.goservices.R;
import java.util.ArrayList;

public class ServiceActivityFemale extends AppCompatActivity {
    ImageView backbutton;
    RecyclerView rv;
    UnisexServiceAdapter adapter;
    ArrayList<UnisexBean> unisexBeans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_female);
        backbutton=findViewById(R.id.backbutton);
        rv=findViewById(R.id.rv);
        unisexBeans=new ArrayList<>();
        unisexBeans.add(new UnisexBean("item name : hair cut ","Price : 500"));
        unisexBeans.add(new UnisexBean("item name : hair cut ","Price : 500"));
        unisexBeans.add(new UnisexBean("item name : hair cut ","Price : 500"));
        unisexBeans.add(new UnisexBean("item name : hair cut ","Price : 500"));
        unisexBeans.add(new UnisexBean("item name : hair cut ","Price : 500"));
        unisexBeans.add(new UnisexBean("item name : hair cut ","Price : 500"));
        unisexBeans.add(new UnisexBean("item name : hair cut ","Price : 500"));

        adapter=new UnisexServiceAdapter(getApplicationContext(),unisexBeans);
        rv.setAdapter(adapter);
        LinearLayoutManager manager = new LinearLayoutManager(getApplicationContext());
        rv.setLayoutManager(manager);



    }
}