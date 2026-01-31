# 04-Data-Structures: Storing Data Efficiently

Welcome to the **Data Structures** module! This is where we learn how to organize common data effectively.

## 📦 Concepts & Analogies

### 1. Arrays vs ArrayLists

**Concept**: Two ways to store lists of items.
**Analogy**:

- **Array**: An **Egg Carton**. It has a fixed size (e.g., 12 slots). Once you buy it, you can't add a 13th egg. Efficient, but rigid.
- **ArrayList**: A **Shopping List**. You can start with 1 item, and keep writing more lines at the bottom. It grows as you need it. Flexible, but slightly heavier to manage.

### 2. Time Complexity (Big O)

**Concept**: Measuring how "fast" code is.
**Analogy**:

- **O(1)**: Checking the first page of a book. It takes the same time regardless of how big the book is.
- **O(n)**: Reading every page of a book. The bigger the book, the longer it takes.

### 3. Strings vs StringBuilder

**Concept**: String manipulation efficiency.
**Analogy**:

- **String**: Writing in **Pen**. If you make a mistake, you have to rewrite the whole page on a new sheet (New Object).
- **StringBuilder**: Writing in **Pencil** (or on a Whiteboard). You can erase and change letters without needing new paper.

---

## 📂 Code Walkthrough

| File | Concept | Description |
|------|---------|-------------|
| [ArrayRotation.java](./01-Arrays/ArrayRotation.java) | **Algorithms** | Rotates an array to the right using the clever "Reversal Algorithm" (O(n) time, O(1) space). |
| [DedupArray.java](./01-Arrays/DedupArray.java) | **HashSet** | Removes duplicates instantly by dumping the array into a Set. |
| [Palindrome.java](./01-Arrays/Palindrome.java) | **String Ops** | Reverses a string using `StringBuilder` to check for Palindromes. |
| [ArrayListPrime.java](./02-Lists/ArrayListPrime.java) | **Lists** | A dynamic list that stores numbers and checks for primes using Autoboxing. |

---

## 🙋‍♀️ Interview Questions

### Q1: When should I use an Array over an ArrayList?

**Answer**: Use an Array when:

1. You know the exact size in advance (e.g., Days of the Week = 7).
2. You need maximum performance (no overhead of objects/wrappers).
3. You handle primitive types heavily (avoiding Autoboxing).

### Q2: How does an ArrayList grow dynamically?

**Answer**: Internally, it defaults to size 10. When it gets full, it creates a **new array** that is 50% larger (1.5x) and copies all old elements over. This "resizing" is expensive, so it's good to estimate initial capacity if possible.

### Q3: What is the difference between `Length` and `Capacity`?

**Answer**:

- **Length**: How many items are actually in the list (e.g., 3 eggs).
- **Capacity**: How many slots available before we need a new container (e.g., 12 slots in the carton).
