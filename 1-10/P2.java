import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String : ");
        String str=sc.nextLine();
        checkPalinString(str);
    }

    public static void checkPalinString(String str){
        int i, j;
        for (i = str.length() - 1, j = 0; i >= 0 && j < str.length(); i--, j++) {
            if (str.charAt(i) != str.charAt(j)) {
                System.out.println("String is not Palindrome");
                return;
            }
        }
        System.out.println("String is Palindrom");
    }
}
