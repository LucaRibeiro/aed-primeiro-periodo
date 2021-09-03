import java.util.Scanner;

/**
 * Leia dois números. Se um deles for maior que 45, realize a soma dos mesmos.
 * Caso contrário, se os dois forem maior que 20, realize a subtração do maior
 * pelo menor, senão, se um deles for menor do que 10 e o outro diferente de 0
 * realize a divisão do primeiro pelo segundo. Finalmente, se nenhum dos casos
 * solicitados for válido, mostre seu nome na tela.
 */

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1, n2;
        n1 = s.nextInt();
        n2 = s.nextInt();

        if (n1 > 45 || n2 > 45) {
            System.out.println(n1 + n2);
        } else if (n1 < 20 && n2 < 20) {
            if (n1 > n2)
                System.out.println(n1 - n2);
            else
                System.out.println(n2 + n1);
        } else if (n1 < 10 || n2 < 10) {
            System.out.println(n1 / n2);
        } else {
            System.out.print("Luca");
        }
    }
}
