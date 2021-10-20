package com.tecmanic.goservices.unisex.ViewPagersUnisex;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tecmanic.goservices.R;

import java.util.ArrayList;

public class ServiceFemaleFragment extends Fragment {
    ImageView backbutton;
    RecyclerView rv;
    UnisexServiceAdapter adapter;
    ArrayList<UnisexBean>unisexBeans;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_service_female_fragment,null);
       backbutton=v.findViewById(R.id.backbutton);
       rv=v.findViewById(R.id.rv);
       unisexBeans=new ArrayList<>();
       unisexBeans.add(new UnisexBean("item name : hair cut ","Price : 500"));
        unisexBeans.add(new UnisexBean("item name : hair cut ","Price : 500"));
        unisexBeans.add(new UnisexBean("item name : hair cut ","Price : 500"));
        unisexBeans.add(new UnisexBean("item name : hair cut ","Price : 500"));
        unisexBeans.add(new UnisexBean("item name : hair cut ","Price : 500"));
        unisexBeans.add(new UnisexBean("item name : hair cut ","Price : 500"));
        unisexBeans.add(new UnisexBean("item name : hair cut ","Price : 500"));

        adapter=new UnisexServiceAdapter(getContext(),unisexBeans);
        rv.setAdapter(adapter);
        LinearLayoutManager manager = new LinearLayoutManager(getContext());
        rv.setLayoutManager(manager);

        return v;
    }
}