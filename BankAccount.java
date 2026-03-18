public class BankAccount {

    private String accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;

        if (ownerName.length() >= 3) {
            this.ownerName = ownerName;
        } else {
            this.ownerName = "Unknown";
        }

        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        if (ownerName.length() >= 3) {
            this.ownerName = ownerName;
        } else {
            System.out.println("minimum 3 symbols");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance && amount > 0) {
            balance -= amount;
        } else {
            System.out.println("Недостатньо коштів.");
        }
    }

    public double getBalance() {
        return balance;
    }
}