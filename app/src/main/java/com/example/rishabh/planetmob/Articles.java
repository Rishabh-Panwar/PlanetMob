package com.example.rishabh.planetmob;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class Articles extends android.support.v4.app.Fragment {


    public Articles() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_articles, container, false);

        ImageButton button1 = rootView.findViewById(R.id.image1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplication(), Article_Dynamic.class);
                intent.putExtra("article", 1);
                startActivity(intent);
            }
        });
        ImageButton button2 = rootView.findViewById(R.id.image2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplication(), Article_Dynamic.class);
                intent.putExtra("article", 2);
                startActivity(intent);
            }
        });
        ImageButton button3 = rootView.findViewById(R.id.image3);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplication(), Article_Dynamic.class);
                intent.putExtra("article", 3);
                startActivity(intent);
            }
        });
        ImageButton button4 = rootView.findViewById(R.id.image4);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplication(), Article_Dynamic.class);
                intent.putExtra("article", 4);
                startActivity(intent);
            }
        });
        ImageButton button5 = rootView.findViewById(R.id.image5);

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplication(), Article_Dynamic.class);
                intent.putExtra("article", 5);
                startActivity(intent);
            }
        });


        return rootView;
    }

}
