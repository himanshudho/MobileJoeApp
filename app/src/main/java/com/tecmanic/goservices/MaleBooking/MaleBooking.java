package com.tecmanic.goservices.MaleBooking;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tecmanic.goservices.R;
import java.util.ArrayList;

public class MaleBooking extends AppCompatActivity {
    ImageView backbutton;
    TextView textview;
    RecyclerView rv;
ArrayList<Malebookingbean>malebookingbeans;
MaleBookingAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_male_booking);
        backbutton=findViewById(R.id.backbutton);
        rv=findViewById(R.id.rv);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        malebookingbeans = new ArrayList<>();
        malebookingbeans.add(new Malebookingbean(R.drawable.hair2,"Location : kila maidan, indore","Shoap Name : Just For You ","OpenTime : 8AM","CloseTime : 10PM"));
        malebookingbeans.add(new Malebookingbean(R.drawable.beardlook,"Location : Rajwad, 41/2, indore","Shoap Name : Rohit Jents","OpenTime : 9AM","CloseTime : 9PM"));
        malebookingbeans.add(new Malebookingbean(R.drawable.hair7,"Location : Indore,nandnbag ","ShoapName : Shri Hair ","OpenTime : 9AM","CloseTime : 10PM"));
        malebookingbeans.add(new Malebookingbean(R.drawable.hair2,"Location : kila maidan, indore","Shoap Name : Just For You ","OpenTime : 8AM","CloseTime : 10PM"));
        malebookingbeans.add(new Malebookingbean(R.drawable.beardlook,"Location : Rajwad, 41/2, indore","Shoap Name : Rohit Jents","OpenTime : 9AM","CloseTime : 9PM"));
        malebookingbeans.add(new Malebookingbean(R.drawable.hair7,"Location : Indore,nandnbag ","ShoapName : Shri Hair ","OpenTime : 9AM","CloseTime : 10PM"));
        malebookingbeans.add(new Malebookingbean(R.drawable.hair2,"Location : kila maidan, indore","Shoap Name : Just For You ","OpenTime : 8AM","CloseTime : 10PM"));
        malebookingbeans.add(new Malebookingbean(R.drawable.beardlook,"Location : Rajwad, 41/2, indore","Shoap Name : Rohit Jents","OpenTime : 9AM","CloseTime : 9PM"));
        malebookingbeans.add(new Malebookingbean(R.drawable.hair7,"Location : Indore,nandnbag ","ShoapName : Shri Hair ","OpenTime : 9AM","CloseTime : 10PM"));
        adapter =new MaleBookingAdapter(this,malebookingbeans);
        rv.setAdapter(adapter);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        rv.setLayoutManager(manager);


    }
}