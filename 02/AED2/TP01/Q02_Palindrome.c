#include <stdio.h>
#include <string.h>

/**
 * Verify if string is Palindrome
 * @param str string to verify
 * @return if string is palindrome return true, else return false
 */
void isPalindrome(char str[]){
	int len = strlen(str) - 1;

	for (int i = 0; i < len; i++)
	{
		if (str[i] != str[len - i])
		{
			printf("NAO\n");
			return;
		}
	}
	printf("SIM\n");
}

int main(){
	char str[1000];

	while (1)
	{
		fgets(str, sizeof str, stdin);
		str[strcspn(str, "\n")] = 0;

		if (strcmp(str, "FIM") == 0)
			return 1;

		isPalindrome(str);
	}
	return 1;
}
