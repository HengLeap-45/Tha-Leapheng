import java.util.Scanner;

public class CalculatorCopy {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        
        System.out.println("Enter First Number");
        double num1 = Scanner.nextDouble();
        System.out.println("Enter Second Number");
        double num2 = Scanner.nextDouble();
        
        System.out.println("\n Choose operation");
        System.out.println("1. addition (+) ");
        System.out.println("2. Subtraction (-) ");
        System.out.println("3. multiplication (*) ");
        System.out.println("4 Division  (/) ");
        int choice = Scanner.nextInt();
        
        double Result = 0;
        switch (choice) {
            case 1:
                Result = num1 + num2;
                System.out.println("RESULT :" + num1 + "+" + num2 + "=" + Result);
                break;
            case 2:
                Result = num1 - num2;
                System.out.println("RESULT :" + num1 + "-" + num2 + "=" + Result);
                break;
            case 3:
                Result = num1 * num2;
                System.out.println("RESULT :" + num1 + "*" + num2 + "=" + Result);
                break;
            case 4:
                if (num2 != 0) {
                    Result = num1 / num2;
                    System.out.println("RESULT :" + num1 + "/" + num2 + "=" + Result);
                } else {
                    System.out.println("Error : Division by zero");
                }
                break;
            default:
                System.out.println("invalid choice");
        }
        Scanner.close();
    }
}
