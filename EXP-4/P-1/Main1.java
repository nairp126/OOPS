public class Main1 {
    public static void main(String[] args) {
        // Create a student using the default constructor
        Student student1 = new Student();
        System.out.println("Details of student1 (default constructor):");
        student1.displayInfo();
        
        System.out.println(); // Blank line
        
        // Create a student using the parameterized constructor
        Student student2 = new Student("Alice", 20);
        System.out.println("Details of student2 (parameterized constructor):");
        student2.displayInfo();
    }
}

class Student {
    private String name;
    private int age;
    
    // Default constructor
    public Student() {
        this.name = "Unknown";
        this.age = 0;
    }
    
    // Parameterized constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Method to display student details
    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
}

// The above code demonstrates the use of constructors in Java.
// It includes a default constructor that initializes the student name to "Unknown" and age to 0,
// and a parameterized constructor that allows setting the name and age when creating a Student object.
// The main method creates two Student objects, one using the default constructor and the other using the parameterized constructor,
// and displays their details using the displayInfo() method.
// This showcases the concept of constructor overloading, where multiple constructors with different parameters can be defined in a class.
// The default constructor is called when no arguments are passed, while the parameterized constructor is called when specific values are provided.
// This allows for flexibility in object creation and initialization, making the code more versatile and easier to use.
// The use of constructors is a fundamental concept in object-oriented programming, enabling the creation of objects with specific initial states.
// Constructors are special methods that are called when an object is instantiated, and they play a crucial role in initializing the object's state.
// In this example, the Student class has two constructors: a default constructor that initializes the name to "Unknown" and age to 0,
// and a parameterized constructor that allows the user to set the name and age when creating a Student object.
// The main method demonstrates how to create Student objects using both constructors and display their details using the displayInfo() method.
// This showcases the concept of constructor overloading, where multiple constructors with different parameters can be defined in a class.
// The default constructor is called when no arguments are passed, while the parameterized constructor is called when specific values are provided.