package com.dev.android.appConfigSdk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.dev.android.appConfigSdk.data.config.Fragment;

import java.util.List;


public class CustomPagerAdapter extends FragmentPagerAdapter {

    private final List<Fragment> fragmentItemList;

    public CustomPagerAdapter(@NonNull FragmentManager fm, List<Fragment> fragmentItemList) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        this.fragmentItemList = fragmentItemList;
    }

    @NonNull
    @Override
    public androidx.fragment.app.Fragment getItem(int position) {
        Fragment currentItem = fragmentItemList.get(position);


        if ("web".equals(currentItem.getType())) {

            return BaseWebViewFragment.newInstance(currentItem.getUrl());
        } else if ("rv".equals(currentItem.getType())) {

            return BaseRecyclerViewFragment.newInstance(currentItem.getTitle(),currentItem.getItemViewHolder());
        }

        throw new IllegalArgumentException("Unknown fragment type");
    }

    @Override
    public int getCount() {
        return fragmentItemList.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentItemList.get(position).getTitle();
    }
}
