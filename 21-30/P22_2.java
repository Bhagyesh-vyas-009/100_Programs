import java.util.Scanner;
public class P22_2 
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	
		System.out.print("Enter n : ");
		int n=sc.nextInt();

		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j <= n * 2 - 1; j++)
			{
				if (j >= i && j <= n * 2 - i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
