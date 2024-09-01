import java.util.Scanner;

public class P13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n1 :");
        int n1=sc.nextInt();
        System.out.print("Enter n2 :");
        int n2 = sc.nextInt();
        System.out.print("Enter n3 :");
        int n3 = sc.nextInt();

        int first=(n1<n2 && n1<n3)?n1:(n2<n3)?n2:n3;
        int last= (n1 > n2 && n1 > n3) ? n1 : (n2 > n3) ? n2 : n3;
        int middle=(n1>first && n1<last)?n1:(n2>first && n2<last)?n2:n3;
        System.out.println(first+", "+middle +","+last);
    }
}
