package bt6;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3);
        shapes[1] = new Rectangle(4, 5);
        shapes[2] = new Circle();

        double totalArea = 0;
        for (Shape s : shapes) {
            totalArea += s.area();
        }

        System.out.println("Tong dien tich: " + totalArea);
    }
}

