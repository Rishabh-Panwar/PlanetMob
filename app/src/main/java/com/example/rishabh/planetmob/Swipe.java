package com.example.rishabh.planetmob;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

public class Swipe extends android.support.v4.app.Fragment {

    public Swipe() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_swipe, container, false);

        ImageButton button = rootView.findViewById(R.id.imageButton15);
        ImageButton button1 = rootView.findViewById(R.id.imageButton17);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplication(), PhoneList.class);
                startActivity(intent);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplication(), Notifications.class);
                startActivity(intent);
            }
        });
        return rootView;
    }
}
