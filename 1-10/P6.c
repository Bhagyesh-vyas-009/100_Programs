//Print a following pattern
//1
//1 2
//1 2 3
//1 2 3 4

#include<stdio.h>

void main(){
	
	int i=1,j,row;
	printf("Enter row : ");
	scanf("%d",&row);
	
	for(i=1;i<row;i++){
		for(j=1;j<=i;j++){
			printf("%d ",j);
		}
		printf("\n");
	}
}
