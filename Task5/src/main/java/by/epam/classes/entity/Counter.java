package by.epam.classes.entity;

import java.util.Objects;

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

    public int getMinValue() {
        return minValue;
    }

    public void setMinValue(int minValue) {
        this.minValue = minValue;
    }

    public int getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(int currentValue) {
        this.currentValue = currentValue;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Counter counter = (Counter) o;
        return minValue == counter.minValue &&
                currentValue == counter.currentValue &&
                maxValue == counter.maxValue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(minValue, currentValue, maxValue);
    }

    @Override
    public String toString() {
        return "Current value = " + currentValue;
    }
}
