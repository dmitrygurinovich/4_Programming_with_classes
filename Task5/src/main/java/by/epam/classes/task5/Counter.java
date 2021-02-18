package by.epam.classes.task5;

/*
5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.
 */
public class Counter {
    private int minValue;
    private int currentValue;
    private int maxValue;

    public Counter() {
        this.minValue = 1;
        this.currentValue = this.minValue;
        this.maxValue = 10;
    }

    public Counter(int minValue, int maxValue) {
        this.minValue = minValue;
        this.currentValue = this.minValue;
        this.maxValue = maxValue;
    }

    public int incrementValue() {
        if (currentValue < maxValue) {
            currentValue++;
        }
        return currentValue;
    }

    public int decrementValue() {
        if (currentValue > minValue) {
            currentValue--;
        }
        return currentValue;
    }

    public void printCurrentValue() {
        System.out.println(this.currentValue);
    }

}
