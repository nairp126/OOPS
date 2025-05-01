package Q;
import p.A; // Import class A from package p

public class B extends A { // Class B extends A to access protected members
    public static void main(String[] args) {
        A obj = new A();

        obj.publicMethod(); // ✅ Allowed
        // obj.protectedMethod(); // ❌ Not allowed (outside package & not subclass)
        // obj.defaultMethod();   // ❌ Not allowed (outside package)
        // obj.privateMethod();   // ❌ Not allowed (even inside the same package)

        B obj2 = new B();
        obj2.protectedMethod(); // ✅ Allowed (subclass)
    }
}
// The above code demonstrates the use of access modifiers in Java.
// It includes the definition of a class B that extends class A from package p, showing how access modifiers control visibility and accessibility of class members across packages and subclasses.