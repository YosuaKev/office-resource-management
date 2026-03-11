package com.company.office.model;

public class Reservation {
    private String reservationId;
    private Employee requester;
    private MeetingRoom meetingRoom;
    private String date;

    public Reservation(String reservationId, Employee requester, MeetingRoom meetingRoom, String date) {
        this.reservationId = reservationId;
        this.requester = requester;
        this.meetingRoom = meetingRoom;
        this.date = date;
    }

    public void printReservation() {
        System.out.println("Reservation ID: " + reservationId);
        System.out.println("Requester: " + requester.getName());
        System.out.println("Room: " + meetingRoom.getRoomCode());
        System.out.println("Date: " + date);
    }
}