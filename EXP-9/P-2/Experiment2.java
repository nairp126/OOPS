import java.util.ArrayList;

public class Experiment2 {

    // Employee class with attributes and a toString() method for printing
    static class Employee {
        String name;
        int id;
        double salary;
        
        public Employee(String name, int id, double salary) {
            this.name = name;
            this.id = id;
            this.salary = salary;
        }
        
        @Override
        public String toString() {
            return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
        }
    }
    
    public static void main(String[] args) {
        // Create an ArrayList to hold Employee objects
        ArrayList<Employee> employees = new ArrayList<>();
        
        // Add three employees
        employees.add(new Employee("Alice", 1, 50000));
        employees.add(new Employee("Bob", 2, 60000));
        employees.add(new Employee("Charlie", 3, 55000));
        
        // Update the salary of one employee (update Bob's salary)
        for (Employee emp : employees) {
            if (emp.id == 2) { // Bob has id 2
                emp.salary = 65000;
                break;
            }
        }
        
        // Remove an employee by their id (remove employee with id 1, Alice)
        employees.removeIf(emp -> emp.id == 1);
        
        // Print the remaining employees
        System.out.println("Remaining Employees:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
// The above code demonstrates the use of an ArrayList to manage a list of Employee objects.
// It includes adding, updating, and removing employees, showcasing the dynamic nature of ArrayLists.