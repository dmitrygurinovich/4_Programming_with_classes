package by.epam.classes.task7;

public class Triangle {
    private Side a;
    private Side b;
    private Side c;

    public Triangle(Point a, Point b, Point c) {
        this.a = new Side(a, b);
        this.b = new Side(b, c);
        this.c = new Side(c, a);
    }

    public void perimeter() {
        double perimeter;

        perimeter = a.length() + b.length() + c.length();

        System.out.println("Периметр треугольника: " + perimeter);
    }

    public void square() {
        double p;
        double square;

        p = (a.length() + b.length() + c.length()) / 2;
        square = Math.sqrt(p * (p - a.length()) * (p - b.length()) * (p - c.length()));

        System.out.println("Площадь треугольника: " + square);
    }

    public void centroid() {
        double x;
        double y;

        x = (a.getStart().getX() + b.getStart().getX() + c.getStart().getX()) / 3;
        y = (a.getStart().getY() + b.getStart().getY() + c.getStart().getY()) / 3;

        Point intersection;
        intersection = new Point(x, y);

        intersection.print();

    }
}
