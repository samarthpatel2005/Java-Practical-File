package com.busbooking.ui;

import com.busbooking.models.Bus;
import com.busbooking.models.Ticket;
import com.busbooking.services.BookingService;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class BookingSystemGUI extends JFrame {
    private BookingService bookingService;
    private JTextArea outputArea;

    public BookingSystemGUI() {
        bookingService = new BookingService();
        bookingService.addBus(new Bus(1, "City Express", 50, "Delhi - Agra", "10:00 AM"));
        bookingService.addBus(new Bus(2, "Highway Star", 40, "Mumbai - Pune", "11:00 AM"));

        setTitle("Bus Booking System");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Creating Buttons for Booking and Adding Buses
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        JButton bookTicketButton = new JButton("Book Ticket");
        bookTicketButton.addActionListener(new BookTicketAction());
        buttonPanel.add(bookTicketButton);

        JButton addBusButton = new JButton("Add Bus");
        addBusButton.addActionListener(new AddBusAction());
        buttonPanel.add(addBusButton);

        add(buttonPanel, BorderLayout.NORTH);

        outputArea = new JTextArea();
        outputArea.setEditable(false);
        add(new JScrollPane(outputArea), BorderLayout.CENTER);

        setVisible(true);
    }

    // Action for booking a ticket
    private class BookTicketAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                String route = JOptionPane.showInputDialog("Enter the route (e.g., 'Delhi - Agra'):");
                if (route == null || route.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Route cannot be empty.");
                    return;
                }

                int busId = bookingService.findBusByRoute(route);
                if (busId == -1) {
                    outputArea.append("No bus found for this route.\n");
                    return;
                }

                String passengerName = JOptionPane.showInputDialog("Enter your name:");
                if (passengerName == null || passengerName.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Name cannot be empty.");
                    return;
                }

                int numberOfSeats = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of seats:"));
                if (numberOfSeats <= 0) {
                    JOptionPane.showMessageDialog(null, "Invalid number of seats.");
                    return;
                }

                Ticket ticket = bookingService.bookTicket(busId, passengerName, route, numberOfSeats);
                if (ticket != null) {
                    outputArea.append("Booking successful!\n");
                    outputArea.append("Ticket ID: " + ticket.getTicketId() + "\n");
                    outputArea.append("Bus Name: " + ticket.getBusName() + "\n");
                    outputArea.append("Passenger Name: " + ticket.getPassengerName() + "\n");
                    outputArea.append("Route: " + ticket.getRoute() + "\n");
                    outputArea.append("Seats Booked: " + ticket.getNumberOfSeats() + "\n");
                    outputArea.append("-------------------------------------\n");
                } else {
                    outputArea.append("Booking failed. Not enough seats available.\n");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter numeric values for seat count.");
            }
        }
    }

    // Action for adding a new bus
    private class AddBusAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                int id = Integer.parseInt(JOptionPane.showInputDialog("Enter Bus ID:"));
                String name = JOptionPane.showInputDialog("Enter Bus Name:");
                int totalSeats = Integer.parseInt(JOptionPane.showInputDialog("Enter Total Seats:"));
                String route = JOptionPane.showInputDialog("Enter Route (e.g., 'Delhi - Agra'):");
                String timing = JOptionPane.showInputDialog("Enter Timing (e.g., '10:00 AM'):");

                if (name == null || name.trim().isEmpty() || route == null || route.trim().isEmpty() || timing == null || timing.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please provide valid inputs.");
                    return;
                }

                Bus newBus = new Bus(id, name, totalSeats, route, timing);
                bookingService.addBus(newBus);
                outputArea.append("Bus added successfully!\n");
                outputArea.append("Bus ID: " + id + "\n");
                outputArea.append("Bus Name: " + name + "\n");
                outputArea.append("Route: " + route + "\n");
                outputArea.append("Timing: " + timing + "\n");
                outputArea.append("Total Number of seats: " + totalSeats + "\n");
                outputArea.append("-------------------------------------\n");

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter numeric values for Bus ID and Total Seats.");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(BookingSystemGUI::new);
    }
}