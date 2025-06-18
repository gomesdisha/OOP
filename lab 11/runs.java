import java.util.Scanner;

// Class that creates a thread by extending the Thread class
class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread using Thread class: " + i);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

// Class that creates a thread by implementing the Runnable interface
class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread using Runnable interface: " + i);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class runs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n\nMENU");
            System.out.println("1. Create thread using Thread class (Extends)");
            System.out.println("2. Create thread using Runnable interface (Implements)");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                // Creating a thread by extending the Thread class
                MyThread thread1 = new MyThread();
                thread1.start(); // Start the thread
            } else if (choice == 2) {
                // Creating a thread by implementing the Runnable interface
                MyRunnable runnable = new MyRunnable();
                Thread thread2 = new Thread(runnable); // Passing runnable object to Thread constructor
                thread2.start(); // Start the thread
            } else if (choice == 3) {
                System.out.println("Exiting program.");
                break;
            } else {
                System.out.println("Invalid choice! Please enter 1, 2, or 3.");
            }
        }

        sc.close();
    }
}
