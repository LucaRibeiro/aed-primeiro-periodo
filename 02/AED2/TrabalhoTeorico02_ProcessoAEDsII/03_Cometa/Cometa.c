#include <stdio.h>

int main(char **args){
	int year, next, term = 75;
	while(1){
		scanf("%d", &year);
		if(year == 0)
			return 1;
		for(next = 1986; next <= year;next += term);
		printf("%d\n", next+2);
	}	
}
