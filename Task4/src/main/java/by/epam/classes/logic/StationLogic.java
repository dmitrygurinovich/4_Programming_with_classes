package by.epam.classes.logic;

import by.epam.classes.entity.Train;
import java.util.regex.Pattern;

public class StationLogic {
    public StationLogic() {

    }

    public Train searchTrainByNumber(Train[] trains, int number) {
        boolean numberIsExist;

        numberIsExist = false;

        for (Train tr : trains) {
            if (tr.getTrainNumber() == number) {
                numberIsExist = true;
            }
        }

        if (numberIsExist) {
            for (Train tr : trains) {
                if (tr.getTrainNumber() == number) {
                    return tr;
                }
            }
        }
        return null;
    }

    public Train[] sortTrainsByNumber(Train[] trains) {
        boolean sorted;
        Train temp;

        sorted = false;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < trains.length - 1; i++) {
                if (trains[i].getTrainNumber() > trains[i + 1].getTrainNumber()) {
                    temp = trains[i];
                    trains[i] = trains[i + 1];
                    trains[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        return trains;
    }

    public static Train[] sortTrainsByDestinationName(Train[] trains) {
        Train temp;
        boolean sorted = false;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < trains.length - 1; i++) {
                if (trains[i].getDestinationName().compareTo(trains[i + 1].getDestinationName()) > 0) {
                    temp = trains[i];
                    trains[i] = trains[i + 1];
                    trains[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        return trains;
    }

    public static Train[] sortTrainsByDepartureTime(Train[] trains) {
        boolean sorted;
        Train temp;

        sorted = false;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < trains.length - 1; i++) {
                if (departureTimeToInteger(trains[i].getDepartureTime()) > departureTimeToInteger(trains[i + 1].getDepartureTime())) {
                    temp = trains[i];
                    trains[i] = trains[i + 1];
                    trains[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        return trains;
    }

    public static int departureTimeToInteger(String timeString) {
        int time;

        Pattern pattern = Pattern.compile(":");
        String[] arr = pattern.split(timeString);
        String timeStr = arr[0].concat(arr[1]);

        time = Integer.valueOf(timeStr);
        return time;
    }

    public Train[] sortTrainsByDestinationNameAndDepartureTime(Train[] trains) {
        StationLogic.sortTrainsByDestinationName(trains);
        StationLogic.sortTrainsByDepartureTime(trains);
        StationLogic.sortTrainsByDestinationName(trains);

        return trains;
    }

}
