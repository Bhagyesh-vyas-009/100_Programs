import java.util.Scanner;

public class P12 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n1 :");
        int n1=sc.nextInt();
        System.out.print("Enter n2 :");
        int n2=sc.nextInt();
        int sum=0;
        sum=(n1%10)+(n2%10);
        System.out.println("Sum = "+sum);
    }
}
