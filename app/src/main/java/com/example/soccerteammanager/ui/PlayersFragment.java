package com.example.soccerteammanager.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.soccerteammanager.R;
import com.example.soccerteammanager.adapter.PlayersAdapter;
import com.example.soccerteammanager.data.DataProvider;
import com.example.soccerteammanager.model.Player;
import java.util.List;

public class PlayersFragment extends Fragment {
    private RecyclerView recyclerView;
    private PlayersAdapter playersAdapter;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_players, container, false);
        recyclerView = view.findViewById(R.id.recyclerViewPlayers);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        List<Player> players = DataProvider.getSamplePlayers();
        playersAdapter = new PlayersAdapter(players);
        recyclerView.setAdapter(playersAdapter);
        return view;
    }
}
