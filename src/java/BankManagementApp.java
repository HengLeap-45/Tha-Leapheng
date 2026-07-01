import java.util.Scanner;

public class BankManagementApp {

    // Nested class to avoid conflict with other BankAccount classes in the same directory
    static class BankAccount {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Bank Management System ===");

        // Create Account  
        System.out.print("Enter account holder name: ");    
        String name = sc.nextLine();

        System.out.print("Enter account number: ");
        int accNo = sc.nextInt();

        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();

        BankAccount account = new BankAccount(name, accNo, balance);

        int choice;

        do {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Account Info");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 3:
                    account.displayBalance();
                    break;

                case 4:
                    account.displayAccountInfo();
                    break;

                case 5:
                    System.out.println("Thank you for using the system.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);
        
        sc.close();
    }
}
