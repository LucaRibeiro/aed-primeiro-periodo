#include <stdio.h>
#include <string.h>

int main(void){
	char frase[1000];
	
	puts("Entrada: ");
	gets(frase);
	
	int tamanho = strlen(frase);

	for(int i = tamanho; i >= 0; i--){
		printf("%c", frase[i]); 
	}

	return 0;
}
