// Package removed to match directory structure

/**
 * Modern Java (Java 14+): Records.
 * 
 * Problem: In older Java, creating a simple data holder required:
 * - Private fields
 * - Constructor
 * - Getters (and Setters)
 * - equals() and hashCode()
 * - toString()
 * 
 * Solution: 'record' does ALL of that in one line.
 */

// 1. The Old Way (Verbose)
/*
 * class UserOld {
 * private final String name;
 * private final int id;
 * public UserOld(String name, int id) { this.name = name; this.id = id; }
 * public String getName() { return name; }
 * public int getId() { return id; }
 * // ... equals, hashcode, toString ... (50+ lines of code)
 * }
 */

// 2. The New Way (Concise)
// Only define the data components. Java implies the rest.
record User(String name, int id) {
    // Compact Constructor: Validation
    public User {
        if (id < 0) {
            throw new IllegalArgumentException("ID cannot be negative");
        }
    }
}

public class UserRecord {
    public static void main(String[] args) {
        User u1 = new User("Alice", 101);
        User u2 = new User("Alice", 101);

        // 1. Automatic Getters (no 'get' prefix)
        System.out.println("Name: " + u1.name());

        // 2. Automatic toString()
        System.out.println("User: " + u1); // Prints: User[name=Alice, id=101]

        // 3. Automatic equals()
        System.out.println("Are they equal? " + u1.equals(u2)); // true
    }
}
