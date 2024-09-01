import java.util.Scanner;

public class P24{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int a[] = new int[n + 1];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter element to delete : ");
        int ele = sc.nextInt();
        int ind=0;
        for(int i=0;i<n;i++){
            if(a[i]==ele){
                ind=i;
            }
        }
        if(ind==0){
                System.out.println("element not found");
            }

        for (int i = ind; i<n; i++) {
                a[i]=a[i+1];
        }    
        n-=1;
        

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
