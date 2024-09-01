// WAP to convert a Binary to Decimal. 

public class P26 {

    public static void main(String[] args) {
        int bin[] = { 0, 0, 0, 1 }, ind = 0, sum = 0;
        int n = bin.length;

        for (int i = 0; i < n; i++) {
            sum += 2 ^ ind * i;
            ind++;
        }
        System.out.println("Sum = " + sum);
    }
}
