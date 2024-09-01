#include<stdio.h>

void main(){
	
	int a[]={2,4,6,2,0,1,3,44},i,j,temp;
	int n=sizeof(a)/sizeof(a[0]);
	
	for(i=1;i<n;i++){
		j=i-1;
		temp=a[i];
		while(j>=0 && a[j]>temp){
			a[j+1]=a[j];
			j--;
		}
		a[j+1]=temp;
	}
	
	for(i=0;i<n;i++){
		printf("%d,",a[i]);
	}
}
