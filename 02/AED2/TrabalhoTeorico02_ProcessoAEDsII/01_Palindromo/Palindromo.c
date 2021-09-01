#include <stdio.h>
#include <string.h>

void isPalindrome(char str[])
{
    int i = 0;
    int len = strlen(str) - 1;
 
    while (len > i){
        if (str[i++] != str[len--]){
        	printf("NAO\n");
            return;
        }
    }
    printf("SIM\n");
}

int main(){
	char str[1000];
	
	while(1) {
		fgets(str, sizeof str, stdin);
		str[strcspn(str, "\n")] = 0;

		if(strcmp(str,"FIM") == 0)
			return 1;
		
		isPalindrome(str);
	}
	return 1;
}
