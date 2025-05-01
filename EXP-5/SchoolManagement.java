// Base Class
abstract class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    // Abstract method to be overridden in subclasses
    abstract void performDuty();
}

// Subclass: Student
class Student extends Person {
    Student(String name) {
        super(name);
    }

    @Override
    void performDuty() {
        System.out.println(name + " is studying for exams.");
    }
}

// Subclass: Teacher
class Teacher extends Person {
    Teacher(String name) {
        super(name);
    }

    @Override
    void performDuty() {
        System.out.println(name + " is teaching a class.");
    }
}

// Main Class
public class SchoolManagement {
    public static void main(String[] args) {
        // Creating an array of Person references
        Person[] people = new Person[3];

        // Storing Student and Teacher objects
        people[0] = new Student("Alice");
        people[1] = new Teacher("Mr. Smith");
        people[2] = new Student("Bob");

        // Iterating and calling performDuty()
        for (Person p : people) {
            p.performDuty();  // Dynamic method dispatch
        }
    }
}

// The above code demonstrates the use of abstract classes and method overriding in Java.
// It includes a base class Person with an abstract method performDuty(), which is overridden in the subclasses Student and Teacher.
// The main method creates an array of Person references, storing both Student and Teacher objects, and calls the performDuty() method on each object. 
// This showcases polymorphism and dynamic method dispatch, where the method that gets executed is determined at runtime based on the actual object type.