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

