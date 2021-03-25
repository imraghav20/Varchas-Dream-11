package com.example.varchasdream11.TeamSelection;

public class Team {

    public String playerName, playerImage, playerCategory, playerCredits, playerID, playerScore;


    public Team(String playerName, String playerImage, String playerCategory, String playerCredits, String playerID, String playerScore) {
        this.playerName = playerName;
        this.playerImage = playerImage;
        this.playerCategory = playerCategory;
        this.playerCredits = playerCredits;
        this.playerID = playerID;
        this.playerScore = playerScore;
    }

    public Team(){}

    public String getPlayerScore() {
        return playerScore;
    }

    public void setPlayerScore(String playerScore) {
        this.playerScore = playerScore;
    }

    public String getPlayerID() {
        return playerID;
    }

    public void setPlayerID(String playerID) {
        this.playerID = playerID;
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
