package com.example.soccerteammanager.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.soccerteammanager.R;
import com.example.soccerteammanager.model.Player;
import java.util.List;

public class PlayersAdapter extends RecyclerView.Adapter<PlayersAdapter.PlayerViewHolder> {
    private List<Player> players;

    public PlayersAdapter(List<Player> players) {
        this.players = players;
    }

    @Override
    public PlayerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_player, parent, false);
        return new PlayerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PlayerViewHolder holder, int position) {
        Player player = players.get(position);
        holder.textViewPlayerName.setText(player.getName());
    }

    @Override
    public int getItemCount() {
        return players.size();
    }

    class PlayerViewHolder extends RecyclerView.ViewHolder {
        TextView textViewPlayerName;

        public PlayerViewHolder(View itemView) {
            super(itemView);
            textViewPlayerName = itemView.findViewById(R.id.textViewPlayerName);
        }
    }
}
