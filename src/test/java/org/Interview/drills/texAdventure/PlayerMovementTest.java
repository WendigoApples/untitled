package org.Interview.drills.texAdventure;

import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerMovementTest {

    @Test
    public void testMovePlayerNorth() {
        PlayerMovement playerMovement = new PlayerMovement() {
            @Override
            public int movePlayer(int currentPlayerPosition, int direction) {
                return 0;
            }
        };
        int currentPlayerPosition = 0b0000_0000_0000_0000_0000_0000_0000_1010; // Player's initial position

        // Move the player north
        int newPosition = playerMovement.movePlayer(currentPlayerPosition, PlayerMovement.NORTH);

        // Assert that player's position has changed correctly
        int expectedPosition = 0b0000_0000_0000_0000_0000_0000_0000_1010; // Expected new position after moving north
        assertEquals(expectedPosition, newPosition);
    }

    @Test
    public void testMovePlayerEast() {
        PlayerMovement playerMovement = new PlayerMovement() {
            @Override
            public int movePlayer(int currentPlayerPosition, int direction) {
                return 0;
            }
        };
        int currentPlayerPosition = 0b0000_0000_0000_0000_0000_0000_0000_1010; // Player's initial position

        // Move the player east
        int newPosition = playerMovement.movePlayer(currentPlayerPosition, PlayerMovement.EAST);

        // Assert that player's position has changed correctly
        int expectedPosition = 0b0000_0000_0000_0000_0000_0000_0001_0100; // Expected new position after moving east
        assertEquals(expectedPosition, newPosition);
    }

    // Add more test cases for other directions (south, west) and edge cases as needed
}
