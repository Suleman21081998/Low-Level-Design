package com.lowleveldesignproblem.dto.snakeladder;

import java.util.HashMap;
import java.util.List;

public class Game {

    List<Player> players;

    Player winner;

    HashMap<Integer, Integer> ladderAndSnakes;

    int currentTurn;

    public boolean roll(Player player, int value) {

        if (winner != null || value > 6 || value < 1 || players.get(currentTurn).getId() != player.getId()) {
            return false;
        }
        int destination = players.get(currentTurn).getCurrentPosition() + value;

        if (destination < 100) {

            if (ladderAndSnakes.get(destination) != null) {
                players.get(currentTurn).setCurrentPosition(ladderAndSnakes.get(destination));
            } else {
                players.get(currentTurn).setCurrentPosition(destination);
            }
        }
        if (destination == 100) {
            winner = players.get(currentTurn);
        }

        nextPlayer();
        return false;
    }

    private void nextPlayer() {
        currentTurn = (currentTurn + 1) % players.size();
    }


}
