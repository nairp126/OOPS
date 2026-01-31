
/**
 * This class demonstrates the concept of a "Class" and "Constructor".
 * A class is a blueprint for creating objects.
 */
public class Course {
    // Private attributes (Encapsulation).
    // These define the state of a Course object.
    private String courseName;
    private String courseCode;

    /**
     * Parameterized Constructor.
     * Use to initialize the object's state when it is created.
     * 
     * @param courseName Name of the course (local variable).
     * @param courseCode Code of the course (local variable).
     */
    public Course(String courseName, String courseCode) {
        // The 'this' keyword refers to the current object instance.
        // It resolves the "Shadowing" problem where the parameter name (courseName)
        // is the same as the field name (courseName).
        // this.courseName points to the class field.
        // courseName points to the parameter passed in.
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    /**
     * A method to display the internal state of the object.
     */
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
    }
}
