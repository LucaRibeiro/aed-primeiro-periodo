#include <stdio.h>
#include <math.h>

int main(void)
{
    float fahrenheit, celsius;

    printf("Digite um valor em Fahrenheit: ");
    scanf("%f", &fahrenheit);

    celsius = (fahrenheit - 32) * 5/9;

    printf("\nA temperatura e %.2f celsius", celsius);
    return 0;
}