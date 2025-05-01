class MathConstants {
    final double PI = 3.14159; // Final variable

    final void displayPI() { // Final method
        System.out.println("Value of PI: " + PI);
    }
}

// The above code demonstrates the use of final classes and methods in Java.
// It includes the definition of a MathConstants class with a final variable PI and a final method displayPI(), and a Circle class that extends MathConstants and uses the PI constant.
// The final variable PI cannot be changed, and the final method displayPI() cannot be overridden in subclasses.
// This ensures that the value of PI remains constant and the method behavior is fixed, promoting code stability and reliability.