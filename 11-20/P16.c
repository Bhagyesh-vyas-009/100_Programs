#include<stdio.h>

void main(){
	
	int a[]={2,4,0,1,3,44},i,j,temp;
	int n=sizeof(a)/sizeof(a[0]);
	
	for(i=0;i<n;i++){
		for(j=0;j<n-i-1;j++){
			if(a[j]>a[j+1])
			{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;	
			}	
		}
	}
	
	for(i=0;i<n;i++){
		printf("%d,",a[i]);
	}
}
