class TaskThread extends Thread {
    public TaskThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(getName() + " is executing step " + i);
                // Simulate some processing delay
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(getName() + " was interrupted.");
        }
        System.out.println(getName() + " has completed execution.");
    }
}

public class SetPriority {
    public static void main(String[] args) {
        // Create 3 threads
        TaskThread t1 = new TaskThread("Thread 1");
        TaskThread t2 = new TaskThread("Thread 2");
        TaskThread t3 = new TaskThread("Thread 3");

        // Set different priorities
        t1.setPriority(Thread.MIN_PRIORITY);  // Priority 1
        t2.setPriority(Thread.NORM_PRIORITY); // Priority 5 (default)
        t3.setPriority(Thread.MAX_PRIORITY);  // Priority 10

        // Start the threads
        t1.start();
        t2.start();
        t3.start();

        // Interrupt Thread 2 after a delay
        try {
            // Give the threads some time to start
            Thread.sleep(2500);
            System.out.println("Interrupting " + t2.getName());
            t2.interrupt(); // Interrupting thread 2
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted.");
        }

        // Wait for all threads to complete
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted while waiting for other threads.");
        }

        System.out.println("All threads have completed.");
    }
}
