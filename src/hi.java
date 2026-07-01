import java.io.IOException;
import java.util.Scanner;

public class hi {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        int food = 10;
        switch (food) {
            case 1:
                System.out.println("rice");
                break;
            case 2:
                System.out.println("snack");
                break;
            case 3:
                System.out.println("cake");
                break;
            case 4:
                System.out.println("noodle");
                break;
            case 5:
                System.out.println("pork");
                break;
            default:
                System.out.println("Please enter a number between 1 and 50");
                break;
        }
        // LOOP JAVA learning not yet

        System.out.println("Enter your code");
        int start = Scanner.nextInt();
        // didnot forget to testing code you write today i you didnot want to fail

        for (int i = start; i <= 50; i++) {

            System.out.println(i);

            Thread.sleep(1000); // Tread.sleep for countdown number like happy new hear
        }
        System.out.println("Happy Khmer new year");

    }
}
