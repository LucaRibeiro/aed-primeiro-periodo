## [Questão 1](./1.c)

### Ímpares decrescente

Crie uma função recursiva que tenha como entrada um inteiro qualquer e retorne todos os ímpares, menor ou igual ao número dado até 1.

```
Gabarito:
Digite um valor: 10
Saída: 9, 7, 5, 3, 1
```

### Solução

```c
#include <stdio.h>

void lastOdd(int number){
    if (number > 1){
        if (number % 2 == 1){
            printf("%i, ", number);
        }
        lastOdd(number - 1);
    } else {
        printf("%i\n", number);
    }
}

int main(const char *args){
    int input;
    printf("Digite um valor: ");
    scanf("%i", &input);

    lastOdd(input);

    return 0;
}
```

## [Questão 2](./2.c)

### Texto invertido

### Solução

```c
#include <stdio.h>
#include <string.h>

void swapCharacter(char* x, char* y) {
    char aux = *x;
    *x = *y;
    *y = aux;
}

void invertString(char* string, int position) {
    static int i = 0;

    // if the end of the string is reached
    if (*(string + position) == '\0') {
        return;
    }

    invertString(string, position + 1);

    if (i <= position) {
        swapCharacter(&string[i++], &string[position]);
    }
}

int main() {
    char string[50];

    fgets(string, 50, stdin);

    invertString(string, 0);

    printf("%s", string);
    return 0;
}
```

## [Questão 3](./3.c)

### Fatorial

Escreva uma função recursiva que dado um número inteiro, retorne o valor fatorial desse número, sabendo que:

!0 = 1

!1 = 1

!2 = 2 \* 1 = 2

!3 = 3 \* 2 \* 1 = 6

!n = n \* (n - 1) \* (n - 2) ... \* 3 \* 2 \* 1

```
Gabarito:

Digite um valor: 5
O fatorial de 5 é: 120
```

### Solução

```c
#include <stdio.h>
#include <string.h>

int fatorial(int resultado, int multiplicador) {
    if (multiplicador > 0) {
        resultado = resultado * multiplicador;
        multiplicador--;
        return fatorial(resultado, multiplicador);
    }
    return resultado;
}

int main() {
    int numero, resultado = 1;

    printf("Insira o numero:");
    scanf("%i", &numero);

    resultado = fatorial(resultado, numero);

    printf("%i! = %i", numero, resultado);
    return 0;
}
```

## [Questão 4](./4.c)

### Torre de hanoi

Torres de Hanoi é um exemplo de jogo que pode ser resolvido por recursividade.
O quebra-cabeça foi inventado pelo matemático francês Édouard Lucas em 1883 e seu nome foi inspirado na torre símbolo da cidade de Hanói, no Vietnã.
Formado por três pinos, em um dos quais estão discos em ordem de tamanho. O problema consiste em passar todos os discos de um pino para outro qualquer, usando um dos pinos como auxiliar, um disco maior nunca deve fique em cima de outro menor

[Toore de Hanoi](./assets/hanoi.png)

Escreva um programa que utilize funções recursivas para resolver a torre de hanoi. O programa deve exibir como devem ser realizadas as movimentações de um dos 3 pinos como origem para um dos três pinos como destino.

Na função hanoi (gabarito) o primeiro parâmetro representa o número de discos (3), o segundo, o número do pino origem (1), o terceiro, o pino destino (3) e o quarto o pino trabalho (2).

```
Gabarito:
Chamada da função: hanoi(3, 1, 3, 2);
move: origem 1 para 3
move: origem 1 para 2
move: origem 3 para 2
move: origem 1 para 3
move: origem 2 para 1
move: origem 2 para 3
move: origem 1 para 3
```

### Solução

```c
#include<stdio.h>

void hanoi(int n, int x, int y, int z) {
    if (n > 0) {
        hanoi(n - 1, x, z, y);
        printf("\nmove: origem %i para %i", x, y);
        hanoi(n - 1, z, y, x);
    }
}

int main() {
    printf("Chamada da função: hanoi(3, 1, 3, 2);");
    hanoi(3, 1, 3, 2);
}
```
