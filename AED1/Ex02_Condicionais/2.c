#include <stdio.h>

int main(void){
	int num1, num2;	
	printf("Infome o primeiro numero:");
	scanf("%i",&num1);

	printf("Infome o segundo numero:");
	scanf("%i",&num2);
	
	int result, soma = num1 + num2; 
	
	if(soma > 5 && soma <= 10){
		 result = soma + 5;
	} else {
		result = soma - 3;
	}
	printf("%i", result);
    	return 0;
}
