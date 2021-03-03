package by.epam.classes.main;

import by.epam.classes.entity.Station;
import by.epam.classes.entity.Train;
import by.epam.classes.logic.StationLogic;

/*
 4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
 Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
 номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
 Добавьте возможность сортировки массива по пункту назначения, причем поезда с одинаковыми пунктами
 назначения должны быть упорядочены по времени отправления.
 */
public class Main {
    public static void main(String[] args) {
        Train[] trains = {
                new Train("Гродно", 171, "18:30"),
                new Train("Слуцк", 142, "14:25"),
                new Train("Минск", 81, "17:10"),
                new Train("Слуцк", 209, "02:45"),
                new Train("Гродно", 112, "9:20")
        };

        Station station = new Station(trains);
        StationLogic logic = new StationLogic();

        logic.sortTrainsByNumber(trains);
        System.out.println("Trains after sorting by train's number:");
        for (Train train : trains) {
            System.out.println(train.toString() + "\n");
        }

        System.out.println("Search result:");
        System.out.println(logic.searchTrainByNumber(trains, 81).toString() + "\n");

        logic.sortTrainsByDestinationName(trains);
        System.out.println("Trains after sorting by destination name: ");
        for (Train train : trains) {
            System.out.println(train.toString() + "\n");
        }

    }


}
