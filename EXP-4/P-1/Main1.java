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
