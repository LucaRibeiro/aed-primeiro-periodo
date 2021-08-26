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