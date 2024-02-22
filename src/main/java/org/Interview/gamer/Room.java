package org.Interview.gamer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Room {
    private String name;
    private List<Room> connectedRooms;

    public Room(String name) {
        this.name = name;
        this.connectedRooms = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Room> getConnectedRooms() {
        return connectedRooms;
    }

    public void addConnection(Room room) {
        connectedRooms.add(room);
    }
}

