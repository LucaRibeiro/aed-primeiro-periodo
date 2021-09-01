
/** Faça um programa que leia um número inteiro n e mostre na
 * tela o n-ésimo termo da sequência de Fibonacci */

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] fibonacci = new int[n - 1];

        for (int i = 0; i < n; i++) {
            if (i < 2)
                fibonacci[i] = i;
            else
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        System.out.println(fibonacci[n - 1]);
    }
}
