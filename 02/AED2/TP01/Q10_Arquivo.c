#include <stdio.h>


int main(char* argc, char** argv) {
    double tmp, scan;
    int n;

    scanf("%d", &n);
    FILE* fwriter = fopen("Q10_Arquivo_LucaRibeiro.txt", "w");

    for (int i = 0; i < n; i++) {
        scanf("%lf", &tmp);
        fwrite(&tmp, sizeof(double), 1, fwriter);
    }
    fclose(fwriter);

    FILE* freader = fopen("Q10_Arquivo_LucaRibeiro.txt", "r");

    for (int i = 1; i <= n; i++) {
        fseek(freader, -i * sizeof(double), SEEK_END);
        fread(&scan, sizeof(double), 1, freader);
        printf("%g\n", scan);
    }

    fclose(freader);
    return 0;
}