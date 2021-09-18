#include <stdio.h>
#include <string.h>

int main(void){
	// Lista de consoantes e vogais separadas por espa√o
	const char vogais[] = "a e i o u w y";
      	const char consoantes[] = "b c d f g h j k l m n p q r s t v w x z";
	// Numero de consoantes e vogais;
	int numero_vogais = 0, numero_consoantes = 0;
	// Declara e recebe valor para palavra
	char palavra[20];
	printf("A palavra:");
	scanf("%s", palavra);
	
	// Executa para cada letra dentro da palavra
	for(int i = 0; i < strlen(palavra); i++ ){
		// Verifica a posi√√£oda letra na lista de vogais/consoantes
		// retorna "NULL" se n√£o existir ocorrenci,caso cont√°io 
		// aumenta o contador de vogais/consoantes 
		if(strchr(vogais,palavra[i]) != NULL){
			numero_vogais++;
		}else if (strchr(consoantes,palavra[i]) != NULL){
			numero_consoantes++;
		}
	}
	printf("Possui:	%i vogais e %i consoantes", numero_vogais, numero_consoantes);
	return 0;
}
