#include <stdio.h>
#include <stdlib.h>

int max(int a, int b){
	if(a > b){
		return a;
	}
	return b;
}

int min(int a, int b){
	if(a < b){
	    return a;
	}
	return b;	
}

int diff(int a, int b){
	int higher = max(a,b);
    printf("\n %i eh o maior", higher);
	
	int lower = min(a,b);
	printf("\n %i eh o menor", lower);

	return (higher - lower);
}

int main(){
	int a,b;

	printf("\nInsira o primeiro numero: ");
	scanf("%i", &a);
	printf("\nInsira o segundo numero: ");
	scanf("%i", &b);
	int difference = diff(a,b);

	printf("\nA diferenca entre os numeros %i e %i eh %i", a, b, difference);
	return 0;

}
