package com.company;

public class EnhancedPlayer {
    private String name;
    private int health = 100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if (health < 100 && health > 0){
            this.health = health;
        }
        this.weapon = weapon;
    }
    public void loseHeath( int damage ){
        this.health -= damage;
        if ( health <= 0) {
            System.out.println("Player knocked out");
        }
    }

    public int getHealth() {
        return health;
    }
}
