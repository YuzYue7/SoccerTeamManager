package com.example.soccerteammanager.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.soccerteammanager.R;
import com.example.soccerteammanager.model.Team;
import java.util.List;

public class TeamsAdapter extends RecyclerView.Adapter<TeamsAdapter.TeamViewHolder> {
    private List<Team> teams;

    public TeamsAdapter(List<Team> teams) {
        this.teams = teams;
    }

    @Override
    public TeamViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_team, parent, false);
        return new TeamViewHolder(view);
    }

    @Override
    public void onBindViewHolder(TeamViewHolder holder, int position) {
        Team team = teams.get(position);
        holder.textViewTeamName.setText(team.getName());
    }

    @Override
    public int getItemCount() {
        return teams.size();
    }

    public void updateData(List<Team> newTeams) {
        teams = newTeams;
        notifyDataSetChanged();
    }

    class TeamViewHolder extends RecyclerView.ViewHolder {
        TextView textViewTeamName;

        public TeamViewHolder(View itemView) {
            super(itemView);
            textViewTeamName = itemView.findViewById(R.id.textViewTeamName);
        }
    }
}
