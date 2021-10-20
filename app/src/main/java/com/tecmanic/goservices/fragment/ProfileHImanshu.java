package com.tecmanic.goservices.fragment;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tecmanic.MyBooking;
import com.tecmanic.goservices.EditProfileActivity;
import com.tecmanic.goservices.PrivecyPolecy;
import com.tecmanic.goservices.R;
import com.tecmanic.goservices.SignUpActivity;
import com.tecmanic.goservices.TermsAndCondition;

public class ProfileHImanshu extends Fragment {
    TextView tEdit;
    LinearLayout llBooking, signIn;
    TextView privecyPolecy, term;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_profile_himanshu, container, false);
        tEdit = view.findViewById(R.id.tEdit);
        privecyPolecy = view.findViewById(R.id.privecyPolecy);
        term = view.findViewById(R.id.term);
        term.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), TermsAndCondition.class);
                startActivity(intent);
            }
        });
        privecyPolecy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), PrivecyPolecy.class);
                startActivity(intent);

            }
        });















        tEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(), EditProfileActivity.class);
                startActivity(intent);

            }

        });

        llBooking = view.findViewById(R.id.llBooking);
        llBooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MyBooking.class);
                startActivity(intent);

            }
        });
        signIn = view.findViewById(R.id.signIN);
        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SignUpActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }
}