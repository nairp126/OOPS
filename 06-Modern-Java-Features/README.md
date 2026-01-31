# 06-Modern-Java-Features: Java 17+

Welcome to the **Modern Era**! Java has evolved massively since Java 8.  
This module covers the "Game Changer" features introduced between Java 14 and Java 21 that make code cleaner, safer, and more expressive.

## 🚀 Concepts

### 1. Records (Java 14)

**Concept**: Concise data carriers.
**Why**: Writing POJOs (Plain Old Java Objects) involves 90% boilerplate (getters, toString, equals).
**Benefit**: `record User(String name) {}` replaces 50 lines of code.

### 2. Enhanced Switch (Java 14)

**Concept**: Switch as an expression.
**Why**: The old `switch` was error-prone (forgot `break`?) and couldn't return values.
**Benefit**: Use `->` arrows. No fall-through errors. Can be used in assignments: `int days = switch(month) { ... }`.

### 3. Text Blocks (Java 15)

**Concept**: Multi-line strings.
**Why**: Embedding JSON/SQL used to look like `"SELECT * FROM \n" + " WHERE id = 1"`.
**Benefit**: Use `"""` to write strings exactly as they appear.

### 4. Sealed Classes (Java 17)

**Concept**: Controlled inheritance.
**Why**: Sometimes you want to represent a fixed hierarchy (e.g., `Result` is either `Success` or `Failure`, nothing else).
**Benefit**: You declare exactly *who* can extend your class using `permits`.

---

## 📂 Code Walkthrough

| File | Concept | Description |
|------|---------|-------------|
| [UserRecord.java](./01-Records/UserRecord.java) | **Records** | Comparing the old verbose Class way vs the new 1-line Record way. |
| [EnhancedSwitch.java](./02-Switch/EnhancedSwitch.java) | **Switch** | Using the arrow syntax to simplify logic. |
| [JsonString.java](./03-TextBlocks/JsonString.java) | **Text Blocks** | Writing clean JSON without escape characters. |
| [ShapeHierarchy.java](./04-SealedClasses/ShapeHierarchy.java) | **Sealed Classes** | A Shape interface that strictly permits only Circle and Rectangle. |

---

## 🙋‍♀️ Interview Questions

### Q1: What is the main difference between a Record and a Class?

**Answer**: Records are **immutable** (fields are final) and purely data-driven. They automatically generate `equals()`, `hashCode()`, and `toString()`. You cannot extend a Record (it's implicitly final).

### Q2: Can a Record have methods?

**Answer**: Yes! You can add custom validation in the constructor or add helper methods. You just cannot add extra instance fields.

### Q3: What is the benefit of Sealed Classes?

**Answer**: They allow for **Exhaustive Pattern Matching**. If you write a switch on a Sealed Class, the compiler knows exactly all possible subclasses, so you don't need a default case.
