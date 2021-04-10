## Question 1
```c#
#include <stdio.h>
#include <string.h>

int main(void){
	// Lista de consoantes e vogais separadas por espa�o
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
		// Verifica a posi�ãoda letra na lista de vogais/consoantes
		// retorna "NULL" se não existir ocorrenci,caso contáio 
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
```

## Question 2
```c#
#include <stdio.h>

int main(void){
	int menu;
	float total = 0;
	do{
		puts("Peca pelo número");
		puts("0 - Sair");
		puts("1 - Pounder");
		puts("2 - Quarter");
		puts("3 - Crispy");
		puts("4 - Chiken");
		puts("5 - Nogget");
		scanf("%i", &menu);
	
		switch (menu){
			case 0:
				break;
			case 1:
				puts("Pounder: $5.49");
				total += 5.49;
				break;
			case 2:
				puts("Quarter: $6,49");
				total += 6.49;
				break;
			case 3:
				puts("Crispy:  $5,89");
				total += 5.89;
				break;
			case 4:
				puts("Chiken:  $6,19");
				total += 6.19;
				break;
			case 5:
				puts("Nogget:  $6,19");
				total += 6.19;
				break;
			default:
				puts("Opcao invalida...");
		}
		printf("\n\nTotal: %.2f", total);
	}while(menu != 0);

	return 0;
}
```

## Question 3
```c#
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
```

## Question 4

```c#

#include <stdio.h>

int main(void){

	char dias[7] = {'D','S','T','Q','Q','S','S'};
	int vitaminas[5] = {1,2,3,4,5};
	int j = 0;
	for(int i = 0; i != 7; i++){
		printf("\nDia %c: ", dias[i]);
		for(int horas = 6; horas != 18; horas += 3){
			printf("[%ih Vitamina: %i]",horas,vitaminas[(j % 5)] );
			j++;
		}
	}
	return 0;
}
```
