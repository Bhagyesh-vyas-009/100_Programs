import java.util.Scanner;

public class P23 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n=sc.nextInt();
        int a[]=new int[n+1];

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        System.out.print("Enter position : ");
        int pos = sc.nextInt();
        System.out.print("Enter element : ");
        int ele = sc.nextInt();
        
        for(int i=(n-1);i>=(pos-1);i--){
            a[i+1]=a[i];
        }
        a[pos-1]=ele;

        for (int i = 0; i < n + 1; i++) {
            System.out.print(a[i]+" ");
        }

    }
}
