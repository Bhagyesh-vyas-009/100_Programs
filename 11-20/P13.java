import java.util.Scanner;

public class P13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int r1, c1, r2, c2;
        System.out.print("Enter row dimension of matrix-1 : ");
        r1 = sc.nextInt();
        System.out.print("Enter column dimension of matrix-1 : ");
        c1 = sc.nextInt();
        
        System.out.print("Enter row dimension of matrix-2 : ");
        r2 = sc.nextInt();
        System.out.print("Enter column dimension of matrix-2 : ");
        c2 = sc.nextInt();
        int[][] m1 = new int[r1][c1];
        int[][] m2 = new int[r2][c2];
        
        if (c1 != r2) {
            System.out.println("matrix multiplication not possible");
            return;
        }
        int[][] c = new int[r1][c2];
            System.out.println("Enter Elements of matrix-1 :");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    m1[i][j] = sc.nextInt();
                }
            }

            System.out.println("Enter Elements of matrix-2 :");
            for (int i = 0; i < r2; i++) {
                for (int j = 0; j < c2; j++) {
                    m2[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    c[i][j]=0;
                    for(int k=0;k<c1;k++)
                    {
                        c[i][j]+=m1[i][k]*m2[k][j];
                    }
                }
            }

            
        

        System.out.println("Result Matrix");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                
                System.out.print(c[i][j]+" " );
                System.out.println();
            }
        }
    }
}
