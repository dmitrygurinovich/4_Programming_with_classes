package by.epam.classes.entity;

import java.util.ArrayList;
import java.util.Objects;

public class TourOperator {
    private String name;
    private ArrayList<Tour> tourList;

    public TourOperator(String name, ArrayList<Tour> tourList) {
        this.name = name;
        this.tourList = tourList;
    }

    public TourOperator(String name) {
        this.name = name;
    }

    public TourOperator() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setTourList(ArrayList<Tour> tourList) {
        this.tourList = tourList;
    }

    public ArrayList<Tour> getTourList() {
        return tourList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TourOperator that = (TourOperator) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(tourList, that.tourList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, tourList);
    }

    @Override
    public String toString() {
        return "Tour operator: [" + name + "]" +
                "\nTour's list: \n" + tourList + "\n\n";
    }
}
