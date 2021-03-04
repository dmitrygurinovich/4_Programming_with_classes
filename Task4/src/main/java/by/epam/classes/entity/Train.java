package by.epam.classes.entity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Train {

    private String destinationName;
    private int trainNumber;
    private Date departureTime;
    private static SimpleDateFormat format = new SimpleDateFormat("HH:mm");

    public Train(String destinationName, int trainNumber, Date departureTime) {
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

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public static SimpleDateFormat getFormat() {
        return format;
    }

    public static void setFormat(SimpleDateFormat format) {
        Train.format = format;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Train train = (Train) o;
        return trainNumber == train.trainNumber && destinationName.equals(train.destinationName) &&
                departureTime.equals(train.departureTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destinationName, trainNumber, departureTime);
    }

    @Override
    public String toString() {
        return "Train's number: " + trainNumber + "\n" +
                "Destination name: " + destinationName + "\n" +
                "Departure time: " + format.format(departureTime);
    }
}
