abstract class Shape {
    // Abstract method to calculate area.
    abstract void calculateArea();
}

class Rectangle extends Shape {
    double width;
    double height;

    // Constructor to initialize rectangle dimensions.
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Override calculateArea() to compute the area of a rectangle.
    @Override
    void calculateArea() {
        double area = width * height;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Circle extends Shape {
    double radius;

    // Constructor to initialize the circle's radius.
    public Circle(double radius) {
        this.radius = radius;
    }

    // Override calculateArea() to compute the area of a circle.
    @Override
    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

public class TestShapes {
    public static void main(String[] args) {
        // Create a Rectangle object.
        Shape rect = new Rectangle(5, 4);
        rect.calculateArea();

        // Create a Circle object.
        Shape circle = new Circle(3);
        circle.calculateArea();
    }
}
// The above code demonstrates the use of abstract classes and method overriding in Java.
// It includes the definition of a Shape class with an abstract method calculateArea(), and two subclasses Rectangle and Circle that implement this method.
// The use of abstract classes allows for a clean separation of interface and implementation, promoting code reusability and maintainability.