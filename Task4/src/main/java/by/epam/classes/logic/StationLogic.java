package by.epam.classes.logic;

import by.epam.classes.entity.Train;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class StationLogic {
    public StationLogic() {

    }

    public static void printAllTrains(Train[] trains) {
        for (Train tr : trains) {
            System.out.println(tr.toString() + "\n");
        }

    }

    public static void searchTrainByNumber(Train[] trains) {

        int number;
        boolean numberIsExist;

        numberIsExist = false;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter train's number: ");
        while (!in.hasNextInt()) {
            in.next();
            System.out.println("Enter train's number: ");
        }
        number = in.nextInt();

        for (Train tr : trains) {
            if (tr.getTrainNumber() == number) {
                numberIsExist = true;
            }
        }

        if (!numberIsExist) {
            System.out.println("Train with number " + number + " not found!");
            searchTrainByNumber(trains);
        }

        for (Train tr : trains) {
            if (tr.getTrainNumber() == number) {
                System.out.println("\n" + tr.toString() + "\n");
            }
        }
    }

    public static void sortTrainsByNumber(Train[] trains) {
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

        for (int i = 0; i < trains.length; i++) {
            System.out.println(trains[i].toString() + "\n");
        }
    }

    public static Train[] sortTrainsByDestinationName(Train[] trains) {
        String[] destinationNames;
        Train[] sortedTrains;

        destinationNames = new String[5];
        sortedTrains = new Train[5];

        for (int i = 0; i < destinationNames.length; i++) {
            destinationNames[i] = trains[i].getDestinationName();
        }

        Arrays.sort(destinationNames);

        ArrayList<Train> tempList = new ArrayList<>();
        ArrayList<Train> sortedTemList = new ArrayList<>();

        for (int i = 0; i < trains.length; i++) {
            tempList.add(trains[i]);
        }

        for (int i = 0; i < destinationNames.length; i++) {
            for (int j = 0; j < tempList.size(); j++) {
                if (destinationNames[i].equals(tempList.get(j).getDestinationName())) {
                    sortedTemList.add(tempList.get(j));
                    tempList.remove(j);
                }
            }
        }

        for (int i = 0; i < sortedTrains.length; i++) {
            sortedTrains[i] = sortedTemList.get(i);
        }

        return sortedTrains;
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

    public static void sortTrainsByDestinationNameAndDepartureTime(Train[] trains) {

        Train[] tempTrains;

        tempTrains = StationLogic.sortTrainsByDestinationName(trains);
        tempTrains = StationLogic.sortTrainsByDepartureTime(tempTrains);
        tempTrains = StationLogic.sortTrainsByDestinationName(tempTrains);

        for (Train tr : tempTrains) {
            System.out.println("\n" + tr.toString() + "\n");
        }
    }

}
