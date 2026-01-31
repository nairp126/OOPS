// Package removed to match directory structure

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Executors (Thread Pools).
 * 
 * Problem: Creating a 'new Thread()' for every task is expensive (memory +
 * CPU).
 * Solution: Reuse a fixed number of threads using a Pool.
 */
public class ThreadPoolDemo {
    public static void main(String[] args) {
        // Create a pool of 2 threads.
        // Even if we submit 5 tasks, only 2 run at a time.
        ExecutorService pool = Executors.newFixedThreadPool(2);

        System.out.println("Submitting tasks...");

        for (int i = 1; i <= 5; i++) {
            final int taskId = i;
            pool.submit(() -> {
                System.out.println("Task " + taskId + " running on " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000); // Simulate 1 second job
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }

        // We must shut down the pool, otherwise the app keeps running.
        pool.shutdown();
        System.out.println("All tasks submitted.");
    }
}
