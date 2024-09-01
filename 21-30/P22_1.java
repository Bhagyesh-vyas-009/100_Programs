public class P22_1 {
    public static void main(String[] args) {
        
        int rows=4;
        int n=1;
        char letter='A';

        for(int i=1;i<=rows;i++){
            for(int k=n;k>=i;k--){
                System.out.print(" ");
            }
            if(i%2!=0){
                for(int j=1;j<=i;j++)
                {
                    System.out.print(n + " ");
                    n++;
                }
            }
            else{
            
        
                for(int j=1;j<=i;j++)
                {
                    System.out.print(letter + " ");
                    letter++;
                }
            }
            System.out.println();
        }
    }
}
