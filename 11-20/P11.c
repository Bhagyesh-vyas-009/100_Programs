#include<stdio.h>

void main(){
	
	int num=123,temp,ri,n=0,sum;
	
	temp=num;
	while(temp!=0)
	{
		temp/=10;
		++n;
	}
	
	temp=num;
	
	while(temp>0){
		ri=temp%10;
		sum+=pow(ri,n);
		temp/=10;
	}


	if(sum==num){
		printf("Armstrong");
	}
	else{
		printf("Not Armstrong");
	}
	
	
}
