package com.thiagomuller.BasicFormProject.Model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Player {

    @NotNull(message="is required")
    private String playerName;

    @NotNull(message="is required")
    @Min(value=1, message="age must be greater than zero")
    private Integer playerAge;

    @NotNull(message="is required")
    private String favoriteConsole;

    @NotNull(message="is required")
    private String favoriteGame;

    @NotNull(message="is required")
    private String favoriteExclusive;


    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Integer getPlayerAge() {
        return playerAge;
    }

    public void setPlayerAge(Integer playerAge) {
        this.playerAge = playerAge;
    }

    public String getFavoriteConsole() {
        return favoriteConsole;
    }

    public void setFavoriteConsole(String favoriteConsole) {
        this.favoriteConsole = favoriteConsole;
    }

    public String getFavoriteGame() {
        return favoriteGame;
    }

    public void setFavoriteGame(String favoriteGame) {
        this.favoriteGame = favoriteGame;
    }

    public String getFavoriteExclusive() {
        return favoriteExclusive;
    }

    public void setFavoriteExclusive(String favoriteExclusive) {
        this.favoriteExclusive = favoriteExclusive;
    }
}
