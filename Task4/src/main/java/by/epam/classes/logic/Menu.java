package by.epam.classes.logic;

import by.epam.classes.entity.Train;
import java.util.Scanner;

public class Menu {
    public Menu() {

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
                StationLogic.printAllTrains(trains);
                ui(trains);
                break;
            case 2:
                StationLogic.sortTrainsByNumber(trains);
                ui(trains);
                break;
            case 3:
                StationLogic.searchTrainByNumber(trains);
                ui(trains);
                break;
            case 4:
                StationLogic.sortTrainsByDestinationNameAndDepartureTime(trains);
                ui(trains);
                break;
            default:
                System.out.println("Incorrect choose!");
                ui(trains);
        }
    }
}
