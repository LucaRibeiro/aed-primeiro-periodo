#include <stdio.h>
#include <stdlib.h>

void makeFolders(){
	#ifdef _WIN32
		system("md exercicio");
		system("md avaliacoes");
		system("md notas");

	#else
		system("mkdir exercicio;");
		system("mkdir avaliacoes");
		system("mkdir notas");
	#endif
}

int main(){
	makeFolders();
	return 0;
}
