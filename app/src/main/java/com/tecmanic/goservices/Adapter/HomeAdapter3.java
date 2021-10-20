package com.tecmanic.goservices.Adapter;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tecmanic.goservices.MaleBooking.ViewPageers.Maleshoapprofile;
import com.tecmanic.goservices.ModelClass.Home3bean;
import com.tecmanic.goservices.R;
import com.tecmanic.goservices.RatingActivity;
import com.tecmanic.goservices.ServiceArea;
import java.util.ArrayList;

public class HomeAdapter3 extends  RecyclerView.Adapter<HomeAdapter3.HomeViewHolderAdapter> {

    Context context;
    ArrayList<Home3bean>home3beans;

    public HomeAdapter3(Context context, ArrayList<Home3bean> home3beans) {
        this.context = context;
        this.home3beans = home3beans;

    }

    @Override
    public HomeViewHolderAdapter onCreateViewHolder( ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.itemlinearview,parent,false);
        return new HomeViewHolderAdapter(v);

    }

    @Override
    public void onBindViewHolder( HomeAdapter3.HomeViewHolderAdapter holder, int position) {
        Home3bean bean= home3beans.get(position);


    }

    @Override
    public int getItemCount() {

        return home3beans.size();
    }

    public  class  HomeViewHolderAdapter extends RecyclerView.ViewHolder{

        TextView  Saloonname,address,booking,tvrating;


        public HomeViewHolderAdapter(View itemView) {
            super(itemView);


            address=itemView.findViewById(R.id.address);
            booking=itemView.findViewById(R.id.booking);
            tvrating=itemView.findViewById(R.id.tvrating);

            tvrating.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent= new Intent(context, RatingActivity.class);
                    context.startActivity(intent);

                }

            });
             
            address.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context , Maleshoapprofile.class);
                    context.startActivity(intent);

                }

            });

            booking.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context , ServiceArea.class);
                    context.startActivity(intent);

                }
            });
        }
    }


}
