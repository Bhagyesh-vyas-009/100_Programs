// WAP to find a summation of a digit of a given number. (Iterative and recursive) 

#include<stdio.h>

void main()
{
	int num=123,temp,sum=0,ri=0,d=0;
	temp=num;
	
	while(num>0){
		ri=num%10;
		sum=10*ri+d;
		d=num/10;
	}
	printf("sum = %d",sum);
}
