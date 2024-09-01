#include<stdio.h>

void main()
{
    int a[5],i,sum=0;
    int n=sizeof(a)/sizeof(a[0]);

	printf("Enter elements : \n");
    for(i=0;i<n;i++){
    	
        scanf("%d",&a[i]);
        if(a[i]%2==0){
        	sum+=a[i];
		}
    }

	printf("Sum = %d",sum);
//    for(i = 0; i < n; i++)
//    {
//        printf("%d", a[i]);
//    }
}
