import java.util.Scanner;

class Counter {
    private int count = 0;

    // Synchronized method to increment the counter
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class CounterWithBlock {
    private int count = 0;

    public void increment() {
        synchronized (this) { // Synchronized block
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}

class IncrementThread extends Thread {
    private Counter counter;

    public IncrementThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

class IncrementThreadWithBlock extends Thread {
    private CounterWithBlock counter;

    public IncrementThreadWithBlock(CounterWithBlock counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

public class SynchronizedDemo {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose synchronization method:");
        System.out.println("1. Synchronized Method");
        System.out.println("2. Synchronized Block");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            Counter counter = new Counter();
            IncrementThread t1 = new IncrementThread(counter);
            IncrementThread t2 = new IncrementThread(counter);
            t1.start();
            t2.start();
            t1.join();
            t2.join();
            System.out.println("Final count (using synchronized method): " + counter.getCount());
        } else if (choice == 2) {
            CounterWithBlock counter = new CounterWithBlock();
            IncrementThreadWithBlock t1 = new IncrementThreadWithBlock(counter);
            IncrementThreadWithBlock t2 = new IncrementThreadWithBlock(counter);
            t1.start();
            t2.start();
            t1.join();
            t2.join();
            System.out.println("Final count (using synchronized block): " + counter.getCount());
        } else {
            System.out.println("Invalid choice. Please enter 1 or 2.");
        }

        
    }
}
