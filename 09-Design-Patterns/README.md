# 09-Design-Patterns: The Gang of Four

Design Patterns are reusable solutions to common software problems.
They are not code, but **templates** for how to solve a problem.

## 🏗️ Categories

### 1. Creational Patterns

**Focus**: Object Creation mechanisms.

- **Factory Pattern**: Creating objects without specifying the exact class.
- **Singleton Pattern**: Ensuring a class has only one instance.
- **Builder Pattern**: Constructing complex objects step by step.

### 2. Structural Patterns

**Focus**: Class and Object composition.

- **Adapter Pattern**: Making incompatible interfaces work together.
- **Decorator Pattern**: Adding behavior to an object dynamically.

### 3. Behavioral Patterns

**Focus**: Communication between objects.

- **Strategy Pattern**: Selecting an algorithm at runtime.
- **Observer Pattern**: Notifying subscribers of changes.

---

## 📂 Code Walkthrough

| File | Pattern | Description |
|------|---------|-------------|
| [SingletonConfig.java](./01-Creational/SingletonConfig.java) | **Singleton** | Ensures only one Configuration object exists. |
| [NotificationFactory.java](./02-Creational/NotificationFactory.java) | **Factory** | Creates `SMS` or `Email` based on a string input. |
| [PaymentStrategy.java](./03-Behavioral/PaymentStrategy.java) | **Strategy** | Swaps between `CreditCard` and `PayPal` logic cleanly. |
| [LegacyAdapter.java](./04-Structural/LegacyAdapter.java) | **Adapter** | Wraps an `OldPrinter` to work with a `ModernPrinter` interface. |

---

## 🙋‍♀️ Interview Questions

### Q1: When is Singleton bad?

**Answer**: Singletons can be bad because they hide dependencies (everything uses the global instance), making Unit Testing difficult. They are also essentially global state.

### Q2: Factory vs Abstract Factory?

**Answer**:

- **Factory Method**: Creates **one** type of object (e.g., `createCar()`).
- **Abstract Factory**: Creates **families** of related objects (e.g., `createCar()`, `createEngine()`, `createTires()`).

### Q3: Why use Strategy instead of Inheritance?

**Answer**: Inheritance is static (you pick the parent class at compile time). Strategy is dynamic (you can swap behavior at runtime, like changing a payment method).
