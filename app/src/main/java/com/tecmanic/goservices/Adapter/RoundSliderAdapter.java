package com.tecmanic.goservices.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.tecmanic.goservices.ModelClass.RoundSlider;
import com.tecmanic.goservices.R;

import java.util.ArrayList;

public class RoundSliderAdapter extends  RecyclerView.Adapter<RoundSliderAdapter.RoundSliderHolder> {

    Context context;
    ArrayList<RoundSlider>roundSliders;




    @Override
    public RoundSliderHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.itemadaptersecond,parent,false);
        return new RoundSliderHolder(v);
    }

    @Override
    public void onBindViewHolder( RoundSliderAdapter.RoundSliderHolder holder, int position) {
        RoundSlider r = roundSliders.get(position);
        holder.name.setText(r.getName());
    }

    @Override
    public int getItemCount() {
        return roundSliders.size();
    }

    public RoundSliderAdapter(Context context, ArrayList<RoundSlider> roundSliders) {
        this.context = context;
        this.roundSliders = roundSliders;
    }


    public class  RoundSliderHolder extends RecyclerView.ViewHolder{
        TextView name;

        public RoundSliderHolder( View itemView) {
            super(itemView);
            name= itemView.findViewById(R.id.name);


        }
    }
}
