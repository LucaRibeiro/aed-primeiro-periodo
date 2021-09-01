
/**
 * Faça um programa que leia três números reais representando os lados de um
 * triângulo e informe se seu triângulo é Equilátero, Isósceles ou Escaleno
 */

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int l1, l2, l3;
        l1 = s.nextInt();
        l2 = s.nextInt();
        l3 = s.nextInt();

        if (l1 == l2 && l1 == l3) {
            System.out.printf("Equilátero");
        } else if (l1 == l2 || l1 == l3 || l2 == l3) {
            System.out.printf("Isóceles");
        } else {
            System.out.printf("Escaleno");
        }
    }
}
