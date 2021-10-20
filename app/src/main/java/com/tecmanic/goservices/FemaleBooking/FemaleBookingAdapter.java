package com.tecmanic.goservices.FemaleBooking;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tecmanic.goservices.FemaleBooking.Female2Fragment.FemalProfile;
import com.tecmanic.goservices.HomePageActivity;
import com.tecmanic.goservices.MaleBooking.AddStyle;
import com.tecmanic.goservices.MaleBooking.MaleBookingViewpager;
import com.tecmanic.goservices.MaleBooking.MaleServiceScreen;
import com.tecmanic.goservices.R;

import java.util.ArrayList;

public class FemaleBookingAdapter extends RecyclerView.Adapter<FemaleBookingAdapter.FemaleBookingViewHolder> {

    Context context;
    ArrayList<FemaleBookingbean>femaleBookingbeans;


    public FemaleBookingAdapter(Context context, ArrayList<FemaleBookingbean> femaleBookingbeans) {
        this.context = context;
        this.femaleBookingbeans = femaleBookingbeans;

    }


    @Override
    public FemaleBookingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    View v = LayoutInflater.from(context).inflate(R.layout.itemmalebooking,parent,false);
        return new FemaleBookingViewHolder(v);
    }
    @Override
    public void onBindViewHolder(FemaleBookingAdapter.FemaleBookingViewHolder holder, int position) {
  FemaleBookingbean m = femaleBookingbeans.get(position);
        holder.shopImage.setImageResource(m.getShoapImage());

    }

    @Override
    public int getItemCount() {
        return femaleBookingbeans.size();
    }
    public  class FemaleBookingViewHolder extends RecyclerView.ViewHolder{
        ImageView shopImage;
        TextView location, shoapname, opentime,closetime,submit,add,Animities;

        public FemaleBookingViewHolder( View itemView) {
            super(itemView);
            shopImage=itemView.findViewById(R.id.shoapImage);
            location = itemView.findViewById(R.id.location);

            submit=itemView.findViewById(R.id.submit);
            add=itemView.findViewById(R.id.add);
            Animities=itemView.findViewById(R.id.Animities);
            submit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, FemalProfile.class);
                    context.startActivity(intent);
                }
            });
            add.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, MaleServiceScreen.class);
                    context.startActivity(intent);
                }
            });

        }
    }








}
