package com.tecmanic.goservices.unisex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.tabs.TabLayout;
import com.tecmanic.goservices.MaleBooking.ViewPageers.MaleViewPadgerAdapter;
import com.tecmanic.goservices.R;
import com.tecmanic.goservices.unisex.ViewPagersUnisex.UnisexViewPadgerAdapter;

public class UnisexBookingViewPadger extends AppCompatActivity {
    UnisexViewPadgerAdapter adapter;

    ViewPager viewPager;
    TabLayout tabLayout;
    ImageView backbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unisex_booking_view_padger);
        viewPager = findViewById(R.id.viewpager);
        tabLayout = findViewById(R.id.tablayout);
        backbutton=findViewById(R.id.backbutton);

        adapter=new UnisexViewPadgerAdapter(this.getSupportFragmentManager(),1);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}