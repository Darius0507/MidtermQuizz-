package org.example;

public class Squar implements Shape {
    public final double side;

    public Squar(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }
}
