#include <stdio.h>
#include <math.h>

#define GRAVIDADE 9.81

int main(void) {
    int segundos;
    float distancia;

    printf("Entre com o tempo de queda: ");
    scanf("%i", &segundos);

    distancia = (pow(segundos, 2) * GRAVIDADE)/2;

    printf("\nDistancia percorrida de: %.2f m", distancia);
   return 0;
}
