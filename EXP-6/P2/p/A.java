package p;

public class A {
    public void publicMethod() {
        System.out.println("Public Method");
    }

    protected void protectedMethod() {
        System.out.println("Protected Method");
    }

    void defaultMethod() { // No modifier = default
        System.out.println("Default Method");
    }

    private void privateMethod() {
        System.out.println("Private Method");
    }
}
// The above code demonstrates the use of access modifiers in Java.
// It includes the definition of a class A with methods that have different access levels: public, protected, default (package-private), and private.