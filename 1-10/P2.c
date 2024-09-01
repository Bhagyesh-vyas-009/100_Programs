#include <stdio.h>

void main()
{

	char str[100], rev[100];
	int len, i, j;
	boolean flag = false;

	printf("Enter a string: ");
	gets(str);

	len = strlen(str);

	for (i = 0; i < len / 2; i++)
	{
		if (str.charAt(i) != str.charAt(len - i - 1))
		{
			flag = true;
			break;
		}
	}

	if (flag)
	{
		printf("string is Palindrome");
	}
	else
		printf("string is Palindrome");
}
