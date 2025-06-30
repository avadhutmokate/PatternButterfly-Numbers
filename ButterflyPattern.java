public class ButterflyPattern {
    public  static void main(String args[]) {
    int n = 5;

        for (int i = 1; i <= n; i++) {
            // Left side increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Spaces in between
            int spaces = 2 * (n - i);
            for (int s = 1; s <= spaces; s++) {
                System.out.print(" ");
            }

            // Right side decreasing numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}














