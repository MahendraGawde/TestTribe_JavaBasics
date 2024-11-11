package solid_principles.open_closed;

import java.util.Arrays;
import java.util.List;

public class AreaCalculator {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 7);
        Shape triangle = new Triangle(6, 4);
        Shape circle = new Circle(3);

        List<Shape> shapes = Arrays.asList(rectangle, triangle, circle);

        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.calculateArea());
        }
    }
}
