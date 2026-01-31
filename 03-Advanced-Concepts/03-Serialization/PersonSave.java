import java.io.*;

/**
 * This class demonstrates "Serialization".
 * Serialization is the process of converting an object into a byte stream
 * to save it to a file or send it over a network.
 * 
 * To be serialized, a class MUST implement the 'Serializable' interface.
 * This is a "Marker Interface" (it has no methods), it just tags the class as
 * "allow serialization".
 */
class Person implements Serializable {
    // Unique ID to ensure the sender and receiver have compatible classes.
    // If you change the class (add a field), you should change this version ID.
    private static final long serialVersionUID = 1L;

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class PersonSave {
    public static void main(String[] args) {
        Person p1 = new Person("Aman", 21);
        String filename = "person.ser"; // .ser is a common convention for serialized files

        // 1. Serialization (Writing Object to File)
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(p1);
            System.out.println("Success: Person object saved to " + filename);
        } catch (IOException e) {
            System.out.println("Serialization Error: " + e.getMessage());
        }

        System.out.println("--------------------------");

        // 2. Deserialization (Reading Object from File)
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            // readObject returns a generic 'Object', sowe must cast it back to 'Person'
            Person p2 = (Person) in.readObject();

            System.out.println("Success: Object loaded from file:");
            p2.display();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization Error: " + e.getMessage());
        }

        // Cleanup: delete the temp file
        new File(filename).deleteOnExit();
    }
}