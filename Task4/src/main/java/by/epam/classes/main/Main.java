package by.epam.classes.main;

import by.epam.classes.entity.Station;
import by.epam.classes.entity.Train;
import by.epam.classes.logic.Menu;

/*
 4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
 Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
 номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
 Добавьте возможность сортировки массива по пункту назначения, причем поезда с одинаковыми пунктами
 назначения должны быть упорядочены по времени отправления.
 */
public class Main {
    public static void main(String[] args) {
        Train[] trains = new Train[5];

        trains[0] = new Train("Гродно", 171, "18:30");
        trains[1] = new Train("Слуцк", 142, "14:25");
        trains[2] = new Train("Минск", 81, "17:10");
        trains[3] = new Train("Слуцк", 209, "02:45");
        trains[4] = new Train("Гродно", 112, "9:20");

        Station station = new Station(trains);

        Menu.ui(trains);

    }


}
