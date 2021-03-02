package by.epam.classes.task10;

import java.util.Arrays;

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
public class Airline {
    private String destinationName;
    private int flightNumber;
    private String plainType;
    private String departureTime;
    private String[] days;

    public Airline(String destinationName, int flightNumber, String plainType, String departureTime, String[] days) {
        this.destinationName = destinationName;
        this.flightNumber = flightNumber;
        this.plainType = plainType;
        this.departureTime = departureTime;
        this.days = days;
    }

    @Override
    public String toString() {
        return  "Destination name: " + destinationName +
                "\nFlight number: " + flightNumber +
                "\nPlain type: " + plainType +
                "\nDeparture time: " + departureTime +
                "\nDays: " + Arrays.toString(days) + "\n";
    }

    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getPlainType() {
        return plainType;
    }

    public void setPlainType(String plainType) {
        this.plainType = plainType;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String[] getDays() {
        return days;
    }

    public void setDays(String[] days) {
        this.days = days;
    }
}
