# Quiz 2 - Pesquisa binária

## Pergunta 1
P: Quando acontece o melhor e o pior caso do algoritmo de pesquisa binária?
R: O melhor caso na pesquisa binária é quando o elemento buscado está ao centro do array, sendo assim é realizada apenas uma execução no loop. Já o pior caso é quando o elemento buscado não está presente no array ou a lista não está previamente ordenada, impossibilitando o algoritmo de usar os extremos como referências.

 
## Pergunta 2
R: A solução apresentada para pesquisa binária faz duas comparações entre elementos do array em cada execução da repetição, modifique o código para efetuarmos apenas uma.
R: 
```c
boolean resp = false;
int dir = n - 1, esq = 0, meio;
while(array[meio] != x){ 
	meio = (esq + dir)/2; 
	if(x > array[meio]){ 
		esq = meio + 1; 
	} else { 
		dir = meio -1; 
	} 
}
```
