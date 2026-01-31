# ☕ Challenge: The Coffee Factory

**Topic**: Design Patterns (Factory Method)

## 📝 Problem Statement

You are building the ordering system for a cafe.
We serve 3 types of coffee: **Espresso**, **Latte**, and **Cappuccino**.
Creating these objects manually (`new Latte()`, `new Espresso()`) all over the code is messy.

Your task is to implement a **CoffeeFactory** that takes a String type and returns the correct Object.

---

## 💻 Starter Code

Copy this code into `CoffeeShop.java`.

```java
// 1. Common Interface
interface Coffee {
    void brew();
}

// 2. Concrete Classes
class Espresso implements Coffee {
    public void brew() { System.out.println("Brewing strong Espresso..."); }
}

class Latte implements Coffee {
    public void brew() { System.out.println("Brewing creamy Latte..."); }
}

// TODO 1: Create 'CoffeeFactory' class
// It should have a method: public Coffee makeCoffee(String type)

public class CoffeeShop {
    public static void main(String[] args) {
        // TODO 2: Use the Factory!
        // CoffeeFactory factory = ...
        
        // Coffee c1 = factory.makeCoffee("Latte");
        // c1.brew();
        
        // Coffee c2 = factory.makeCoffee("Espresso");
        // c2.brew();
    }
}
```

---

## ✅ Acceptance Criteria

1. **Encapsulation**: The `main` method should NOT use the keyword `new Latte()` or `new Espresso()`. Only `new CoffeeFactory()` or a static factory method.
2. **Safety**: If I ask for "Tea", the factory should handle it gracefully (throw Exception or return null).
3. **Interface**: Both coffee types must implement `Coffee` and override `brew()`.
