package by.epam.classes.task1;

import java.util.Objects;

public class Test1 {
    private int a;
    private int b;

    public Test1() {

    }

    public Test1(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test1 test1 = (Test1) o;
        return a == test1.a && b == test1.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

    @Override
    public String toString() {
        return "Test1{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public void print() {
        System.out.println("a = " + a + "\n" + "b = " + b);
    }

    public void sum() {
        System.out.println("a + b = " + (a + b));
    }

    public void max() {
        if (a > b) {
            System.out.println("Max: a = " + a);
        } else if (a < b) {
            System.out.println("Max: b = " + b);
        } else {
            System.out.println("a = b");
        }
    }

    public void changeA(int a) {
        this.a = a;
    }

    public void changeB(int b) {
        this.b = b;
    }

    public void changeAllNumbs(int a, int b) {
        this.a = a;
        this.b = b;
    }
}
