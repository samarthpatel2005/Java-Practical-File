package com.busbooking.models;

public class Ticket {
    private int ticketId;
    private String busName;
    private String passengerName;
    private String route;
    private int numberOfSeats;

    public Ticket(int ticketId, String busName, String passengerName, String route, int numberOfSeats) {
        this.ticketId = ticketId;
        this.busName = busName;
        this.passengerName = passengerName;
        this.route = route;
        this.numberOfSeats = numberOfSeats;
    }

    // Getters
    public int getTicketId() {
        return ticketId;
    }

    public String getBusName() {
        return busName;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public String getRoute() {
        return route;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }
}