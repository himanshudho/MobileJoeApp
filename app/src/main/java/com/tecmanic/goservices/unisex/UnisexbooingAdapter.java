package com.tecmanic.goservices.unisex;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.tecmanic.goservices.HomePageActivity;
import com.tecmanic.goservices.MaleBooking.AddStyle;
import com.tecmanic.goservices.MaleBooking.MaleServiceScreen;
import com.tecmanic.goservices.R;
import com.tecmanic.goservices.unisex.ViewPagersUnisex.UnisexProfile;

import java.util.ArrayList;

public class UnisexbooingAdapter  extends  RecyclerView.Adapter<UnisexbooingAdapter.UnisexbookingViewHolder>{
    Context context;
    ArrayList<Unisexbean>unisexbeans;
    public UnisexbooingAdapter(Context context, ArrayList<Unisexbean> unisexbeans) {
        this.context = context;
        this.unisexbeans = unisexbeans;
    }

    @Override
    public UnisexbookingViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
       View v = LayoutInflater.from(context).inflate(R.layout.itemunisexbooking,parent,false);
        return new UnisexbookingViewHolder(v);
    }

    @Override
    public void onBindViewHolder(UnisexbooingAdapter.UnisexbookingViewHolder holder, int position) {
        Unisexbean m= unisexbeans.get(position);
        holder.shopImage.setImageResource(m.getShoapImage());
        holder.shoapname.setText(m.getShoapname());
        holder.opentime.setText(m.getOpentime());
        holder.closetime.setText(m.getClosetime());
        holder.location.setText(m.getLocation());
    }
    @Override
    public int getItemCount() {
        return unisexbeans.size();
    }

    public  class  UnisexbookingViewHolder extends RecyclerView.ViewHolder{
        ImageView shopImage;
        TextView location, shoapname, opentime,closetime,submit,add,Animities;
        public UnisexbookingViewHolder(View itemView) {
            super(itemView);
            shopImage=itemView.findViewById(R.id.shoapImage);
            location = itemView.findViewById(R.id.location);
            shoapname=itemView.findViewById(R.id.shoapname);
            opentime = itemView.findViewById(R.id.opentime);
            closetime=itemView.findViewById(R.id.closetime);
            submit=itemView.findViewById(R.id.submit);
            add=itemView.findViewById(R.id.add);
            Animities=itemView.findViewById(R.id.Animities);
            submit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, UnisexProfile.class);
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
