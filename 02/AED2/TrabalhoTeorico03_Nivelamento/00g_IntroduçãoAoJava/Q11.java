
/**
 * Faça um programa que leia um número inteiro N e mostre na tela os N primeiros
 * números inteiros ímpares.
 */

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();

        for (int i = 1; i < x; i += 2)
            System.out.println(i);
    }
}
