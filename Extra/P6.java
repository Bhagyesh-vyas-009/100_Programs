import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array :");
        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] : ");
            a[i] = sc.nextInt();
        }
        int oddsum = 0,evensum=0;
        for(int i=0;i<n;i++){
            if(a[i]%2==0)
                evensum+=a[i];
            else
                oddsum+=a[i];
        }
        System.out.println("Odd Sum = "+oddsum);
        System.out.println("Even Sum = "+evensum);
    }
}
