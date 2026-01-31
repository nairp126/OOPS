# 02-OOP-Fundamentals: The 4 Pillars of OOP

Welcome to the **OOP Fundamentals** module! This is the heart of Java. Here we move beyond simple scripts to creating robust, scalable software architectures using Object-Oriented Programming (OOP).

## 🏛️ The 4 Pillars of OOP

### 1. Encapsulation

**Concept**: Bundling data (variables) and methods (functions) together and restricting direct access to some of an object's components.
**Analogy**:

- A **Capsule**: You can't see the medicine powder inside directly; you just swallow the capsule.
- **Car Dashboard**: You use the steering wheel and pedals (public interface), but you don't mess with the engine pistons directly (private state).

### 2. Inheritance

**Concept**: A mechanism where a new class inherits properties and behavior from an existing class.
**Analogy**:

- **Biological Inheritance**: You inherit traits (eye color, height) from your parents, but you also have your own unique traits.
- `Vehicle` (Parent) -> `Car`, `Truck`, `Bike` (Children). They all "drive", but they are different.

### 3. Polymorphism

**Concept**: "Many Forms". It allows unrelated objects to be treated as the same type, or the same method to behave differently.
**Analogy**:

- **"Speak" Command**: If you tell a Dog to "Speak", it barks. If you tell a Cat to "Speak", it meows. The command is the same, the behavior is different.

### 4. Abstraction

**Concept**: Hiding complex implementation details and showing only the essential features of the object.
**Analogy**:

- **Light Switch**: You flip the switch, light goes on. You don't need to understand the electrical wiring behind the wall to use it.

---

## 📂 Code Walkthrough

| File | Concept | Description |
|------|---------|-------------|
| [Employee.java](./01-Classes/Employee.java) | **Encapsulation** | Uses `private` fields and `public` getters. Shows `static` vs instance variables. |
| [EmployeeDemo.java](./01-Classes/EmployeeDemo.java) | **Objects** | How to instantiate objects using different constructors (`new Employee()`). |
| [PlayerHierarchy.java](./02-Inheritance/PlayerHierarchy.java) | **Inheritance** | `CricketPlayer` extends `Player`. Reuses code for name/age/position. |
| [Logger.java](./03-Encapsulation/Logger.java) | **Final Class** | A class that cannot be extended, effectively sealing its design. |
| [ShapeAbstraction.java](./04-Abstraction/ShapeAbstraction.java) | **Abstraction** | `Shape` is abstract; you can't have just a "Shape", it must be a specific *kind* (Circle/Rectangle). |
| [BankSystem.java](./05-Interfaces/BankSystem.java) | **Interfaces** | Defines a contract (`Bank`) that any Account (`deposit`, `withdraw`) must obey. |
| [EmployeePolymorphism.java](./06-Polymorphism/EmployeePolymorphism.java) | **Polymorphism** | Treats `Manager` and `Developer` as generic `PolyEmployee`s. |

---

## 🙋‍♀️ Interview Questions

### Q1: What is the difference between an Abstract Class and an Interface?

**Answer**:

- **Abstract Class**: Partial abstraction. Can have concrete methods and instance variables. Use when classes share a common identity (e.g., `Dog` is an `Animal`).
- **Interface**: Total abstraction (usually). Can only have constants and abstract methods (prior to Java 8). Use when unrelated classes share a capability (e.g., `Dog` and `Airplane` both implement `Movable`).

### Q2: What is "Polymorphism" in one sentence?

**Answer**: Polymorphism is the ability of a single interface to support entities of multiple types (e.g., treating a `Circle` and `Square` both as `Shape`).

### Q3: Why is Encapsulation important?

**Answer**: It protects the internal state of an object. By hiding fields (making them private), you force external code to use methods (getters/setters), allowing you to validate data or change internal logic without breaking the rest of the app.
