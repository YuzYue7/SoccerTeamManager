package com.example.soccerteammanager.repository;

import com.example.soccerteammanager.model.Team;
import java.util.Iterator;
import java.util.List;

public class TeamIterator implements Iterator<Team> {
    private List<Team> teams;
    private int position = 0;

    public TeamIterator(List<Team> teams) {
        this.teams = teams;
    }

    public boolean hasNext() {
        return position < teams.size();
    }

    public Team next() {
        return teams.get(position++);
    }
}
