package com.narxoz.rpg.facade;

import com.narxoz.rpg.decorator.AttackAction;
import com.narxoz.rpg.enemy.BossEnemy;
import com.narxoz.rpg.hero.Hero;

public class BattleService {

    public AdventureResult fight(Hero hero, BossEnemy boss, AttackAction action) {
        AdventureResult result = new AdventureResult();

        int round = 0;
        result.addLog("Battle starts: " + hero.getName() + " vs " + boss.getName());

        while (hero.isAlive() && boss.isAlive()) {
            round++;
            result.addLog("-- Round " + round + " --");

            int heroDamage = action.getDamage() + hero.getBasePower();
            boss.takeDamage(heroDamage);
            result.addLog(hero.getName() + " uses " + action.getName() + " and deals " + heroDamage
                    + " damage. Boss HP: " + boss.getHp());

            if (!boss.isAlive()) {
                break;
            }

            int bossDamage = boss.getDamage();
            hero.takeDamage(bossDamage);
            result.addLog(boss.getName() + " attacks back for " + bossDamage
                    + " damage. Hero HP: " + hero.getHp());
        }

        result.setRounds(round);
        result.setWinner(hero.isAlive() ? hero.getName() : boss.getName());
        return result;
    }
}