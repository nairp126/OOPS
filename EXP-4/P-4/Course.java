

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
