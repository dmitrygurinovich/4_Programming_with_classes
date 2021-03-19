package by.epam.classes.entity;

import java.util.ArrayList;
import java.util.Objects;

public class Region {
    private City name;
    private ArrayList<District> districts;

    public Region(City name, District... districts) {
        this.name = name;

        ArrayList<District> tempDistricts;
        tempDistricts = new ArrayList<>();

        for (District district : districts) {
            tempDistricts.add(district);
        }
        this.districts = tempDistricts;
    }

    public Region() {
    }

    public City getName() {
        return name;
    }

    public void setName(City name) {
        this.name = name;
    }

    public ArrayList<District> getDistricts() {
        return districts;
    }

    public void setDistricts(ArrayList<District> districts) {
        this.districts = districts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Region region = (Region) o;
        return Objects.equals(name, region.name) && Objects.equals(districts, region.districts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, districts);
    }

    @Override
    public String toString() {
        return  name + " region";
    }
}
