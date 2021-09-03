
/** Leia 10 números inteiros, selecione o maior e imprima seu valor na tela. */

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int maior = s.nextInt();
        int tmp;
        for (int i = 1; i < 10; i++) {
            tmp = s.nextInt();
            if (tmp > maior)
                maior = tmp;
        }
        System.out.print(maior);
    }
}
