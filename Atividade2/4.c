#include <stdio.h>
#include <math.h>

int main(void)
{
	double a, b, c, delta, x1, x2, xv, yv;
	
	// Recebe o input do usu√rio
	printf("a = ");
	scanf("%lf", &a);

	printf("b = ");
	scanf("%lf", &b);

	printf("c = ");
	scanf("%lf", &c);
	
	// Calcula o delta 
	delta = pow(b,2) - (4 * a * c);

	// Calculas ra√zes
	x1 = ( b*(-1) + sqrt(delta) ) / (2 * a);
	x2 = ( b*(-1) - sqrt(delta) ) / (2 * a);

	// Calcula as coordenadas do v√rtice
	xv = ( (-1) * b ) / ( 2 * a );
	yv = ( (-1) * delta ) / ( 4 * a );
	
	// Imprime os resultados
	printf("\nDuas raizes: %.2lf %.2lf", x1, x2);
	printf("\nVertice: (%.2lf, %.2lf)", xv, yv);

	return 0;
}
