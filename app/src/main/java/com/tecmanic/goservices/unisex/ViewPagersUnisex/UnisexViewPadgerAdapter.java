package com.tecmanic.goservices.unisex.ViewPagersUnisex;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.tecmanic.goservices.MaleBooking.ViewPageers.AnimitiesFragment;
import com.tecmanic.goservices.MaleBooking.ViewPageers.InformationFragment;
import com.tecmanic.goservices.MaleBooking.ViewPageers.ServiceFragment;

public class UnisexViewPadgerAdapter extends FragmentPagerAdapter {




    public UnisexViewPadgerAdapter(FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @Override
    public Fragment getItem(int position) {

        Fragment fragment = null;
        switch ((position)){
          //  case 0: fragment=new InformationFemaleFragment();break;
            case 1: fragment=new ServiceFemaleFragment();break;
            //case 2: fragment = new AnimitiesFemaleFragment();break;

        }
        return fragment;

    }

    @Override
    public int getCount() {
        return 1;
    }
    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String tabtitle ="";

         if(position==1)
            tabtitle="Service";

        return tabtitle;
    }





}
