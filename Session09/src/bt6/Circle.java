package bt6;

public class Circle extends Shape {
    private double radius;

    public Circle() {
        this.radius = 1;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area(double r) {
        return Math.PI * r * r;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

