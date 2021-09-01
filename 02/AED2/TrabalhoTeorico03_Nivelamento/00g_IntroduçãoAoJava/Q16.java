
/**
 * Faça um programa que leia n números e mostre a soma do i-ésimo com o
 * (2*i+1)-ésimo termo até que (2*i+1) < n
 */

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        for (int i = 0; (2 * i + 1) < n; i++)
            System.out.println(i + (2 * i + 1));
    }
}
