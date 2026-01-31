// Abstract Base Class
// 'abstract' means this class cannot be instantiated directly (you can't say 'new SchoolPerson()').
// It serves only as a template for other classes.
abstract class SchoolPerson {
    String name;

    SchoolPerson(String name) {
        this.name = name;
    }

    // Abstract method: A "Contract".
    // Any class extending SchoolPerson MUST provide code for this method.
    abstract void performDuty();
}

// Subclass: SchoolStudent
class SchoolStudent extends SchoolPerson {
    SchoolStudent(String name) {
        super(name);
    }

    // Implementation of the contract
    @Override
    void performDuty() {
        System.out.println(name + " is studying for exams.");
    }
}

// Subclass: SchoolTeacher
class SchoolTeacher extends SchoolPerson {
    SchoolTeacher(String name) {
        super(name);
    }

    @Override
    void performDuty() {
        System.out.println(name + " is teaching a class.");
    }
}

// Main Class
public class SchoolSystem {
    public static void main(String[] args) {
        // Polymorphic Array: An array of the Parent type holding Child objects.
        // This is powerful: we can process Students and Teachers in the same loop!
        SchoolPerson[] people = new SchoolPerson[3];

        people[0] = new SchoolStudent("Alice");
        people[1] = new SchoolTeacher("Mr. Smith");
        people[2] = new SchoolStudent("Bob");

        // Iterating through the heterogeneous collection
        for (SchoolPerson p : people) {
            // Polymorphism: Java calls the correct method for the specific object (Student
            // or Teacher)
            p.performDuty();
        }
    }
}