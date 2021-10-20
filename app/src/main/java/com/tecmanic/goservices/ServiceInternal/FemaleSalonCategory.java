package com.tecmanic.goservices.ServiceInternal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.tecmanic.goservices.MyAdapter.FemaleSaloonAdapter;
import com.tecmanic.goservices.MyBean.MaleSalonBean;
import com.tecmanic.goservices.R;

import java.util.ArrayList;

public class FemaleSalonCategory extends AppCompatActivity {
    RecyclerView rv;
    ArrayList<MaleSalonBean> maleSalonBeans;
    FemaleSalonAdapter1 adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_female_salon_category);
        rv=findViewById(R.id.rv);









        maleSalonBeans =new ArrayList<>();
        maleSalonBeans.add(new MaleSalonBean(R.drawable.beauti,"Beauti FashWash"));
        maleSalonBeans.add(new MaleSalonBean(R.drawable.fingernail,"Finfernail"));
        maleSalonBeans.add(new MaleSalonBean(R.drawable.beauti1,"beauti lips"));
        maleSalonBeans.add(new MaleSalonBean(R.drawable.beauti,"Beauti FashWash"));
        maleSalonBeans.add(new MaleSalonBean(R.drawable.beauti2,"Eye brow"));
        maleSalonBeans.add(new MaleSalonBean(R.drawable.heair1,"beauti lips"));
        maleSalonBeans.add(new MaleSalonBean(R.drawable.makeup,"Full Makeup"));
        maleSalonBeans.add(new MaleSalonBean(R.drawable.malesalon112,"beauti lips"));
        maleSalonBeans.add(new MaleSalonBean(R.drawable.beauti,"Beauti FashWash"));
        maleSalonBeans.add(new MaleSalonBean(R.drawable.fingernail,"Finfernail"));
        maleSalonBeans.add(new MaleSalonBean(R.drawable.beauti1,"beauti lips"));
        maleSalonBeans.add(new MaleSalonBean(R.drawable.beauti,"Beauti FashWash"));
        maleSalonBeans.add(new MaleSalonBean(R.drawable.beauti2,"Eye brow"));
        maleSalonBeans.add(new MaleSalonBean(R.drawable.heair1,"beauti lips"));
        maleSalonBeans.add(new MaleSalonBean(R.drawable.makeup,"Full Makeup"));
        maleSalonBeans.add(new MaleSalonBean(R.drawable.malesalon112,"beauti lips"));
        maleSalonBeans.add(new MaleSalonBean(R.drawable.beauti,"Beauti FashWash"));
        maleSalonBeans.add(new MaleSalonBean(R.drawable.fingernail,"Finfernail"));
        maleSalonBeans.add(new MaleSalonBean(R.drawable.beauti1,"beauti lips"));
        maleSalonBeans.add(new MaleSalonBean(R.drawable.beauti,"Beauti FashWash"));
        maleSalonBeans.add(new MaleSalonBean(R.drawable.beauti2,"Eye brow"));
        maleSalonBeans.add(new MaleSalonBean(R.drawable.heair1,"beauti lips"));
        maleSalonBeans.add(new MaleSalonBean(R.drawable.makeup,"Full Makeup"));
        maleSalonBeans.add(new MaleSalonBean(R.drawable.malesalon112,"beauti lips"));


        adapter= new FemaleSalonAdapter1(this,maleSalonBeans);
        rv.setAdapter(adapter);
        LinearLayoutManager manager = new GridLayoutManager(this,2);
        rv.setLayoutManager(manager);


    }
}