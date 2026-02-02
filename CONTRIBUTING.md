# 🤝 Contributing to Java & OOP Mastery

Welcome, fellow learner! 👋

First off, thank you for considering contributing to this repository. This project is maintained by a community of developers who believe that **learning should be clear, simple, and fun**.

Whether you're fixing a typo, adding a new Design Pattern, or refining an explanation, your help is appreciated!

---

## 🌟 Philosophy

Our goal is not just to write code that *works*, but to write code that **teaches**.

* **Clarity over Cleverness**: Avoid complex one-liners. Write code that a beginner can read and understand.
* **Why > What**: The most important part of your code is the **comment** explaining *why* you did it that way.
* **Industry Standards**: We adhere to professional practices so students learn the "Right Way" from day one.

---

## 🚀 How to Contribute

### 1. Adding a New Concept

If you want to add a new topic (e.g., "Java Streams" or "Spring Boot"):

1. **Create a New Folder**: Follow the numbering scheme (e.g., `11-Java-Streams`).
2. **Add a README**: Every folder must have a `README.md` explaining the concept in simple terms (with allergies/diagrams if possible).
3. **Add Code**: Create a clear, compilable `.java` file.
4. **Add a Challenge**: Create a `Challenge.md` so learners can practice.

### 2. Improving Existing Content

* Found a bug? Fix it!
* Explanation unclear? Rewrite it!
* Start by Forking the repository and creating a branch.

---

## 🎨 Code Style Guide

We strictly follow standard Java conventions.

1. **Naming**:
    * Classes: `PascalCase` (e.g., `BankAccount`, `UserSession`).
    * Variables/Methods: `camelCase` (e.g., `calculateTotal()`, `firstName`).
    * Constants: `UPPER_SNAKE_CASE` (e.g., `MAX_RETRIES`).

2. **formatting**:
    * Use 4 spaces for indentation.
    * Left braces `{` go on the same line.

3. **Documentation (Crucial!)**:
    * **Javadoc**: All public classes and methods must have Javadoc.
    * **Inline Comments**: Explain the *intent*, not the syntax.

    *Bad:*

    ```java
    i++; // Increment i
    ```

    *Good:*

    ```java
    // Move to the next index to check for duplicates
    i++;
    ```

---

## 📂 Directory Structure

Please follow the existing pattern. Do not create loose files in the root directory.

* `01-Basics/`
* `02-OOP-Fundamentals/`
* `...`
* `09-Design-Patterns/`

---

## 🔄 Pull Request Process

1. **Fork** the repo and clone it locally.
2. **Create a Branch**: `git checkout -b feature/topic-name`.
3. **Test**: Ensure your code runs without errors (`javac YourFile.java` or `mvn clean test`).
4. **Javadoc**: Ensure you have added comments.
5. **Push** to your fork and submit a Pull Request.
6. **Be Patient**: We review PRs as fast as we can. We might ask for changes to match our philosophy—this is a conversation, not a critique!

Thank you for helping us build the best Java learning resource! ☕
