/**
 * This class demonstrates "Method Overloading".
 * Method overloading allows a class to have more than one method having the
 * same name,
 * if their parameter lists are different.
 * This increases readability; we just call 'area()' and Java figures out which
 * math to use.
 */
public class AreaCalculator {

    /**
     * Calculate area of a Rectangle.
     * Signature: area(double, double)
     */
    public static double area(double length, double breadth) {
        return length * breadth;
    }

    /**
     * Calculate area of a Square.
     * Signature: area(double, boolean)
     * 
     * Why the boolean flag?
     * Since a square has one side, we might want 'area(double side)'.
     * However, the Circle calculation also takes one double 'area(double radius)'.
     * Java cannot distinguish methods just by parameter names (side vs radius),
     * only by types.
     * So we add a dummy boolean to make the signature unique: (double, boolean).
     */
    public static double area(double side, boolean isSquare) {
        if (isSquare) {
            return side * side;
        }
        return -1; // Return -1 to indicate invalid input or logic if flag is false.
    }

    /**
     * Calculate area of a Circle.
     * Signature: area(double)
     */
    public static double area(double radius) {
        return Math.PI * radius * radius;
    }

    /**
     * Calculate area of a Triangle.
     * Signature: area(double, double, boolean)
     * Similar logic to the square method - using a flag to distinguish from the
     * rectangle method
     * which also takes two doubles.
     */
    public static double area(double base, double height, boolean isTriangle) {
        if (isTriangle) {
            return 0.5 * base * height;
        }
        return -1;
    }

    public static void main(String[] args) {
        // Java automatically picks the correct method based on the arguments passed.
        System.out.println("Area of Rectangle (5 x 3): " + area(5, 3));
        System.out.println("Area of Square (side 4): " + area(4, true));
        System.out.println("Area of Circle (radius 2.5): " + area(2.5));
        System.out.println("Area of Triangle (base 4, height 3): " + area(4, 3, true));
    }
}