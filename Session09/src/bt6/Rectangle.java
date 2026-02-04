package bt6;
public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle() {
        this.width = 1;
        this.height = 1;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area(double w, double h) {
        return w * h;
    }

    @Override
    public double area() {
        return width * height;
    }
}

