package com.example.soccerteammanager.ui;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class SoccerPagerAdapter extends FragmentStateAdapter {
    public SoccerPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position == 0) {
            return new TeamsFragment();
        } else if (position == 1) {
            return new PlayersFragment();
        } else {
            return new MatchesFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
