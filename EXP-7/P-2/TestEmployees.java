abstract class Employee {
    String name;

    // Constructor to initialize the employee's name.
    public Employee(String name) {
        this.name = name;
    }

    // Abstract methods to be implemented by subclasses.
    abstract double calculateSalary();
    abstract void displayDetails();
}

class Manager extends Employee {
    double fixedSalary;

    public Manager(String name, double fixedSalary) {
        super(name);  // Call the parent class constructor.
        this.fixedSalary = fixedSalary;
    }

    @Override
    double calculateSalary() {
        return fixedSalary;
    }

    @Override
    void displayDetails() {
        System.out.println("Manager Name: " + name);
        System.out.println("Salary: " + calculateSalary());
    }
}

class Developer extends Employee {
    double hourlyWage;
    int hoursWorked;

    public Developer(String name, double hourlyWage, int hoursWorked) {
        super(name);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyWage * hoursWorked;
    }

    @Override
    void displayDetails() {
        System.out.println("Developer Name: " + name);
        System.out.println("Salary: " + calculateSalary());
    }
}

public class TestEmployees {
    public static void main(String[] args) {
        Employee manager = new Manager("Pranav", 6000);
        manager.displayDetails();

        Employee developer = new Developer("Shashwat", 50, 160);
        developer.displayDetails();
    }
}
