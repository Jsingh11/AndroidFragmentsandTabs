package com.japnitchawla.tabsandfragmentsjava;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyPagerAdapter extends FragmentPagerAdapter {
    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) { // Return a fragment from the current position
        // TODO Implement getItem()
        return PageFragment.newInstance("Content For Tab #" + String.valueOf(position + 1));
    }

    @Override
    public int getCount() { // How many tab we want in the UI
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) { // The title of each tab
        // TODO Implement getPageTitle()
        return "Tab #" + String.valueOf(position + 1);
    }
}
