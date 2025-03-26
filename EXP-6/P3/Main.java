class Circle extends MathConstants {
    void calculateArea(double radius) {
        // PI = 3.14; // ❌ Compilation error (final variable cannot be changed)
        double area = PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    // void displayPI() { // ❌ Compilation error (final method cannot be overridden)
    //     System.out.println("Trying to override final method");
    // }
}

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.calculateArea(5);
        c.displayPI();
    }
}
