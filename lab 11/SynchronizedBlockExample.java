// BankAccount class with synchronized statements (blocks)
class BankAccountWithBlock {
    private int balance = 1000;

    // Method for withdrawing money using synchronized block
    public void withdraw(int amount) {
        synchronized (this) {
            if (balance >= amount) {
                System.out.println(Thread.currentThread().getName() + " is withdrawing: " + amount);
                balance -= amount;
                System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining balance: " + balance);
            } else {
                System.out.println(Thread.currentThread().getName() + " insufficient balance to withdraw: " + amount);
            }
        }
    }

    // Method for depositing money using synchronized block
    public void deposit(int amount) {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " is depositing: " + amount);
            balance += amount;
            System.out.println(Thread.currentThread().getName() + " completed deposit. New balance: " + balance);
        }
    }

    public int getBalance() {
        return balance;
    }
}

// Thread class for withdrawing money (synchronized block)
class WithdrawThreadBlock extends Thread {
    private BankAccountWithBlock account;
    private int amount;

    public WithdrawThreadBlock(BankAccountWithBlock account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.withdraw(amount);
    }
}

// Thread class for depositing money (synchronized block)
class DepositThreadBlock extends Thread {
    private BankAccountWithBlock account;
    private int amount;

    public DepositThreadBlock(BankAccountWithBlock account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.deposit(amount);
    }
}

public class SynchronizedBlockExample {
    public static void main(String[] args) {
        BankAccountWithBlock account = new BankAccountWithBlock();

        // Create two threads for withdrawing and depositing
        WithdrawThreadBlock withdrawThread = new WithdrawThreadBlock(account, 700);
        DepositThreadBlock depositThread = new DepositThreadBlock(account, 400);

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
