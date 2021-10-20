package com.tecmanic.goservices.MaleBooking.ViewPageers;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.common.internal.Objects;
import com.tecmanic.goservices.R;
import java.util.ArrayList;

public class ServiceAdapter extends RecyclerView.Adapter<ServiceAdapter.ServiceViewHolder> {

    Context context;
    ArrayList<ServiceBean>serviceBeans;

    public ServiceAdapter(Context context, ArrayList<ServiceBean> serviceBeans) {
        this.context = context;
        this.serviceBeans = serviceBeans;
    }

    @Override
    public ServiceViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       View v= LayoutInflater.from(context).inflate(R.layout.itemmaleserviceadapter,parent,false);
        return new ServiceViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ServiceAdapter.ServiceViewHolder holder, int position) {
        ServiceBean b = serviceBeans.get(position);
        holder.price.setText(b.getPrice());
        holder.name.setText(b.getName());
    }

    @Override
    public int getItemCount() {
        return serviceBeans.size();
    }

    public class  ServiceViewHolder extends RecyclerView.ViewHolder{
        LinearLayout lll;
        TextView name,price;
        public ServiceViewHolder(View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.name);
            price=itemView.findViewById(R.id.price);
            lll=itemView.findViewById(R.id.ll);
            lll.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context, "Add to curd", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
