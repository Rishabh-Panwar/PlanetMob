package com.example.rishabh.planetmob;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

class PagerViewAdapter extends FragmentPagerAdapter {
    public PagerViewAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                Articles articles = new Articles();
                return articles;

            case 1:
                Notif notif = new Notif();
                return notif;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
