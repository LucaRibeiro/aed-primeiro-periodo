
/**
 * Faça um programa que leia a nota de 5 alunos e mostre na tela a média das
 * mesmas
 */

import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 5; i++)
            sum += s.nextInt();

        System.out.println(sum / 5);
    }
}
