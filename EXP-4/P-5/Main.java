public class Main {
    public static void main(String[] args) {
        // Create an employee using the default constructor
        Employee emp1 = new Employee();
        
        // Create an employee using the parameterized constructor
        Employee emp2 = new Employee(101, "Pranav", "Finance", 75000.0);
        Employee emp3 = new Employee(102, "rahul", "IT", 85000.0);
        
        // Display employee details using the instance method
        System.out.println("Employee 1 Details:");
        emp1.displayEmployeeInfo();
        System.out.println("Salary (calculated): $" + emp1.calculateSalary());
        System.out.println();

        System.out.println("Employee 2 Details:");
        emp2.displayEmployeeInfo();
        System.out.println("Salary (using getter): $" + emp2.getSalary());
        System.out.println();

        System.out.println("Employee 3 Details:");
        emp3.displayEmployeeInfo();
        System.out.println("Salary (calculated): $" + emp3.calculateSalary());
        System.out.println();

        // Display the total number of employees using the static method
        Employee.displayTotalEmployees();
    }
}

// The above code demonstrates the use of constructors in Java, specifically constructor overloading and encapsulation.
// The Employee class has a default constructor that initializes the employeeId, name, department, and salary to default values,
// and a parameterized constructor that allows setting these values when creating an Employee object.
// The class also includes a static variable totalEmployees to keep track of the number of Employee objects created.
// The calculateSalary() method returns the salary of the employee, and the getSalary() method provides access to the private salary variable.
// The displayEmployeeInfo() method prints the employee details, and the static method displayTotalEmployees() displays the total number of employees.
// The main method demonstrates how to create Employee objects using both constructors and display their details using the displayEmployeeInfo() method.
// This showcases the concept of constructor overloading, where multiple constructors with different parameters can be defined in a class.
// The default constructor is called when no arguments are passed, while the parameterized constructor is called when specific values are provided.