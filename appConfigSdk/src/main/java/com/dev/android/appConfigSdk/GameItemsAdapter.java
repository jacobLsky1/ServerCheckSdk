package com.dev.android.appConfigSdk;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.dev.android.appConfigSdk.data.CustomMatch;

import java.util.List;
import java.util.Objects;

public class GameItemsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<CustomMatch> games;
    private int style;

    public GameItemsAdapter(List<CustomMatch> games, int style) {
        this.games = games;
        this.style = style;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        if (style == 1) {
            View view = inflater.inflate(R.layout.item_match_1, parent, false);
            return new StyleOneViewHolder(view);
        }
        if (style == 2) {
            View view = inflater.inflate(R.layout.item_match_2, parent, false);
            return new StyleTwoViewHolder(view);
        }
        if (style == 3) {
            View view = inflater.inflate(R.layout.item_match_3, parent, false);
            return new StyleThreeViewHolder(view);
        }
        if (style == 4) {
            View view = inflater.inflate(R.layout.item_match_4, parent, false);
            return new StyleFourViewHolder(view);
        }
        View view = inflater.inflate(R.layout.item_match_5, parent, false);
        return new StyleFiveViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        CustomMatch game = games.get(position);

        if (style == 1) {
            ((StyleOneViewHolder) holder).bind(game);
        }
        if (style == 2) {
            ((StyleTwoViewHolder) holder).bind(game);
        }
        if (style == 3) {
            ((StyleThreeViewHolder) holder).bind(game);
        }
        if (style == 4) {
            ((StyleFourViewHolder) holder).bind(game);
        }
        if (style == 5) {
            ((StyleFiveViewHolder) holder).bind(game);
        }
    }

    @Override
    public int getItemCount() {
        return games.size();
    }

    static class StyleOneViewHolder extends RecyclerView.ViewHolder {
        ImageView matchLocalTeamIV, matchVisitorTeamIV, matchLeagueIV;
        TextView matchLocalTeamTV, matchVisitorTeamTV, matchLeagueTV, matchStartTime, matchScore;

        public StyleOneViewHolder(@NonNull View itemView) {
            super(itemView);
            matchLocalTeamIV = itemView.findViewById(R.id.app_config_matchLocalTeamIV1);
            matchVisitorTeamIV = itemView.findViewById(R.id.app_config_matchVisitorTeamIV1);
            matchLeagueIV = itemView.findViewById(R.id.app_config_matchLeagueIV1);

            matchLocalTeamTV = itemView.findViewById(R.id.app_config_matchLocalTeamTV1);
            matchVisitorTeamTV = itemView.findViewById(R.id.app_config_matchVisitorTeamTV1);
            matchLeagueTV = itemView.findViewById(R.id.app_config_matchLeagueTV1);
            matchStartTime = itemView.findViewById(R.id.app_config_matchStartTime1);
            matchScore = itemView.findViewById(R.id.app_config_matchScore1);
        }

        void bind(CustomMatch game) {
            Glide.with(itemView.getContext()).load(game.getLocalTeamLogo()).into(matchLocalTeamIV);
            Glide.with(itemView.getContext()).load(game.getVisitorTeamLogo()).into(matchVisitorTeamIV);
            Glide.with(itemView.getContext()).load(game.getLeagueLogo()).into(matchLeagueIV);

            matchLocalTeamTV.setText(game.getLocalTeamName());
            matchVisitorTeamTV.setText(game.getVisitorTeamName());
            matchLeagueTV.setText(game.getLeagueName());
            if(!Objects.equals(game.getPrediction(), "")) {
                matchStartTime.setText(game.getPrediction());
            }else{
                matchStartTime.setText(game.getStartTime());
            }
            matchScore.setText(game.getScore());
        }
    }

    static class StyleTwoViewHolder extends RecyclerView.ViewHolder {
        ImageView matchLocalTeamIV, matchVisitorTeamIV, matchLeagueIV;
        TextView matchLocalTeamTV, matchVisitorTeamTV, matchLeagueTV, matchStartTime, matchScore;

        public StyleTwoViewHolder(@NonNull View itemView) {
            super(itemView);
            matchLocalTeamIV = itemView.findViewById(R.id.app_config_matchLocalTeamIV2);
            matchVisitorTeamIV = itemView.findViewById(R.id.app_config_matchVisitorTeamIV2);
            matchLeagueIV = itemView.findViewById(R.id.app_config_matchLeagueIV2);

            matchLocalTeamTV = itemView.findViewById(R.id.app_config_matchLocalTeamTV2);
            matchVisitorTeamTV = itemView.findViewById(R.id.app_config_matchVisitorTeamTV2);
            matchStartTime = itemView.findViewById(R.id.app_config_matchStartTime2);
            matchScore = itemView.findViewById(R.id.app_config_matchScore2);
        }

        void bind(CustomMatch game) {
            Glide.with(itemView.getContext()).load(game.getLocalTeamLogo()).into(matchLocalTeamIV);
            Glide.with(itemView.getContext()).load(game.getVisitorTeamLogo()).into(matchVisitorTeamIV);
            Glide.with(itemView.getContext()).load(game.getLeagueLogo()).into(matchLeagueIV);

            matchLocalTeamTV.setText(game.getLocalTeamName());
            matchVisitorTeamTV.setText(game.getVisitorTeamName());
            if(!Objects.equals(game.getPrediction(), "")) {
                matchStartTime.setText(game.getPrediction());
            }else{
                matchStartTime.setText(game.getStartTime());
            }
            matchScore.setText(game.getScore());
        }
    }


    static class StyleThreeViewHolder extends RecyclerView.ViewHolder {
        ImageView matchLocalTeamIV, matchVisitorTeamIV, matchLeagueIV;
        TextView matchLocalTeamTV, matchVisitorTeamTV, matchLeagueTV, matchStartTime, matchScore;

        public StyleThreeViewHolder(@NonNull View itemView) {
            super(itemView);
            matchLocalTeamIV = itemView.findViewById(R.id.app_config_matchLocalTeamIV3);
            matchVisitorTeamIV = itemView.findViewById(R.id.app_config_matchVisitorTeamIV3);
            matchLeagueIV = itemView.findViewById(R.id.app_config_matchLeagueIV3);

            matchLocalTeamTV = itemView.findViewById(R.id.app_config_matchLocalTeamTV3);
            matchVisitorTeamTV = itemView.findViewById(R.id.app_config_matchVisitorTeamTV3);
            matchLeagueTV = itemView.findViewById(R.id.app_config_matchLeagueTV3);
            matchStartTime = itemView.findViewById(R.id.app_config_matchStartTime3);
            matchScore = itemView.findViewById(R.id.app_config_matchScore3);
        }

        void bind(CustomMatch game) {
            Glide.with(itemView.getContext()).load(game.getLocalTeamLogo()).into(matchLocalTeamIV);
            Glide.with(itemView.getContext()).load(game.getVisitorTeamLogo()).into(matchVisitorTeamIV);
            Glide.with(itemView.getContext()).load(game.getLeagueLogo()).into(matchLeagueIV);

            matchLocalTeamTV.setText(game.getLocalTeamName());
            matchVisitorTeamTV.setText(game.getVisitorTeamName());
            matchLeagueTV.setText(game.getLeagueName());
            if(!Objects.equals(game.getPrediction(), "")) {
                matchStartTime.setText(game.getPrediction());
            }else{
                matchStartTime.setText(game.getStartTime());
            }
            matchScore.setText(game.getScore());
        }
    }

    static class StyleFourViewHolder extends RecyclerView.ViewHolder {
        ImageView matchLocalTeamIV, matchVisitorTeamIV, matchLeagueIV;
        TextView matchLocalTeamTV, matchVisitorTeamTV, matchLeagueTV, matchStartTime, matchScore;

        public StyleFourViewHolder(@NonNull View itemView) {
            super(itemView);
            matchLocalTeamIV = itemView.findViewById(R.id.app_config_matchLocalTeamIV4);
            matchVisitorTeamIV = itemView.findViewById(R.id.app_config_matchVisitorTeamIV4);
            matchLeagueIV = itemView.findViewById(R.id.app_config_matchLeagueIV4);

            matchLocalTeamTV = itemView.findViewById(R.id.app_config_matchLocalTeamTV4);
            matchVisitorTeamTV = itemView.findViewById(R.id.app_config_matchVisitorTeamTV4);
            matchLeagueTV = itemView.findViewById(R.id.app_config_matchLeagueTV4);
            matchStartTime = itemView.findViewById(R.id.app_config_matchStartTime4);
            matchScore = itemView.findViewById(R.id.app_config_matchScore4);
        }

        void bind(CustomMatch game) {
            Glide.with(itemView.getContext()).load(game.getLocalTeamLogo()).into(matchLocalTeamIV);
            Glide.with(itemView.getContext()).load(game.getVisitorTeamLogo()).into(matchVisitorTeamIV);
            Glide.with(itemView.getContext()).load(game.getLeagueLogo()).into(matchLeagueIV);

            matchLocalTeamTV.setText(game.getLocalTeamName());
            matchVisitorTeamTV.setText(game.getVisitorTeamName());
            matchLeagueTV.setText(game.getLeagueName());
            if(!Objects.equals(game.getPrediction(), "")) {
                matchStartTime.setText(game.getPrediction());
            }else{
                matchStartTime.setText(game.getStartTime());
            }
            matchScore.setText(game.getScore());
        }
    }

    static class StyleFiveViewHolder extends RecyclerView.ViewHolder {
        ImageView matchLocalTeamIV, matchVisitorTeamIV, matchLeagueIV;
        TextView matchLocalTeamTV, matchVisitorTeamTV, matchLeagueTV, matchStartTime, matchScore;

        public StyleFiveViewHolder(@NonNull View itemView) {
            super(itemView);
            matchLocalTeamIV = itemView.findViewById(R.id.app_config_matchLocalTeamIV5);
            matchVisitorTeamIV = itemView.findViewById(R.id.app_config_matchVisitorTeamIV5);
            matchLeagueIV = itemView.findViewById(R.id.app_config_matchLeagueIV5);

            matchLocalTeamTV = itemView.findViewById(R.id.app_config_matchLocalTeamTV5);
            matchVisitorTeamTV = itemView.findViewById(R.id.app_config_matchVisitorTeamTV5);
            matchLeagueTV = itemView.findViewById(R.id.app_config_matchLeagueTV5);
            matchStartTime = itemView.findViewById(R.id.app_config_matchStartTime5);
            matchScore = itemView.findViewById(R.id.app_config_matchScore5);
        }


        void bind(CustomMatch game) {
            Glide.with(itemView.getContext()).load(game.getLocalTeamLogo()).into(matchLocalTeamIV);
            Glide.with(itemView.getContext()).load(game.getVisitorTeamLogo()).into(matchVisitorTeamIV);
            Glide.with(itemView.getContext()).load(game.getLeagueLogo()).into(matchLeagueIV);

            matchLocalTeamTV.setText(game.getLocalTeamName());
            matchVisitorTeamTV.setText(game.getVisitorTeamName());
            matchLeagueTV.setText(game.getLeagueName());
            if(!Objects.equals(game.getPrediction(), "")) {
                matchStartTime.setText(game.getPrediction());
            }else{
                matchStartTime.setText(game.getStartTime());
            }
            matchScore.setText(game.getScore());
        }
    }
}
