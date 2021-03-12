package by.epam.classes.logic;

import by.epam.classes.entity.Point;
import by.epam.classes.entity.Triangle;

public class TriangleLogic {

    public TriangleLogic() {

    }

    public double perimeter(Triangle triangle) {
        double perimeter;

        perimeter = triangle.getA().getLength() + triangle.getB().getLength() + triangle.getC().getLength();

        return perimeter;
    }

    public double square(Triangle triangle) {
        double p;
        double square;

        p = (triangle.getA().getLength() + triangle.getB().getLength() + triangle.getC().getLength()) / 2;
        square = Math.sqrt(p * (p - triangle.getA().getLength()) * (p - triangle.getB().getLength()) * (p - triangle.getC().getLength()));

        return square;
    }

    public Point centroid(Triangle triangle) {
        double x;
        double y;
        Point intersection;

        x = (triangle.getA().getStart().getX() + triangle.getB().getStart().getX() + triangle.getC().getStart().getX()) / 3;
        y = (triangle.getA().getStart().getY() + triangle.getB().getStart().getY() + triangle.getC().getStart().getY()) / 3;

        intersection = new Point(x, y);

        return intersection;
    }


}
