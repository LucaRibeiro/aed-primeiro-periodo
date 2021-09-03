
/**
 * Leia 3 números inteiros, selecione o menor e o maior e imprima os seus
 * respectivos valores na tela
 */

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int l1, l2, l3;
        l1 = s.nextInt();
        l2 = s.nextInt();
        l3 = s.nextInt();

        if (l1 >= l2 && l1 >= l3) {
            System.out.println(l1);
        } else if (l2 >= l1 && l2 >= l3) {
            System.out.println(l2);
        } else {
            System.out.println(l3);
        }

        if (l1 <= l2 && l1 <= l3) {
            System.out.println(l1);
        } else if (l2 <= l1 && l2 <= l3) {
            System.out.println(l2);
        } else {
            System.out.println(l3);
        }
    }
}
