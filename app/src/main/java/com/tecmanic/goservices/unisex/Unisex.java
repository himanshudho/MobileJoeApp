package com.tecmanic.goservices.unisex;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tecmanic.goservices.R;
import java.util.ArrayList;

public class Unisex extends AppCompatActivity {
    ImageView backbutton;
    TextView textview;
    RecyclerView rv;
    UnisexbooingAdapter adapter;
    ArrayList<Unisexbean>unisexbeans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unisex);
        backbutton=findViewById(R.id.backbutton);
        rv=findViewById(R.id.rv);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        unisexbeans=new ArrayList<>();
        unisexbeans.add(new Unisexbean( R.drawable.hair2,"Location : kila maidan, indore","Shoap Name : Just For You ","OpenTime : 8AM","CloseTime : 10PM"));
        unisexbeans.add(new Unisexbean( R.drawable.hair7,"Location : kila maidan, indore","Shoap Name : Just For You ","OpenTime : 8AM","CloseTime : 10PM"));
        unisexbeans.add(new Unisexbean( R.drawable.hair3,"Location : kila maidan, indore","Shoap Name : Just For You ","OpenTime : 8AM","CloseTime : 10PM"));
        unisexbeans.add(new Unisexbean( R.drawable.hair4,"Location : kila maidan, indore","Shoap Name : Just For You ","OpenTime : 8AM","CloseTime : 10PM"));
        unisexbeans.add(new Unisexbean( R.drawable.beardlook,"Location : kila maidan, indore","Shoap Name : Just For You ","OpenTime : 8AM","CloseTime : 10PM"));
        unisexbeans.add(new Unisexbean( R.drawable.beauti2,"Location : kila maidan, indore","Shoap Name : Just For You ","OpenTime : 8AM","CloseTime : 10PM"));
        unisexbeans.add(new Unisexbean( R.drawable.beauti,"Location : kila maidan, indore","Shoap Name : Just For You ","OpenTime : 8AM","CloseTime : 10PM"));
        unisexbeans.add(new Unisexbean( R.drawable.fingernail,"Location : kila maidan, indore","Shoap Name : Just For You ","OpenTime : 8AM","CloseTime : 10PM"));
        unisexbeans.add(new Unisexbean( R.drawable.beardlook,"Location : kila maidan, indore","Shoap Name : Just For You ","OpenTime : 8AM","CloseTime : 10PM"));
        unisexbeans.add(new Unisexbean( R.drawable.hair2,"Location : kila maidan, indore","Shoap Name : Just For You ","OpenTime : 8AM","CloseTime : 10PM"));
        unisexbeans.add(new Unisexbean( R.drawable.hair2,"Location : kila maidan, indore","Shoap Name : Just For You ","OpenTime : 8AM","CloseTime : 10PM"));
        unisexbeans.add(new Unisexbean( R.drawable.hair7,"Location : kila maidan, indore","Shoap Name : Just For You ","OpenTime : 8AM","CloseTime : 10PM"));
        unisexbeans.add(new Unisexbean( R.drawable.hair3,"Location : kila maidan, indore","Shoap Name : Just For You ","OpenTime : 8AM","CloseTime : 10PM"));
        unisexbeans.add(new Unisexbean( R.drawable.hair4,"Location : kila maidan, indore","Shoap Name : Just For You ","OpenTime : 8AM","CloseTime : 10PM"));
        unisexbeans.add(new Unisexbean( R.drawable.beardlook,"Location : kila maidan, indore","Shoap Name : Just For You ","OpenTime : 8AM","CloseTime : 10PM"));
        unisexbeans.add(new Unisexbean( R.drawable.beauti2,"Location : kila maidan, indore","Shoap Name : Just For You ","OpenTime : 8AM","CloseTime : 10PM"));
        unisexbeans.add(new Unisexbean( R.drawable.beauti,"Location : kila maidan, indore","Shoap Name : Just For You ","OpenTime : 8AM","CloseTime : 10PM"));
        unisexbeans.add(new Unisexbean( R.drawable.fingernail,"Location : kila maidan, indore","Shoap Name : Just For You ","OpenTime : 8AM","CloseTime : 10PM"));
        unisexbeans.add(new Unisexbean( R.drawable.beardlook,"Location : kila maidan, indore","Shoap Name : Just For You ","OpenTime : 8AM","CloseTime : 10PM"));
        unisexbeans.add(new Unisexbean( R.drawable.hair2,"Location : kila maidan, indore","Shoap Name : Just For You ","OpenTime : 8AM","CloseTime : 10PM"));
        adapter= new UnisexbooingAdapter(this,unisexbeans);
        rv.setAdapter(adapter);
        LinearLayoutManager  manager = new LinearLayoutManager(this);
        rv.setLayoutManager(manager);


    }
}