# 🏎️ Challenge: The Great Thread Race

**Topic**: Concurrency (Threads, Sleep, Race Conditions)

## 📝 Problem Statement

We want to simulate a car race with 3 cars.
Each car is a **Thread**.
They need to race from 0 to 100 meters.
Every 10 meters, they print their status and "sleep" for a random amount of time (simulating engine speed).

**Constraint**: The main thread must wait for ALL cars to finish before declaring "Race Over!".

---

## 💻 Starter Code

Copy this code into `RaceSim.java`.

```java
import java.util.Random;

// TODO 1: Make 'Car' implement Runnable
class Car implements Runnable {
    private String name;
    
    public Car(String name) { this.name = name; }

    @Override
    public void run() {
        // TODO 2: Loop from 0 to 100
        // Print "Car [name] is at [i] meters"
        // Thread.sleep(random time)
    }
}

public class RaceSim {
    public static void main(String[] args) {
        Thread ferrari = new Thread(new Car("Ferrari"));
        Thread ford = new Thread(new Car("Ford"));

        // TODO 3: Start the threads
        
        // TODO 4: Ensure Main waits for them! 
        // HINT: Use .join() inside a try-catch block
        
        System.out.println("🏁 ACE OVER! 🏁");
    }
}
```

---

## ✅ Acceptance Criteria

1. **Parallelism**: You should see the output interleaved (Ferrari 10, Ford 10, Ferrari 20...). It should NOT be Ferrari 0-100 then Ford 0-100.
2. **Randomness**: `Thread.sleep()` should be slightly random so the winner isn't always the same.
3. **Synchronization**: "RACE OVER" must be the **last** line printed. Use `join()`.
