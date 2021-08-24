#include <stdio.h>

void ultimoInteiro(int number) {
    if (number > 1) {
        if (number % 2 == 1) {
            printf("%i, ", number);
        }
        ultimoInteiro(number - 1);
    }
    else {
        printf("%i\n", number);
    }
}

int main(const char* args) {
    int input;
    printf("Digite um valor: ");
    scanf("%i", &input);

    ultimoInteiro(input);

    return 0;
}