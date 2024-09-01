import java.util.Scanner;

public class P10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter Number : ");
        // int n = sc.nextInt();
        // boolean flag=false;

        // for (int i = 2; i < n / 2; i++) {

        // if (n % i == 0) {
        // flag=true;
        // break;
        // }
        // }

        // if(flag){
        // System.out.println(n + " is Not Prime");
        // }
        // else{
        // System.out.println(n + " is Prime");
        // }

        int st, en;
        System.out.print("Enter Start range : ");
        st = sc.nextInt();
        System.out.print("Enter End range : ");
        en = sc.nextInt();

        // if (st < en) {
        // if (st < 2) {
        //     System.out.println("No prime numbers less than 2");
        // } else {
            for (int i = st; i <= en; i++) {
                boolean flag = true;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    System.out.print(i + ",");
                }

            }
        // }
        // } else {
        // System.out.println("Start range must be less then End range");
        // }

    }
}
