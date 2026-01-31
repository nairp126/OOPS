// Package removed to match directory structure

import java.util.concurrent.Executors;

/**
 * Virtual Threads (Java 21+).
 * 
 * Problem: Classic Java threads are wrappers around OS threads (Heavy, max
 * ~4000 per machine).
 * Solution: Virtual threads are lightweight. You can create millions.
 */
public class HighScaleServer {
    public static void main(String[] args) {
        // NOTE: Requires JDK 21+

        long startTime = System.currentTimeMillis();

        // Try creating 10,000 threads.
        // With 'newThreadPerTaskExecutor' (Visual Threads), this is instant.
        // With classic threads, this might crash your laptop.
        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            for (int i = 0; i < 10_000; i++) {
                executor.submit(() -> {
                    try {
                        Thread.sleep(100); // Simulate I/O wait
                    } catch (InterruptedException e) {
                        // ignore
                    }
                });
            }
        } // Executor auto-closes and waits for all tasks here

        long endTime = System.currentTimeMillis();
        System.out.println("Time taken for 10,000 threads: " + (endTime - startTime) + "ms");
    }
}
