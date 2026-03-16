package com.narxoz.rpg.hero;

public class Hero {
    private final String name;
    private int hp;
    private final int basePower;

    public Hero(String name, int hp, int basePower) {
        this.name = name;
        this.hp = hp;
        this.basePower = basePower;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getBasePower() {
        return basePower;
    }

    public void takeDamage(int amount) {
        hp -= Math.max(0, amount);
        if (hp < 0) hp = 0;
    }

    public boolean isAlive() {
        return hp > 0;
    }
}