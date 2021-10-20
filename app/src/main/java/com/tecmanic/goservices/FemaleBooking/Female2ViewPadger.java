package com.tecmanic.goservices.FemaleBooking;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.tabs.TabLayout;
import com.tecmanic.goservices.FemaleBooking.Female2Fragment.Female2ViewpadgerFragment;
import com.tecmanic.goservices.MaleBooking.ViewPageers.MaleViewPadgerAdapter;
import com.tecmanic.goservices.R;

public class Female2ViewPadger extends AppCompatActivity {
    ViewPager viewPager;
    TabLayout tabLayout;
    Female2ViewpadgerFragment adapter;
    ImageView backbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_female2_view_padger);
        viewPager = findViewById(R.id.viewpager);
        tabLayout = findViewById(R.id.tablayout);
        tabLayout.setupWithViewPager(viewPager);
        adapter=new Female2ViewpadgerFragment(this.getSupportFragmentManager(),1);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        backbutton=findViewById(R.id.backbutton);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });



    }
}