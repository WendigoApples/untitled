package org.Interview.gamer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AdventureLevelMap {
    public static void main(String[] args) {
        List<Room> rooms = generateLevelMap(6, 10);
        printLevelMap(rooms);
    }

    private static List<Room> generateLevelMap(int minRooms, int maxRooms) {
        Random random = new Random();
        int numRooms = random.nextInt(maxRooms - minRooms + 1) + minRooms;

        List<Room> rooms = new ArrayList<>();
        for (int i = 0; i < numRooms; i++) {
            rooms.add(new Room("Room " + (i + 1)));
        }

        for (Room room : rooms) {
            int numConnections = random.nextInt(rooms.size() - 1); // Generate random number of connections
            for (int i = 0; i < numConnections; i++) {
                Room connectedRoom = rooms.get(random.nextInt(rooms.size())); // Choose a random room to connect to
                if (!room.getConnectedRooms().contains(connectedRoom) && room != connectedRoom) {
                    room.addConnection(connectedRoom);
                }
            }
        }

        return rooms;
    }

    private static void printLevelMap(List<Room> rooms) {
        for (Room room : rooms) {
            System.out.println(room.getName() + " connected to:");
            for (Room connectedRoom : room.getConnectedRooms()) {
                System.out.println("    " + connectedRoom.getName());
            }
            System.out.println();
        }
    }
}

