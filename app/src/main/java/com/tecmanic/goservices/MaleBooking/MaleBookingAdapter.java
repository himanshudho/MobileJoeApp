package com.tecmanic.goservices.MaleBooking;

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

import com.tecmanic.goservices.HomePageActivity;
import com.tecmanic.goservices.MaleBooking.ViewPageers.Maleshoapprofile;
import com.tecmanic.goservices.R;

import java.util.ArrayList;

public class MaleBookingAdapter extends  RecyclerView.Adapter<MaleBookingAdapter.MaleBookingViewHolder> {
    Context context;
    ArrayList<Malebookingbean>malebookingbeans;

    public MaleBookingAdapter(Context context, ArrayList<Malebookingbean> malebookingbeans) {
        this.context = context;
        this.malebookingbeans = malebookingbeans;
    }

    @Override
    public MaleBookingViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
      View v = LayoutInflater.from(context).inflate(R.layout.itemmalebooking,parent,false);
        return new MaleBookingViewHolder(v);
    }

    @Override
    public void onBindViewHolder( MaleBookingAdapter.MaleBookingViewHolder holder, int position) {
        Malebookingbean m = malebookingbeans.get(position);


    }

    @Override
    public int getItemCount() {
        return malebookingbeans.size();
    }


    public  class  MaleBookingViewHolder extends RecyclerView.ViewHolder{
        ImageView shopImage;
        TextView location, shoapname, opentime,closetime,submit,add,Animities;
        public MaleBookingViewHolder(View itemView) {
            super(itemView);
            shopImage=itemView.findViewById(R.id.shoapImage);
            location = itemView.findViewById(R.id.location);
            shoapname=itemView.findViewById(R.id.shoapname);

            submit=itemView.findViewById(R.id.submit);
            add=itemView.findViewById(R.id.add);
            Animities=itemView.findViewById(R.id.Animities);

            submit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, Maleshoapprofile.class);
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
