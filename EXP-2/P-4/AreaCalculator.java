public class AreaCalculator {
    // Calculate area of a rectangle (length and breadth)
    public static double area(double length, double breadth) {
        return length * breadth;
    }

    // Calculate area of a square using a flag to differentiate
    public static double area(double side, boolean isSquare) {
        if (isSquare) {
            return side * side;
        }
        return 0; // Not a valid case if flag is false
    }

    // Calculate area of a circle (one parameter)
    public static double area(double radius) {
        return Math.PI * radius * radius;
    }

    // Calculate area of a triangle using a flag to differentiate
    public static double area(double base, double height, boolean isTriangle) {
        if (isTriangle) {
            return 0.5 * base * height;
        }
        return 0; // Not a valid case if flag is false
    }

    public static void main(String[] args) {
        // Example calculations:
        System.out.println("Area of Rectangle (5 x 3): " + area(5, 3));
        System.out.println("Area of Square (side 4): " + area(4, true));
        System.out.println("Area of Circle (radius 2.5): " + area(2.5));
        System.out.println("Area of Triangle (base 4, height 3): " + area(4, 3, true));
    }
}

// The above code demonstrates the use of method overloading to calculate areas of different shapes.    
// It includes methods for rectangle, square, circle, and triangle, each with appropriate parameters.
// The use of boolean flags helps differentiate between square and triangle calculations, ensuring clarity in method usage.