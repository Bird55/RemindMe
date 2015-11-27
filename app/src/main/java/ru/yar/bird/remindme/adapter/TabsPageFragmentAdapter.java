package ru.yar.bird.remindme.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import ru.yar.bird.remindme.fragment.ExampleFragment;

/**
 * Created by bird on 27.11.2015
 */
public class TabsPageFragmentAdapter extends FragmentPagerAdapter {

    private String[] tabs;

    public TabsPageFragmentAdapter(FragmentManager fm) {
        super(fm);
        tabs = new String[] {
                "Tab 1",
                "Напоминания",
                "Tab 2"
        };
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return ExampleFragment.getInstanse();
            case 1:
                return ExampleFragment.getInstanse();
            case 2:
                return ExampleFragment.getInstanse();
        }
        return null;
    }

    @Override
    public int getCount() {
        return tabs.length;
    }
}
