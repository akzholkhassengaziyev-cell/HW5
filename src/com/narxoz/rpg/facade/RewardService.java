package com.narxoz.rpg.facade;

import com.narxoz.rpg.decorator.AttackAction;
import com.narxoz.rpg.hero.Hero;

public class PreparationService {
    public String prepare(Hero hero, AttackAction action) {
        return "Preparation: " + hero.getName() + " enters the dungeon with attack -> " + action.getSummary();
    }
}