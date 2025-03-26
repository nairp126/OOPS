public class Employee {
    // Instance variables
    public int employeeId;
    public String name;
    public String department;
    private double salary; // Encapsulated variable

    // Static variable to track total number of employees
    public static int totalEmployees = 0;

    // Default constructor initializing with default values
    public Employee() {
        this.employeeId = 0;
        this.name = "Unknown";
        this.department = "None";
        this.salary = 0.0;
        totalEmployees++;  // Increase total count every time an Employee object is created
    }

    // Parameterized constructor to initialize employee details
    public Employee(int employeeId, String name, String department, double salary) {
        this.employeeId = employeeId;     // 'this.employeeId' refers to the class variable
        this.name = name;
        this.department = department;
        this.salary = salary;
        totalEmployees++;  // Increase the static counter for each new employee
    }

    // Method to calculate and return salary (here it's simple, just returns salary)
    public double calculateSalary() {
        return this.salary;
    }

    // Public getter for the private salary variable
    public double getSalary() {
        return this.salary;
    }

    // Method to display employee details
    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }

    // Static method to display the total number of employees
    public static void displayTotalEmployees() {
        System.out.println("Total Number of Employees: " + totalEmployees);
    }
}
