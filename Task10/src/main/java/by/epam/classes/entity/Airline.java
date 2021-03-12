package by.epam.classes.entity;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

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
    private Date departureTime;
    private String[] days;
    private static final SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");

    public Airline(String destinationName, int flightNumber, String plainType, Date departureTime, String[] days) {
        this.destinationName = destinationName;
        this.flightNumber = flightNumber;
        this.plainType = plainType;
        this.departureTime = departureTime;
        this.days = days;
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

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public static SimpleDateFormat getTimeFormat() {
        return timeFormat;
    }

    public String[] getDays() {
        return days;
    }

    public void setDays(String[] days) {
        this.days = days;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airline airline = (Airline) o;
        return flightNumber == airline.flightNumber &&
                Objects.equals(destinationName, airline.destinationName) &&
                Objects.equals(plainType, airline.plainType) &&
                Objects.equals(departureTime, airline.departureTime) &&
                Arrays.equals(days, airline.days);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(destinationName, flightNumber, plainType, departureTime);
        result = 31 * result + Arrays.hashCode(days);
        return result;
    }

    @Override
    public String toString() {
        return  "Destination name: " + destinationName +
                "\nFlight number: " + flightNumber +
                "\nPlain type: " + plainType +
                "\nDeparture time: " + departureTime +
                "\nDays: " + Arrays.toString(days) + "\n";
    }
}
