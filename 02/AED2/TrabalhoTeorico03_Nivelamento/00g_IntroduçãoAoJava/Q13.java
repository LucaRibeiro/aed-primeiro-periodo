
/**
 * Faça um programa que leia um número inteiro N indicando a nota máxima em uma
 * prova P. Em seguida, leia a nota de 20 alunos (entre 0 e N) e mostre na tela:
 * (i) a média da turma, (ii) o número de alunos cuja nota foi menor que a média
 * da Universidade (suponha 60%) e (iii) a quantidade de alunos com conceito A
 * (mais de 90%).
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int tmp;
        int[] conceitosA = new int[20], abaixoMedia = new int[20];
        int contadorConceitosA = 0, contadorAbaixoMedia = 0;
        int total = 0;

        for (int i = 0; i < 20; i++) {
            tmp = s.nextInt();
            total += tmp;
            if (tmp > 0.9 * n)
                conceitosA[++contadorConceitosA] = tmp;
            else if (tmp < 0.6 * n)
                abaixoMedia[++contadorAbaixoMedia] = tmp;
        }

        System.out.println(total / 20);

        for (int i = 0; i < contadorAbaixoMedia; i++)
            System.out.println(abaixoMedia[i]);

        for (int i = 0; i < contadorConceitosA; i++)
            System.out.println(conceitosA[i]);

    }
}
