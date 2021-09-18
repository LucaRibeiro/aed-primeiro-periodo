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
