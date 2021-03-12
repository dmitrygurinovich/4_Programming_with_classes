package by.epam.classes.main;

import by.epam.classes.entity.Time;
import by.epam.classes.logic.TimeLogic;

/*
 6. Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
заданное количество часов, минут и секунд.
 */
public class Main {
    public static void main(String[] args) {

        Time time = new Time(10, 12, 49);
        TimeLogic logic = new TimeLogic();

        System.out.println(time);

        logic.changeHours(time, 12);
        logic.changeMinutes(time, 25);
        logic.changeSeconds(time, 32);
        System.out.println(time);

        logic.addHours(time, 209);
        System.out.println(time);

        logic.addMinutes(time, 10000);
        System.out.println(time);

        logic.addSeconds(time, 70002);
        System.out.println(time);
    }
}
