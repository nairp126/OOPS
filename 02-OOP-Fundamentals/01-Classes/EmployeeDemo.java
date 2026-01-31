/**
 * Runner class to demonstrate the Employee class functionality.
 */
public class EmployeeDemo {
    public static void main(String[] args) {
        // 1. Instantiation using Default Constructor
        // This uses the "no-argument" constructor we defined in Employee.java.
        Employee emp1 = new Employee();

        // 2. Instantiation using Parameterized Constructor
        // We pass data directly during object creation, which is cleaner.
        // Naming Convention: Variable names like 'emp2' are clear, but in real apps use
        // 'financeManager' etc.
        Employee emp2 = new Employee(101, "Pranav", "Finance", 75000.0);
        Employee emp3 = new Employee(102, "Rahul", "IT", 85000.0); // Corrected variable casing (rahul -> Rahul)

        // 3. Invoking Instance Methods
        // We call methods ON the object (e.g., emp1.display...). The behavior depends
        // on that specific object's data.
        System.out.println("--- Employee 1 (Default) ---");
        emp1.displayEmployeeInfo();
        System.out.println("Salary (calculated): $" + emp1.calculateSalary());
        System.out.println();

        System.out.println("--- Employee 2 (Finance) ---");
        emp2.displayEmployeeInfo();
        System.out.println("Salary (via getter): $" + emp2.getSalary()); // demonstrating getter usage
        System.out.println();

        System.out.println("--- Employee 3 (IT) ---");
        emp3.displayEmployeeInfo();
        System.out.println("Salary (calculated): $" + emp3.calculateSalary());
        System.out.println();

        // 4. Invoking Static Methods
        // Notice we call this on the CLASS itself 'Employee', not on an object like
        // 'emp1'.
        // This confirms the variable is shared across all instances.
        Employee.displayTotalEmployees();
    }
}