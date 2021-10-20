package com.tecmanic.goservices.MaleBooking.ViewPageers;


import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tecmanic.goservices.R;
import java.util.ArrayList;


public class ServiceFragment extends Fragment {
RecyclerView rv;
ArrayList<ServiceBean>serviceBeans;
ServiceAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_service_fragment,null);
       rv=v.findViewById(R.id.rv);
        serviceBeans=new ArrayList<>();
        serviceBeans.add(new ServiceBean("item name : - Hair Cut","Price : $50"));
        serviceBeans.add(new ServiceBean("item name : - Hair Salon","Price : $50"));
        serviceBeans.add(new ServiceBean("item name : - Hair Cut","Price : $50"));
        serviceBeans.add(new ServiceBean("item name : - Hair Salon","Price : $50"));
        serviceBeans.add(new ServiceBean("item name : - Hair Cut","Price : $50"));
        serviceBeans.add(new ServiceBean("item name : - Hair Salon","Price : $50"));
        serviceBeans.add(new ServiceBean("item name : - Hair Cut","Price : $50"));
        serviceBeans.add(new ServiceBean("item name : - Hair Salon","Price : $50"));
        serviceBeans.add(new ServiceBean("item name : - Hair Cut","Price : $50"));
        serviceBeans.add(new ServiceBean("item name : - Hair Salon","Price : $50"));
        serviceBeans.add(new ServiceBean("item name : - Hair Cut","Price : $50"));
        serviceBeans.add(new ServiceBean("item name : - Hair Salon","Price : $50"));
        serviceBeans.add(new ServiceBean("item name : - Hair Cut","Price : $50"));
        serviceBeans.add(new ServiceBean("item name : - Hair Salon","Price : $50"));

        adapter=new ServiceAdapter(getActivity(),serviceBeans);
        rv.setAdapter(adapter);
        LinearLayoutManager manager = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(manager);
        return v;
    }

}