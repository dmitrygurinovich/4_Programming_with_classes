package by.epam.classes.entity;

import java.util.Objects;

public class Triangle {
    private Side a;
    private Side b;
    private Side c;

    public Triangle(Point a, Point b, Point c) {
        this.a = new Side(a, b);
        this.b = new Side(b, c);
        this.c = new Side(c, a);
    }

    public Side getA() {
        return a;
    }

    public void setA(Side a) {
        this.a = a;
    }

    public Side getB() {
        return b;
    }

    public void setB(Side b) {
        this.b = b;
    }

    public Side getC() {
        return c;
    }

    public void setC(Side c) {
        this.c = c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Objects.equals(a, triangle.a) && Objects.equals(b, triangle.b) && Objects.equals(c, triangle.c);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
