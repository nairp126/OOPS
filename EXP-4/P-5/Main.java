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
