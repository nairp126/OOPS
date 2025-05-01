
/**
 * Main class to demonstrate the Course class functionality
 */
public class Main2 {
    /**
     * Main method - entry point of the program
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        // Create a new Course object with name and code
        Course myCourse = new Course("Computer Science", "CSG101");
        
        // Display the course details using the Course class method
        myCourse.displayCourseDetails();
    }
}
