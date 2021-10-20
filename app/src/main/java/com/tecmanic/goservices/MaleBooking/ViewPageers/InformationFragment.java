package com.tecmanic.goservices.MaleBooking.ViewPageers;

import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tecmanic.goservices.R;

public class InformationFragment extends Fragment {



    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
      View v = inflater.inflate(R.layout.activity_information_fragment,null);
        return v;
    }
}