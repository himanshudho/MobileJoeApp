package com.tecmanic.goservices.MyAdapter;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.tecmanic.goservices.FemaleBooking.FemaleBooking;
import com.tecmanic.goservices.HomePageActivity;
import com.tecmanic.goservices.MaleBooking.MaleBooking;
import com.tecmanic.goservices.MyBean.MaleSalonBean;
import com.tecmanic.goservices.R;
import com.tecmanic.goservices.ServiceScreen;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class FemaleSaloonAdapter  extends RecyclerView.Adapter<FemaleSaloonAdapter.FemaleSalonViewHolder> {

    Context context;
    ArrayList<MaleSalonBean>maleSalonBeans;

    public FemaleSaloonAdapter(Context context, ArrayList<MaleSalonBean> maleSalonBeans) {
        this.context = context;
        this.maleSalonBeans = maleSalonBeans;
    }


    @Override
    public FemaleSaloonAdapter.FemaleSalonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.itemfemale,parent,false);
        return new FemaleSalonViewHolder(v);
    }

    @Override
    public void onBindViewHolder( FemaleSaloonAdapter.FemaleSalonViewHolder holder, int position) {

        MaleSalonBean b = maleSalonBeans.get(position);
        holder.name.setText(b.getName());
        holder.civ.setImageResource(b.getCiv());
    }

    @Override
    public int getItemCount() {
        return maleSalonBeans.size();
    }

    public  class  FemaleSalonViewHolder extends RecyclerView.ViewHolder{
        CircleImageView civ;
        TextView name;
        CardView cardView;

        public FemaleSalonViewHolder( View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            civ=itemView.findViewById(R.id.civ);
            cardView = itemView.findViewById(R.id.cardview);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, FemaleBooking.class);
                    context.startActivity(intent);

                }
            });
        }
    }


}
