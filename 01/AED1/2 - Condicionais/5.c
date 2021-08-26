#include <stdio.h>
#include <math.h>

int main(void)
{
	double salario, aliquota = 0;
	
	// Recebe o salÃ¡rio
	printf("Digite seu salÃ¡rio: ");
	scanf("%lf", &salario);

	// Calcula a taxa com base no salario
		if(salario >= 0 && salario <= 1100){
			aliquota += salario * 0.075;
		}else if(salario >= 1100.01 && salario <= 2203.45){
			// Valor referente a primeira faixa (1100 * 0.075)
			aliquota += 82.50;
			// Valor faltante
			aliquota += (salario - 1100) * 0.09; 
		}else if(salario >= 2203.49 && salario <= 3300.22){
			// Valor referente a primeira e segunda faixa (1.103.48 * 0.09)
			aliquota += 82.50 + 99.31;
		        // Valor faltante
			aliquota += (salario - 2203.48) * 0.12;	
		}else if(salario >= 3305.23 && salario <= 6433.57){
			// Valor referente a primeira e segunda faixa (1.103.48 * 0.09)
			aliquota += 82.50 + 99.31 + 132.21;
		        // Valor faltante
			aliquota += (salario - 3305.23) * 0.14;
		} else{
			// Valor mÃximo a ser pago
			aliquota += 82.50 + 99.31 + 132.21 + 437.97;
		}
	
	// Imprime os resultados
	printf("\nAli­quoa do INSS: %.2lf", aliquota);

	return 0;
}
