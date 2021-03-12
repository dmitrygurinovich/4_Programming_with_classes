package by.epam.classes.entity;

import java.util.Objects;

public class Side {
    private Point start;
    private Point end;
    private double length;

    public Side (Point start, Point end) {
        this.start = start;
        this.end = end;
        this.length = Math.sqrt(Math.pow((end.getX() - start.getX()), 2) + Math.pow((end.getY() - start.getY()), 2));
    }

    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Side side = (Side) o;
        return Double.compare(side.length, length) == 0 && Objects.equals(start, side.start) && Objects.equals(end, side.end);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, end, length);
    }

    @Override
    public String toString() {
        return "Side{" +
                "start=" + start +
                ", end=" + end +
                ", length=" + length +
                '}';
    }
}
