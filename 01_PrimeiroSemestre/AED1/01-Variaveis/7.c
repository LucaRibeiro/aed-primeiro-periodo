#include <stdio.h>
#include <math.h>
#define PI 3.1415

int main(void)
{
    double grau, radianos;
    
    printf("Digite o grau: ");
    scanf("%lf", &grau);

    radianos = grau*PI/180;

    printf("\nSeno: %.2f", sin(radianos));
    printf("\nCosseno: %.2f", cos(radianos));
    printf("\nTangente: %.2f", tan(radianos));

    return 0;
}
