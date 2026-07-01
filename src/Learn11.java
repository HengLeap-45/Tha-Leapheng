import java.util.Scanner;

public class Learn11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name;
		double initialBalance;
		System.out.println("Enter account holder name");
		name = scanner.next();
		System.out.println("Enter initial balance");
		initialBalance = scanner.nextDouble();
		BankAccount account = new BankAccount(name, initialBalance);
		int choice;
		do {
			System.out.println("=====Menu====");
			System.out.println("1. deposit :");
			System.out.println("2. withdraw:");
			System.out.println("3.Check balance :");
			System.out.println("4. Exit ");
			choice = scanner.nextInt();
			switch (choice) {
				case 1:
					System.out.println("Enter deposit amount");
					double depositAmount = scanner.nextDouble();
					account.deposit(depositAmount);
					break;
				case 2:
					System.out.println("Enter withdraw amount");
					double withdrawAmount = scanner.nextDouble();
					account.withdraw(withdrawAmount);
					break;
				case 3:
					account.checkBalance();
					break;
				case 4:
					System.out.println("Good bye");
				default:
					System.out.println("Invalid choice");
			}
		} while (choice != 4);
		;
		scanner.close();
	}
}
