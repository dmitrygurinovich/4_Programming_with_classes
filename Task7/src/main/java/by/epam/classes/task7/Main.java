package by.epam.classes.task7;

/*
 7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
 площади, периметра и точки пересечения медиан.
 */
public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(6, 5,  2.2);

        triangle.square();
        triangle.perimeter();
        triangle.centroid();
    }
}
