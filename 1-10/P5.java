import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        sumOfDigit(n);
        int sum=recSumOfDigit(n);
        System.out.println("Sum = " + sum);
    }
    public static void sumOfDigit(int n){
        int ri=0,sum=0;
        while(n>0){
            ri=n%10;
            sum+=ri;
            n=n/10;
        }
        System.out.print("Sum = "+sum);
    }

    public static int recSumOfDigit(int n) {
        
        if(n==0)
            return 0;
        
        return ((n%10)+recSumOfDigit(n/10));
    }   
}
