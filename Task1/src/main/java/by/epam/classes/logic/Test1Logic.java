package by.epam.classes.logic;

import by.epam.classes.entity.Test1;

public class Test1Logic {
    public Test1Logic() {
    }

    public void sum(Test1 t) {
        System.out.println("a + b = " + (t.getA() + t.getB()));
    }

    public void max(Test1 t) {
        if (t.getA() > t.getB()) {
            System.out.println("Max: a = " + t.getA());
        } else if (t.getA() < t.getB()) {
            System.out.println("Max: b = " + t.getB());
        } else {
            System.out.println("a = b");
        }
    }

    public void changeA(Test1 t, int a) {
        t.setA(a);
    }

    public void changeB(Test1 t, int b) {
        t.setB(b);
    }

    public void changeAllNumbs(Test1 t, int a, int b) {
        t.setA(a);
        t.setB(b);
    }
}
