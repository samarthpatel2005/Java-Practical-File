package com.busbooking.models;

public class Bus {
    private int id;
    private String busName;
    private int totalSeats;
    private int availableSeats;
    private String route;
    private String timing;

    public Bus(int id, String busName, int totalSeats, String route, String timing) {
        this.id = id;
        this.busName = busName;
        this.totalSeats = totalSeats;
        this.availableSeats = totalSeats;
        this.route = route;
        this.timing = timing;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getBusName() {
        return busName;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public String getRoute() {
        return route;
    }

    public String getTiming() {
        return timing;
    }
}