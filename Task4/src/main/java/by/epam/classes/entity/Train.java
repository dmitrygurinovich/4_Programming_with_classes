package by.epam.classes.entity;

import java.util.Objects;

/*
 4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
 Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
 номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
 Добавьте возможность сортировки массива по пункту назначения, причем поезда с одинаковыми пунктами
 назначения должны быть упорядочены по времени отправления.
 */
public class Train {

    private String destinationName;
    private int trainNumber;
    private String departureTime;

    public Train(String destinationName, int trainNumber, String departureTime) {
        this.destinationName = destinationName;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
    }

    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Train train = (Train) o;
        return trainNumber == train.trainNumber &&
                Objects.equals(destinationName, train.destinationName) &&
                Objects.equals(departureTime, train.departureTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destinationName, trainNumber, departureTime);
    }

    @Override
    public String toString() {
        return "Номер поезда: " + trainNumber + "\n" +
                "Пункт назначения: " + destinationName + "\n" +
                "Время отправления: " + departureTime;
    }
}
