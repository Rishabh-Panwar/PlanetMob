package com.example.rishabh.planetmob;


import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ToggleButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class Setting extends android.support.v4.app.Fragment {

    Button share;
    public Setting() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_setting, container, false);
        share = rootView.findViewById(R.id.setting_button6);
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_SUBJECT,"CHECK OUT OUR APP");
                shareIntent.putExtra(Intent.EXTRA_TEXT,"Check out our NEW APP at: " +
                        "https://github.com/Rishabh-Panwar/PlanetMob.git");
                startActivity(Intent.createChooser(shareIntent,"Share Via..."));
            }
        });
        return rootView;
    }
}
