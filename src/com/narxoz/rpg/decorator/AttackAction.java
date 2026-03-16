package com.narxoz.rpg.decorator;

public interface AttackAction {
    String getName();
    int getDamage();
    String getDescription();

    default String getSummary() {
        return getName() + " -> " + getDescription() + " [damage=" + getDamage() + "]";
    }
}