package com.example.ticketchecker.model;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {
    private String licensePlate;
    private Boolean hasReducedMovilityOwner;
    private List<Ticket> tickets;

    public Vehicle(String licensePlate, Boolean hasReducedMovilityOwner) {
        this.licensePlate = licensePlate;
        this.hasReducedMovilityOwner = hasReducedMovilityOwner;
        tickets = new ArrayList<>();
    }

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public Boolean hasReducedMovilityOwner() {
        return hasReducedMovilityOwner;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

}
