package com.tecmanic.goservices.ServiceInternal;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.tecmanic.goservices.MaleBooking.MaleBooking;
import com.tecmanic.goservices.MaleBooking.MaleServiceScreen;
import com.tecmanic.goservices.MyAdapter.MaleSalonAdapter;
import com.tecmanic.goservices.MyBean.MaleSalonBean;
import com.tecmanic.goservices.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class MaleSalonAdapter1 extends RecyclerView.Adapter<MaleSalonAdapter1.MaleSalonViewHolder1> {


    Context context;
    ArrayList<MaleSalonBean> maleSalonBeans;

    public MaleSalonAdapter1(Context context, ArrayList<MaleSalonBean> maleSalonBeans) {
        this.context = context;
        this.maleSalonBeans = maleSalonBeans;

    }


    @Override
    public MaleSalonViewHolder1 onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(context).inflate(R.layout.itemmalesalon,parent,false);
        return new MaleSalonViewHolder1(v);


    }

    @Override
    public void onBindViewHolder(MaleSalonAdapter1.MaleSalonViewHolder1 holder, int position) {
        MaleSalonBean b = maleSalonBeans.get(position);
        holder.name.setText(b.getName());
        holder.civ.setImageResource(b.getCiv());
    }

    @Override
    public int getItemCount() {
        return maleSalonBeans.size();
    }


    public  class  MaleSalonViewHolder1 extends RecyclerView.ViewHolder{
        CircleImageView civ;
        TextView name;
        CardView cardView;

        public MaleSalonViewHolder1( View itemView) {
            super(itemView);
            civ = itemView.findViewById(R.id.civ);
            name=itemView.findViewById(R.id.name);
            cardView = itemView.findViewById(R.id.cardview);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, MaleServiceScreen.class);
                    context.startActivity(intent);
                }
            });
        }
    }





}

