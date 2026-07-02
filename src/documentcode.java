public class documentcode {
    public static void main(String[] args) {
        int size = 15 ; // controls the size of the heart
        // this code from AI not person
        for (int i = size / 2; i <= size; i += 2) {
            // left spacing
            for (int j = 1; j < size - i; j += 2) {
                System.out.print(" ");
            }
            // left half of heart
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // middle spacing
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            // right half of heart
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Bottom part of the heart
        for (int i = size; i >= 0; i--) {
            // left spacing
            for (int j = i; j < size; j++) {
                System.out.print(" ");
            }
            // bottom part
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
