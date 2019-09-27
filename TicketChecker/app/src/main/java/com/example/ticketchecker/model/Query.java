package com.example.ticketchecker.model;

import java.util.Date;

public class Query {
    private Date date;
    private String consultedLicensePlate;
    private String consultedDate;
    private String consultedTime;
    private String outcome;

    public Query(Date date, String consultedLicensePlate, String consultedDate,
                 String consultedTime, String outcome) {
        this.date = date;
        this.consultedLicensePlate = consultedLicensePlate;
        this.consultedDate = consultedDate;
        this.consultedTime = consultedTime;
        this.outcome = outcome;
    }

    public Date getDate() {
        return date;
    }

    public String getConsultedDate() {
        return consultedDate;
    }

    public String getConsultedLicensePlate() {
        return consultedLicensePlate;
    }

    public String getConsultedTime() {
        return consultedTime;
    }

    public String getOutcome() {
        return outcome;
    }
}
