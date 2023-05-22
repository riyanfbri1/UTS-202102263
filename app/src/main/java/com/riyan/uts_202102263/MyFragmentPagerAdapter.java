package com.riyan.uts_202102263;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    private Fragment_internal _fragment_internal = new Fragment_internal();
    private Context _context;
    private Fragment_resmi _fragment_resmi = new Fragment_resmi();
    private int _tabCount;

    public MyFragmentPagerAdapter(Context _context, FragmentManager fragmentManager, int tabCount) {

        super(fragmentManager);

        _context = _context;
        _tabCount = tabCount;
    }
        @NonNull
        @Override
        public Fragment getItem(int position) {
            switch (position)
            {
                case 0:
                    return _fragment_resmi;
                default:
                    return _fragment_internal;
            }
        }

        @Override
        public int getCount() {
            return _tabCount;}
}
