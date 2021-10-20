package com.tecmanic.goservices.FemaleBooking.Female2Fragment;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tecmanic.goservices.R;
import java.util.ArrayList;


public class ServiceFemale2Fragment extends Fragment {
    RecyclerView rv;
    ArrayList<Female2bean>female2beans;
    Female2Adapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_service_female2_fragment,null);
        rv= v.findViewById(R.id.rv);
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
        adapter = new Female2Adapter(getContext(),female2beans);
        rv.setAdapter(adapter);
        LinearLayoutManager manager= new LinearLayoutManager(getContext());
        rv.setLayoutManager(manager);

        return v;
    }
}