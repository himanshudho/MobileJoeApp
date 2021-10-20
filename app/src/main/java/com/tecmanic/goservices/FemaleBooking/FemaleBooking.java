package com.tecmanic.goservices.FemaleBooking;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tecmanic.goservices.R;
import java.util.ArrayList;

public class FemaleBooking extends AppCompatActivity {
    ImageView backbutton;
    TextView textview;
    RecyclerView rv;
    FemaleBookingAdapter adapter;
    ArrayList<FemaleBookingbean>femaleBookingbeans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_female_booking);

        rv=findViewById(R.id.rv);

        femaleBookingbeans = new ArrayList<>();
        femaleBookingbeans.add(new FemaleBookingbean(R.drawable.beauti,"Location : kila maidan","Shoap Name : Just For You ","OpenTime : 8AM","CloseTime : 10PM"));
        femaleBookingbeans.add(new FemaleBookingbean(R.drawable.fingernail,"Location : kila maidan","Shoap Name : Just For You ","OpenTime : 8AM","CloseTime : 10PM"));
        femaleBookingbeans.add(new FemaleBookingbean(R.drawable.beauti2,"Location : kila maidan","Shoap Name : Just For You ","OpenTime : 8AM","CloseTime : 10PM"));
        femaleBookingbeans.add(new FemaleBookingbean(R.drawable.beardlook,"Location : kila maidan","Shoap Name : Just For You ","OpenTime : 8AM","CloseTime : 10PM"));
        femaleBookingbeans.add(new FemaleBookingbean(R.drawable.fingernail,"Location : kila maidan","Shoap Name : Just For You ","OpenTime : 8AM","CloseTime : 10PM"));
        femaleBookingbeans.add(new FemaleBookingbean(R.drawable.nodtatt,"Location : kila maidan","Shoap Name : Just For You ","OpenTime : 8AM","CloseTime : 10PM"));
        femaleBookingbeans.add(new FemaleBookingbean(R.drawable.hair2,"Location : kila maidan","Shoap Name : Just For You ","OpenTime : 8AM","CloseTime : 10PM"));
        femaleBookingbeans.add(new FemaleBookingbean(R.drawable.beauti,"Location : kila maidan","Shoap Name : Just For You ","OpenTime : 8AM","CloseTime : 10PM"));
        femaleBookingbeans.add(new FemaleBookingbean(R.drawable.fingernail,"Location : kila maidan","Shoap Name : Just For You ","OpenTime : 8AM","CloseTime : 10PM"));
        femaleBookingbeans.add(new FemaleBookingbean(R.drawable.beauti2,"Location : kila maidan","Shoap Name : Just For You ","OpenTime : 8AM","CloseTime : 10PM"));
        femaleBookingbeans.add(new FemaleBookingbean(R.drawable.beardlook,"Location : kila maidan","Shoap Name : Just For You ","OpenTime : 8AM","CloseTime : 10PM"));
        femaleBookingbeans.add(new FemaleBookingbean(R.drawable.fingernail,"Location : kila maidan","Shoap Name : Just For You ","OpenTime : 8AM","CloseTime : 10PM"));
        femaleBookingbeans.add(new FemaleBookingbean(R.drawable.nodtatt,"Location : kila maidan","Shoap Name : Just For You ","OpenTime : 8AM","CloseTime : 10PM"));
        femaleBookingbeans.add(new FemaleBookingbean(R.drawable.hair2,"Location : kila maidan","Shoap Name : Just For You ","OpenTime : 8AM","CloseTime : 10PM"));
        adapter = new FemaleBookingAdapter(this,femaleBookingbeans);
        rv.setAdapter(adapter);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        rv.setLayoutManager(manager);



    }
}