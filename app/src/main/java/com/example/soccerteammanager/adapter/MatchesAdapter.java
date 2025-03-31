package com.example.soccerteammanager.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.soccerteammanager.R;
import com.example.soccerteammanager.model.Match;
import java.util.List;

public class MatchesAdapter extends RecyclerView.Adapter<MatchesAdapter.MatchViewHolder> {
    private List<Match> matches;

    public MatchesAdapter(List<Match> matches) {
        this.matches = matches;
    }

    @Override
    public MatchViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_match, parent, false);
        return new MatchViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MatchViewHolder holder, int position) {
        Match match = matches.get(position);
        holder.textViewMatchInfo.setText(match.toString());
    }

    @Override
    public int getItemCount() {
        return matches.size();
    }

    class MatchViewHolder extends RecyclerView.ViewHolder {
        TextView textViewMatchInfo;

        public MatchViewHolder(View itemView) {
            super(itemView);
            textViewMatchInfo = itemView.findViewById(R.id.textViewMatchInfo);
        }
    }
}
