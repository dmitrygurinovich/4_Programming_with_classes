package by.epam.classes.main;

import by.epam.classes.entity.City;
import by.epam.classes.entity.District;
import by.epam.classes.entity.Country;
import by.epam.classes.entity.Region;
import by.epam.classes.logic.CountryLogic;

import java.util.ArrayList;

/*
 3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
 столицу, количество областей, площадь, областные центры.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Region> regions = new ArrayList<>();

        regions.add(new Region(new City("Minsk"), new District(new City("Slutsk")), new District(new City("Volozhin"))));
        regions.add(new Region(new City("Brest"), new District(new City("Baranovichi")), new District(new City("Ivacevichi"))));
        regions.add(new Region(new City("Gomel"), new District(new City("Dobrush")), new District(new City("Rechica"))));
        regions.add(new Region(new City("Grodno"), new District(new City("Korelichi")), new District(new City("Dyatlovo"))));
        regions.add(new Region(new City("Mogilev"), new District(new City("Belinychi")), new District(new City("Glussk"))));
        regions.add(new Region(new City("Vitebsk"), new District(new City("Braslav")), new District(new City("Glubokoe"))));

        Country belarus = new Country("Belarus", new City("Minsk"), 207600, regions);
        CountryLogic logic = new CountryLogic();

        System.out.println("Capital: " + logic.printCapital(belarus));
        System.out.println("There are " + logic.printRegionsCount(belarus) + " regions.");
        System.out.println("Square of Belarus is " + logic.printSquare(belarus) + " sq. km.");

        System.out.println("Regional centers: ");
        for (City city : logic.printRegionsCentre(belarus)) {
            System.out.println("- " + city);
        }
    }
}
