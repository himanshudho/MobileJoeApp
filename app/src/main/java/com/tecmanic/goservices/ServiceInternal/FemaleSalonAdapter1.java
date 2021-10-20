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

import com.tecmanic.goservices.FemaleBooking.FemaleBooking;
import com.tecmanic.goservices.MaleBooking.MaleServiceScreen;
import com.tecmanic.goservices.MyAdapter.FemaleSaloonAdapter;
import com.tecmanic.goservices.MyBean.MaleSalonBean;
import com.tecmanic.goservices.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class FemaleSalonAdapter1  extends RecyclerView.Adapter<FemaleSalonAdapter1.FemaleSalonViewHolder1> {

    Context context;
    ArrayList<MaleSalonBean> maleSalonBeans;

    public FemaleSalonAdapter1(Context context, ArrayList<MaleSalonBean> maleSalonBeans) {
        this.context = context;
        this.maleSalonBeans = maleSalonBeans;
    }


    @Override
    public FemaleSalonViewHolder1 onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.itemfemale,parent,false);
        return new FemaleSalonViewHolder1(v);
    }

    @Override
    public void onBindViewHolder(FemaleSalonAdapter1.FemaleSalonViewHolder1 holder, int position) {
        MaleSalonBean b = maleSalonBeans.get(position);
        holder.name.setText(b.getName());
        holder.civ.setImageResource(b.getCiv());
    }

    @Override
    public int getItemCount() {
        return maleSalonBeans.size();
    }

    public  class  FemaleSalonViewHolder1 extends RecyclerView.ViewHolder{
        CircleImageView civ;
        TextView name;
        CardView cardView;

        public FemaleSalonViewHolder1( View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            civ=itemView.findViewById(R.id.civ);
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
