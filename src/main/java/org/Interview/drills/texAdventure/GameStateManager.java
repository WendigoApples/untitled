package org.Interview.drills.texAdventure;

public interface GameStateManager {

    // Define constants for the game state
    int EXPLORE_MODE = 0b00;
    int BATTLE_MODE = 0B01;

    // Method to toggle between game modes
    int toggleGameMode(int currentGameState);
}
