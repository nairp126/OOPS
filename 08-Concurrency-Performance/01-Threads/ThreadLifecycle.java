// Package removed to match directory structure

/**
 * Basic Threads.
 * 
 * Concept: A Thread is a lightweight process.
 * Two ways to create:
 * 1. Extend Thread class.
 * 2. Implement Runnable interface (Preferred, because you can extend other
 * classes).
 */
class Worker extends Thread {
    @Override
    public void run() {
        System.out.println("Worker Thread (" + Thread.currentThread().getName() + ") is running...");
        try {
            Thread.sleep(500); // Simulate work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Worker Thread finished.");
    }
}

class Task implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable Task (" + Thread.currentThread().getName() + ") is running...");
    }
}

public class ThreadLifecycle {
    public static void main(String[] args) {
        System.out.println("Main Thread started.");

        // Method 1: Extending Thread
        Worker t1 = new Worker();
        t1.start(); // calling run() directly would NOT start a new thread!

        // Method 2: Implementing Runnable
        Thread t2 = new Thread(new Task());
        t2.start();

        System.out.println("Main Thread finished (but JVM waits for others).");
    }
}
