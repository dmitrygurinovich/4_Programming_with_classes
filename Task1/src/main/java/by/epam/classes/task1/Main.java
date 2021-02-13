package by.epam.classes.task1;

/*
1. Создайте класс by.epam.classes.Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
наибольшее значение из этих двух переменных.
 */
public class Main {
    public static void main(String[] args) {
        Test1 t = new Test1(12, 3);
        t.print();
        t.sum();
        t.changeA(12);
        t.changeB(33);
        t.print();
        t.max();
        t.changeAllNumbs(34,18);
        t.print();
    }
}
