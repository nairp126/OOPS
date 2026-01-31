// package Q; // Removed to match directory structure as we are in the default package for this demo or root of 01-Packages.
// In a real project, this would likely be in a package like 'com.example.demo'.

import p.A; // Import class A from package p

/**
 * This class demonstrates "Access Modifiers" across different packages.
 * It extends class 'A' to show how 'protected' works.
 */
public class PackageDemo extends A {
    public static void main(String[] args) {
        A obj = new A();

        // 1. PUBLIC: Accessible everywhere.
        obj.publicMethod(); // ✅ Allowed

        // 2. PROTECTED: Accessible in same package OR subclasses.
        // obj.protectedMethod(); // ❌ Not allowed here via 'A' reference because
        // PackageDemo is in a different package (default) and we are accessing it
        // through A instance, not PackageDemo instance (inheritance rule nuance).

        // 3. DEFAULT (Package-Private): Accessible ONLY in same package.
        // obj.defaultMethod(); // ❌ Not allowed (PackageDemo is not in package 'p')

        // 4. PRIVATE: Accessible ONLY inside class 'A'.
        // obj.privateMethod(); // ❌ Not allowed

        // Accessing inherited protected method via Subclass instance
        PackageDemo obj2 = new PackageDemo();
        obj2.accessProtected();
    }

    // Creating a wrapper to demonstrate accessing the protected method inherited
    // from Parent
    public void accessProtected() {
        // We can access protectedMethod() here because PackageDemo IS-A A,
        // and we are inside the subclass.
        super.protectedMethod(); // ✅ Allowed
    }
}