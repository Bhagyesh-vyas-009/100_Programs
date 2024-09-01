import java.util.Scanner;
public class P9 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n=sc.nextInt();

        int temp=n/2;
        if(temp*2==n){
            System.out.println(n+" is even");
        }
        else{
            System.out.println(n+" is odd");
        }          


        // if ((n & 1) == 0) {
        //     System.out.println(n+ " Is Even");
        // } else {
        //     System.out.print(n+" Is Odd");
        // }

    }
}