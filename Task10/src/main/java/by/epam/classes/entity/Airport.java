package by.epam.classes.entity;

import java.util.ArrayList;

public class Airport {
    private ArrayList<Airline> base = new ArrayList<>();

    public Airport() {

    }

    public ArrayList<Airline> getBase() {
        return base;
    }

    public void setBase(ArrayList<Airline> base) {
        this.base = base;
    }
}
