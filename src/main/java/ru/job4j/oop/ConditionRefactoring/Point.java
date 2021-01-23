package ru.job4j.oop.ConditionRefactoring;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {
    /**
     * Это поле объекта. Оно доступно только конкретному объекту.
     */
    private int x;
    /**
     * И это поле объекта. Оно доступно только конкретному объекту.
     */
    private int y;

    public Point(int first, int second){
        this.x = first;
        this.y = second;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public static void main(String[] args) {
        Point point1 = new Point(2,3);
        Point point2 = new Point(-2,-3);
        double dist = point1.distance(point2);
        System.out.println("Distance between Point1 and Point2 = " + dist);
    }
}
