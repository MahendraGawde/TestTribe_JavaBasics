package solid_principles.open_closed;

// Circle.java
public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        }

        @Override
        public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
