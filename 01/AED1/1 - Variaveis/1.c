#include <stdio.h>

int main(void) {
    char nomeCompleto[100];
    puts("Digite seu nome completo: ");
    gets(nomeCompleto);
    printf("Olá, nome: %s", nomeCompleto);
   return 0;
}
