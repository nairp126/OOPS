/**
 * This class demonstrates "Encapsulation" and "Static members".
 */
public class Employee {
    // Instance variables: Unique to EACH object (Employee).
    public int employeeId;
    public String name;
    public String department;

    // 'private' access modifier: Vital for Encapsulation.
    // This variable cannot be accessed directly from outside this class.
    private double salary;

    // Static variable: Shared by ALL objects of this class.
    // There is only ONE copy of this variable in memory, regardless of how many
    // employees we create.
    public static int totalEmployees = 0;

    /**
     * Default Constructor.
     * Called when we do: new Employee();
     */
    public Employee() {
        this.employeeId = 0;
        this.name = "Unknown";
        this.department = "None";
        this.salary = 0.0;
        totalEmployees++; // Increment the shared counter.
    }

    /**
     * Parameterized Constructor.
     * Called when we do: new Employee(101, "Alice", ...);
     */
    public Employee(int employeeId, String name, String department, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.salary = salary;
        totalEmployees++; // Increment the shared counter.
    }

    // Encapsulation: We provide a method to calculate the salary, rather than
    // exposing the logic directly.
    public double calculateSalary() {
        return this.salary;
    }

    // Getter method: controlled access to the private variable 'salary'.
    // We could add logic here (e.g., authentication) before returning the value.
    public double getSalary() {
        return this.salary;
    }

    // Display method to show object state.
    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }

    /**
     * Static method: Can be called without creating an object.
     * Usage: Employee.displayTotalEmployees();
     * Note: Static methods can ONLY access other static members (like
     * 'totalEmployees').
     */
    public static void displayTotalEmployees() {
        System.out.println("Total Number of Employees: " + totalEmployees);
    }
}