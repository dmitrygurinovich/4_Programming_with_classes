package by.epam.classes.main;

import by.epam.classes.logic.CounterLogic;
import by.epam.classes.entity.Counter;

/*
5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.
 */
public class Main {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        CounterLogic logic = new CounterLogic();

        System.out.println(logic.printCurrentValue(counter1));;
        logic.incrementValue(counter1);
        logic.incrementValue(counter1);
        logic.incrementValue(counter1);
        System.out.println(logic.printCurrentValue(counter1));;
        logic.decrementValue(counter1);
        System.out.println(logic.printCurrentValue(counter1));;

        Counter counter2 = new Counter(2, 15);
        System.out.println(logic.printCurrentValue(counter2));;
        logic.incrementValue(counter2);
        logic.incrementValue(counter2);
        logic.incrementValue(counter2);
        System.out.println(logic.printCurrentValue(counter2));;
        logic.decrementValue(counter2);
        System.out.println(logic.printCurrentValue(counter2));;
    }
}
