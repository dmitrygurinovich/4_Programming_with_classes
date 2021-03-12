package by.epam.classes.main;

import by.epam.classes.entity.Point;
import by.epam.classes.entity.Triangle;
import by.epam.classes.logic.TriangleLogic;

/*
 7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
 площади, периметра и точки пересечения медиан.
 */
public class Main {
    public static void main(String[] args) {
        Point A = new Point(0.0, 0.0);
        Point B = new Point(5.0, 6.0);
        Point C = new Point(8.0, 0.0);

        Triangle triangle = new Triangle(A, B, C);
        TriangleLogic logic = new TriangleLogic();

        System.out.println("Периметр: " +logic.perimeter(triangle));;
        System.out.println("Площадь: " + logic.square(triangle));;
        System.out.println("Медианы пересекаются в точке: " + logic.centroid(triangle));;

    }
}
