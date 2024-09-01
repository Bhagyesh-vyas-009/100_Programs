import java.util.Scanner;

public class P11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter units :");
        float n = sc.nextInt();
        float amt = 0.0f;

        if (n <= 200) {
            amt = (float) (n * 0.80);
        }
        if (n > 200 && n <= 300) {
            amt = (200F * 0.8F) + (float) ((n-200)*0.90);
        }
        if(n>300){
            amt=(200F * 0.8F) + (100F * 0.9F) + (n-300);
        }
        amt+=100;

        if(amt>300){
            amt+=(float)((amt*12.36)/100);
        }

        System.out.println("Total Biil = "+amt);
    }
}
