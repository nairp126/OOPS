// Package removed to match directory structure

/**
 * Modern Java (Java 17): Sealed Classes.
 * 
 * Problem: 'final' blocks ALL inheritance. Public classes block NONE.
 * What if you want to allow SOME subclasses (e.g., Shape) but not ANYONE (e.g.,
 * WeirdShape)?
 * 
 * Solution: 'sealed' + 'permits'.
 */

// 1. The Parent (Sealed)
// We say: "Only Circle and Rectangle can extend me."
sealed interface Shape permits Circle, Rectangle {
    double area();
}

// 2. Allowed Child 1 (Final)
// Subclasses of sealed classes must be one of: final, sealed, or non-sealed.
final class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

// 3. Allowed Child 2 (Final)
final class Rectangle implements Shape {
    private final double w, h;

    public Rectangle(double w, double h) {
        this.w = w;
        this.h = h;
    }

    @Override
    public double area() {
        return w * h;
    }
}

// 4. FORBIDDEN (Uncommenting this causes a Compiler Error!)
// class Triangle implements Shape {}
// Error: class is not permitted to extend sealed class: Shape

public class ShapeHierarchy {
    public static void main(String[] args) {
        Shape s1 = new Circle(5);
        System.out.println("Circle Area: " + s1.area());
    }
}
