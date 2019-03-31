package com.datatypes;

public class Main {

    public static void main(String[] args) {

        String playerName = "Thiago";

        int playerScore = 50;

        int playerPosition = calculateHighScorePosition(playerScore);

        displayHighScorePosition(playerName , playerPosition);

    }

    public static void displayHighScorePosition(String playerName ,  int playerPosition){

        System.out.println("Player: " + playerName + " managed to get into position " + playerPosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore){
        if(playerScore > 1000){
            return 1;
        }
        else if(playerScore <1000 && playerScore > 500){
            return 2;
        }
        else if(playerScore <500 && playerScore > 100){
            return 3;
        }
        else{
            return 4;
        }
    }
}
