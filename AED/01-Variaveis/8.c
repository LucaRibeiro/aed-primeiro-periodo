#include <stdio.h>
#include <math.h>

#define TAXA 0.08
#define JUROS 0.0025
#define MULTA 0.4

int main()
{
    int meses;
    float salario, depositoMensal, saldoCorrigido, multa, total;

    printf("\nInforme o periodo em meses: ");
    scanf("%i", &meses);

    printf("\nInforme o valor do salario base: ");
    scanf("%f", &salario);

    depositoMensal = salario * TAXA;

    printf("\nDeposito mensal R$: %.2f", depositoMensal);

    saldoCorrigido = (depositoMensal * (1 + JUROS) * (pow((1 + JUROS), meses) - 1)) / JUROS;

    printf("\nSaldo Corrigido R$%.2f", saldoCorrigido);

    multa = saldoCorrigido * MULTA;

    printf("\nMulta por demissao R$%.2f", multa);

    total = saldoCorrigido + multa;

    printf("\nTotal FGTS mais 40%c de multa: %.2f", '%',total);

    return 1;
}