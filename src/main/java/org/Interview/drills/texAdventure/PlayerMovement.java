package org.Interview.drills.texAdventure;

public interface PlayerMovement {

    int NORTH = 0b00;
    int EAST = 0b01;
    int SOUTH = 0b10;
    int WEST = 0b11;

    int movePlayer(int currentPlayerPosition, int direction);

}
