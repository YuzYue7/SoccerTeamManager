package com.example.soccerteammanager.model;

public class Player implements SoccerEntity {
    private String name;
    private int age;
    private String country;
    private String position;
    private String team;
    private int number;

    public Player(String name, int age, String country, String position, String team, int number) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.position = position;
        this.team = team;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    public String getPosition() {
        return position;
    }

    public String getTeam() {
        return team;
    }

    public int getNumber() {
        return number;
    }

    public String toString() {
        return name;
    }
}
