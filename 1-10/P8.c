//WAP to find a total odd and total even digit of a given number.

#include<stdio.h>

void main(){
	
	int a[5],i,j,min,temp,oddc=0,evenc=0;
	int n=sizeof(a)/sizeof(a[0]);
	printf("Enter");
	for(i=0;i<n;i++){
		scanf("%d",&a[i]);
	}
	for(i=0;i<n;i++){
		if(a[i]%2==0){
			evenc+=1;
		}	
		else{
			oddc+=1;
		}
	}
	
	for(i=0;i<n;i++){
		printf("%d,",a[i]);
	}
	
	printf("Odd count = %d, Even Count = %d",oddc,evenc);
}
