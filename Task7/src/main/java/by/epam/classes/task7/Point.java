package by.epam.classes.task7;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    @Override
    public String toString() {
        return "(" + x + "; " + y + ")";
    }

    public void print() {
        System.out.println("Медианы пересекаются в точке: " + this.toString());
    }
}
