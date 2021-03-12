package by.epam.classes.main;

import by.epam.classes.entity.Airline;
import by.epam.classes.entity.Airport;
import by.epam.classes.logic.AirportLogic;

import java.text.ParseException;

/*
10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
методами. Задать критерии выбора данных и вывести эти данные на консоль.
Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
Найти и вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */
public class Main {
    public static void main(String[] args) throws ParseException {
        Airport airport = new Airport();
        AirportLogic logic = new AirportLogic();

        logic.addAirline(airport,"Moskow", 341, "Boing 747", Airline.getTimeFormat().parse("11:20"), new String[]{"Monday", "Sunday"});
        logic.addAirline(airport,"Gomel", 712, "Boing 787", Airline.getTimeFormat().parse("14:10"), new String[]{"Tuesday", "Thursday","Saturday"});
        logic.addAirline(airport,"Stambul", 554, "Boing 737", Airline.getTimeFormat().parse("12:10"), new String[]{"Monday", "Tuesday","Thursday", "Friday","Sunday"});
        logic.addAirline(airport,"Amsterdam", 113, "Boing 747", Airline.getTimeFormat().parse("13:10"), new String[]{"Saturday", "Sunday"});
        logic.addAirline(airport,"Lomdon", 271, "Boing 747", Airline.getTimeFormat().parse("9:00"), new String[]{"Wednesday","Thursday","Friday"});

        System.out.println(airport.getBase().get(0));
    }
}
