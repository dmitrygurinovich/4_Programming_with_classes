package by.epam.classes.logic;

import by.epam.classes.entity.Airline;
import by.epam.classes.entity.Airport;

import java.util.Date;

public class AirportLogic {
    public AirportLogic() {

    }

    public void addAirline(Airport base, String destinationName, int flightNumber, String plainType, Date departureTime, String[] days) {
        base.getBase().add(new Airline(destinationName, flightNumber, plainType, departureTime, days));
    }
}
