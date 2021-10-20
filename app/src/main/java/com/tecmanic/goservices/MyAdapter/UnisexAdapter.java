package com.tecmanic.goservices.MyAdapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.tecmanic.goservices.HomePageActivity;
import com.tecmanic.goservices.MaleBooking.MaleBooking;
import com.tecmanic.goservices.MyBean.Unisexbean;
import com.tecmanic.goservices.R;
import com.tecmanic.goservices.ServiceScreen;
import com.tecmanic.goservices.unisex.Unisex;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class UnisexAdapter extends RecyclerView.Adapter<UnisexAdapter.UnisexViewholder> {
    Context context;
    ArrayList<Unisexbean>unisexbeans;
    public UnisexAdapter(Context context, ArrayList<Unisexbean> unisexbeans) {
        this.context = context;
        this.unisexbeans = unisexbeans;
    }
    @Override
    public UnisexViewholder onCreateViewHolder( ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(context).inflate(R.layout.itemunisex,parent,false);
        return new UnisexViewholder(v);
    }
    @Override
    public void onBindViewHolder( UnisexAdapter.UnisexViewholder holder, int position) {
    Unisexbean unisexbean = unisexbeans.get(position);
    holder.civ.setImageResource(unisexbean.getCiv());
    holder.name.setText(unisexbean.getName());
    }
    @Override
    public int getItemCount() {
        return unisexbeans.size();
    }
    public  class UnisexViewholder extends RecyclerView.ViewHolder{
        CircleImageView civ;
        TextView name;
        CardView cardView;
        public UnisexViewholder( View itemView) {
            super(itemView);
            civ=itemView.findViewById(R.id.civ);
            name= itemView.findViewById(R.id.name);
            cardView= itemView.findViewById(R.id.cardview);
            cardView.setOnClickListener(new View.OnClickListener() {
                
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, MaleBooking.class);
                    context.startActivity(intent);

                }
            });
        }
    }
}
