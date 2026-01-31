# ⚔️ Challenge: The RPG Hero Factory

**Topic**: OOP (Inheritance, Polymorphism, Encapsulation, Abstraction)

## 📝 Problem Statement

You are the lead developer for a new text-based RPG game.
Your task is to build the **Character System**.

We need a flexible system where all heroes share common traits (like Name and Health), but behave differently when they fight.

Requirements:

1. **Base Class `Hero`**: Should hold the `name` and `health`. It should be `abstract` because you can't just be a generic "Hero".
2. **Encapsulation**: `health` should be `private`. Provide a method `takeDamage(int amount)` to safely reduce health (don't let it go below 0).
3. **Subclass `Warrior`**: Has high health. Its special ability uses "Stamina".
4. **Subclass `Mage`**: Has low health. Its special ability uses "Mana".
5. **Polymorphism**: Both must implement an `attack()` method, but the output text should be different.

---

## 💻 Starter Code

Copy this code into `RPGShim.java` and implement the missing classes!

```java
// Step 1: Define the abstract Parent class
abstract class Hero {
    private String name;
    private int health;

    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() { return name; }
    public int getHealth() { return health; }

    // TODO 1: Implement a 'takeDamage' method that reduces health
    // Ensure health never drops below 0.
    public void takeDamage(int damage) {
        // ???
    }

    // TODO 2: Define an abstract method 'attack()'
    // public abstract void ...
}

// Step 2: Create the Warrior
class Warrior extends Hero {
    public Warrior(String name) {
        // Warriors start with 100 Health
        super(name, 100); 
    }

    // TODO 3: Override attack()
    // Print: "[Name] swings a heavy sword!"
}

// Step 3: Create the Mage
class Mage extends Hero {
    public Mage(String name) {
        // Mages start with 50 Health
        super(name, 50);
    }

    // TODO 4: Override attack()
    // Print: "[Name] casts a fireball!"
}

public class RPGShim {
    public static void main(String[] args) {
        // Polymorphism in action!
        Hero[] party = { new Warrior("Thor"), new Mage("Merlin") };

        System.out.println("--- Battle Start ---");
        for (Hero h : party) {
            h.attack(); // Should print different things for Thor vs Merlin
        }
    }
}
```

---

## ✅ Acceptance Criteria

1. **Encapsulation**: You cannot set `health` directly (e.g., `h.health = -10` should fail or be impossible).
2. **Polymorphism**: The `main` loop must call `.attack()` on the generic `Hero` variable, but run the specific `Warrior`/`Mage` version.
3. **Inheritance**: `Warrior` and `Mage` must use `super(name, hp)` to set up the parent class correctly.
