package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int highestScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your Second Score was " + highestScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highestScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your Second Score was " + highestScore);
        int playersPosition = calculateHighestScorePosition(1500);
        displayHighScorePosition("kasun", playersPosition);
        playersPosition = calculateHighestScorePosition(900);
        displayHighScorePosition("pubudu", playersPosition);
        playersPosition = calculateHighestScorePosition(400);
        displayHighScorePosition("nimal", playersPosition);
        playersPosition = calculateHighestScorePosition(50);
        displayHighScorePosition("kamal", playersPosition);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);

            return finalScore;
        }

        return -1;
    }
    public static void displayHighScorePosition(String playersName, int positionInHighestScore){
        System.out.println(playersName + " managed to get in to " + positionInHighestScore + " on the highest score table");
    }
    public static int calculateHighestScorePosition(int score){
//        if (score > 1000){
//            return 1;
//        }
//        else if (score >500){
//            return 2;
//        }
//        else if (score > 100){
//            return 3;
//        }
//        return 4;
        int position = 4;
        if (score >= 1000){
            position = 1;
        }
        else if (score >= 500){
            position = 2;
        }
        else if (score >= 100){
            position = 3;
        }
        return position;
    }
}
