//WAP to find a Factor of a given number (iterative and recursive)

#include<stdio.h>

void factor(int num){
	int i;
	printf("Factors of %d :",num ," = ");
	for(i=1;i<=num;i++)
	{
		if(num%i==0)
			printf("%d ",i);
	}
	
}

void factorRecursive(int num,int i)
{
	if(i>num){
		return;
	}
	if(num%i==0){
		printf("%d ",i);
	}
	
	factorRecursive(num,i+1);
}
void main()
{
	int num,i;
	printf("Enter Number : ");
	scanf("%d",&num);
	
	factorRecursive(num,1);
	
}
