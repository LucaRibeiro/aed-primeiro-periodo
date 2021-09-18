
/**
 * Seja uma partida de futebol, leia os números de gols do mandante e do
 * visitante e imprima quem foi o vencedor ou se foi empate.
 */

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int mandante, visitante;
        mandante = s.nextInt();
        visitante = s.nextInt();

        if (mandante > visitante)
            System.out.printf("Mandante");
        else if (visitante > mandante)
            System.out.printf("Visitante");
        else
            System.out.print("Empate");

    }
}
