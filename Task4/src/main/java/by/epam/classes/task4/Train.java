package by.epam.classes.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

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

    public Train() {

    }

    public String getDestinationName() {
        return destinationName;
    }

    public static void ui(Train[] trains) {
        int choose;
        Scanner in = new Scanner(System.in);
        System.out.println("" +
                "Menu:\n" +
                "1. Show all trains\n" +
                "2. Sort trains by train's numbers.\n" +
                "3. Search train by train's number.\n" +
                "4. Sort trains by destination name.\n" +
                "Please select the action:\t");

        while (!in.hasNextInt()) {
            in.next();
            System.out.println("" +
                    "Menu:\n" +
                    "1. Show all trains\n" +
                    "2. Sort trains by train's numbers.\n" +
                    "3. Search train by train's number.\n" +
                    "4. Sort trains by destination name.\n" +
                    "Please select the action:\t");
        }
        choose = in.nextInt();

        switch (choose) {
            case 1:
                printAllTrains(trains);
                ui(trains);
                break;
            case 2:
                sortTrainsByNumber(trains);
                ui(trains);
                break;
            case 3:
                searchTrainByNumber(trains);
                ui(trains);
                break;
            case 4:
                sortTrainsByDestinationNameAndDepartureTime(trains);
                ui(trains);
                break;
            default:
                System.out.println("Incorrect choose!");
                ui(trains);
        }
    }

    public static void sortTrainsByDestinationNameAndDepartureTime(Train[] trains) {

        Train[] tempTrains;

        tempTrains = sortTrainsByDestinationName(trains);
        tempTrains = sortTrainsByDepartureTime(tempTrains);
        tempTrains = sortTrainsByDestinationName(tempTrains);

        for (Train tr : tempTrains) {
            System.out.println("\n" + tr.toString() + "\n");
        }
    }

    public static Train[] sortTrainsByDepartureTime(Train[] trains) {

        boolean sorted;
        Train temp;

        sorted = false;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < trains.length - 1; i++) {
                if (departureTimeToInteger(trains[i].departureTime) > departureTimeToInteger(trains[i + 1].departureTime)) {
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

    public static void sortTrainsByNumber(Train[] trains) {
        boolean sorted;
        Train temp;

        sorted = false;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < trains.length - 1; i++) {
                if (trains[i].trainNumber > trains[i + 1].trainNumber) {
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
            if (tr.trainNumber == number) {
                numberIsExist = true;
            }
        }

        if (!numberIsExist) {
            System.out.println("Train with number " + number + " not found!");
            searchTrainByNumber(trains);
        }

        for (Train tr : trains) {
            if (tr.trainNumber == number) {
                System.out.println("\n" + tr.toString() + "\n");
            }
        }
    }

    public static void printAllTrains(Train[] trains) {
        for (Train tr : trains) {
            System.out.println(tr.toString() + "\n");
        }

    }

    @Override
    public String toString() {
        return "Номер поезда: " + trainNumber + "\n" +
                "Пункт назначения: " + destinationName + "\n" +
                "Время отправления: " + departureTime;
    }
}
