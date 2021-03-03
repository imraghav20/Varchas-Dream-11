package com.example.varchasdream11.Matches;

public class Match {
    public String team1Name, team2Name, team1Image, team2Image,matchTime;

    public Match(){}

    public Match(String team1Name, String team2Name, String team1Image, String team2Image, String matchTime) {
        this.team1Name = team1Name;
        this.team2Name = team2Name;
        this.team1Image = team1Image;
        this.team2Image = team2Image;
        this.matchTime = matchTime;
    }

    public String getMatchTime() {
        return matchTime;
    }

    public void setMatchTime(String matchTime) {
        this.matchTime = matchTime;
    }

    public String getTeam1Name() {
        return team1Name;
    }

    public void setTeam1Name(String team1Name) {
        this.team1Name = team1Name;
    }

    public String getTeam2Name() {
        return team2Name;
    }

    public void setTeam2Name(String team2Name) {
        this.team2Name = team2Name;
    }

    public String getTeam1Image() {
        return team1Image;
    }

    public void setTeam1Image(String team1Image) {
        this.team1Image = team1Image;
    }

    public String getTeam2Image() {
        return team2Image;
    }

    public void setTeam2Image(String team2Image) {
        this.team2Image = team2Image;
    }
}
