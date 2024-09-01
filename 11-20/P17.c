#include<stdio.h>

void main(){
	
	int a[]={2,4,6,2,0,1,3,44},i,j,min,temp;
	int n=sizeof(a)/sizeof(a[0]);
	
	for(i=0;i<n-1;i++){
		min=i;
		for(j=i+1;j<n;j++){
			if(a[min]>a[j])
			{
				min=j;	
			}	
		}
		if(min!=i){
			temp=a[min];
			a[min]=a[i];
			a[i]=temp;
		}
	}
	
	for(i=0;i<n;i++){
		printf("%d,",a[i]);
	}
}
