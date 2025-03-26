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
