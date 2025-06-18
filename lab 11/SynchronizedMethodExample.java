// BankAccount class with synchronized methods
class BankAccount {
    private int balance = 1000;

    // Synchronized method for withdrawing money
    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is withdrawing: " + amount);
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " insufficient balance to withdraw: " + amount);
        }
    }

    // Synchronized method for depositing money
    public synchronized void deposit(int amount) {
        System.out.println(Thread.currentThread().getName() + " is depositing: " + amount);
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " completed deposit. New balance: " + balance);
    }

    public int getBalance() {
        return balance;
    }
}

// Thread class for withdrawing money
class WithdrawThread extends Thread {
    private BankAccount account;
    private int amount;

    public WithdrawThread(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.withdraw(amount);
    }
}

// Thread class for depositing money
class DepositThread extends Thread {
    private BankAccount account;
    private int amount;

    public DepositThread(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.deposit(amount);
    }
}

public class SynchronizedMethodExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        // Create two threads for withdrawing and depositing
        WithdrawThread withdrawThread = new WithdrawThread(account, 500);
        DepositThread depositThread = new DepositThread(account, 200);

        // Start both threads
        withdrawThread.start();
        depositThread.start();

        // Join the threads
        try {
            withdrawThread.join();
            depositThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final balance: " + account.getBalance());
    }
}
