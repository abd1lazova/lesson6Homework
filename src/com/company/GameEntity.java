package com.company;

public class GameEntity {
    public GameEntity(String health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    private String health;
    private int damage;


    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getInfo(){
        return  "health " + health + " damage " + damage;
    }


}
