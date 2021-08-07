#include <stdio.h>

int main(void)
{
    float distancia, kmL, precoCombustivel, precoPedagios, totalViagem;

    printf("Digite a distancia: ");
    scanf("%f", &distancia);

    printf("Informe o gasto medio do veiculo(km/L):  ");
    scanf("%f", &kmL);

    printf("Informe o custo do combustivel(R$/L): ");
    scanf("%f", &precoCombustivel);

    printf("Informe total de pedagios: ");
    scanf("%f", &precoPedagios);

    totalViagem = distancia * precoCombustivel / kmL + precoPedagios;
    printf("A viagem custara: %.2f", totalViagem);
    return 0;
}
