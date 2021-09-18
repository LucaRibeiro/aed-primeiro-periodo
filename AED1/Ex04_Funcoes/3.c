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
	int lower = min(a,b);

	return (higher - lower);
}

int main(){
	int a,b;

	printf("\nInsira dois valoress: ");
	scanf("%i", &a);
	scanf("%i", &b);
	int difference = diff(a,b);

	printf("\nDiferenca: %i", difference);
	return 0;

}
