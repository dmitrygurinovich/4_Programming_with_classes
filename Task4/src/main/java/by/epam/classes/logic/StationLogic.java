package by.epam.classes.logic;

import by.epam.classes.entity.Train;


public class StationLogic {
    public StationLogic() {

    }

    public String searchTrainByNumber(Train[] trains, int number) {
        String train;
        train = "Train not found!";
        for (Train tr : trains) {
            if (tr.getTrainNumber() == number) {
                return  train = tr.toString();
            }
        }
        return train;
    }

    public void sortTrainsByNumber(Train[] trains) {
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
    }

    public void sortTrainsByDestinationName(Train[] trains) {
        Train temp;
        boolean sorted = false;

        while (!sorted) {
            sorted = true;

            for (int i = 0; i < trains.length - 1; i++) {

                if (!trains[i].getDestinationName().equals(trains[i + 1].getDestinationName())) {
                    if (trains[i].getDestinationName().compareTo(trains[i + 1].getDestinationName()) > 0) {
                        temp = trains[i];
                        trains[i] = trains[i + 1];
                        trains[i + 1] = temp;
                        sorted = false;
                    }
                } else {
                    if (trains[i].getDepartureTime().compareTo(trains[i+1].getDepartureTime()) > 0) {
                        temp = trains[i];
                        trains[i] = trains[i + 1];
                        trains[i + 1] = temp;
                        sorted = false;
                    }
                }
            }
        }
    }

}
