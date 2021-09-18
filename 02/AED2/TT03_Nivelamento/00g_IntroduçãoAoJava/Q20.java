import java.util.Scanner;

/**
 * Faça um programa para ler a nota de cinco alunos, calcular e mostrar: a soma
 * e a média das mesmas e a menor nota
 */

import java.util.Scanner;

public class Q20 {
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
