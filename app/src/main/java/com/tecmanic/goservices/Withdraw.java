package com.tecmanic.goservices;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.tecmanic.goservices.MyAdapter.UnisexAdapter;
import com.tecmanic.goservices.MyBean.Unisexbean;

import java.util.ArrayList;

public class Withdraw extends AppCompatActivity {
    RecyclerView rv;
    UnisexAdapter adapter;
    ArrayList<Unisexbean>unisexbeans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_withdraw);
        rv=findViewById(R.id.rv);
        unisexbeans=new ArrayList<>();
        unisexbeans.add(new Unisexbean(R.drawable.beauti,"beauti"));
        unisexbeans.add(new Unisexbean(R.drawable.beauti1,"Lipstic"));
        unisexbeans.add(new Unisexbean(R.drawable.haridesing,"Head Masaj"));
        unisexbeans.add(new Unisexbean(R.drawable.beauti2,"eye brow"));
        unisexbeans.add(new Unisexbean(R.drawable.malesalon112,"beauti lips"));
        unisexbeans.add(new Unisexbean(R.drawable.beauti,"beauti"));
        unisexbeans.add(new Unisexbean(R.drawable.beauti1,"Lipstic"));
        unisexbeans.add(new Unisexbean(R.drawable.haridesing,"Head Masaj"));
        unisexbeans.add(new Unisexbean(R.drawable.beauti2,"eye brow"));
        unisexbeans.add(new Unisexbean(R.drawable.malesalon112,"beauti lips"));
        unisexbeans.add(new Unisexbean(R.drawable.beauti,"beauti"));
        unisexbeans.add(new Unisexbean(R.drawable.beauti1,"Lipstic"));
        unisexbeans.add(new Unisexbean(R.drawable.haridesing,"Head Masaj"));
        unisexbeans.add(new Unisexbean(R.drawable.beauti2,"eye brow"));
        unisexbeans.add(new Unisexbean(R.drawable.malesalon112,"beauti lips"));

        unisexbeans.add(new Unisexbean(R.drawable.beauti,"beauti"));
        adapter = new UnisexAdapter(this,unisexbeans);
        rv.setAdapter(adapter);
        LinearLayoutManager manager = new GridLayoutManager(this,2);
        rv.setLayoutManager(manager);

    }

}