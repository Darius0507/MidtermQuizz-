package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapesTest {
    private AddShape shp;

    @BeforeEach
    public void setShp() {
        shp = new AddShape();
    }

    @Test
    public void addShape() {
        shp.addShape(new Rectangle(5, 4));
        shp.addShape(new Squar(5));
        shp.addShape(new Circle(25));
        shp.addShape(new Triangle(5, 4, 10));

        assertEquals(4, shp.getShape().size());
    }

    @Test
    public void rectangleTese() {
        Shape rectangle = new Rectangle(5, 8);

        assertEquals(40, rectangle.getArea());
        assertEquals(26, rectangle.getPerimeter());

    }

    @Test
    public void squarTest() {
        Shape squar = new Squar(5);

        assertEquals(25, squar.getArea());
        assertEquals(20, squar.getPerimeter());

    }

    @Test
    public void circleTest() {
        Shape circle = new Circle(4);

        assertEquals(50.26548245743669, circle.getArea());
        assertEquals(25.132741228718345, circle.getPerimeter());

    }

    @Test
    public void triangleTest() {
        Shape triangle = new Triangle(4, 5, 8);

        assertEquals(8.181534085976786, triangle.getArea());
        assertEquals(17, triangle.getPerimeter());

    }

}