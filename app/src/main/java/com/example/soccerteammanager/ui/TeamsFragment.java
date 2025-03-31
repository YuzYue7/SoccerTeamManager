package com.example.soccerteammanager.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.soccerteammanager.R;
import com.example.soccerteammanager.adapter.TeamsAdapter;
import com.example.soccerteammanager.data.DataProvider;
import com.example.soccerteammanager.model.Team;
import java.util.List;

public class TeamsFragment extends Fragment {
    private RecyclerView recyclerView;
    private TeamsAdapter teamsAdapter;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_teams, container, false);
        recyclerView = view.findViewById(R.id.recyclerViewTeams);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        List<Team> teams = DataProvider.getSampleTeams();
        teamsAdapter = new TeamsAdapter(teams);
        recyclerView.setAdapter(teamsAdapter);
        return view;
    }
}
