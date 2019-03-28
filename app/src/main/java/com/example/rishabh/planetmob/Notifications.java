package com.example.rishabh.planetmob;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Notifications extends AppCompatActivity {

    private TextView NotificationsLabel;
    private TextView ArticlesLabel;

    private ViewPager MainPager;

    private PagerViewAdapter PagerViewAdapter;

    public void buttonClick1(View view) {
        Intent myIntent = new Intent(Notifications.this, Home.class);
        Notifications.this.startActivity(myIntent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);

        NotificationsLabel = findViewById(R.id.textView1);
        ArticlesLabel = findViewById(R.id.textView2);

        MainPager = findViewById(R.id.mainPager);

        PagerViewAdapter = new PagerViewAdapter(getSupportFragmentManager());
        MainPager.setAdapter(PagerViewAdapter);

        NotificationsLabel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainPager.setCurrentItem(1);
            }
        });

        ArticlesLabel.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                MainPager.setCurrentItem(0);
            }
        });

        MainPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
                changeTabs(i);
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        }
        );
    }

    private void changeTabs(int i) {
        if(i == 0) {
            NotificationsLabel.setTextSize(12);
            ArticlesLabel.setTextSize(24);
        }

        if(i == 1) {
            NotificationsLabel.setTextSize(24);
            ArticlesLabel.setTextSize(12);
        }
    }
}
