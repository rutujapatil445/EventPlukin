package com.example.eventplaneer;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;

public class DashboardFragment extends Fragment {
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_dashboard, container, false);

        ImageButton birthdayButton = view.findViewById(R.id.birth);
        ImageButton businessButton = view.findViewById(R.id.bussiness);
        ImageButton receptionButton = view.findViewById(R.id.reception);
        ImageButton weddingButton = view.findViewById(R.id.wedd);
        ImageButton engageButton = view.findViewById(R.id.engage);

        // Set click listeners for the buttons
        birthdayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start the birthday activity
                Intent intent = new Intent(getActivity(), birthday.class);
                startActivity(intent);
            }
        });

        businessButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start the business activity
                Intent intent = new Intent(getActivity(), business.class);
                startActivity(intent);
            }
        });

        receptionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start the birthday activity
                Intent intent = new Intent(getActivity(), Reception.class);
                startActivity(intent);
            }
        });

        weddingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start the birthday activity
                Intent intent = new Intent(getActivity(), Wedding.class);
                startActivity(intent);
            }
        });

        engageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start the birthday activity
                Intent intent = new Intent(getActivity(), Engagement.class);
                startActivity(intent);
            }
        });


        return view;

    }

}