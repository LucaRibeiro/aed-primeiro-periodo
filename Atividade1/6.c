#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(void)
{
    int numeroIntegrantes;

    printf("Digite o numero de integrantes: ");
    scanf("%i", &numeroIntegrantes);

    srand(time(NULL));
    int sorteado = (rand() % numeroIntegrantes) + 1;

    printf("Valor aleatorio: %i", sorteado);
    return 0;
}
