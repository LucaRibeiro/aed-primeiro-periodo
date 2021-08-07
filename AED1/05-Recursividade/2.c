#include <stdio.h> 
#include <string.h>

void trocaChar(char* x, char* y) {
    char aux = *x;
    *x = *y;
    *y = aux;
}

void inverte(char* frase, int position) {
    static int i = 0;

    if (*(frase + position) == '\0') {
        return;
    }

    inverte(frase, position + 1);

    if (i <= position) {
        trocaChar(&frase[i++], &frase[position]);
    }
}

int main() {
    char frase[50];

    puts("Insira a frase:");
    fgets(frase, 50, stdin);

    inverte(frase, 0);

    puts("A frase invertida é:");
    printf("%s", frase);
    return 0;
}