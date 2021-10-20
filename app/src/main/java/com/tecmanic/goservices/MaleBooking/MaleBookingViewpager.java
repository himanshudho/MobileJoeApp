package com.tecmanic.goservices.MaleBooking;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.tabs.TabLayout;
import com.tecmanic.goservices.MaleBooking.ViewPageers.MaleViewPadgerAdapter;
import com.tecmanic.goservices.R;

public class MaleBookingViewpager extends AppCompatActivity {
    ViewPager viewPager;
    TabLayout tabLayout;
    MaleViewPadgerAdapter adapter;
    ImageView backbutton;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_male_booking_viewpager);
        viewPager = findViewById(R.id.viewpager);
        tabLayout = findViewById(R.id.tablayout);
        adapter=new MaleViewPadgerAdapter(this.getSupportFragmentManager(),1);
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
