// Abstract Parent Class
abstract class PolyEmployee {
    String name;

    public PolyEmployee(String name) {
        this.name = name;
    }

    // Abstract methods forces children to specifically implement these behaviors.
    abstract double calculateSalary();

    abstract void displayDetails();
}

// Child 1: Manager
class PolyManager extends PolyEmployee {
    double fixedSalary;

    public PolyManager(String name, double fixedSalary) {
        super(name);
        this.fixedSalary = fixedSalary;
    }

    @Override
    double calculateSalary() {
        return fixedSalary; // Managers get a flat rate
    }

    @Override
    void displayDetails() {
        // 'name' is inherited from PolyEmployee
        System.out.println("Manager Name: " + name);
        System.out.println("Salary: " + calculateSalary());
    }
}

// Child 2: Developer
class PolyDeveloper extends PolyEmployee {
    double hourlyWage;
    int hoursWorked;

    public PolyDeveloper(String name, double hourlyWage, int hoursWorked) {
        super(name);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyWage * hoursWorked; // Developers get hourly pay
    }

    @Override
    void displayDetails() {
        System.out.println("Developer Name: " + name);
        System.out.println("Salary: " + calculateSalary());
    }
}

/**
 * This class demonstrates "Polymorphism".
 * Polymorphism allows us to perform a single action in different ways.
 * Here, we call 'displayDetails()' on both objects, but the output differs
 * based on the sub-type (Manager vs Developer).
 */
public class EmployeePolymorphism {
    public static void main(String[] args) {
        // Polymorphic Reference: Type is PolyEmployee, Object is PolyManager
        PolyEmployee manager = new PolyManager("Pranav", 6000);

        // Polymorphic Reference: Type is PolyEmployee, Object is PolyDeveloper
        PolyEmployee developer = new PolyDeveloper("Shashwat", 50, 160);

        // Same method call, different behavior!
        System.out.println("--- Polymorphism in Action ---");
        manager.displayDetails();
        System.out.println();
        developer.displayDetails();
    }
}