package org.example;

import java.util.ArrayList;
import java.util.List;

public class AddShape {
    private final List<Shape> shapes = new ArrayList<>();


    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public List<Shape> getShape() {
        return shapes;
    }
}
