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

    fclose(arquivo);
    return 0;
}
