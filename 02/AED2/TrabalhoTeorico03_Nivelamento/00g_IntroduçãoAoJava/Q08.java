
/**
 * Leia 10 números inteiros, selecione o menor e o maior e imprima os seus
 * respectivos valores na tela.
 */

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int minor = s.nextInt();
        int major = minor;
        int tmp;
        for (int i = 1; i < 10; i++) {
            tmp = s.nextInt();
            if (tmp < minor)
                minor = tmp;
            if (tmp > major)
                major = tmp;
        }
        System.out.println(major);
        System.out.println(minor);
    }
}
