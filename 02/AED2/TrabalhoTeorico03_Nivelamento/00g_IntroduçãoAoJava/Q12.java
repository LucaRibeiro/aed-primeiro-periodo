
/**
 * Faça um programa que leia um número inteiro N e mostre na tela os N primeiros
 * números da sequência 1, 5, 12, 16, 23, 27 34.
 */

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int i = 1;

        do {
            System.out.println(i);

            if (i % 2 == 0)
                i += 4;
            else
                i += 7;

        } while (i < x);
    }
}
