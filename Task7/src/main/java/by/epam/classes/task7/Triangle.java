package by.epam.classes.task7;

/*
 7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
 площади, периметра и точки пересечения медиан.
 */
public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle() {
        this.sideA = 0.0;
        this.sideB = 0.0;
        this.sideC = 0.0;
    }

    public Triangle(double sideA, double sideB, double sideC) {

        if (sideA + sideB >= sideC && sideB + sideC >= sideA && sideA + sideC >= sideB) {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        } else {
            this.sideA = 0.0;
            this.sideB = 0.0;
            this.sideC = 0.0;
        }

    }

    public void square() {
        double p;
        double square;

        p = (this.sideA + this.sideB + this.sideC) / 2;
        square = Math.sqrt(p * (p - this.sideA) * (p - this.sideB) * (p - this.sideC));
        System.out.println("Площадь треугольника = " + square);
    }

    public void perimeter() {
        double perimeter;

        perimeter = this.sideA + this.sideB + this.sideC;

        System.out.println("Периметр = " + perimeter);
    }

    public void centroid() {
        double h;
        double p;
        double[] pointA = new double[2];
        double[] pointB = new double[2];
        double[] pointC = new double[2];
        double[] medianFromPointB = new double[2];
        double[] medianFromPointC = new double[2];
        double[] intersection = new double[2];

        pointA[0] = 0;
        pointA[1] = 0;

        pointC[0] = this.sideA;
        pointC[1] = 0;

        p = (this.sideA + this.sideB + this.sideC) / 2;
        h = (2 / this.sideA) * Math.sqrt(p * (p - this.sideA) * (p - this.sideB) * (p - this.sideC));

        pointB[0] = Math.sqrt(Math.pow(this.sideB, 2) - Math.pow(h, 2));
        pointB[1] = h;

        medianFromPointB[0] = this.sideA / 2;
        medianFromPointB[1] = 0;

        medianFromPointC[0] = (pointA[0] + pointB[0]) / 2;
        medianFromPointC[1] = (pointA[1] + pointB[1]) / 2;

        intersection[0] = (pointA[0] + pointB[0] + pointC[0]) / 3;
        intersection[1] = (pointA[1] + pointB[1] + pointC[1]) / 3;

        System.out.println("Точка пересечения медиан: (" + intersection[0] + ";" + intersection[1] + ")");
    }
}
