class TaskThread extends Thread {
    private String taskName;

    public TaskThread(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(taskName + " is executing. Iteration: " + i);
                Thread.sleep(500); // Simulate work by sleeping
            }
        } catch (InterruptedException e) {
            System.out.println(taskName + " was interrupted.");
        }
        System.out.println(taskName + " has completed.");
    }
}

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        TaskThread t1 = new TaskThread("High Priority Task");
        TaskThread t2 = new TaskThread("Normal Priority Task");
        TaskThread t3 = new TaskThread("Low Priority Task");

        // Set thread priorities
        t1.setPriority(Thread.MAX_PRIORITY); // Highest priority
        t2.setPriority(Thread.NORM_PRIORITY); // Normal priority
        t3.setPriority(Thread.MIN_PRIORITY); // Lowest priority

        // Start the threads
        t1.start();
        t2.start();
        t3.start();

        // Interrupt the normal priority thread after a short delay
        try {
            Thread.sleep(1000); // Let the threads run for a while
            t2.interrupt(); // Interrupt the normal priority thread
            System.out.println("Interrupt signal sent to Normal Priority Task.");
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted.");
        }

        // Wait for threads to complete
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted during join.");
        }

        System.out.println("All tasks are complete.");
    }
}
