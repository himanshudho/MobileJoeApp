package com.tecmanic.goservices.Adapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.tecmanic.goservices.ModelClass.Slider1;
import com.tecmanic.goservices.R;

import java.util.ArrayList;

public class SliderHomeAdapter extends  RecyclerView.Adapter<SliderHomeAdapter.SliderViewHolder> {

    Context context;
    ArrayList<Slider1>slider1s;

    public SliderHomeAdapter(Context context, ArrayList<Slider1> slider1s) {
        this.context = context;
        this.slider1s = slider1s;
    }


    @Override
    public SliderViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.slidingimages,parent,false);
        return new SliderViewHolder(v);
    }

    @Override
    public void onBindViewHolder( SliderHomeAdapter.SliderViewHolder holder, int position) {
        Slider1 s = slider1s.get(position);
        holder.name.setText(s.getName());
    }
    @Override
    public int getItemCount() {

        return slider1s.size();

    }

    public  class  SliderViewHolder extends RecyclerView.ViewHolder{

        TextView name;
        public SliderViewHolder(View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.name);
        }
    }
}
