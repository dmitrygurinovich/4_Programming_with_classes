package by.epam.classes.task7;

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

        triangle.perimeter();
        triangle.square();
        triangle.centroid();
    }
}
