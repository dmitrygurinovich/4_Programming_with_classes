package by.epam.classes.logic;

import by.epam.classes.entity.Airline;
import by.epam.classes.entity.Airport;

import java.util.ArrayList;
import java.util.Date;

public class AirportLogic {
    public AirportLogic() {

    }

    public void addAirline(Airport base, String destinationName, int flightNumber, String plainType, Date departureTime, String[] days) {
        base.getBase().add(new Airline(destinationName, flightNumber, plainType, departureTime, days));
    }

    public ArrayList<Airline> searchAirlinesByDestinationName(Airport airport, String destinationName) {
        ArrayList<Airline> searchResult = new ArrayList<>();

        for (Airline airline : airport.getBase()) {
            if (airline.getDestinationName().equals(destinationName)) {
                searchResult.add(airline);
            }
        }

        return searchResult;
    }

    public ArrayList<Airline> searchAirlinesByDays(Airport airport, String day) {
        ArrayList<Airline> searchResult = new ArrayList<>();

        for (Airline airline : airport.getBase()) {

            for (String dayOfWeek : airline.getDays()) {
                if (dayOfWeek.equals(day)) {
                    searchResult.add(airline);

                }
            }

        }

        return searchResult;
    }

    public ArrayList<Airline> searchAirlinesByDaysAndDepartureTime(Airport airport, String day, Date time) {
        ArrayList<Airline> searchResult = new ArrayList<>();

        for (Airline airline : airport.getBase()) {

            if (airline.getDepartureTime().compareTo(time) > 0) {

                for (String dayOfWeek : airline.getDays()) {

                    if (dayOfWeek.equals(day)) {
                        searchResult.add(airline);
                        break;
                    }

                }

            }

        }

        return searchResult;

    }
}
