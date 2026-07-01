import java.util.Scanner;

public class Javabasic {
	public static void main(String[] args) {
		Scanner ac = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		/*
		 * int u1 = 1;
		 * int u2 = 2;
		 * int u3 = 7;
		 * double d = u2-u1;
		 * double Cardinal = u3/d - u1+1 ;
		 * System.out.println (Cardinal);
		 * double num1= u3%u2 + 3;
		 * System.out.println (num1);
		 */
		int BroCode;
		double python;
		String Java;
		String A = "Leapheng";
		char none = 'P';
		// double Pro;
		System.out.println("Hello BroCode");
		BroCode = ac.nextInt();
		System.out.println("Hello python");
		python = ac.nextDouble();
		System.out.println("Hello java");
		Java = ac.nextLine();
		System.out.println("Hello programming");
		{
			if (BroCode <= 90) {
				System.out.println("Hello" + A + none);

				int Hello = sc.nextInt();
				{
					if (BroCode <= 100 && BroCode != 100) {
						System.out.println("None of Number");
					} else if (BroCode > 100 && BroCode / 2 > 90) {
						System.out.println("Number output");
					}

				}
			} else if (BroCode <= 80) {
				System.out.println("Hello to :" + A + none);

			} else if (BroCode <= 70) {
				System.out.println("Hello to a man who can't be move" + A + none);

			} else if (BroCode <= 60) {
				System.out.println("Hello to progammer ");
			}

		}
	}
}
