

public class Course {
    // Private attributes
    private String courseName;
    private String courseCode;
    
    // Constructor with parameters having the same names as the attributes
    public Course(String courseName, String courseCode) {
    
        this.courseName = courseName;
        this.courseCode = courseCode;
    }
    
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
    }
}

//     public static void main(String[] args) {
//         // Creating an object of the Course class
//         Course course = new Course("Java Programming", "CS101");
//         // Displaying course details
//         course.displayCourseDetails();
//     }
// }

// // The above code demonstrates the use of constructors in Java, specifically constructor overloading and the use of 'this' keyword.
// // The Course class has a constructor that initializes the courseName and courseCode attributes using parameters with the same names.
// // The displayCourseDetails() method is used to print the course details.
// // The main method creates an instance of the Course class and calls the displayCourseDetails() method to show the course information.
// // This showcases the concept of constructor overloading, where multiple constructors with different parameters can be defined in a class.
// // The constructor with parameters allows for initializing the object's state at the time of creation, making the code more flexible and easier to use.
// // The use of the 'this' keyword helps to differentiate between the class attributes and the constructor parameters when they have the same name.
