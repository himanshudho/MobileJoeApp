package com.tecmanic.goservices.toprated;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tecmanic.goservices.R;
import com.tecmanic.goservices.unisex.UnisexBookingViewPadger;
import com.tecmanic.goservices.unisex.ViewPagersUnisex.UnisexProfile;
import java.util.ArrayList;



public class TopretedAdapter extends  RecyclerView.Adapter<TopretedAdapter.TopratedViewHolder> {

    Context context;
    ArrayList<Topratedbean>topratedbeans;

    public TopretedAdapter(Context context, ArrayList<Topratedbean> topratedbeans) {
        this.context = context;
        this.topratedbeans = topratedbeans;
    }

    @Override
    public TopratedViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(context).inflate(R.layout.itemtoprareted,parent,false);
        return new TopratedViewHolder(v);
    }

    @Override
    public void onBindViewHolder(TopretedAdapter.TopratedViewHolder holder, int position) {
        Topratedbean m= topratedbeans.get(position);

    holder.shopImage.setImageResource(m.getImage());
    }

    @Override
    public int getItemCount() {
        return topratedbeans.size();
    }


    public class  TopratedViewHolder extends RecyclerView.ViewHolder {

        ImageView shopImage;
        TextView location, shoapname, opentime,closetime,submit,add,Animities;


      public TopratedViewHolder(View itemView) {
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
                  Intent intent = new Intent(context, UnisexBookingViewPadger.class);
                  context.startActivity(intent);
              }
          });
      }
      }







}
