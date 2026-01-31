// Package removed to match directory structure

import java.util.concurrent.CompletableFuture;

/**
 * CompletableFuture (Async Programming).
 * 
 * Concept: Do something -> THEN do something else -> THEN print it.
 * All without blocking the main thread.
 */
public class CompletableFutureDemo {
    public static void main(String[] args) {
        System.out.println("Main: Placing Order...");

        // 1. Async Task: Fetch Price (Simulated)
        CompletableFuture.supplyAsync(() -> {
            sleep(1000);
            System.out.println("Server: Price fetched.");
            return 100; // Price
        })

                // 2. Chained Task: Calculate Tax (Runs after step 1)
                .thenApply(price -> {
                    System.out.println("Server: Calculating tax...");
                    return price * 1.10; // Add 10% tax
                })

                // 3. Final Task: Display (Runs after step 2)
                .thenAccept(finalPrice -> {
                    System.out.println("Main: Total cost is $" + finalPrice);
                });

        System.out.println("Main: I am not blocked! Doing other work...");

        // Keep main thread alive long enough to see results
        sleep(2000);
    }

    private static void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
        }
    }
}
