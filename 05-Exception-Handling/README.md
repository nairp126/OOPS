# 05-Exception-Handling: Handling Errors Gracefully

Welcome to the **Exception Handling** module! In the real world, things go wrong. Files go missing, servers go down, and users input text when you asked for numbers. Exception handling is how we prevent our application from crashing when these things happen.

## 🚨 Concepts & Analogies

### 1. What is an Exception?

**Concept**: An event that disrupts the normal flow of the program.
**Analogy**:

- **Normal Flow**: Driving your car to work.
- **Exception**: Getting a **Flat Tire**.
  - If you ignore it (no handling), the car crashes (Program terminates).
  - If you handle it (Change the tire), you can continue your journey (Graceful recovery).

### 2. Try - Catch - Finally

**Concept**: The keywords we use to handle errors.
**Analogy**:

- **try**: "Attempt to drive to work." (The code that might fail).
- **catch**: "If a flat tire happens, put on the spare." (The recovery plan).
- **finally**: "Put the jack and tools back in the trunk." (Cleanup that happens whether you had a flat or not).

### 3. Checked vs Unchecked

**Concept**: Java has two types of exceptions.

- **Checked (Compile-time)**: Java forces you to handle these inside the code (e.g., `IOException`).
  - *Analogy*: The car check-engine light. You can't start the car until you acknowledge/fix it.
- **Unchecked (Runtime)**: Errors that happen due to logic bugs (e.g., `NullPointerException`, `ArithmeticException`).
  - *Analogy*: A sudden deer crossing the road. You can't predict it, but you react when it happens.

---

## 📂 Code Walkthrough

| File | Concept | Description |
|------|---------|-------------|
| [BasicExample.java](./BasicExample.java) | **Try-Catch-Finally** | Handles Division by Zero (`ArithmeticException`) and bad input (`NumberFormatException`) safely. |
| [RealWorldExample.java](./RealWorldExample.java) | **Custom Exceptions** | A Banking demo that throws a custom `InsufficientFundsException` when you withdraw too much. |
| [Pitfall.java](./Pitfall.java) | **The Silent Killer** | Demonstrates "Exception Swallowing" (empty catch blocks) and why you should NEVER do it. |

---

## 🙋‍♀️ Interview Questions

### Q1: What is the difference between `Checked` and `Unchecked` exceptions?

**Answer**:

- **Checked Exceptions** (e.g. `IOException`) are checked at **compile-time**. You *must* handle them with try-catch or declare `throws`. They usually represent external errors (file missing, network down).
- **Unchecked Exceptions** (e.g. `NullPointerException`, `RuntimeException`) occur at **runtime**. They usually represent programming bugs. You aren't forced to catch them.

### Q2: Can we catch `Error`?

**Answer**: technically yes, but you **should not**. `Error` (like `OutOfMemoryError` or `StackOverflowError`) indicates a serious system failure that the application likely cannot recover from.

### Q3: What happens if I have a `return` statement in the `try` block and a `finally` block?

**Answer**: The `finally` block **will still execute**! It runs right before the method returns.
