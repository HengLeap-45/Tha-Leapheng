import java.util.Scanner;

//Model class
class BankAccount implements Banksystem{
    private int accountNumber;
    private String owner ;
    
    private double balance;
    public BankAccount (int accountNumber ,  String owner , double balance){
        this.accountNumber = accountNumber;
        this.owner = owner ;
        this.balance = balance;
    }

    public BankAccount (String name, double initailBalance) {
        this.owner = name;
        this.balance = initailBalance;
        this.accountNumber = (int)(Math.random() * 1000000);
    }

    public  void deposit(double amount){
        balance += amount;
        System.out.println("deposited: $"+ amount);
     }
     public void withdraw (double amount){
        if (amount <= balance ){
            balance -= amount;
            System.out.println(" withdraw: $"+ amount);
        }else {
            System.out.println(" Not enough balance");
        }
     }
   public void checkBalance(){
        System.out.println("check balance : $" +balance);

    }
}
    public class Bank implements Banksystem{
        private static String name;

        public static void main (String[] args) {
            Scanner scanner = new Scanner (System.in);
            // create account
            System.out.println ("\nEnter your acc name :");
            name = scanner.nextLine ();
            System.out.println ("\nEnter your balance");
            double balance = scanner.nextDouble ();
            Banksystem account = new BankAccount (name, balance);
            // Menu
            int Choice;
            do {
                System.out.println ("=======\n Bank Account========");
                System.out.println ("1. Deposit");
                System.out.println ("2. withdraw");
                System.out.println ("3.  Check balance");
                System.out.println ("4. Exit");
                System.out.println ("Choose an option");
                Choice = scanner.nextInt ();
                switch (Choice){
                    case 1:
                        System.out.println("Enter Deposit amount :");
                        double depositAmount= scanner.nextDouble();
                        account.deposit(depositAmount);
                        break;
                    case 2 :
                        System.out.println("Enter withdraw amount :");
                        double withdrawAmount = scanner.nextDouble();
                        account.withdraw(withdrawAmount);
                        break;
                    case 3 :
                        account.checkBalance();
                        break;
                    case 4 :
                        System.out.println("Thank you for using Bank System");
                        break;
                    default:
                        System.out.println("Invalid choice . please try again");

                }
            }while (Choice != 4);
            scanner.close();
        }
   }