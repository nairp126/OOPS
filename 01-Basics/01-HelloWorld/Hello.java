/**
 * This class serves as the entry point for our "Hello World" to Objects lesson.
 * In Java, every application must have at least one class definition.
 * The class name 'Hello' matches the filename 'Hello.java', which is a
 * requirement for public classes.
 */
public class Hello {

    /**
     * The main method is the gateway of any Java application.
     * public: Access modifier meaning it can be called from everywhere.
     * static: It exists without creating an instance of the class.
     * void: It returns no value.
     * main: The specific name the JVM looks for to start execution.
     */
    public static void main(String[] args) {
        // Instantiation: Creating a concrete object (student1) from the blueprint
        // (HelloStudent).
        // Here we use the "Default Constructor" which sets default values.
        HelloStudent student1 = new HelloStudent();
        System.out.println("Details of student1 (default constructor):");
        student1.displayInfo(); // Calling a method on the object to perform an action.

        System.out.println(); // Prints a blank line for readability in the console output.

        // Here we use the "Parameterized Constructor".
        // This allows us to inject specific state (Name: Alice, Age: 20) at the moment
        // of creation.
        HelloStudent student2 = new HelloStudent("Alice", 20);
        System.out.println("Details of student2 (parameterized constructor):");
        student2.displayInfo();
    }
}

/**
 * A simple class representing a Student.
 * This acts as a blueprint defining the structure (fields) and behavior
 * (methods) of a student.
 * Note: It is not public, so it can only be used within this package (default
 * package).
 */
class HelloStudent {
    // Member variables (Fields).
    // marked 'private' to enforce Encapsulation - only this class can access them
    // directly.
    private String name;
    private int age;

    /**
     * Default Constructor.
     * If you don't define any constructor, Java provides an empty one.
     * However, defining one allows us to set safe default values (Unknown, 0) to
     * avoid null pointers later.
     */
    public HelloStudent() {
        this.name = "Unknown";
        this.age = 0;
    }

    /**
     * Parameterized Constructor.
     * This is an example of "Constructor Overloading".
     * We have multiple constructors with different signatures, allowing flexibility
     * in how objects are created.
     * 
     * @param name The name of the student.
     * @param age  The age of the student.
     */
    public HelloStudent(String name, int age) {
        this.name = name; // 'this.name' refers to the instance variable, 'name' refers to the parameter.
        this.age = age;
    }

    /**
     * A public method to expose the internal state safely.
     * Instead of letting outsiders read 'name' directly, we print it here.
     */
    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
}