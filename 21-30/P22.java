public class P22 {

    public static void main(String[] args) {

        int n = 5;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * (n - i) - 1); k++) {
                System.err.print("*");
            }
            System.out.println();
        }
    }
}
