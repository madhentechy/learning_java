interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}

// SavingsAccount class implementing Account interface
class SavingsAccount implements Account {
    private double balance;
    private double interestRate;

    // Constructor
    public SavingsAccount(double initialBalance, double interestRate) {
        this.balance = initialBalance;
        this.interestRate = interestRate;
    }

    // Implementing methods

    public void deposit(double amount) {
        balance += amount;
    }


    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }


    public double getBalance() {
        return balance;
    }

    // Method for calculating interest
    public void calculateInterest() {
        balance += balance * interestRate;
    }
}

// CurrentAccount class implementing Account interface
class CurrentAccount implements Account {
    private double balance;
    private double overdraftLimit;

    // Constructor
    public CurrentAccount(double initialBalance, double overdraftLimit) {
        this.balance = initialBalance;
        this.overdraftLimit = overdraftLimit;
    }

    // Implementing methods

    public void deposit(double amount) {
        balance += amount;
    }


    public void withdraw(double amount) {
        if (balance - amount >= -overdraftLimit) {
            balance -= amount;
        } else {
            System.out.println("Overdraft limit exceeded");
        }
    }


    public double getBalance() {
        return balance;
    }
}

// Bank class managing collection of accounts
class Bank {
    private Account[] accounts;
    private int numAccounts;

    // Constructor
    public Bank(int capacity) {
        accounts = new Account[capacity];
        numAccounts = 0;
    }

    // Method to add an account to the bank
    public void addAccount(Account account) {
        if (numAccounts < accounts.length) {
            accounts[numAccounts] = account;
            numAccounts++;
        } else {
            System.out.println("Bank is full, cannot add more accounts");
        }
    }

    // Method to display total balance of all accounts in the bank
    public double totalBalance() {
        double total = 0;
        for (int i = 0; i < numAccounts; i++) {
            total += accounts[i].getBalance();
        }
        return total;
    }
}

// Main class to demonstrate usage
public class Banksys {
    public static void main(String[] args) {
        // Creating a bank with capacity for 2 accounts
        Bank bank = new Bank(2);

        // Creating a savings account and a current account
        SavingsAccount savingsAccount = new SavingsAccount(1000, 0.05);
        CurrentAccount currentAccount = new CurrentAccount(500, 200);

        // Adding accounts to the bank
        bank.addAccount(savingsAccount);
        bank.addAccount(currentAccount);

        // Depositing and withdrawing from accounts
        savingsAccount.deposit(200);
        currentAccount.withdraw(300);

        // Displaying total balance of all accounts in the bank
        System.out.println("Total balance in the bank: " + bank.totalBalance());
    }
}