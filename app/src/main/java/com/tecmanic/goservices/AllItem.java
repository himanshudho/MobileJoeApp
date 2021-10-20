package com.tecmanic.goservices;
import androidx.annotation.MainThread;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.tecmanic.goservices.MyAdapter.AllAdapter;
import com.tecmanic.goservices.MyBean.Allbean;
import java.util.ArrayList;

public class AllItem extends AppCompatActivity {
    RecyclerView rv;
    AllAdapter adapter;
    ArrayList<Allbean>allbeans;
    CardView cardView1,cardView,cardView2,cardView3;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_item);
        rv= findViewById(R.id.rv);
        allbeans=new ArrayList<>();
        allbeans.add(new Allbean(R.drawable.beauti2,"FemaleSalon"));
        allbeans.add(new Allbean(R.drawable.heair1,"MaleSalon"));
        allbeans.add(new Allbean(R.drawable.beauti,"UniSexSalon"));
        allbeans.add(new Allbean(R.drawable.home,"HomeService"));
        cardView = findViewById(R.id.cardview);
        cardView1= findViewById(R.id.cardview1);
        cardView2 = findViewById(R.id.cardview2);
        cardView3 = findViewById(R.id.cardview3);

        cardView3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), MaleSallon.class);
                startActivity(intent);
            }
        });

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FemaleSaloon.class);
                startActivity(intent);

            }
        });

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MaleSallon.class);
                startActivity(intent);
            }
        });

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), HomePageActivity.class);
                startActivity(intent);

            }
        });


    //    adapter=new AllAdapter(this,allbeans);
      //  rv.setAdapter(adapter);
       // LinearLayoutManager manager= new GridLayoutManager(this,2);
       // rv.setLayoutManager(manager);





    }
}