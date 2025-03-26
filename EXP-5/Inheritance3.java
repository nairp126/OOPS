// Base Class
class Vehicle {
    String brand;
    String model;
    double price;

    Vehicle(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }
}

// Subclass: Car
class Car extends Vehicle {
    int seatingCapacity;
    String fuelType;

    Car(String brand, String model, double price, int seatingCapacity, String fuelType) {
        super(brand, model, price);  // Constructor chaining
        this.seatingCapacity = seatingCapacity;
        this.fuelType = fuelType;
    }

    @Override
    void displayDetails() {
        super.displayDetails();  // Call parent method
        System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Subclass: ElectricCar (extends Car)
class ElectricCar extends Car {
    double batteryCapacity;
    int chargingTime;

    ElectricCar(String brand, String model, double price, int seatingCapacity, String fuelType, double batteryCapacity, int chargingTime) {
        super(brand, model, price, seatingCapacity, fuelType);  // Constructor chaining
        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;
    }

    @Override
    void displayDetails() {
        super.displayDetails();  // Call Car's displayDetails
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Charging Time: " + chargingTime + " hours");
    }
}

// Subclass: Motorcycle
class Motorcycle extends Vehicle {
    int engineCapacity;
    String type; // e.g., "Sport", "Cruiser"

    Motorcycle(String brand, String model, double price, int engineCapacity, String type) {
        super(brand, model, price);  // Constructor chaining
        this.engineCapacity = engineCapacity;
        this.type = type;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Engine Capacity: " + engineCapacity + " cc");
        System.out.println("Type: " + type);
    }
}

// Main Class
public class Inheritance3 {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", "Camry", 30000, 5, "Petrol");
        Vehicle electricCar = new ElectricCar("Tesla", "Model 3", 45000, 5, "Electric", 75.0, 8);
        Vehicle motorcycle = new Motorcycle("Yamaha", "MT-07", 7500, 689, "Sport");

        car.displayDetails();
        System.out.println("-------------------------");

        electricCar.displayDetails();
        System.out.println("-------------------------");

        motorcycle.displayDetails();
    }
}
