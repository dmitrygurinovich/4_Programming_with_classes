package by.epam.classes.task4;

import java.util.Scanner;

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
        this.departureTime  = departureTime;
    }

    public static void searchTrainByNumber(Train[] trains) {

        int number;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter train's number: ");
        while (!in.hasNextInt()) {
            in.next();
            System.out.println("Enter train's number: ");
        }

        number = in.nextInt();

        // добавить проверку на существование такого поезда
        for(Train tr : trains) {
            if (tr.trainNumber == number) {
                System.out.println(tr.toString());
            }
        }
    }

    public static void printAllTrains(Train[] trains) {
        for(Train tr : trains) {
            System.out.println(tr.toString() + "\n");
        }

    }

    @Override
    public String toString() {
        return  "Номер поезда: " + trainNumber + "\n" +
                "Пункт назначения: " + destinationName + "\n"+
                "Время отправления: " + departureTime;
    }
}
