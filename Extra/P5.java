import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n :");
        int n = sc.nextInt();

        int ans = 0;
        for (int i = 0; i <= n; i++) {
            ans += i;
            System.out.print(ans + " ");
        }
    }
}
