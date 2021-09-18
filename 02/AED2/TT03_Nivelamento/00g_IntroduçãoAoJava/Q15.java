
/**
 * Faça um programa que leia n números e mostre quais deles são maiores que a
 * média
 */

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), total = 0;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
            total += arr[i];
        }

        float media = (total / n);

        for (int i = 0; i < n; i++) {
            if (arr[i] > media)
                System.out.println(arr[i]);
        }
    }
}
