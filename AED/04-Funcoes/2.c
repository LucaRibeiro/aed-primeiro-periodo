#include <stdio.h>
#include <stdlib.h>

void makeFolders(){
	#ifdef _WIN32
		system("md exercicio; md avaliacoes; md notas");
	#else
		system("mkdir exercicio; mkdir avaliacoes; mkdir notas");
	#endif
}

int main(){
	makeFolders();
	return 0;
}
