package com.company;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Tharanga", 999);
        System.out.println("New Score " + newScore);
        int secondScore = calculateScore(400 );
        System.out.println("New Score " + secondScore);
        calculateScore();
    }
    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " Scored " + score + " Points");
        return score * 1000;
    }
    public static int calculateScore(int score) {
        System.out.println("Unnamed Player Scored " + score + " Points");
        return score * 1000;
    }
    public static void calculateScore() {
        System.out.println("No Player No Points");

    }
}
