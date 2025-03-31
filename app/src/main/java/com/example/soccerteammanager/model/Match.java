package com.example.soccerteammanager.model;

public class Match implements SoccerEntity {
    private String homeTeam;
    private String awayTeam;
    private String score;
    private String league;
    private String date;
    private String venue;

    public Match(String homeTeam, String awayTeam, String score, String league, String date, String venue) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.score = score;
        this.league = league;
        this.date = date;
        this.venue = venue;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public String getScore() {
        return score;
    }

    public String getLeague() {
        return league;
    }

    public String getDate() {
        return date;
    }

    public String getVenue() {
        return venue;
    }

    public String toString() {
        return homeTeam + " vs " + awayTeam;
    }
}
