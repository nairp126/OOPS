/**
 * This class demonstrates "Abstraction".
 * Abstraction is about hiding the complex implementation details and showing
 * only the essential features of an object.
 */
abstract class Shape {
    // Abstract Method: Declares intended functionality but provides no
    // implementation.
    // It says "Every shape MUST be able to calculate its area".
    abstract void calculateArea();
}

class Rectangle extends Shape {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Implementing the abstract method for Rectangle logic.
    @Override
    void calculateArea() {
        double area = width * height;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementing the abstract method for Circle logic.
    @Override
    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

public class ShapeAbstraction {
    public static void main(String[] args) {
        // We can refer to the child objects by their parent Abstract type.
        Shape rect = new Rectangle(5, 4);
        rect.calculateArea();

        Shape circle = new Circle(3);
        circle.calculateArea();
    }
}