// Base Class
abstract class Worker {
    String name;
    double salaryRate;

    Worker(String name, double salaryRate) {
        this.name = name;
        this.salaryRate = salaryRate;
    }

    // Abstract method to be implemented in subclasses
    abstract void computePay(int hours);
}

// Subclass: DailyWorker
class DailyWorker extends Worker {
    DailyWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    @Override
    void computePay(int hours) {
        int daysWorked = hours / 8;  // Assuming 8 hours per day
        double salary = daysWorked * salaryRate;
        System.out.println(name + " (Daily Worker) earned: $" + salary);
    }
}

// Subclass: SalariedWorker
class SalariedWorker extends Worker {
    SalariedWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    @Override
    void computePay(int hours) {
        double salary = 40 * salaryRate; // Fixed pay for 40 hours
        System.out.println(name + " (Salaried Worker) earned: $" + salary);
    }
}

// Main Class
public class WorkerDemo {
    public static void main(String[] args) {
        Worker w1 = new DailyWorker("John", 100);    // Daily Worker earns $100 per day
        Worker w2 = new SalariedWorker("Alice", 20); // Salaried Worker earns $20 per hour

        w1.computePay(48); // Worked 48 hours (6 days)
        w2.computePay(50); // Worked 50 hours, but fixed salary for 40 hours
    }
}
