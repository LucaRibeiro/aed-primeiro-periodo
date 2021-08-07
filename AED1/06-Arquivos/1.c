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