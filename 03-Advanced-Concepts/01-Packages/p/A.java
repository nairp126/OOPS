package p;

/**
 * A simple class to define methods with different access levels.
 * Used by PackageDemo.java to test visibility.
 */
public class A {

    // Public: Open to the world.
    public void publicMethod() {
        System.out.println("Public Method: Accessible everywhere.");
        // We can access private members INSIDE the class
        internalCheck();
    }

    // Protected: Open to the family (Package + Subclasses).
    protected void protectedMethod() {
        System.out.println("Protected Method: Accessible in package 'p' and subclasses.");
    }

    // Default (No modifier): Open to the neighborhood (Package only).
    void defaultMethod() {
        System.out.println("Default Method: Accessible only within package 'p'.");
    }

    // Private: Secrets. Open only to this class.
    private void privateMethod() {
        System.out.println("Private Method: Accessible only inside class A.");
    }

    private void internalCheck() {
        System.out.println("Internal Check calling private method:");
        privateMethod(); // ✅ Accessing private method internally
    }
}