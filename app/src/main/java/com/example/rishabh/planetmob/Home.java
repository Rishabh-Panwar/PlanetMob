package com.example.rishabh.planetmob;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class Home extends AppCompatActivity {

    private ViewPager MainPager2;

    public void buttonClick6(View view) {
        Intent myIntent = new Intent(Home.this, Notifications.class);
        Home.this.startActivity(myIntent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageButton swipeLabel = findViewById(R.id.imageButton2);
        ImageButton searchLabel = findViewById(R.id.imageButton3);
        ImageButton cartLabel = findViewById(R.id.imageButton4);
        ImageButton settingLabel = findViewById(R.id.imageButton5);

        MainPager2 = findViewById(R.id.mainPager2);

        com.example.rishabh.planetmob.PagerViewAdapter2 pagerViewAdapter2 = new PagerViewAdapter2(getSupportFragmentManager());
        MainPager2.setAdapter(pagerViewAdapter2);

        swipeLabel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainPager2.setCurrentItem(0);
            }
        });

        searchLabel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainPager2.setCurrentItem(1);
            }
        });

        cartLabel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainPager2.setCurrentItem(2);
            }
        });

        settingLabel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainPager2.setCurrentItem(3);
            }
        });

        MainPager2.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
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
        });
    }

    private void changeTabs(int i) {
        if (i == 0){
            ImageButton ImageButton2 = findViewById(R.id.imageButton2);
            ImageButton2.setImageResource(R.drawable.home_512_on);
            ImageButton ImageButton3 = findViewById(R.id.imageButton3);
            ImageButton3.setImageResource(R.drawable.search_512_off);
            ImageButton ImageButton4 = findViewById(R.id.imageButton4);
            ImageButton4.setImageResource(R.drawable.cart_512_off);
            ImageButton ImageButton5 = findViewById(R.id.imageButton5);
            ImageButton5.setImageResource(R.drawable.settings_512_off);
        }
        if (i == 1){
            ImageButton ImageButton2 = findViewById(R.id.imageButton2);
            ImageButton2.setImageResource(R.drawable.home_512_off);
            ImageButton ImageButton3 = findViewById(R.id.imageButton3);
            ImageButton3.setImageResource(R.drawable.search_512_on);
            ImageButton ImageButton4 = findViewById(R.id.imageButton4);
            ImageButton4.setImageResource(R.drawable.cart_512_off);
            ImageButton ImageButton5 = findViewById(R.id.imageButton5);
            ImageButton5.setImageResource(R.drawable.settings_512_off);
        }
        if (i == 2){
            ImageButton ImageButton2 = findViewById(R.id.imageButton2);
            ImageButton2.setImageResource(R.drawable.home_512_off);
            ImageButton ImageButton3 = findViewById(R.id.imageButton3);
            ImageButton3.setImageResource(R.drawable.search_512_off);
            ImageButton ImageButton4 = findViewById(R.id.imageButton4);
            ImageButton4.setImageResource(R.drawable.cart_512_on);
            ImageButton ImageButton5 = findViewById(R.id.imageButton5);
            ImageButton5.setImageResource(R.drawable.settings_512_off);
        }
        if (i == 3){
            ImageButton ImageButton2 = findViewById(R.id.imageButton2);
            ImageButton2.setImageResource(R.drawable.home_512_off);
            ImageButton ImageButton3 = findViewById(R.id.imageButton3);
            ImageButton3.setImageResource(R.drawable.search_512_off);
            ImageButton ImageButton4 = findViewById(R.id.imageButton4);
            ImageButton4.setImageResource(R.drawable.cart_512_off);
            ImageButton ImageButton5 = findViewById(R.id.imageButton5);
            ImageButton5.setImageResource(R.drawable.settings_512_on);
        }
    }
}

