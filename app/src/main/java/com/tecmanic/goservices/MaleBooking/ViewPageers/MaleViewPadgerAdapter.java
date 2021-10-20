package com.tecmanic.goservices.MaleBooking.ViewPageers;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MaleViewPadgerAdapter extends FragmentPagerAdapter {

    public MaleViewPadgerAdapter(FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @Override
    public Fragment getItem(int position) {

        Fragment fragment = null;
        switch ((position)){
            //case 0: fragment=new InformationFragment();break;
            case 1: fragment=new ServiceFragment();break;
           // case 2: fragment = new AnimitiesFragment();break;

        }
        return fragment;

    }

    @Override
    public int getCount() {
        return 3;
    }
    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String tabtitle ="";
        if(position==0)
            tabtitle="Information";
        else if(position==1)
            tabtitle="Service";
        else if(position==2)
            tabtitle="Animities";
        return tabtitle;
    }
}
