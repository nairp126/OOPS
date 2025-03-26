
class Parent {
    private String privateData = "This is private data";

    // Public method to access private data
    public String getPrivateData() {
        return privateData;
    }
}

class Child extends Parent {
    public void showData() {
        // System.out.println(privateData); // Uncommenting this line will cause a compilation error

        // Correct way
        System.out.println(getPrivateData());
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Child child = new Child();
        child.showData();
    }
}
