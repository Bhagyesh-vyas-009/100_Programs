import java.util.Scanner;

public class OddEvenBitwise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n1 :");
        int n=sc.nextInt();    


        System.out.println(((n & 1)==0)?n+" is Even":n+ " is Odd");
}
}
