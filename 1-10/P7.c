//WAP to find a Fibonacci series up to n terms (n is entered by user) (iterative and recursive)

#include<stdio.h>

int fiboRec(int num){
	if(num==0)
		return 0;
	else if(num==1)
		return 1;
	else
		return fiboRec(num-1)+fiboRec(num-2);
}
void main()
{
    int n1=0,n2=1,n3=0,n,i;
    

	printf("Enter n : ");
	scanf("%d",&n);
	
//	printf("%d %d ",n1,n2);
//	
//    for(i=2;i<10n;i++){
//    	n3=n1+n2;
//    	printf("%d ",n3);
//    	n1=n2;
//    	n2=n3;
//    }
	for (i = 0; i < n; i++) {
        printf("%d ", fiboRec(i));
    }
    printf("\n");
}
