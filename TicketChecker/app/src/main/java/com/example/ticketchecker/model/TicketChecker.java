package com.example.ticketchecker.model;


import java.io.CharArrayReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TicketChecker {
    private Map<String, List<Integer>> rushHour;
    private static TicketChecker newTicketChecker;

    public static TicketChecker getTicketChecker() {
        if (newTicketChecker != null){
            return newTicketChecker;
        }
        newTicketChecker = new TicketChecker();
        return newTicketChecker;
    }

    private TicketChecker() {
        rushHour = new HashMap<>();

        List<Integer> monday = new ArrayList<>();
        List<Integer> tuesday = new ArrayList<>();
        List<Integer> wednesday = new ArrayList<>();
        List<Integer> thursday = new ArrayList<>();
        List<Integer> friday = new ArrayList<>();

        monday.add(1);
        monday.add(2);
        tuesday.add(3);
        tuesday.add(4);
        wednesday.add(5);
        wednesday.add(6);
        thursday.add(7);
        thursday.add(8);
        friday.add(9);
        friday.add(0);

        rushHour.put("lunes", monday);
        rushHour.put("martes", tuesday);
        rushHour.put("miercoles", wednesday);
        rushHour.put("jueves", thursday);
        rushHour.put("viernes", friday);
    }

    public Boolean correspondTicket(String licensePlate, String date, String time) {
        int licensePlateLastNumber = Character.getNumericValue(licensePlate.charAt(licensePlate.length() - 1));
        Integer trimmedTime = Integer.parseInt(time.replaceAll(":", ""));

        if (rushHour.get(date.toLowerCase()).contains(licensePlateLastNumber)){
            if (trimmedTime > 699 || trimmedTime < 1931){
                if (trimmedTime < 931 || trimmedTime > 1599){
                    return true;
                }
            }
        }
        return false;
    }

}
