package by.epam.classes.entity;

import java.util.ArrayList;
import java.util.Objects;

public class Country {
    private String name;
    private City capital;
    private int square;
    private ArrayList<Region> regions;

    public Country(String name, City capital, int square, ArrayList<Region> regions) {
        this.name = name;
        this.capital = capital;
        this.square = square;
        this.regions = regions;
    }

    public Country() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public ArrayList<Region> getRegions() {
        return regions;
    }

    public void setRegions(ArrayList<Region> regions) {
        this.regions = regions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return square == country.square && name.equals(country.name) && capital.equals(country.capital) && regions.equals(country.regions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, capital, square, regions);
    }

    @Override
    public String toString() {
        return  "Country: " +name +
                "\nCapital: " + capital +
                "\nSquare: " + square + " sq.km" +
                "\nRegions: " + regions;
    }
}
