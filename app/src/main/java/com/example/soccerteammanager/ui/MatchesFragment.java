package com.example.soccerteammanager.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.soccerteammanager.R;
import com.example.soccerteammanager.adapter.MatchesAdapter;
import com.example.soccerteammanager.data.DataProvider;
import com.example.soccerteammanager.model.Match;
import java.util.List;

public class MatchesFragment extends Fragment {
    private RecyclerView recyclerView;
    private MatchesAdapter matchesAdapter;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_matches, container, false);
        recyclerView = view.findViewById(R.id.recyclerViewMatches);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        List<Match> matches = DataProvider.getSampleMatches();
        matchesAdapter = new MatchesAdapter(matches);
        recyclerView.setAdapter(matchesAdapter);
        return view;
    }
}
