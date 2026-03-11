package com.company.office.model;

public class MeetingRoom {
    private String roomCode;
    private int capacity;
    private boolean projectorAvailable;

    public MeetingRoom(String roomCode, int capacity, boolean projectorAvailable) {
        this.roomCode = roomCode;
        this.capacity = capacity;
        this.projectorAvailable = projectorAvailable;
    }

    public String getRoomCode() {
        return roomCode;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isProjectorAvailable() {
        return projectorAvailable;
    }

    @Override
    public String toString() {
        return "MeetingRoom{" +
                "roomCode='" + roomCode + '\'' +
                ", capacity=" + capacity +
                ", projectorAvailable=" + projectorAvailable +
                '}';
    }
}