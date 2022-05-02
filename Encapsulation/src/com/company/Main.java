package com.company;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHeath(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        player.health = 100;
//        damage = 11;
//        player.loseHeath(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
        EnhancedPlayer player = new EnhancedPlayer("Tim", 150, "Sword");
        System.out.println("Players health " + player.getHealth());


    }
}
