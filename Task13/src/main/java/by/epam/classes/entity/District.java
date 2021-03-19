package by.epam.classes.entity;

import java.util.Objects;

public class District {
    private City name;

    public District(City name) {
        this.name = name;
    }

    public District() {
    }

    public City getName() {
        return name;
    }

    public void setName(City name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        District district = (District) o;
        return name.equals(district.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name + " district";
    }
}
