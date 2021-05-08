#include <stdio.h>
#include <math.h>

void formaParabola(double a)
{
    if (a > 0)
    {
        printf("\nParabola voltada para cima.");
    }
    else if (a < 0)
    {
        printf("\nParabola voltada para baixo.");
    }
    else
    {
        printf("\nEquacao de 1 grau");
    }
}

double deltaExpressao(double a, double b, double c)
{
    return (pow(b, 2) - (4 * a * c));
}

void numeroRaizes(double delta)
{
    if (delta > 0)
    {
        printf("\nDuas raízes. A parabola toca a reta x em dois pontos.");
    }
    else if (delta < 0)
    {
        printf("\nA parabola nao toca a reta x.");
    }
    else
    {
        printf("\nUma única raiz.");
    }
}

void raizesExpressao(double a, double b, double delta)
{
    double x1 = ((-1 * b) + sqrt(delta)) / (2 * a);
    double x2 = ((-1 * b) - sqrt(delta)) / (2 * a);
    printf("\nZeros da função: %.2lf %.2lf", x1, x2);
}

void verticeParabola(double a, double b, double delta)
{
    double xv = (-1 * b) / (2 * a);
    double yv = (-1 * delta) / (4 * a);
    printf("\nVértices: %.2lf %.2lf", xv, yv);
}

int main()
{
    double a, b, c, *raizes, *coordenadasVertice;
    printf("Digite o valor de a, b e c da expressao ( a*(x^2) + b * x + c )\n");
    scanf("%lf", &a);
    scanf("%lf", &b);
    scanf("%lf", &c);

    formaParabola(a);

    double delta = deltaExpressao(a, b, c);
    printf("\n Delta: %.2lf", delta);

    numeroRaizes(delta);

    if (delta >= 0)
    {
        raizesExpressao(a, b, delta);
    }

    verticeParabola(a, b, delta);

    return 0;
}