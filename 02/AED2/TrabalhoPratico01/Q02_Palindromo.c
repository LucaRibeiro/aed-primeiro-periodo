#include <stdio.h>
#include <string.h>

/** if string is Palindrome print "SIM", else print "NAO"; */
void isPalindrome(char str[])
{
    
    int len = strlen(str) - 1;
 
    for (int i = 0;i < len; i++){
		/** If char at position isn't equal its mirror print NAO*/
        if (str[i] != str[len-i]){
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
