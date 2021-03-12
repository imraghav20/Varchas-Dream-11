package com.example.varchasdream11.TeamSelection;

public class Team {

    public String playerName, playerImage, playerCategory, playerCredits;

    public Team(){}

    public Team(String playerName, String playerImage, String playerCategory, String playerCredits) {
        this.playerName = playerName;
        this.playerImage = playerImage;

        this.playerCategory = playerCategory;
        this.playerCredits = playerCredits;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerImage() {
        return playerImage;
    }

    public void setPlayerImage(String playerImage) {
        this.playerImage = playerImage;
    }


    public String getPlayerCategory() {
        return playerCategory;
    }

    public void setPlayerCategory(String playerCategory) {
        this.playerCategory = playerCategory;
    }

    public String getPlayerCredits() {
        return playerCredits;
    }

    public void setPlayerCredits(String playerCredits) {
        this.playerCredits = playerCredits;
    }
}
