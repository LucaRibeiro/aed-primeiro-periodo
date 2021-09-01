/** 
 * Repita o exercício acima considerando que os 
 * elementos do array estão ordenados de forma 
 * crescente. Uma sugestão seria começar a 
 * pesquisa pelo meio do array. 
*/

public class Q02 {
    public boolean contains(int[] arr, int x){
        int menor = 0;
		int maior = arr.length-1;
		int meio;

		while(menor <= maior)
		{
			meio=(menor + maior) / 2;

			if(arr[meio] < x)
				menor = meio + 1;
			else if(arr[meio] > x)
				maior = meio - 1;
			else
				return true;
		}

		return false;
	}

    public static void main(String []args){}
}
