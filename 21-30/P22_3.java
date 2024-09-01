public class P22_3 {
    public static void main(String[] args) {
        
        int n=5;

        for (int i = 0; i < n; i++) {
            // Print stars on the left side
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }

            // Print spaces in the middle
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print(" ");
            }

            // Print stars on the right side
            for (int l = 0; l < n - i; l++) {
                System.out.print("*");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
