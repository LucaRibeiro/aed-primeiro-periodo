## [Question 1](./1.c)

Escreva uma função que receba um número inteiro como parâmetro e escreva se o número dado é par ou ímpar.

```c
#include <stdio.h>

void isOdd (int number){
    if(number % 2 == 0){
        printf("\nO numero e par");
    } else {
        printf("\nO numero e impar");
    }
}

int main (){
	int number;
	printf("Informe um numero:");
	scanf("%i", &number);
    isOdd(number);
    return 0;
}
```

## [Question 2](./2.c)

Escreva um programa que chame uma função que execute uma lista de comandos do sistema. A função deve criar três pastas: exercicio, avaliacoes e notas.

```c
#include <stdio.h>
#include <stdlib.h>

void makeFolders(){
	#ifdef _WIN32
		system("md exercicio; md avaliacoes; md notas");
	#else
		system("mkdir exercicio; mkdir avaliacoes; mkdir notas");
	#endif
}

int main(){
	makeFolders();
	return 0;
}
```

## [Question 3](./3.c)

Escreva uma função que calcule a diferença dentre dois valores "a" e "b". A função diff(a, b) é definida por: max(a, b) - min(a, b). Crie também as funções max e min que retorna o maior e o menor valor entre "a" e "b", respectivamente.

```c
#include <stdio.h>
#include <stdlib.h>

int max(int a, int b){
	if(a > b){
		return a;
	}
	return b;
}

int min(int a, int b){
	if(a < b){
	    return a;
	}
	return b;
}

int diff(int a, int b){
	int higher = max(a,b);
    printf("\n %i eh o maior", higher);

	int lower = min(a,b);
	printf("\n %i eh o menor", lower);

	return (higher - lower);
}

int main(){
	int a,b;

	printf("\nInsira o primeiro numero: ");
	scanf("%i", &a);
	printf("\nInsira o segundo numero: ");
	scanf("%i", &b);
	int difference = diff(a,b);

	printf("\nA diferenca entre os numeros %i e %i eh %i", a, b, difference);
	return 0;

}
```

## [Question 4](./4.c)

A fórmula de Bhaskara é um cálculo matemático para determinar as raízes de uma função de segundo grau na forma ax² +bx + c = 0, por meio de seus coeficientes (a, b, c).
Escreva uma versão do programa que aplica a fórmula de Bhaskara utilizando funções da seguinte forma:

- No programa principal peça ao usuário para digitar os valores de a, b e c.
- Escreva uma função que receba o valor de "a" e imprima sua relação com a forma da parábola:
  - Se a > 0, parábola voltada para cima
  - Se a < 0, parábola voltada para baixo
  - Se a = 0, equação de 1º grau
- Escreva uma função que receba os valores de a, b e c e retorne o valor de delta.
  - ∆ = b² - 4*a*c (discriminantes)
- Escreva uma função que receba o valor de delta e imprima o número de raízes possíveis.
  - ∆ > 0; duas raízes. A parábola toca a reta x em dos pontos (x é secante à parábola)
  - ∆ = 0, uma única raiz (o vértice da parábola toca a reta x)
  - ∆ < 0; a parábola não toca a reta x.
- Escreva uma função que receba os valores de a, b e delta (se delta >= 0) por valor e retorne os valores de x1 e x2 por referência.
  x1 = -b + √(∆) / 2*a (Bhaskara) Raízes da equação
  x2 = -b - √(∆) / 2*a (Bhaskara) Raízes da equação

- Escreva uma função que receba os valores de a, b e delta e calcule os valores de x e y do vértice passados por referência.
  - xv = -b / 2 \* a (ponto localizado no vértice da parábola)
  - yv = -∆ / 4 \* a

```c

```
