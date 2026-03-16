package com.narxoz.rpg.facade;

import java.util.ArrayList;
import java.util.List;

public class AdventureResult {
    private String winner;
    private int rounds;
    private int goldReward;
    private final List<String> log = new ArrayList<>();

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public int getGoldReward() {
        return goldReward;
    }

    public void setGoldReward(int goldReward) {
        this.goldReward = goldReward;
    }

    public List<String> getLog() {
        return log;
    }

    public void addLog(String line) {
        log.add(line);
    }

    public String summary() {
        return "Winner: " + winner + ", rounds: " + rounds + ", gold: " + goldReward;
    }
}