
/**
 * Faça um programa para ler N números inteiros, calcular a média deles e
 * mostrar aqueles que forem maiores que a média
 */

import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int soma = 0, media, menor = 0;
        int[] notas = new int[5];

        for (int i = 0; i < 5; i++) {
            notas[i] = s.nextInt();
            soma += notas[i];
            if (i == 0 || notas[i] < menor)
                menor = notas[i];
        }
        System.out.println(soma);
        System.out.println(soma / 5);
        System.out.println(menor);
    }
}
