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