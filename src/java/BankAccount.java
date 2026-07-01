class BankAccount {
    private String name;
    private int accNo;
    private double balance;

    public BankAccount(String name, int accNo, double balance) {
        this.name = name;
        this.accNo = accNo;
        this.balance = balance;
    }

    // Deposit
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    // Check Balance
    public void displayBalance() {
        System.out.println("Balance: $" + balance);
    }

    // Account Info
    public void displayAccountInfo() {
        System.out.println("Account Holder: " + name);
        System.out.println("Account Number: " + accNo);
        System.out.println("Balance: $" + balance);
    }
}
