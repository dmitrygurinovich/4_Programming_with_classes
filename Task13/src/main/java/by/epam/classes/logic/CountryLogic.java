package by.epam.classes.logic;

import by.epam.classes.entity.City;
import by.epam.classes.entity.Country;
import by.epam.classes.entity.Region;

import java.util.ArrayList;

public class CountryLogic {
    public CountryLogic() {
    }

    public City printCapital(Country country) {
        return country.getCapital();
    }

    public int printRegionsCount(Country country) {
        return country.getRegions().size();
    }

    public int printSquare(Country country) {
        return country.getSquare();
    }

    public ArrayList<City> printRegionsCentre(Country country) {
        ArrayList<City> result = new ArrayList<>();
        for (Region region : country.getRegions()) {
            result.add(region.getName());
        }
        return result;
    }
}
