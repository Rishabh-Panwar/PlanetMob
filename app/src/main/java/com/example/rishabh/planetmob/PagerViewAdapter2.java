package com.example.rishabh.planetmob;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

class PagerViewAdapter2 extends FragmentPagerAdapter {
    public PagerViewAdapter2(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {

        switch (i) {
            case 0:
                Swipe swipe = new Swipe();
                return swipe;
            case 1:
                Search search = new Search();
                return search;
            case 2:
                Cart cart = new Cart();
                return cart;
            case 3:
                Setting setting = new Setting();
                return setting;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
