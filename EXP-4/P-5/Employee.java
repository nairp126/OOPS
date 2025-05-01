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

// // The above code demonstrates the use of constructors in Java, specifically constructor overloading and encapsulation.
// // The Employee class has a default constructor that initializes the employeeId, name, department, and salary to default values,
// // and a parameterized constructor that allows setting these values when creating an Employee object.
// // The class also includes a static variable totalEmployees to keep track of the number of Employee objects created.
// // The calculateSalary() method returns the salary of the employee, and the getSalary() method provides access to the private salary variable.
// // The displayEmployeeInfo() method prints the employee details, and the static method displayTotalEmployees() displays the total number of employees.
// // The main method demonstrates how to create Employee objects using both constructors and display their details using the displayEmployeeInfo() method.
// // This showcases the concept of constructor overloading, where multiple constructors with different parameters can be defined in a class.
// // The default constructor is called when no arguments are passed, while the parameterized constructor is called when specific values are provided.