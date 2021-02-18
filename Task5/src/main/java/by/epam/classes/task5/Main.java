package by.epam.classes.task5;

/*
5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.
 */
public class Main {
    public static void main(String[] args) {
        Counter counter1 = new Counter();

        counter1.printCurrentValue();

        counter1.incrementValue();
        counter1.incrementValue();
        counter1.incrementValue();

        counter1.printCurrentValue();

        counter1.decrementValue();

        counter1.printCurrentValue();

        Counter counter2 = new Counter(2, 15);

        counter2.printCurrentValue();

        counter2.incrementValue();
        counter2.incrementValue();
        counter2.incrementValue();

        counter2.printCurrentValue();

        counter2.decrementValue();

        counter2.printCurrentValue();


    }
}
