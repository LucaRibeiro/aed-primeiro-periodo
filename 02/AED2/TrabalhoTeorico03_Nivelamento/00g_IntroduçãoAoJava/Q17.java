
/** Faça um programa que leia os elementos de um array de tamanho n e mostre a posição do menor elemento do array  */

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        int menor = arr[0], posicaoMenor = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] < menor) {
                menor = arr[i];
                posicaoMenor = i;
            }
        }
        System.out.println(posicaoMenor);
    }
}
