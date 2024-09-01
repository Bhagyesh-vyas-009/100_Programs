import java.util.Scanner;

public class P14 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=sc.nextInt();

        if(n>0){
            System.out.print(((n&1)==0)?n+" is Even":n+" is Odd");
        }
        else
        {
            System.out.println("Number must be positive");
        }
    }
}
