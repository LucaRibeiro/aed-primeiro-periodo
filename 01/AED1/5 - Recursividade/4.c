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