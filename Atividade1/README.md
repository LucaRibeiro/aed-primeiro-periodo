## Question 1

````c#
#include <stdio.h>

int main(void) {
    char nomeCompleto[100];
    puts("Digite seu nome completo: ");
    gets(nomeCompleto);
    printf("Ola, %s", nomeCompleto);
   return 0
}

````

## Question 2

````c#
#include <stdio.h>
#include <math.h>

int main(void) {
    float lado, area, altura, perimetro=0;

    puts("Lado: ");
    scanf("%f", &lado);

    perimetro = lado * 3; 
    altura = ( lado * sqrt(3) ) / 2;
    area =  ( lado * sqrt(3) ) / 4;
    
    printf("\nArea: %.2f", area);
    printf("\nPerimetro: %.2f", perimetro);
    printf("\nAltura: %.2f", altura);
   return 0;
}
````

## Question 3

````c#
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

````

## Question 4

````c#
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

````

## Question 5

````c#
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

````

## Question 6

````c#
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

````

## Question 7

````c#
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

````

## Question 8

````c#
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
````