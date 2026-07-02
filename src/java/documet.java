
public class documet {

    public static void main(String[] args) {
        int n = 6;
        for (int i = n / 2; i <= n; i += 2) {
            for (int j = 1; j < n - i; j += 2) {
                //print space   
                System.out.print("");
            }
            for (int j = 1; j <= i; j++) {
                //print star
                System.out.print("***");

            }
            for (int j = 1; j <= n - i; j++) {
                //print space
                System.out.println("");
            }
            for (int j = 1; j <= 1; j++) {
                //print star
                System.out.print("**");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = i; j < n; j++) {
                //print space
                System.out.print("");
            }
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
