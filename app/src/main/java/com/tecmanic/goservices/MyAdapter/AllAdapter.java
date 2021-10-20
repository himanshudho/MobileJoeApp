package com.tecmanic.goservices.MyAdapter;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.tecmanic.goservices.MyBean.Allbean;
import com.tecmanic.goservices.R;
import java.util.ArrayList;
import de.hdodenhof.circleimageview.CircleImageView;

public class AllAdapter extends  RecyclerView.Adapter<AllAdapter.AllViewHolder>{

    Context context;
    ArrayList<Allbean>allbeans;
    public AllAdapter(Context context, ArrayList<Allbean>allbeans) {

        this.context = context;
        this.allbeans = allbeans;

    }


    @Override
    public AllViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

      View v = LayoutInflater.from(context).inflate(R.layout.itemall,parent,false);
        return new AllViewHolder(v);


    }

    @Override
    public void onBindViewHolder(AllAdapter.AllViewHolder holder, int position) {
        Allbean allbean= allbeans.get(position);


        holder.civ.setImageResource(allbean.getCiv());
             holder.name.setText(allbean.getName());
    }

    @Override
    public int getItemCount() {

        return allbeans.size();
    }
    public  class AllViewHolder extends RecyclerView.ViewHolder{

         CircleImageView civ;
        TextView name;
        CardView cardView;
       public AllViewHolder( View itemView) {
           super(itemView);
      name = itemView.findViewById(R.id.name);
      civ=itemView.findViewById(R.id.civ);


       }
   }
}
