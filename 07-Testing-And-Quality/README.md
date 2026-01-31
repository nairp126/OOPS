# 07-Testing-And-Quality

**"If it isn't tested, it's broken."**  
This module moves beyond writing code that "just works" on your machine to writing code that is **verified**, **maintainable**, and **observable**.

> ⚠️ **Prerequisite**: These examples use libraries (**JUnit 5**, **Mockito**, **SLF4J**) that are not part of the standard JDK. You need a build tool like **Maven** (covered in Module 10) to run them. Treat these files as concepts for now.

## 🧪 Concepts

### 1. Unit Testing (JUnit 5)

**What**: Testing small individual units of code (methods/classes) in isolation.
**Why**: Ensures your logic is correct before you integrate it with the rest of the app.
**Key Annotations**:

- `@Test`: Marks a method as a test.
- `@BeforeEach`: Setup code that runs before every test.
- `assertEquals(expected, actual)`: Checks if the result is correct.

### 2. Mocking (Mockito)

**What**: Creating "fake" versions of complex dependencies (Databases, APIs).
**Why**: You want to test your Service logic, not your Database connection. Mocking lets you simulate a database without actually having one.
**Key Concepts**:

- `Types of Doppelgangers`: Dummy, Fake, Stub, Spy, Mock.
- `when(mock.method()).thenReturn(value)`: Teaching the mock how to behave.

### 3. Logging (SLF4J)

**What**: Recording application events for debugging and monitoring.
**Why `System.out` is bad**: It's slow, unconfigurable, and spams the console. Loggers allow you to filter messages (e.g., show only ERRORs in production).
**Levels**: `DEBUG` < `INFO` < `WARN` < `ERROR`.

---

## 📂 Code Walkthrough

| File | Concept | Description |
|------|---------|-------------|
| [CalculatorTest.java](./01-JUnit5/CalculatorTest.java) | **Assertions** | Basic unit testing logic asserting math operations. |
| [UserServiceTest.java](./02-Mockito/UserServiceTest.java) | **Mocking** | Testing a Service by "Mocking" its Database dependency. |
| [AppLogger.java](./03-Logging/AppLogger.java) | **Logging** | Using a professional Logger instead of print statements. |

---

## 🙋‍♀️ Interview Questions

### Q1: What is the difference between `@BeforeAll` and `@BeforeEach`?

**Answer**:

- `@BeforeEach` runs before **every single test method**. (Good for resetting variables).
- `@BeforeAll` runs **once** before all tests in the class. (Good for expensive setup like connecting to a test DB). It must be static.

### Q2: Why do we mock the Database in unit tests?

**Answer**: Unit tests must be **fast** and **isolated**. A real database is slow and might have different data every time. Mocking guarantees consistent, instant results.

### Q3: What is the risk of excessive Mocking?

**Answer**: If you mock everything, you might be testing your *mocks* rather than your *code*. You still need **Integration Tests** to verify the real parts work together.
