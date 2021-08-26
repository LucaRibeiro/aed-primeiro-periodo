#include <stdio.h>
#include <math.h>

int main(void) {
    float lado, area, altura, perimetro=0;

    puts("Lado: ");
    scanf("%f", &lado);

    perimetro = lado * 3; 
    altura = ( lado * sqrt(3) ) / 2;
    area =  ( lado * sqrt(3) ) / 4;
    
    printf("\nPerimetro: %.2f", perimetro);
    printf("\nAltura: %.2f", altura);
    printf("\nArea: %.2f", area);
   return 0;
}
