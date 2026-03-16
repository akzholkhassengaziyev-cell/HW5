package com.narxoz.rpg.facade;

import com.narxoz.rpg.decorator.AttackAction;
import com.narxoz.rpg.enemy.BossEnemy;
import com.narxoz.rpg.hero.Hero;

public class DungeonFacade {
    private final PreparationService preparationService = new PreparationService();
    private final BattleService battleService = new BattleService();
    private final RewardService rewardService = new RewardService();

    public AdventureResult runAdventure(Hero hero, BossEnemy boss, AttackAction action) {
        AdventureResult result = new AdventureResult();

        result.addLog("=== DUNGEON RUN START ===");
        result.addLog(preparationService.prepare(hero, action));

        AdventureResult battleResult = battleService.fight(hero, boss, action);
        result.getLog().addAll(battleResult.getLog());

        boolean heroWon = hero.isAlive();
        int gold = rewardService.calculateReward(hero, boss, heroWon);

        result.setWinner(battleResult.getWinner());
        result.setRounds(battleResult.getRounds());
        result.setGoldReward(gold);

        result.addLog(rewardService.buildRewardSummary(gold));
        result.addLog("=== DUNGEON RUN END ===");

        return result;
    }
}