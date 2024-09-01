//WAP to find a factorial of a given integer (iterative and recursive)

//WAP to find a Factor of a given number (iterative and recursive)

#include<stdio.h>

void factorial(int num){
	int i;
	int ans=1;
	for(i=1;i<=num;i++)
	{
		ans=ans*i;
	}
	printf("Factorial = %d",ans);
}

int factorialRecursive(int num)
{
	
	if(num==1){
		return 1;
	}
	else
		return num*factorialRecursive(num-1);

}
void main()
{
	int num,i;
	printf("Enter Number : ");
	scanf("%d",&num);
	
	i=factorialRecursive(num);
	printf("Factorial = %d",i);6
	76
	
}
