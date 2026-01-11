package entities;

public class Rectangle {
    // cada rectangle criado terá seu próprio width e height
    public double width;
    public double height;

    // A = L × W)
    public double area() {
        return width * height;
    }

    // P = 2(length + breadth)
    public double perimeter() {
        return 2 * (width + height);
    }

    // d = √(l² + w²)
    public double diagonal() {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }
}
