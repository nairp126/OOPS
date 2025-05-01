public class Main1 {
    public static void main(String[] args) {
    
        University.displayUniversityName();
        
        University student1 = new University("Pranav");
        University student2 = new University("rahul");
        University student3 = new University("Charvi");
     
        System.out.println("\nStudent Details:");
        student1.displayStudentInfo();
        student2.displayStudentInfo();
        student3.displayStudentInfo();
        
        // Demonstrate that the static variable is shared:
        University.universityName = "UPES";
        
        System.out.println("\nAfter Changing University Name:");
        University.displayUniversityName();
        System.out.println("Access via object: " + student1.universityName);
    }
}

class University {
    public static String universityName = "DIT";
    public String studentName;
    
    public University(String studentName) {
        this.studentName = studentName;
    }
    
    public static void displayUniversityName() {
        System.out.println("University Name: " + universityName);
    }
    
    public void displayStudentInfo() {
        System.out.println("Student Name: " + studentName);
    }
}

// The above code demonstrates the use of static variables and methods in Java.
// The University class has a static variable universityName that is shared among all instances of the class.
// The static method displayUniversityName() is used to display the university name, and it can be called without creating an instance of the class.
// The main method creates instances of the University class and displays their details, including the university name.
// It also shows that changing the static variable through one instance affects all instances, demonstrating the shared nature of static variables.
// This showcases the concept of static members in Java, which are associated with the class itself rather than with any specific instance.
// Static members are useful for defining constants or methods that should be shared across all instances of a class.
// In this example, the static variable universityName is used to store the name of the university, and it is shared among all instances of the University class.
// The static method displayUniversityName() is used to display the university name, and it can be called without creating an instance of the class.
// The main method creates instances of the University class and displays their details, including the university name.
// It also shows that changing the static variable through one instance affects all instances, demonstrating the shared nature of static variables.
