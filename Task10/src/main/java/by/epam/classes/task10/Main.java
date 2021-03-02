package by.epam.classes.task10;

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
    public static void main(String[] args) {
        Airport airport = new Airport();

        airport.addAirline("Moskow", 341, "Boing 747", "11.20", new String[]{"Monday", "Sunday"});
        airport.addAirline("Gomel", 712, "Boing 787", "14.10", new String[]{"Tuesday", "Thursday","Saturday"});
        airport.addAirline("Stambul", 554, "Boing 737", "12.10", new String[]{"Monday", "Tuesday","Thursday", "Friday","Sunday"});
        airport.addAirline("Amsterdam", 113, "Boing 747", "13.10", new String[]{"Saturday", "Sunday"});
        airport.addAirline("Lomdon", 271, "Boing 747", "9.00", new String[]{"Wednesday","Thursday","Friday"});

        System.out.println(airport.getBase().get(0).toString());
    }
}
