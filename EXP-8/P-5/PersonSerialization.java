import java.io.*;

class Person implements Serializable {
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

public class PersonSerialization {
    public static void main(String[] args) {
        Person p1 = new Person("Aman", 21);

        // Serialization
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.txt"));
            out.writeObject(p1);
            out.close();
            System.out.println("Person object serialized successfully.");
        } catch (IOException e) {
            System.out.println("Serialization error.");
        }

        // Deserialization
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.txt"));
            Person p2 = (Person) in.readObject();
            in.close();
            System.out.println("Deserialized object:");
            p2.display();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization error.");
        }
    }
}
// This code defines a `Person` class that implements `Serializable`, allowing it to be serialized and deserialized.
// The `main` method creates a `Person` object, serializes it to a file named "person.txt", and then deserializes it back into a new `Person` object.