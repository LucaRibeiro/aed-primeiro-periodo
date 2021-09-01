
/**
 * Leia dois números reais e imprima a raiz cúbica do menor e o logaritmo do
 * menor considerando o maior como a base desse logaritmo.
 */

import java.util.Scanner;
import java.lang.Math;

public class Q07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n1, n2, menor, maior;

        n1 = s.nextLong();
        n2 = s.nextLong();
        if (n1 < n2) {
            menor = n1;
            maior = n2;
        } else {
            menor = n2;
            maior = n1;
        }

        System.out.println(Math.sqrt(menor));
        System.out.println(Math.log((double) menor) / Math.log((double) maior));

    }
}
