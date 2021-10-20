package com.tecmanic.goservices.ServiceInternal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.tecmanic.goservices.MyAdapter.MaleSalonAdapter;
import com.tecmanic.goservices.MyBean.MaleSalonBean;
import com.tecmanic.goservices.R;

import java.util.ArrayList;

public class MaleSalonCategory extends AppCompatActivity {
    RecyclerView rv;
    ArrayList<MaleSalonBean> maleSalonBeans;
    MaleSalonAdapter1 adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_male_salon_category);
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
        adapter = new MaleSalonAdapter1(this,maleSalonBeans);
        rv.setAdapter(adapter);
        LinearLayoutManager manager = new GridLayoutManager(this,2);
        rv.setLayoutManager(manager);
    }
}