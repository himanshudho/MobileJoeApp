package com.tecmanic.goservices;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


import com.google.android.material.appbar.MaterialToolbar;
import com.tecmanic.goservices.MyAdapter.MaleSalonAdapter;
import com.tecmanic.goservices.MyBean.MaleSalonBean;

import java.util.ArrayList;

public class MaleSallon extends AppCompatActivity {
    RecyclerView rv;
    ArrayList<MaleSalonBean>maleSalonBeans;
    MaleSalonAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_male_sallon);
        rv=findViewById(R.id.rv);
        maleSalonBeans=new ArrayList<>();
        maleSalonBeans.add(new MaleSalonBean(R.drawable.malesalon112,"Beard Look"));
        maleSalonBeans.add(new MaleSalonBean(R.drawable.haridesing,"Heair cut"));
        maleSalonBeans.add(new MaleSalonBean(R.drawable.malesaloon2105,"Hair design"));
        maleSalonBeans.add(new MaleSalonBean(R.drawable.heair1,"Head Masaj"));
        maleSalonBeans.add(new MaleSalonBean(R.drawable.hair2,"Iborw set"));   maleSalonBeans.add(new MaleSalonBean(R.drawable.malesalon112,"Beard Set"));
        maleSalonBeans.add(new MaleSalonBean(R.drawable.hair4,"Fecial"));
        maleSalonBeans.add(new MaleSalonBean(R.drawable.hair2,"Hair Setting "));
        maleSalonBeans.add(new MaleSalonBean(R.drawable.malesalon112,"Beard Look"));
        maleSalonBeans.add(new MaleSalonBean(R.drawable.haridesing,"Heair cut"));
        maleSalonBeans.add(new MaleSalonBean(R.drawable.malesaloon2105,"Hair design"));
        maleSalonBeans.add(new MaleSalonBean(R.drawable.heair1,"Head Masaj"));
        maleSalonBeans.add(new MaleSalonBean(R.drawable.hair2,"Iborw set"));   maleSalonBeans.add(new MaleSalonBean(R.drawable.malesalon112,"Beard Set"));
        maleSalonBeans.add(new MaleSalonBean(R.drawable.hair4,"Fecial"));
        maleSalonBeans.add(new MaleSalonBean(R.drawable.hair2,"Hair Setting "));
        maleSalonBeans.add(new MaleSalonBean(R.drawable.malesalon112,"Beard Look"));
        maleSalonBeans.add(new MaleSalonBean(R.drawable.haridesing,"Heair cut"));
        maleSalonBeans.add(new MaleSalonBean(R.drawable.malesaloon2105,"Hair design"));
        maleSalonBeans.add(new MaleSalonBean(R.drawable.heair1,"Head Masaj"));
        maleSalonBeans.add(new MaleSalonBean(R.drawable.hair2,"Iborw set"));   maleSalonBeans.add(new MaleSalonBean(R.drawable.malesalon112,"Beard Set"));
        maleSalonBeans.add(new MaleSalonBean(R.drawable.hair4,"Fecial"));
        maleSalonBeans.add(new MaleSalonBean(R.drawable.hair2,"Hair Setting "));
        adapter = new MaleSalonAdapter(this,maleSalonBeans);
        rv.setAdapter(adapter);
        LinearLayoutManager manager = new GridLayoutManager(this,2);
        rv.setLayoutManager(manager);
    }
}