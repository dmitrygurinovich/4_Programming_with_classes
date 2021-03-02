package by.epam.classes.task10;

import java.util.ArrayList;

public class Airport {
    private ArrayList<Airline> base = new ArrayList<>();

    public Airport() {

    }

    public void addAirline(String destinationName, int flightNumber, String plainType, String departureTime, String[] days) {
        base.add(new Airline(destinationName, flightNumber, plainType, departureTime, days));
    }

    public ArrayList<Airline> getBase() {
        return base;
    }

    public void setBase(ArrayList<Airline> base) {
        this.base = base;
    }
}
