package com.busbooking.services;

import com.busbooking.models.Bus;
import com.busbooking.models.Ticket;

import java.util.ArrayList;
import java.util.List;

public class BookingService {
    private List<Bus> buses;
    private int ticketCounter = 0;

    public BookingService() {
        buses = new ArrayList<>();
    }

    // Method to add a bus to the list
    public void addBus(Bus bus) {
        buses.add(bus);
    }

    // Method to find a bus by route
    public int findBusByRoute(String route) {
        for (Bus bus : buses) {
            if (bus.getRoute().equalsIgnoreCase(route)) {
                return bus.getId();  // Return bus ID if found
            }
        }
        return -1; // Return -1 if not found
    }

    // Method to book a ticket
    public Ticket bookTicket(int busId, String passengerName, String route, int numberOfSeats) {
        for (Bus bus : buses) {
            if (bus.getId() == busId) {
                if (bus.getAvailableSeats() >= numberOfSeats) {
                    bus.setAvailableSeats(bus.getAvailableSeats() - numberOfSeats);
                    return new Ticket(++ticketCounter, bus.getBusName(), passengerName, route, numberOfSeats);
                } else {
                    return null; // Not enough seats available
                }
            }
        }
        return null; // Bus not found
    }

    // Method to get all buses
    public List<Bus> getAllBuses() {
        return buses;
    }
}