# 08-Concurrency-Performance

Welcome to the world of **Parallelism**.
Modern computers have multiple CPU cores (e.g., 8-cores, 16-threads). If you write single-threaded Java, you are ignoring 90% of your computer's power.

This module covers the evolution from basic Threads to the cutting-edge Virtual Threads in Java 21.

## ⚡ Concepts

### 1. Threads (The Old Way)

**Concept**: A separate path of execution.
**Limitation**: Creating a thread is expensive (uses RAM). You can't just create 1 million threads.

### 2. Executors (The Professional Way)

**Concept**: Reusing threads.
**Mechanism**: A "Pool" of 10 workers handles 1000 tasks. When a worker finishes Task A, it picks up Task B.
**Benefit**: Prevents system crash due to too many threads.

### 3. CompletableFuture (The Async Way)

**Concept**: "Don't call us, we'll call you."
**Why**: Instead of waiting (`blocking`) for a result, you define a **Chain** of actions.
**Example**: User Clicks Order -> (Async) Charge Card -> (Async) Send Email -> (Async) Update Screen. Main thread never freezes.

### 4. Virtual Threads (The Future - Java 21)

**Concept**: Threads that are managed by the **JVM**, not the **OS**.
**Benefit**: They are extremely lightweight. You can spin up **1 Million** virtual threads on a standard laptop. This makes coding high-scale servers (like Netflix/Amazon) much simpler.

---

## 📂 Code Walkthrough

| File | Concept | Description |
|------|---------|-------------|
| [ThreadLifecycle.java](./01-Threads/ThreadLifecycle.java) | **Basic Threads** | Extending `Thread` vs `Runnable`. |
| [ThreadPoolDemo.java](./02-Executors/ThreadPoolDemo.java) | **Executors** | Using a `FixedThreadPool` to manage tasks safely. |
| [CompletableFutureDemo.java](./03-Async/CompletableFutureDemo.java) | **Async** | Chaining work without blocking the main CPU. |
| [HighScaleServer.java](./04-VirtualThreads/HighScaleServer.java) | **Virtual Threads** | The Project Loom magic: Running 10,000 threads in milliseconds. |

---

## 🙋‍♀️ Interview Questions

### Q1: What is a Deadlock?

**Answer**: A situation where Thread A waits for lock X (held by B), and Thread B waits for lock Y (held by A). Neither can proceed. They are stuck forever.

### Q2: Runnable vs Callable?

**Answer**:

- `Runnable`: Returns `void`. Cannot throw checked exceptions.
- `Callable`: Returns a result (`V`). Can throw exceptions. Used with Executors.

### Q3: Why are Virtual Threads better than Async/Reactive code?

**Answer**: Async code (callbacks) is hard to read and debug ("Callback Hell"). Virtual Threads allow you to write simple code (looks synchronous) but get the same high performance as Async code.
