package by.epam.classes.main;

import by.epam.classes.logic.Test1Logic;
import by.epam.classes.entity.Test1;

/*
1. Создайте класс by.epam.classes.entity.Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
наибольшее значение из этих двух переменных.
 */
public class Main {
    public static void main(String[] args) {
        Test1 t = new Test1(8, 15);
        Test1Logic logic = new Test1Logic();

        System.out.println(t);
        logic.sum(t);
        logic.changeA(t, 31);
        logic.changeB(t,33);
        System.out.println(t);
        logic.max(t);
        logic.changeAllNumbs(t,34,18);
        System.out.println(t);
    }
}
