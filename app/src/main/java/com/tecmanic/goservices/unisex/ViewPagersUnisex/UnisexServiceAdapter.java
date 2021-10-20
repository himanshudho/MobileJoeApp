package com.tecmanic.goservices.unisex.ViewPagersUnisex;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.tecmanic.goservices.R;
import java.util.ArrayList;

public class UnisexServiceAdapter extends RecyclerView.Adapter<UnisexServiceAdapter.UnisexServiceViewHolder> {

    Context context;
    ArrayList<UnisexBean>unisexBeans;

    public UnisexServiceAdapter(Context context, ArrayList<UnisexBean> unisexBeans) {
        this.context = context;
        this.unisexBeans = unisexBeans;

    }

    @Override
    public UnisexServiceViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       View v = LayoutInflater.from(context).inflate(R.layout.itemunisexserviceadapter,parent,false);
        return new UnisexServiceViewHolder(v);
    }

    @Override
    public void onBindViewHolder(UnisexServiceAdapter.UnisexServiceViewHolder holder, int position) {

        UnisexBean b = unisexBeans.get(position);

    }

    @Override
    public int getItemCount() {
        return unisexBeans.size();
    }

    public class UnisexServiceViewHolder extends RecyclerView.ViewHolder{
        TextView name,price;
        LinearLayout lll;

        public UnisexServiceViewHolder(View itemView) {
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
