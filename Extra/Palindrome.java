public class Palindrome {

    public static void main(String[] args) {

        int a = 121, rev = 0, ri;
        int temp=a;

        while (temp > 0) {
            ri = temp % 10;
            rev = rev * 10 + ri;
            temp = temp / 10;
        }
        if(rev==a){
            System.out.println("is palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
