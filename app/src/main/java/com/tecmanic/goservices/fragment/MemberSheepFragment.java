package com.tecmanic.goservices.fragment;

import androidx.fragment.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ViewFlipper;
import com.tecmanic.LinkOpenActivity;
import com.tecmanic.goservices.Adapter.SliderHomeAdapter;
import com.tecmanic.goservices.ModelClass.Slider1;
import com.tecmanic.goservices.R;
import java.util.ArrayList;

public class MemberSheepFragment extends Fragment {
    Button INR199, INR299, INR399;
    ViewFlipper flipper, flipper1;
    SliderHomeAdapter adapter;
    ArrayList<Slider1> slider1s;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.activity_member_sheep_fragment, container, false);
        INR199 = v.findViewById(R.id.inr199);
        INR299 = v.findViewById(R.id.inr299);

        INR299.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "comming soon after some time", Toast.LENGTH_SHORT).show();

            }

        });

        INR199.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "comming soon after some time", Toast.LENGTH_SHORT).show();

            }
        });


        flipper = v.findViewById(R.id.flipper);
        flipper1 = v.findViewById(R.id.flipper1);

        flipper1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), LinkOpenActivity.class);
                startActivity(intent);


            }
        });
        int iamgearr1[] = {R.drawable.apploco, R.drawable.beardlook, R.drawable.offermy};
        for (int i = 0; i < iamgearr1.length; i++) {

            showImage1(iamgearr1[i]);
        }


        flipper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), LinkOpenActivity.class);
                startActivity(intent);


            }
        });
        int iamgearr[] = {R.drawable.apploco, R.drawable.beardlook, R.drawable.offermy};
        for (int i = 0; i < iamgearr.length; i++) {

            showImage(iamgearr[i]);
        }


        return v;
    }


    public void showImage(int imagearr) {
        ImageView image = new ImageView(getActivity());
        image.setBackgroundResource(imagearr);
        flipper.addView(image);
        flipper.setFlipInterval(3000);
        flipper.setAutoStart(true);
        flipper.setInAnimation(getContext(), android.R.anim.slide_in_left);
        flipper.setOutAnimation(getContext(), android.R.anim.slide_out_right);

    }

    public void showImage1(int imagearr1) {
        ImageView image = new ImageView(getActivity());
        image.setBackgroundResource(imagearr1);
        flipper1.addView(image);
        flipper1.setFlipInterval(3000);
        flipper1.setAutoStart(true);
        flipper1.setInAnimation(getContext(), android.R.anim.slide_in_left);
        flipper1.setOutAnimation(getContext(), android.R.anim.slide_out_right);

    }

}