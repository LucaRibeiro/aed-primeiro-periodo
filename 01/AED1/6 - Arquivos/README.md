## [Questão 1](./1.c)

### Alfabeto

Escreva um programa em C que salve em arquivo as letras do alfabeto de A-Z (maiúsculas em ordem crescente) e z-a (minúsculas em ordem decrescente), separadas por vírgulas e cada grupo em uma linha conforme gabarito

```
Gabarito:
A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z,
z, y, x, w, v, u, t, s, r, q, p, o, n, m, l, k, j, i, h, g, f, e, d, c, b, a,
```

### Solução

```c
#include <stdio.h>
#include <stdlib.h>

int main(const char** args) {
    FILE* arquivo;
    arquivo = fopen("1.txt", "w");


    for (int i = 65; i <= 90; i++)
        fprintf(arquivo, "%c,", i);

    fprintf(arquivo, "\n");

    for (int i = 122; i >= 97; i--)
        fprintf(arquivo, "%c,", i);

    fclose(arquivo);
    return 0;
}
```

## [Questão 2](./2.c)

### Conta ocorrências de um dado caractere

Escreva um programa que leia um arquivo de texto e conte quantas vezes um dado caractere aparece. Tanto o nome do arquivo quanto o caractere devem ser informados pelo usuário.

```
Gabarito:

Informe o nome do arquivo:

aula.txt

Informe o caractere que deseja contar:

a

Encontrado(s) 8 caractere(s) a
```

### Solução

```c
#include <stdio.h>
#include <string.h>

int main(const char* args) {
    char nomeArquivo[100], caracter, c;
    int contador = 0;

    puts("Informe o arquivo(contendo o caminho completo ou caminho relativo):");
    fgets(nomeArquivo, 100, stdin);

    size_t tamanhoString;
    tamanhoString = strlen(nomeArquivo);

    // Remove o "\n" no final da variável
    if (nomeArquivo[tamanhoString - 1] == '\n')
        nomeArquivo[--tamanhoString] = 0;

    puts("Informe o caractere que deseja contar :");
    scanf("%c", &caracter);

    FILE* arquivo = fopen(nomeArquivo, "r");

    // Le todo o arquivo um caractere por vez
    while ((c = fgetc(arquivo)) != EOF) {
        printf("%c", c);
        if (c == caracter)
            contador++;
    }

    printf("Encontrado(s) %i caractere(s) %c", contador, caracter);

    return 0;
}

```

## [Questão 3](./3.c)

### Lista de Nomes

Escreva um programa com duas funcionalidades: adicionar nomes em um arquivo e listar apenas os nomes dada uma letra inicial. O usuário deve escolher entre uma das três opções. Ao escolher 1 deve poder entrar com um nome que será gravado em arquivo. Ao escolher 2, deve informar uma letra e o programa irá listar somente os nomes com essa letra inicial. Ao escolher 0 (zero) o programa termina.

```
Gabarito:

Digite: 0-sair, 1-adicionar nome, 2-buscar por inicial

1

Digite o nome:

Bárbara

Digite: 0-sair, 1-adicionar nome, 2-buscar por inicial

2

Digite uma inicial:

B

Bruno

Bárbara
```

### Solução

```c
#include <stdio.h>
#include <stdlib.h>

int main(const char** args) {
    FILE* arquivo;
    arquivo = fopen("3.txt", "a+");

    char nome[50], inicial, ** conteudoArquivo;
    int opcao, contador;

    do {
        puts("Digite:");
        puts("0 - Sair");
        puts("1 - Adicionar nome");
        puts("2 - Buscar por inicial");
        scanf("%i", &opcao);

        switch (opcao) {
        case 1:
            printf("Digite o nome:");
            fflush(stdin);
            fgets(nome, 50, stdin);
            fprintf(arquivo, nome);
            break;
        case 2:
            printf("Digite a inicial:");
            fflush(stdin);
            scanf("%c", inicial);

            while (fgets(nome, sizeof(nome), arquivo) != NULL) {
                printf("%s", nome);
            }
            break;
        }
    } while (opcao != 0);

    fclose(arquivo);
    return 0;
}
```

## [Questão 4](./4.c)

### 4. Fluxo de caixa (1,25 pts)

Escreva um programa para controle de entras e saídas. O programa deve apresentar ao usuário quatro opções: 1-entrada, 2-saída, 3-balanço, 0-sair. Escolhendo as opções 1 ou 2 (entrada ou saída), o usuário deve informar o valor. O valor deve ser salvo no arquivo conforme opção escolhida (entras.txt ou saidas.txt).Ao escolher a opção 3 (balanço) o programa deve somar todos os valores salvos em entradas.txt, somar todos os valores salvos em saidas.txt e calcular a diferença. Informe também se o balanço foi positivo ou negativo. O programa deve estar em loop até que o usuário escolha a opção 0 (sair)

```
Gabarito:

> > > > > > > > > Balanço: Escolha uma opção <<<<<<<<<

| 1-entrada | 2-saída | 3-balanço | 0 - sair |

1

Digite o valor de entrada:

4.74

> > > > > > > > > Balanço: Escolha uma opção <<<<<<<<<

| 1-entrada | 2-saída | 3-balanço | 0 - sair |

3

Balanço: Entradas (13.19), Saídas: (5.20) Saldo: (7.99) Balanço positivo
```

### Solução

```c
#include <stdio.h>
#include <string.h>

int main(const char* args) {
    float entras, saidas, ultimo, entras_soma = 0, saidas_soma = 0, balanceador;
    char line[50];
    int opcao;

    FILE* entras_arquivo = fopen("entras.txt", "a+");
    FILE* saidas_arquivo = fopen("saida.txt", "a+");

    do {
        puts("MENU");
        puts("1 - entrada");
        puts("2 - saída");
        puts("3 - balanço");
        puts("0 - sair");
        printf("Escolha: ");
        fflush(stdin);
        scanf("%i", &opcao);

        switch (opcao) {
        case 1:
            puts("Digite o valor de entrada:");
            fflush(stdin);
            scanf("%f", &entras);
            fprintf(entras_arquivo, "%f\n", entras);
            break;
        case 2:
            puts("Digite o valor de entrada:");
            fflush(stdin);
            scanf("%f", &saidas);
            fprintf(saidas_arquivo, "%f\n", saidas);
            break;
            break;
        case 3:
            while (fscanf(entras_arquivo, "%f", &entras) != 0) {
                if (ultimo == entras) {
                    break;
                }
                else {
                    entras_soma += entras;
                    ultimo = entras;
                }
            }
            ultimo = 0;
            while (fscanf(saidas_arquivo, "%f", &saidas) != 0) {
                if (ultimo == saidas) {
                    break;
                }
                else {
                    saidas_soma += saidas;
                    ultimo = saidas;
                }
            }
            balanceador = entras_soma - saidas_soma;

            char status[8];

            if (balanceador > 0) {
                strcpy(status, "positivo");
            }
            else {
                strcpy(status, "negativo");
            }
            printf("Balanço: Entradas (%f), Saídas: (%f) Saldo: (%f) Balanço %s.\n", entras_soma, saidas_soma, balanceador, status);
        }
    } while (opcao != 0);

    fclose(entras_arquivo);
    fclose(saidas_arquivo);
    return 0;
}
```
