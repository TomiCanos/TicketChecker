package com.example.ticketchecker.model;

public class Ticket {
    private Integer id;
    private String vehicleLicensePlate;
    private String date;
    private String time;

    public Ticket(Integer id, String vehicleLicensePlate, String date, String time) {
        this.id = id;
        this.vehicleLicensePlate = vehicleLicensePlate;
        this.date = date;
        this.time = time;
    }

    public Integer getId() {
        return id;
    }

    public String getVehicleLicensePlate() {
        return vehicleLicensePlate;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }
}
