import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        factorOfN(n);
        recFactorOfN(n, 1);
    }

    public static void factorOfN(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + ",");
            }
        }
    }

    public static void recFactorOfN(int n, int i) {
        if (i > n)
            return;
        if(n%i==0)
            System.out.print(i+",");

        recFactorOfN(n, i+1);
    }
}
