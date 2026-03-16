package com.narxoz.rpg.decorator;

public class BasicAttack implements AttackAction {
    private final String name;
    private final int damage;

    public BasicAttack(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public String getDescription() {
        return "A basic direct strike";
    }
}