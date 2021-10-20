package com.tecmanic.goservices.FemaleBooking.Female2Fragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tecmanic.goservices.R;

import java.util.ArrayList;

public class Female2Adapter extends  RecyclerView.Adapter<Female2Adapter.Female2ViewHolder> {
    Context context;
    ArrayList<Female2bean>female2beans;

    public Female2Adapter(Context context, ArrayList<Female2bean> female2beans) {
        this.context = context;
        this.female2beans = female2beans;
    }


    @Override
    public Female2ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
     View v = LayoutInflater.from(context).inflate(R.layout.itemfemale2viewpadgeradapter,parent,false);
        return new Female2ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(Female2Adapter.Female2ViewHolder holder, int position) {


        Female2bean b = female2beans.get(position);
        holder.price.setText(b.getPrice());
        holder.name.setText(b.getName());
    }

    @Override
    public int getItemCount() {
        return female2beans.size();
    }

    public class  Female2ViewHolder extends RecyclerView.ViewHolder{
        LinearLayout ll;

TextView name,price;
        public Female2ViewHolder(View itemView) {
            super(itemView);

            name=itemView.findViewById(R.id.name);
            price=itemView.findViewById(R.id.price);
            ll= itemView.findViewById(R.id.ll);
            ll.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context, "Add to curd", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
