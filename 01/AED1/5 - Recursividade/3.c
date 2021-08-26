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