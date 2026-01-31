# 01-Basics: Java Fundamentals

Welcome to the **Basics** module! This folder contains the foundational building blocks of Java programming. Whether you are a complete beginner or brushing up on syntax, this guide will walk you through the core concepts.

## 🎓 Concepts & Analogies

### 1. Classes & Objects

**Concept**: A `Class` is a blueprint or template. An `Object` is a real-world instance created from that blueprint.
**Analogy**:

- **Class**: The architectural engineer's *blueprint* for a house. You can't live in the blueprint.
- **Object**: The actual *house* built from that blueprint. You can build 50 identical houses (Objects) from one blueprint (Class).

### 2. Variables & Data Types

**Concept**: Containers for storing data values. Java is statically typed, meaning you must say what kind of data goes in the box (e.g., `int`, `double`, `String`).
**Analogy**:

- **Variable**: A moving box labeled "Kitchen Items".
- **Data Type**: The rule that says "Only kitchen items go in here". You can't put a "Bed" (wrong type) in a "Kitchen Items" box.

### 3. Control Flow (If/Else, Switch)

**Concept**: Deciding which code to run based on conditions.
**Analogy**:

- **If/Else**: A fork in the road. If the light is green, go; else, stop.
- **Switch**: A vending machine. You press button "1", you get Coke. You press "2", you get Pepsi. It jumps directly to the selection.

### 4. Loops

**Concept**: Repeating a block of code multiple times.
**Analogy**:

- **Loop**: Doing 10 pushups. The action (pushup) is the same, but you repeat it until you hit the count (10) or a condition is met (too tired).

---

## 📂 Code Walkthrough

We have refactored the code in this folder to demonstrate these concepts clearly.

| File | Concept | Description |
|------|---------|-------------|
| [Hello.java](./01-HelloWorld/Hello.java) | **Classes & Constructors** | The classic "Hello World" turned object-oriented. Learn how `main` works and how to create objects. |
| [AreaCalculator.java](./02-Variables/AreaCalculator.java) | **Method Overloading** | Calculating areas for different shapes. Shows how methods can share names if they have different parameters. |
| [ToDoListSimple.java](./02-Variables/ToDoListSimple.java) | **Variables & Swing** | A mini-project! Usage of variables to manage a real To-Do list UI. |
| [GradeCalculator.java](./03-ControlFlow/GradeCalculator.java) | **If-Else Logic** | Calculates grades based on marks. Demonstrates how to handle ranges of values. |
| [DayOfWeekSwitch.java](./03-ControlFlow/DayOfWeekSwitch.java) | **Switch Statements** | efficient decision making for fixed values (Days 1-7). |
| [PatternPrinting.java](./04-Loops/PatternPrinting.java) | **Nested Loops** | Prints a number triangle. Shows how one loop can live inside another to create 2D patterns. |
| [Stopwatch.java](./05-Time/Stopwatch.java) | **Timing & Events** | A working stopwatch using `Timer`. Introduction to event-driven programming. |

---

## 🙋‍♀️ Interview Questions

### Q1: What is "Method Overloading"?

**Answer**: It allows multiple methods in the same class to have the same name but different parameters (different type, number, or order). It increases readability (e.g., `area(radius)` vs `area(length, width)`).

### Q2: Explain `public static void main(String[] args)`

**Answer**:

- `public`: Accessible from anywhere (JVM needs to find it).
- `static`: Can run without creating an object of the class first.
- `void`: Returns nothing.
- `main`: The specific entry point name.
- `String[] args`: Command-line arguments.

### Q3: What is the difference between `break` and `continue` in loops?

**Answer**:

- `break`: Exits the loop completely.
- `continue`: Skips the *current* iteration and moves to the next one.
