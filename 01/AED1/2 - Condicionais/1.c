#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(void){
	srand(time(NULL));
	int num1 = rand() % 10 + 1;
	int num2;	
	printf("Adivinhe o numero:");
	scanf("%i",&num2);

	if(num1 == num2){
		puts("Parabéns você acertou!");
	} else if(num2 < num1){
		puts("Você errou, chute baixo!");
	}else{
		puts("Você errou, chute alto!");
	}
	printf("O número era: %i\n", num1);
	puts("Fim do jogo");
    	return 0;
}
