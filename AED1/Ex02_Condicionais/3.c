#include <stdio.h>

int main(void)
{
	float altura, massa;
	
	printf("Infome o peso (Kg):");
	scanf("%f", &massa);

	printf("Infome a altura (m):");
	scanf("%f", &altura);

	float IMC = massa / (altura * altura);
	printf("Seu IMC é %.2f\n", IMC);	

	if (IMC < 10){
		puts("Desnutrição Grau V");
	}else if (IMC >= 10 && IMC < 13){
		puts("Desnutrição Grau IV");
	}else if (IMC >= 13 && IMC < 16){
		puts("Desnutrição Grau III");
	}else if (IMC >= 16 && IMC < 17){
		puts("Desnutrição Grau II");
	}else if (IMC >= 17 && IMC < 18.5){
		puts("Desnutrição Grau I");
	}else if (IMC >= 18.5 && IMC < 25){
		puts("Normal");
	}else if (IMC >= 25 && IMC < 30){
		puts("Pré-obesidade");
	}else if (IMC >= 30 && IMC < 35){
		puts("Obesidade Grau I");
	}else if (IMC >= 35 && IMC < 40){
		puts("Obesidade Grau II (Severa)");
	}else if (IMC >= 40){
		puts("Obesidade Grau III (Mórbida)");
	}

	return 0;
}
